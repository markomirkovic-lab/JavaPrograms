

public class GrigliaMatrice {
    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int riga = 0; riga < matrice.length; riga++) {
            // Stampa la linea superiore della griglia (solo per l'inizio di ogni riga)
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                System.out.print("+---");
            }
            System.out.println("+"); // Chiude l'ultima colonna della riga superiore

            
            // Stampa i valori con i bordi verticali
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                System.out.printf("| %d ", matrice[riga][colonna]);
            }
            System.out.println("|"); // Chiude l'ultima colonna della riga
            
            // Stampa la linea inferiore della griglia (per chiudere la riga)
            if (riga == matrice.length - 1) { // Solo per l'ultima riga
                for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                    System.out.print("+---");
                }
                System.out.println("+");
            }
            
        }
    }
}
