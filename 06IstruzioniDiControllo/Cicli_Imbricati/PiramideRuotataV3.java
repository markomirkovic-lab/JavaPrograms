public class PiramideRuotataV3 {
    public static void main(String[] args) {
        int base = 8; // Puoi cambiare questo valore con qualsiasi numero pari
        
        if (base % 2 != 0) {
            System.out.println("La base deve essere un numero pari!");
            return;
        }
        
        // Calcola la metà della base
        int metaBase = base / 2;
        
        // Prima metà della piramide (parte superiore)
        for (int i = 1; i <= metaBase; i++) {
            // Stampa la riga di asterischi con spazi
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Aggiunto uno spazio dopo ogni asterisco
            }
            System.out.println();
        }
        
        // Seconda metà della piramide (parte inferiore)
        for (int i = metaBase; i >= 1; i--) {
            // Stampa la riga di asterischi con spazi
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Aggiunto uno spazio dopo ogni asterisco
            }
            System.out.println();
        }
    }
}
