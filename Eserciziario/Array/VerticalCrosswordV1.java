/*
https://gitalb.github.io/eserciziario2.0/array/methods/2019/03/08/verticalcrossword.html
VerticalCrossword Mar 8, 2019 array methods Livello 12 

Scrivi il programma VerticalCrossword contenente i metodi utili per trovare delle parole 
nascoste nelle colonne di una matrice.

La classe VerticalCrossword deve contenere i metodi seguenti:

public static int getMaxWidth(char[][] table)
Ritorna la dimensione della riga più larga (con il maggior numero di colonne) contenuta 
nella matrice table.

public static String getColAsString(char[][] table, int col)
Ritorna la stringa ottenuta concatenando tutti i caratteri presenti nella colonna col 
della matrice table. Le righe troppo corte per possedere un carattere nella colonna 
specificata da col vengono ignorate. Ad esempio, per la matrice seguente e per col 
pari a 3, il metodo ritorna la stringa "CaNe":

c	C	e	C	c	
c	a	n	a	a	
c	p	a	N	n	E
a	e	e			
a	b	c	e	e	
public static int searchInCols(char[][] table, String word)
Ritorna l’indice della colonna della matrice table che contiene la parola word 
(non sensibile al caso dei caratteri). Se word è presente in più colonne, ritorna 
l’indice della prima ricorrenza. Se nessuna colonna di table contiene word, 
ritorna -1.

Ad esempio per la parola "cane" e la matrice seguente il metodo ritorna 3:

c	C	e	C	c	
c	a	n	a	a	
c	p	a	N	n	E
a	e	e			
a	b	c	e	e	
Mentre per questa matrice e "BAU" ritorna 1:

G	a	t	t	o		
r	b	a	u			
R	A	p	U	n	Z	
r	u	p

main
Contiene il codice utile a verificare e dimostrare il buon funzionamento di 
tutti i metodi che hai scritto.
*/
public class VerticalCrosswordV1 {


    // Metodo per ottenere la larghezza massima della matrice
    public static int getMaxWidth(char[][] table) {

        int maxWidth = 0;

        for(int i = 0; i < table.length; i++) {

            if(table[i].length > maxWidth) {

                maxWidth = table[i].length;
            }
        }

        return maxWidth;
    }

    // Metodo per ottenere una colonna come stringa
    public static String getColAsString(char[][] table, int col) {

        StringBuilder colWord = new StringBuilder();

        for(int i = 0; i < table.length; i++) {

            if(col < table[i].length) {

                colWord.append(table[i][col]);
            }
        }

        return colWord.toString();
    }

    // Metodo per cercare una parola nelle colonne della matrice
    // Ritorna l’indice della colonna della matrice table che contiene la 
    // parola word (non sensibile al caso dei caratteri). Se word è 
    // presente in più colonne, ritorna l’indice della prima ricorrenza. 
    // Se nessuna colonna di table contiene word, ritorna -1.
    public static int searchInCols(char[][] table, String word) {

        word = word.toLowerCase();
        int maxWidth = getMaxWidth(table);

        for(int column = 0; column < maxWidth; column++) {

            String columString = getColAsString(table, column).toLowerCase();//column = for index

            if(columString.contains(word)) {
                return column;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        char[][] table1 = {
            {'c', 'C', 'e', 'C', 'c'},
            {'c', 'a', 'n', 'a', 'a'},
            {'c', 'p', 'a', 'N', 'n', 'E'},
            {'a', 'e', 'e'},
            {'a', 'b', 'c', 'e', 'e'}
        };

        char[][] table2 = {
            {'G', 'a', 't', 't', 'o'},
            {'r', 'b', 'a', 'u'},
            {'R', 'A', 'p', 'U', 'n', 'Z'},
            {'r', 'u', 'p'}
        };

        // Test getMaxWidth
        System.out.println("Larghezza massima della tabella 1: " + getMaxWidth(table1)); // Output: 6
        System.out.println("Larghezza massima della tabella 2: " + getMaxWidth(table2)); // Output: 6

        // Test getColAsString
        System.out.println("Colonna 3 della tabella 1: " + getColAsString(table1, 3)); // Output: "CaNe"
        System.out.println("Colonna 1 della tabella 2: " + getColAsString(table2, 1)); // Output: "abAu"

        // Test searchInCols
        System.out.println("Indice della colonna con 'cane' nella tabella 1: " + searchInCols(table1, "cane")); // Output: 3
        System.out.println("Indice della colonna con 'BAU' nella tabella 2: " + searchInCols(table2, "BAU")); // Output: 1
        System.out.println("Indice della colonna con 'gatto' nella tabella 2: " + searchInCols(table2, "gatto")); // Output: -1
        
    }
}
