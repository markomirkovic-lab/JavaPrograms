// 8.2 Cosa stamperà il codice seguente?

public class Es8_2_CosaStampa {

    public static void main(String[] args) {
        int a, b, c, s, i, g;
        a = b = c = s = 4;
        i = g = ++a;
        
        a = s++ + --s + ++i + g++;
        //System.out.println("i " + i);
        b *= (~i) + 1;
        
        System.out.println(a + " " + b);

        /*
        i = g = ++a ++4 (5) = 5                a = 5
        a = s++ 4++ (4)  +  --s (3)  +  ++i (6) + g++ (5)  = 18       a = 5    s = 3    i = 6    g = 6

        ~ 

        In Java, l'operatore ~ è il NOT bit a bit (bitwise NOT) e inverte ogni bit di un numero.
        i = 5
        (~5):
        00000000 00000000 00000000 00000110     6
        11111111 11111111 11111111 11111001     INVERSIONE bit


        Interpretazione del risultato:

        In Java, i numeri interi (tipo int) sono rappresentati in complemento a 2.

        Per interpretare il risultato:

        Il bit più significativo (MSB, Most Significant Bit) indica il segno:
        1 = negativo.
        0 = positivo.
        Per calcolare il valore decimale del risultato negativo, trovi il complemento a 2:
        Complemento a 2: Inverti i bit e somma 1.

        00000000 00000000 00000000 00000110     5
        11111111 11111111 11111111 11111001     INVERSIONE bit -> segno negativo

        00000000 00000000 00000000 00000110     inversione bit
        00000000 00000000 00000000 00000001     somma 1
        00000000 00000000 00000000 00000111     risulato = -7

        b = b (6) * (~6) (-7) + 1 = -42 + 1 = -41








        



        */

        System.out.println((~6));
    }

}
