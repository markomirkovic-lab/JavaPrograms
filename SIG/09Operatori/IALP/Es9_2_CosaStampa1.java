/*
9.2 Cosa stampa?
Rispondete senza copiare il codice in NetBeans. 
Cosa stamperà il seguente pezzo di codice nei casi 
con x = 4 5 6 9 10 11
*/

public class Es9_2_CosaStampa1 {

    public static void main(String[] args) {

        // int x = 4 5 6 9 10 11

        int x = 4;


        // // int x =                       4   5   6   9   10  11
        if (x >= 5)
            System.out.println("A");//        A   A   A    A   A
        else if (x < 2)
            System.out.println("B");//
        else
            System.out.println("C");//    C


        //--

        System.out.println();

        for(x = 4; x < 12; x++) {

            if (x >= 5)
            System.out.print("A ");
            else if (x < 2)
                System.out.print("B ");
            else
                System.out.print("C ");
        }

        /*
        C A A A A A A A
        */
        


        
    


    }

}
