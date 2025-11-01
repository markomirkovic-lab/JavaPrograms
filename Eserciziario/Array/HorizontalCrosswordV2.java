/*
https://gitalb.github.io/eserciziario2.0/array/methods/2019/03/08/horizontalcrossword.html
HorizontalCrossword Mar 8, 2019 array methods Livello 12 

Scrivi il programma HorizontalCrossword contenente i metodi utili per trovare 
delle parole nascoste nelle righe di una matrice.

La classe HorizontalCrossword deve contenere i metodi seguenti:

public static String reverse(String word)
Ritorna la stringa word rovesciata, ad esempio per "cane" ritorna "enac".

public static String getRowAsString(char[][] table, int row)
Ritorna la stringa ottenuta concatenando tutti i caratteri presenti nella
riga row della matrice table.

public static int searchInRows(char[][] table, String word)
Ritorna l’indice della riga della matrice table che contiene la parola word 
(regolare o rovesciata, non sensibile al caso dei caratteri). Se word è 
presente in più righe, ritorna l’indice della prima ricorrenza. Se nessuna 
riga di table contiene word, ritorna -1.

Ad esempio per la parole “cane” e la matrice seguente il metodo ritorna 1:

c	C	e	a	c	
c	A	n	E	a	
o	N	i	s	N	E
b	E	e			
g	a	t	t	E	

Mentre per questa ritorna 3:

t	O	p	o	C	a	N
F	r	o	g			
T	a	n	A	r		
e	N	A	c	i	o	S
A	g	u	L	e	B	
B	o	V	e
			
main
Contiene il codice utile a verificare e dimostrare il buon funzionamento di tutti i metodi che hai scritto.
*/
public class HorizontalCrosswordV2 {

    /*
    Questo codice dimostra come cercare parole nascoste nelle righe di una 
    matrice, considerando sia la parola originale che la sua versione rovesciata.

    Spiegazione del codice:
    reverse(String word):
    Questo metodo utilizza StringBuilder per invertire la stringa in input. 
    Ad esempio, per "cane" restituisce "enac".

    getRowAsString(char[][] table, int row):
    Questo metodo concatena tutti i caratteri della riga specificata (row) 
    della matrice table e restituisce la stringa risultante.

    searchInRows(char[][] table, String word):
    Questo metodo cerca la parola word (o la sua versione rovesciata) in 
    tutte le righe della matrice. La ricerca non è sensibile al caso dei 
    caratteri. Se la parola viene trovata in una riga, viene restituito 
    l'indice della riga. Se la parola non viene trovata in nessuna riga, 
    viene restituito -1.

    main:
    Il metodo main contiene esempi di utilizzo dei metodi per verificare 
    il loro corretto funzionamento. Vengono create due matrici di esempio 
    e vengono testati i metodi reverse, getRowAsString e searchInRows.

    Output atteso:
    Copy
    Parola 'cane' rovesciata: enac
    Riga 1 della tabella 1: cAnEa
    Riga 3 della tabella 2: eNAcioS
    Indice della riga con 'cane' nella tabella 1: 1
    Indice della riga con 'cane' nella tabella 2: 3
    Indice della riga con 'gatto' nella tabella 1: -1

    Esempi di funzionamento:
    Nella tabella 1, la parola "cane" è presente nella riga 1 (cAnEa), 
    quindi searchInRows restituisce 1.

    Nella tabella 2, la parola "cane" è presente nella riga 3 (eNAcioS), 
    quindi searchInRows restituisce 3.

    La parola "gatto" non è presente in nessuna riga della tabella 1, 
    quindi searchInRows restituisce -1.
    */

    // Metodo per invertire una stringa
    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    // Metodo per ottenere una riga come stringa
    public static String getRowAsString(char[][] table, int row) {
        StringBuilder rowString = new StringBuilder();
        for (int col = 0; col < table[row].length; col++) {
            rowString.append(table[row][col]);
        }
        return rowString.toString();
    }

    // Metodo per cercare una parola nelle righe della matrice
    public static int searchInRows(char[][] table, String word) {
        word = word.toLowerCase(); // Ignora il caso dei caratteri
        String reversedWord = reverse(word); // Ottieni la parola rovesciata

        for (int row = 0; row < table.length; row++) {
            String rowString = getRowAsString(table, row).toLowerCase();
            if (rowString.contains(word) || rowString.contains(reversedWord)) {
                return row;
            }
        }
        return -1;
    }

    // Metodo main per testare i metodi
    public static void main(String[] args) {

        char[][] table1 = {
            {'c', 'C', 'e', 'a', 'c'},
            {'c', 'A', 'n', 'E', 'a'},
            {'o', 'N', 'i', 's', 'N', 'E'},
            {'b', 'E', 'e'},
            {'g', 'a', 't', 't', 'E'}
        };

        char[][] table2 = {
            {'t', 'O', 'p', 'o', 'C', 'a', 'N'},
            {'F', 'r', 'o', 'g'},
            {'T', 'a', 'n', 'A', 'r'},
            {'e', 'N', 'A', 'c', 'i', 'o', 'S'},
            {'A', 'g', 'u', 'L', 'e', 'B'},
            {'B', 'o', 'V', 'e'}
        };

        // Test reverse
        System.out.println("Parola 'cane' rovesciata: " + reverse("cane")); // Output: "enac"

        // Test getRowAsString
        System.out.println("Riga 1 della tabella 1: " + getRowAsString(table1, 1)); // Output: "cAnEa"
        System.out.println("Riga 3 della tabella 2: " + getRowAsString(table2, 3)); // Output: "eNAcioS"

        // Test searchInRows
        System.out.println("Indice della riga con 'cane' nella tabella 1: " + searchInRows(table1, "cane")); // Output: 1
        System.out.println("Indice della riga con 'cane' nella tabella 2: " + searchInRows(table2, "cane")); // Output: 3
        System.out.println("Indice della riga con 'gatto' nella tabella 1: " + searchInRows(table1, "gatto")); // Output: -1

        /*
        Parola 'cane' rovesciata: enac
        Riga 1 della tabella 1: cAnEa
        Riga 3 della tabella 2: eNAcioS
        Indice della riga con 'cane' nella tabella 1: 1
        Indice della riga con 'cane' nella tabella 2: 3
        Indice della riga con 'gatto' nella tabella 1: -1
        */
    }
}

