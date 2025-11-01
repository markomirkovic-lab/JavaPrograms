public class Es10_8_3_ContaProgressivo {

    public static void main(String[] args) {
        
        // da 1 a 10, ogni 4

        // ciclo for
        int n = 10;
        for(int i = 4; i < n; i +=4) {
            System.out.print(i + " ");
        }

        //--
        System.out.println();

        // ciclo do-while
        // int n = 10;
        n = 10;
        int i = 4;
        do {
            System.out.print(i + " ");
            i +=4;
        } while(i < n);

        //--
        System.out.println();

        // ciclo while
        n = 10;
        i = 4;
        while(i < n) {
            System.out.print(i + " ");
            i += 4;
        }

    }
    
}
