public class PiramideRuotataV4 {
    public static void main(String[] args) {
        int base = 6; // Puoi cambiare questo valore con qualsiasi numero pari
        
        if (base % 2 != 0) {
            System.out.println("La base deve essere un numero pari!");
            return;
        }
        
        // Primo
        System.out.println("*");

        // Prima metà della piramide (parte superiore)
        for (int i = base; i >= 2; i -= 2) {

            for(int k = 0; k < base; k++ ) {
                if(k == 0) {
                    System.out.print("*");
                }
            }
            
            // Stampa gli spazi iniziali
            for (int j = 1; j <= (base - i) / 2; j++) {
                System.out.print(" ");
            }
            // Stampa gli asterischi
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        
        // Seconda metà della piramide (parte inferiore)
        for (int i = 2; i <= base-1; i += 2) {

            for(int k = 0; k < base; k++ ) {
                if(k == 0) {
                    System.out.print("*");
                }
            }
            // Stampa gli spazi iniziali
            for (int j = 1; j <= (base - i) / 2; j++) {
                if(i == 0) {
                    //System.out.println("*");
                }
                System.out.print(" ");
            }

            



            // Stampa gli asterischi
            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // ultimo
        System.out.println("*");


    }
}
