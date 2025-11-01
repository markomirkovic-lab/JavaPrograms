/*
9.3 Cosa stampa 2?
Rispondete senza copiare il codice in NetBeans. 
Cosa stamperà il seguente pezzo di codice nei casi con 
x= 4 5 6 9 10 11
 */

public class Es9_2_CosaStampa2 {

    public static void main(String[] args) {

        int x = 0;

        // x                                        0   5   6   9   10  11
        if (x >= 5) {
            System.out.println("A");//                A   A   A   A   A
            if (x < 10)
                System.out.println("B");//        B
        } else
            System.out.println("C");//

        //--

         for(x = 4; x < 12; x++) {

            if (x >= 5)
            System.out.print("A ");
            else if (x < 10)
                System.out.print("B ");
            else
                System.out.print("C ");
        }

        /*
        C
        B A A A A A A A 
        */

    }

}
