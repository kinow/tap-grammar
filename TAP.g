grammar TAP;

/* Based on http://perldoc.perl.org/5.12.1/TAP/Parser/Grammar.html */

INTEGER	:	'1'..'9' '0'..'9'*;

fragment NEWLINE	:	'\r'? '\n';

WS
    : (' '|'\t'|'\n'|'\r')+ {skip();}
    ;
    

input	:	tap_stream EOF;

tap_stream
	:	leading_plan lines | lines trailing_plan;
	
leading_plan 	:	plan skip_directive? NEWLINE*;

/* Directives */

skip_directive 
	:	'#' 'SKIP' (.)*;

trailing_plan 
	:	plan;
	
plan 
	:	 '1..' INTEGER NEWLINE*;
	
lines	:	line*;

line 	:	comment | test_result;

comment 	: 	'#' ~('\n'|'\r')* ('\r'? '\n')?;

test_result 
	:	test_status test_number NEWLINE*;
	
test_status 
	:	'ok' | 'not ok';
	
test_number 
	:	INTEGER+;