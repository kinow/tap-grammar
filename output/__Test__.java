import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        TAPLexer lex = new TAPLexer(new ANTLRFileStream("/home/kinow/java/workspace/tap-grammar/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        TAPParser g = new TAPParser(tokens, 49100, null);
        try {
            g.INTEGER();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}