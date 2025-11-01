import java.util.Scanner;

public class TriangoloPattern {
    public static void disegnaTriangolo(int base) {
        if (base <= 0) {
            System.out.println("La dimensione deve essere maggiore di zero!");
            return;
        }
        
        // Prima riga (sempre un singolo asterisco)
        System.out.println("*");
        
        // Prima metà del triangolo (parte crescente)
        for (int i = 1; i < base / 2; i++) {
            if (i == 1) {
                System.out.println("**");  // Seconda riga sempre due asterischi
            } else {
                // Stampa * seguito da spazi e poi *
                System.out.print("*");
                for (int j = 0; j < i-1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        
        // Parte centrale (se la base è pari, non c'è una riga centrale)
        if (base % 2 == 1) {
            int mid = base / 2;
            System.out.print("*");
            for (int i = 0; i < mid-1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        // Seconda metà del triangolo (parte decrescente)
        for (int i = base / 2 - 1; i > 0; i--) {
            if (i == 1) {
                System.out.println("**");  // Penultima riga sempre due asterischi
            } else {
                // Stampa * seguito da spazi e poi *
                System.out.print("*");
                for (int j = 0; j < i-1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        
        // Ultima riga (sempre un singolo asterisco)
        System.out.println("*");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la dimensione della base del triangolo: ");
        int base = scanner.nextInt();
        disegnaTriangolo(base);
        scanner.close();
    }
}
