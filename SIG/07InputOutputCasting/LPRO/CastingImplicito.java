public class CastingImplicito {

    public static void main(String[] args) {
        
        System.out.println("Casting implicito");
        System.out.println();

        double a;
        int b = 10, c = 3;

        a = b / c + 1.5;
        System.out.println("a: " + a);// 3 + 1.5 = 4.5

        a = 10 / 3 + 1.5;
        System.out.println("a: " + a);// 3 + 1.5 = 4.5

        a = (int) 10 / 3 + 1.5;       //attention!!! 1.5 non viene convertito in int (1)
        System.out.println("a: " + a);//3 + 1.5 = 4.5

        a = (int) (10 / 3 + 1.5);
        System.out.println("a: " + a);//3 + 1.0 = 4.0

        a = (double) 10 / 3 + 1.5;    // U S A R E   Q U E S T A   S I N T A S S S I
        System.out.println("a: " + a);//3.33 + 1.5 = 4.833333333333334

        a = (double) (10 / 3) + 1.5;  //attention!!! (10 / 3) non viene convertito in double
        System.out.println("a: " + a);//3 + 1.5 = 4.5

        a = (double) (10 / 3 + 1.5);  //attention!!! (10 / 3) non viene convertito in double
        System.out.println("a: " + a);//3 + 1.5 = 4.5 

        a = b / (c + 3.5);//esempio di un totale casting implicito verso il formato piu' grande
        // b = 10 (e' intero)
        // c =  3 (e' intero)
        // a = 10 / (3 + 3.5)
        // a = 10 / (3.0 + 3.5)
        // a = 10 / 6.5
        // a = 10.0 / 6.5
        // a = 1.5384615384615385
        System.out.println("a: " + a);// 10 / (3.0 + 3.5) = 10.0 / 6.5 = 1.5384615384615385

        a = (double) 10 / 3 + (double) 10 / 3 + 1.5;    // U S A R E   Q U E S T A   S I N T A S S S I
        System.out.println("a: " + a);//3.33 + 3.33 + 1.5 = 8.166666666666668

        a = (double) 10 / 3 + (double) 10 / 3 + (int) 1.5;    // U S A R E   Q U E S T A   S I N T A S S S I
        System.out.println("a: " + a);//3.33 + 3.33 + 1.5 = 7.666666666666667

        a = (double) 10 / 3 + 10 / 3 + 1.5;//attention!!! il secondo (10 / 3) non viene convertito in double
        System.out.println("a: " + a);//3.33 + 3.0 + 1.5 = 4.833333333333334

        a = b / c;                    //attention!!! (divisione tra interi)
        System.out.println("a: " + a);//10 / 3 = 3.0 

        a = 10 / 3;                   //attention!!! (divisione tra interi)
        System.out.println("a: " + a);//10 / 3 = 3.0

        a = (double) 10 / 3;          //risultato castato a double
        System.out.println("a: " + a);//10.0 / 3.0 = 3.3333333333

        a = 10.0 / 3.0;
        System.out.println("a: " + a);//10.0 / 3.0 = 3.3333333333

        //---

        String s;
        a = 5;//double
        b = 7;//int
        s =   a + b + " uguale a " + a + b;//12 uguale a 57
        //s = 5.0 + 7 + " uguuale a " + 5.0 + 7
        //s = 12.0 uguale a 5.07
        System.out.println("s: " + s);

        a = 5;//double
        b = 7;//int
        s =   a + b + " uguale a " + (a + b);//12 uguale a 12
        //s = 5.0 + 7 + " uguuale a " + 5.0 + 7.0
        //s = 12.0 uguale a 12.0
        System.out.println("s: " + s);

        s = "";
        int a2 = 5;//int
        int b2 = 7;//int
        s =   a2 + b2 + " uguale a " + a2 + b2;//12 uguale a 57
        //s = 5 + 7 + " uguuale a " + 5 + 7     CASTING DA int A String!!!!
        //s = "12" + "uguale a" + 5 + 7
        //s = "12 uguale a" + 5 + 7
        //s = "12 uguale a" + "5" + 7
        //s = "12 uguale a 5" + 7
        //s = "12 uguale a 5" + "7"
        //s = "12 uguale a 57"
        System.out.println("s: " + s);

        s = "";
        a2 = 5;//int
        b2 = 7;//int
        s =   a2 + b2 + " uguale a " + (a2 + b2);//12 uguale a 12
        //s = 5 + 7 + " uguuale a " + (5 + 7)     CASTING DA int A String!!!!
        //s = "12" + "uguale a" + (5 + 7)         (5 + 7) somma interi
        //s = "12 uguale a" + (5 + 7)
        //s = "12 uguale a" + 12
        //s = "12 uguale a" + "12"
        //s = "12 uguale a 12"
        System.out.println("s: " + s);



    }
    
}
