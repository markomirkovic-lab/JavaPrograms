import java.util.Scanner;

public class MatriceColonne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire le dimensioni della matrice
        System.out.print("Inserisci il numero di righe: ");
        int righe = scanner.nextInt();
        System.out.print("Inserisci il numero di colonne: ");
        int colonne = scanner.nextInt();

        // Crea la matrice
        int[][] matrice = new int[righe][colonne];

        // Riempie la matrice colonna per colonna
        int valore = 0;
        for (int col = 0; col < colonne; col++) {
            for (int rig = 0; rig < righe; rig++) {
                matrice[rig][col] = valore++;
            }
        }

        // Stampa la matrice
        System.out.println("Matrice risultante:");
        for (int rig = 0; rig < righe; rig++) {
            for (int col = 0; col < colonne; col++) {
                System.out.print(matrice[rig][col] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
