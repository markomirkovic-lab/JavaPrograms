// & C:\Users\marko.mirkovic\JavaPrograms\04SIG\05PrimiPassi\IALP\Es5_3_Carte.java

// Quale codice consente di rappresentare le carte da gioco?

import java.nio.charset.StandardCharsets;
import java.nio.*;


public class Es5_3_Carte {

    public static void main(String[] args) {

        //System.out.println("\t'\u2660'\t'\u2665'\t'\u2666'\t'\u2663'");

        //System.out.println('\u2660');

        // Caratteri Unicode
        char spades = '\u2660';  // ♠
        char hearts = '\u2665';  // ♥
        char diamonds = '\u2666'; // ♦
        char clubs = '\u2663';   // ♣

        // Stampa dei simboli
        System.out.println("Simboli delle carte:");
        System.out.println("Spades: " + spades);
        System.out.println("Hearts: " + hearts);
        System.out.println("Diamonds: " + diamonds);
        System.out.println("Clubs: " + clubs);

        System.out.println();

        System.out.println("Test Unicode:");
        System.out.printf("%c", spades); // ♠ ♥ ♦ ♣


        String spades2 = "\u2660";

        System.out.println(spades2);

        System.out.println("\u0041");

        System.out.println("♣");

        // caratteri unicode ♠

        System.out.println((int) '♠');
        System.out.println('\u9824');
        System.out.println('♢');
        System.out.println("♢");

        System.out.println("----");

        String x = "é";
        System.out.println(x.length());
        byte[] data = x.getBytes(StandardCharsets.UTF_8);
        String y = new String(data, StandardCharsets.ISO_8859_1);
        System.out.println(y.length());
        System.out.println(y);
        
    }
    
}
