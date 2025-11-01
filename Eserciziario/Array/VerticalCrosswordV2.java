
public class VerticalCrosswordV2 {

    /*
     * Questo codice dimostra come trovare parole nascoste nelle colonne di una
     * matrice
     * e come gestire casi in cui le righe hanno lunghezze diverse.
     * 
     * Spiegazione del codice:
     * 
     * getMaxWidth(char[][] table):
     * Questo metodo scorre tutte le righe della matrice e trova la lunghezza
     * massima
     * tra le righe, che rappresenta la larghezza massima della matrice.
     * 
     * getColAsString(char[][] table, int col):
     * Questo metodo costruisce una stringa concatenando i caratteri della colonna
     * specificata (col). Se una riga è troppo corta per avere un carattere in
     * quella colonna, viene ignorata.
     * 
     * searchInCols(char[][] table, String word):
     * Questo metodo cerca la parola word in tutte le colonne della matrice. La
     * ricerca non è sensibile al caso dei caratteri. Se la parola viene trovata
     * in una colonna, viene restituito l'indice della colonna. Se la parola non
     * viene trovata in nessuna colonna, viene restituito -1.
     * 
     * main:
     * Il metodo main contiene esempi di utilizzo dei metodi per verificare il loro
     * corretto funzionamento. Vengono create due matrici di esempio e vengono
     * testati
     * i metodi getMaxWidth, getColAsString e searchInCols.
     * 
     * Output atteso:
     * Copy
     * Larghezza massima della tabella 1: 6
     * Larghezza massima della tabella 2: 6
     * Colonna 3 della tabella 1: CaNe
     * Colonna 1 della tabella 2: abAu
     * Indice della colonna con 'cane' nella tabella 1: 3
     * Indice della colonna con 'BAU' nella tabella 2: 1
     * Indice della colonna con 'gatto' nella tabella 2: -1
     */

    // Metodo per ottenere la larghezza massima della matrice
    public static int getMaxWidth(char[][] table) {
        int maxWidth = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i].length > maxWidth) {
                maxWidth = table[i].length;
            }
        }
        return maxWidth;
    }

    // Metodo per ottenere una colonna come stringa
    public static String getColAsString(char[][] table, int col) {
        StringBuilder columnString = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (col < table[i].length) {
                columnString.append(table[i][col]);
            }
        }
        return columnString.toString();
    }

    // Metodo per cercare una parola nelle colonne della matrice
    public static int searchInCols(char[][] table, String word) {
        word = word.toLowerCase(); // Ignora il caso dei caratteri
        int maxWidth = getMaxWidth(table);
        for (int col = 0; col < maxWidth; col++) {
            String columnString = getColAsString(table, col).toLowerCase();
            if (columnString.contains(word)) {
                return col;
            }
        }
        return -1;
    }

    // Metodo main per testare i metodi
    public static void main(String[] args) {
        
        char[][] table1 = {
                { 'c', 'C', 'e', 'C', 'c' },
                { 'c', 'a', 'n', 'a', 'a' },
                { 'c', 'p', 'a', 'N', 'n', 'E' },
                { 'a', 'e', 'e' },
                { 'a', 'b', 'c', 'e', 'e' }
        };

        char[][] table2 = {
                { 'G', 'a', 't', 't', 'o' },
                { 'r', 'b', 'a', 'u' },
                { 'R', 'A', 'p', 'U', 'n', 'Z' },
                { 'r', 'u', 'p' }
        };

        // Test getMaxWidth
        System.out.println("Larghezza massima della tabella 1: " + getMaxWidth(table1)); // Output: 6
        System.out.println("Larghezza massima della tabella 2: " + getMaxWidth(table2)); // Output: 6

        // Test getColAsString
        System.out.println("Colonna 3 della tabella 1: " + getColAsString(table1, 3)); // Output: "CaNe"
        System.out.println("Colonna 1 della tabella 2: " + getColAsString(table2, 1)); // Output: "abAu"

        // Test searchInCols
        System.out.println("Indice della colonna con 'cane' nella tabella 1: " + searchInCols(table1, "cane")); // Output:
                                                                                                                // 3
        System.out.println("Indice della colonna con 'BAU' nella tabella 2: " + searchInCols(table2, "BAU")); // Output:
                                                                                                              // 1
        System.out.println("Indice della colonna con 'gatto' nella tabella 2: " + searchInCols(table2, "gatto")); // Output:
                                                                                                                  // -1
    }
}
