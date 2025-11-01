import java.util.Scanner;

/**
 * Programma che dichiara e inizializza, con valori casuali, 2 matrici di interi
 * la cui dimensione, numero minimo e numero massimo sono richiesti all'utente.
 * In seguito, sottrae le due matrici e stampa a schermo il contenuto della
 * matrice risultante. Inoltre percorre la matrice risultante e stampa a schermo
 * la posizione di tutti i numeri negativi contenuti nella matrice. Se non
 * dovessero esserci numeri negativi, al termine, il programma stampa la scritta
 * 'nessun numero negativo presente'.
 */
public class SottrazioneMatrici {

    /**
     * Popola la matrice con dei numeri casuali compresi tra min e max (escluso)
     * 
     * @param matrice matrice da popolare con numeri casuali
     * @param min     valore minimo desiderato
     * @param max     valore massimo (escluso) desiderato
     */
    private static void popolaMatrice(int[][] matrice, int min, int max) {
        for (int i = 0; i < matrice.length; i++)
            for (int j = 0; j < matrice[i].length; j++)
                matrice[i][j] = (int) (Math.random() * (max - min)) + min;
    }

    /**
     * Sottrai due matrici e restituisce la matrice risultante
     * 
     * @param matrice1 prima matrice
     * @param matrice2 seconda matrice
     * @return matrice contenente il risultato della sottrazione
     */
    private static int[][] sottrai(int[][] matrice1, int[][] matrice2) {
        int righe = matrice1.length;
        int colonne = matrice1[0].length;
        int[][] matriceSottrazione = new int[righe][colonne];
        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++)
                matriceSottrazione[i][j] = matrice1[i][j] - matrice2[i][j];
        return matriceSottrazione;
    }

    /**
     * Mostra il contenuto della matrice
     * 
     * @param matrice matrice da mostrare a schermo
     */
    private static void mostra(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++)
                System.out.print(matrice[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Richiedi e controlla il numero di righe e di colonne
        System.out.print("Dimensioni matrici (righe colonne): ");
        int righe = input.nextInt();
        int colonne = input.nextInt();
        while (righe <= 0) {
            System.out.print("Numero di righe non valido. Riprova: ");
            righe = input.nextInt();
        }
        while (colonne <= 0) {
            System.out.print("Numero di colonne non valido. Riprova: ");
            colonne = input.nextInt();
        }

        // Richiedi e controlla il numero minimo e quello massimo
        System.out.print("Numero minimo: ");
        int numeroMinimo = input.nextInt();
        System.out.print("Numero massimo: ");
        int numeroMassimo = input.nextInt();
        while (numeroMassimo <= numeroMinimo) {
            System.out.print("Numero massimo non valido. Riprova: ");
            numeroMassimo = input.nextInt();
        }

        input.close();

        // Crea, popola e mostra le matrici. Calcola e mostra il risultato della
        // sottrazione
        int[][] matrice1 = new int[righe][colonne];
        int[][] matrice2 = new int[righe][colonne];

        popolaMatrice(matrice1, numeroMinimo, numeroMassimo);
        popolaMatrice(matrice2, numeroMinimo, numeroMassimo);

        mostra(matrice1);
        mostra(matrice2);

        int[][] matriceSottrazione = sottrai(matrice1, matrice2);
        mostra(matriceSottrazione);

        // Mostra la posizione degli eventuali numeri negativi
        boolean negativiPresenti = false;
        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++)
                if (matriceSottrazione[i][j] < 0) {
                    if (!negativiPresenti)
                        negativiPresenti = true;
                    System.out.println("riga: " + (i + 1) + ", colonna: " + (j + 1));
                }
        if (!negativiPresenti)
            System.out.println("Nessun numero negativo presente");
    }
}
