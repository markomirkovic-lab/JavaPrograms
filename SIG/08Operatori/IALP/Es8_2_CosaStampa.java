// 8.2 Cosa stamperà il codice seguente?

public class Es8_2_CosaStampa {

    public static void main(String[] args) {

        /*
        Precdenze operatori:
        expr++, expr--
        ++expr, --expr, +, -, ~, !, (type (unari))
        *, /, %
        +, -
        <<, >>, >>>
        <, >, <=, >=, instanceof
        ==, !=
        &
        ^
        |
        &&
        ||
        ? :
        =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
        */


        int a, b, c, s, i, g;
        a = b = c = s = 4;
        i = g = ++a;
        
        a = s++ + --s + ++i + g++;
        System.out.println("b " + b);
        System.out.println("i " + i);
        b *= (~i) + 1;
        
        System.out.println(a + " " + b);//19 -28

        /*
        i = g = ++a ++4 (5) = 5              i = 5   g = 5  a = 5
        a = s++ 4++ (4)  +  --s (s=5 -> 4)  +  ++i (6) + g++ (5)  = 19       a = 19    s = 4    i = 6    g = 6

        Andiamo con ordine: l’espressione
        a=b=c=s=4;
        assegna 4 alle variabili a, b, c, s.
        i=g=++a;
        incrementa a di uno, quindi varrà 5, e poi la usa, sostituendo il valore 5 nell’espressione.
        g varrà 5 e i anche.
        Se avessimo scritto a++, Java avrebbe prima usato il valore di a (4) sostituendolo 
        nell’espressione, e poi avrebbe incrementato, lasciando i e g a 4.
        a=s++ + --s + ++i + g++;
        // A B C D
        Primo giro, vengono valutati gli operatori ++ e -- da sinistra a destra.
        Prima dell’espressione i valori sono i seguenti:
        a=5 i=5 g=5 s=4

        Valutando la parte A: nell’espressione viene inserito 4 e dopo s viene incrementato.
        Valutando la parte B: s viene decrementata e questo valore viene inserito nell’espressione.
        Valutando la parte C: i viene incrementata e questo valore viene inserito nell’espressione.
        Valutando la parte D: nell’espressione viene inserito 5 e dopo g viene incrementato.
        Infine si valuta tutta l’espressione e ad a viene assegnato: 4 + 4 + 6 + 5=19.
        Dopo l’espressione i valori sono i seguenti:
        a=19 i=6 g=6 s=4


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

        00000000 00000000 00000000 00000110     6
        11111111 11111111 11111111 11111001     INVERSIONE bit -> segno negativo

        00000000 00000000 00000000 00000110     inversione bit
        00000000 00000000 00000000 00000001     somma 1
        00000000 00000000 00000000 00000111     risulato = -7

        ++++++++++++++++++++++
        ~ metodo semplificato:
        ~x = -(x + 1)
        ~6 = -(6 + 1) = -7
        ++++++++++++++++++++++

        b = b (4) * ( (~6) (-7) + 1 ) = 4 * -6 = -24

        */

        //System.out.println((~6));//-7
    }

}
