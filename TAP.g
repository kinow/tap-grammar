grammar TAP;
options
{
 language=Java;
 output=AST;
}

/* Based on http://perldoc.perl.org/5.12.1/TAP/Parser/Grammar.html */
    
// lexer rules
Int: '0'..'9' ('1'..'9')*;
NewLine: ('\r' | '\n' | '\r\n' );
	
// parser rules
start_rule
	:	tap_stream EOF;

tap_stream
	:	plan lines;
	
plan 
	:	'1..' Int+ NewLine*;
	
lines	:	line (NewLine line)*;

line 	:	comment | test_result;

comment 	: 	'#' ~(NewLine)* NewLine*;

test_result 
	:	test_status Int (comment)?;
	
test_status 
	:	'ok' | 'not ok';

