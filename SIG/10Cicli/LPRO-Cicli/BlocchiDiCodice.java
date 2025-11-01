public class BlocchiDiCodice {

    public static void main(String[] args) {
        
        int a = 1;
        System.out.println("a "  + a);

        {
            int b = 2;
            System.out.println("a+b: " + (a+b));//3
            a = 5;
            System.out.println();
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }

        {
            int b = 3;
            System.out.println("a+b " + (a+b));//8
            System.out.println();
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }

        System.out.println();
        System.out.println("a: " + a);
        //System.out.println("b: " + b);//Errore, qui b non esite

        /*
        a: 1
        a+b: 3

        a: 5
        b: 2
        a+b 8

        a: 5
        b: 3

        a: 5
        */
    }
    
}
