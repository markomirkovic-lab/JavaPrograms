public class Es10_8_2_ContaProgressivo {

    public static void main(String[] args) {
        

        // da 10 a 1

        // ciclo for
        for(int i = 10; i > 0 ; i--) {
            System.out.print(i + " ");
        }

        //--
        System.out.println();

        // ciclo do-while
        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while(i > 0);


        //--
        System.out.println();

        // ciclo while
        // int i = 10;
        i = 10;
        while(i > 0) {
            System.out.print(i + " ");
            i--;
        }

    }
    
}
