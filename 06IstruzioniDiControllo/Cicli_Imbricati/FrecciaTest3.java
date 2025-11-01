import java.util.Scanner;



public class FrecciaTest3 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero pari per la base della piramide: ");
        int base = scanner.nextInt();

        // Controllo per base pari
        while (base % 2 != 0) {
            System.out.print("La base deve essere un numero pari. Riprova: ");
            base = scanner.nextInt();
        }

        // Parte superiore della piramide
        for (int riga = 1; riga <= base / 2; riga++) {
            // Inizio
            System.out.print("*");

            // Spazi interni
            if (riga > 1) {
                for (int colonna = 1; colonna <= riga - 2; colonna++) {
                    System.out.print(" ");
                }
                // Fine
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferiore della piramide
        for (int riga = base / 2 - 1; riga >= 1; riga--) {
            // Inizio
            System.out.print("*");

            // Spazi interni
            if (riga > 1) {
                for (int colonna = 1; colonna <= riga - 2; colonna++) {
                    System.out.print(" ");
                }
                // Fine
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}


        
    
    


    

