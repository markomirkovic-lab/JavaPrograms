public class MatriceConsecutiva {

    public static int[][] costruisciMatrice(int m, int n, int x) {
        // Creazione della matrice m x n
        int[][] matrice = new int[m][n];
        
        // Popolamento della matrice con numeri consecutivi a partire da x
        int valore = x;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = valore;
                valore++;
            }
        }
        
        return matrice;
    }

    public static void stampaMatrice(int[][] matrice) {
        // Stampa la matrice riga per riga
        for (int[] riga : matrice) {
            for (int elemento : riga) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Parametri
        int m = 3; // Numero di righe
        int n = 4; // Numero di colonne
        int x = 10; // Numero da cui iniziare la matrice

        // Creazione della matrice
        int[][] matrice = costruisciMatrice(m, n, x);

        // Stampa della matrice
        stampaMatrice(matrice);
    }
}
