/*
8.4 Operatori unari
Rispondete alle domande senza usare il compilatore.
Cosa stamperà a schermo?

Dichiarati: int a=3 e float b=1.5F. Quanto fa 40/a++?
Dichiarati: int a=3 e float b=1.5F. Quanto fa a++-b?
*/

public class Es8_4_OperatoriUniari {
    public static void main(String[] args) {

        // 1.
        int a = 3;//32 bit
        float b = 1.5F;//32 bit
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++ + b++);
        System.out.println(++a + (++b));

        /*
        3
        5
        6.5
        10.5
        */

        System.out.println();

        // 2.
        a = 3;//32 bit
        b = 1.5F;//32 bit
        System.out.println(40/a++);
        // 40 / 3 = 13

        System.out.println();

        // 3.
        a = 3;//32 bit
        b = 1.5F;//32 bit
        System.out.println(a++ - b);
        // 3 - 1.5 = 1.5

        /*
        Prima dell’espressione a vale 3.
        a++ viene sostituito con 3, dopodiché viene incrementato a.
        Stamperà 3.
        Dopo l’espressione a vale 4.
        System.out.println(++a);
        Prima dell’espressione a vale 4.
        ++a incrementa a e poi sostituisce nell’espressione il risultato, ovvero 5.
        Stamperà 5.
        Dopo l’espressione a vale 5.
        System.out.println(a+++b++);
        Prima dell’espressione a vale 5 e b vale 1.5.
        a++ viene sostituito con 5, dopodiché incrementa a.
        b++ viene sostituito con 1.5, dopodiché incrementa b.
        Stamperà 6.5.
        Dopo l’espressione a vale 6 e b 2.5.
        System.out.println(++a+(++b));
        Prima dell’espressione a vale 6 e b vale 2.5.
        ++a incrementa a e poi sostituisce nell’espressione il risultato, ovvero 7.
        ++b incrementa b e poi sostituisce nell’espressione il risultato, ovvero 3.5.
        Stamperà 10.5.
        Dopo l’espressione a vale 7 e b 3.5.

        Dichiarati: int a=3 e float b=1.5F. Quanto fa 40/a++?
        Prima sostituisce nell’espressione a++ con 3 e poi incrementa a di 1.
        40/3 ritorna 13 in quanto è una divisione fra interi.

        Dichiarati: int a=3 e float b=1.5F. Quanto fa a++-b?
        Prima sostituisce nell’espressione a++ con 3 e poi incrementa a di 1.
        3-1.5 ritorna 1.5.
        */


        /*
        1. stampa a schermo
        System.out.println(a++);
        3       a ora vale 4
        System.out.println(++a);
        5
        System.out.println(a++ + b++);
        5 + 1.5 = 6.5      a ora vale 6    b ora vale 2.5
        System.out.println(++a + (++b));
        7 + (3.5) = 10.5

        3
        5
        6.5
        10.5

        2. Dichiarati: int a=3 e float b=1.5F. Quanto fa 40/a++?
        40 / 3 = 13 (a++ prima esegue l'operazione poi incrementa)


        3. Dichiarati: int a=3 e float b=1.5F. Quanto fa a++-b?
        3-1.5 = 1.5 (a++ prima esegue l'operazione poi incrementa)

        */

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

        /*
        Tipo	Dimensione (bit)	Valore minimo	Valore massimo	        Esempio
        byte	8	                -128	        127	                    byte b = 10;
        short	16	                -32,768	        32,767	                short s = 200;
        int	    32	                -2^31	        2^31 - 1	            int i = 1000;
        long	64	                -2^63	        2^63 - 1	            long l = 5000L;
        float	32	                ±1.4E-45	    ±3.4028235E38	        float f = 3.14f;
        double	64	                ±4.9E-324	    ±1.7976931348623157E308	double d = 3.14;
        char	16	                '\u0000' (0)	'\uffff' (65,535)	    char c = 'A';
        boolean	1 (non specificato)	false	        true	                boolean flag = true;
        */

        
    }

}
