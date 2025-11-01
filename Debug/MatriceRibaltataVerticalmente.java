/*
MatriceTDLR Mar 21, 2017 array Livello 13 

Ora prova riempire una matrice colonna per colonna. Scrivi un programma che:

Crea una matrice con le dimensioni definite dall’utente
Riempie la matrice disponendo dei valori crescenti dall’alto verso il basso, da sinistra a destra
Stampa lo stato della matrice
Esempio, per una matrice di 5 x 5:

0	5	10	15	20	
1	6	11	16	21	
2	7	12	17	22	
3	8	13	18	23	
4	9	14	19	24	
Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio per 7 x 2:

0	7	
1	8	
2	9	
3	10	
4	11	
5	12	
6	13	
*/
import java.util.Scanner;

public class MatriceRibaltataVerticalmente {   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire le dimensioni della matrice
        System.out.print("Inserisci il numero di righe: ");
        int righe = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Inserisci il numero di colonne: ");
        int colonne = scanner.nextInt();
        scanner.nextLine();

        // Crea la matrice
        int[][] matrice = new int[righe][colonne];

        // Riempie la matrice con valori crescenti da sinistra a destra, dal basso verso l'alto
        int valore = 0;
        /*
        for(int c = 0; c < colonne; c++) {

            for(int r = 0; r < righe; r++) {

                matrice[r][c] = valore++;
            }
        }
        */
        for (int col = 0; col < colonne; col++) {
            for (int rig = 0; rig < righe; rig++) {
                matrice[rig][col] = valore++;
            }
        }
        
        /*
        // Stampa la matrice
        System.out.println("Matrice ribaltata verticalmente:");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
        */
        for (int rig = 0; rig < righe; rig++) {
            for (int col = 0; col < colonne; col++) {
                System.out.print(matrice[rig][col] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
