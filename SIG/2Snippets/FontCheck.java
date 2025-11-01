import static java.lang.Character.*;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class FontCheck {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("♥"); // Stampa il simbolo dei cuori

        System.out.println("\u2661");
        System.out.println('\u2661');

        //System.out.println("\u00a5"); 


        PrintWriter printWriter = new PrintWriter(System.out,true);
        char aa = '\u0905';
        char bb = '\u2661';
        //printWriter.println("aa = " + aa);
        printWriter.println("bb = " + bb);

        Charset utf8 = Charset.forName("UTF-8");
        Charset def = Charset.defaultCharset();

        String charToPrint = "\u2661";

        byte[] bytes = charToPrint.getBytes("UTF-8");
        String message = new String(bytes , def.name());

        PrintStream printStream = new PrintStream(System.out, true, utf8.name());
        printStream.println(message); // should print your character



        String var1 = "Cyntia";
        String var2 = new String(" is my daughter!");
        
        System.out.println(var1 + " \u263A" + var2);
    
        //printing heart using unicode
        System.out.println("Hello World \u2665");
        


        /*
        for (int i=0; i<MAX_CODE_POINT; i++) {
            int t = getType(i);
            boolean p = t == CONTROL || t == CONNECTOR_PUNCTUATION || t == CURRENCY_SYMBOL || t == DASH_PUNCTUATION || t == DECIMAL_DIGIT_NUMBER || t == ENCLOSING_MARK || t == END_PUNCTUATION || t == FINAL_QUOTE_PUNCTUATION || t == INITIAL_QUOTE_PUNCTUATION || t == LETTER_NUMBER || t == LOWERCASE_LETTER || t == MATH_SYMBOL || t == MODIFIER_LETTER || t == MODIFIER_SYMBOL || t == OTHER_LETTER || t == OTHER_NUMBER || t == OTHER_PUNCTUATION || t == OTHER_SYMBOL || t == START_PUNCTUATION || t == TITLECASE_LETTER || t == UPPERCASE_LETTER;
            if (!p) {
                System.out.println("Non printable codepoint " + i);
            }
        } 
        */
    }
}