public class PiramideRuotata {
    public static void main(String[] args) {
        int base = 8; // Puoi cambiare questo valore con qualsiasi numero pari
        
        if (base % 2 != 0) {
            System.out.println("La base deve essere un numero pari!");
            return;
        }
        
        // Calcola la metà della base per il numero di colonne
        int metaBase = base / 2;
        
        // Stampa la prima metà della piramide (parte crescente)
        for (int i = 1; i <= metaBase; i++) {
            // Stampa gli spazi iniziali
            for (int j = 1; j <= metaBase - i; j++) {
                System.out.print(" ");
            }
            // Stampa gli asterischi
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Stampa la seconda metà della piramide (parte decrescente)
        for (int i = metaBase; i >= 1; i--) {
            // Stampa gli spazi iniziali
            for (int j = 1; j <= metaBase - i; j++) {
                System.out.print(" ");
            }
            // Stampa gli asterischi
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
