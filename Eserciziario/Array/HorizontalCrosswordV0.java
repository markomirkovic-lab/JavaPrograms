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

public class HorizontalCrosswordV0 {

    // Ritorna la stringa word rovesciata, ad esempio per "cane" ritorna "enac".
    public static String reverse(String word) {

        String reversedWord = "";

        for(int i = word.length()-1; i >= 0; i--) {

            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }

    // Ritorna la stringa ottenuta concatenando tutti i caratteri presenti nella
    // riga row della matrice table.
    public static String getRowAsString(char[][] table, int row) {

        StringBuilder rowString = new StringBuilder();
        //String rowString = "";

        for(int i = 0; i < table[row].length; i++) {

            rowString.append(table[row][i]);
        }

        return rowString.toString();
    }

    // Ritorna l’indice della riga della matrice table che contiene la parola word
    // (regolare o rovesciata, non sensibile al caso dei caratteri). Se word è
    // presente in più righe, ritorna l’indice della prima ricorrenza. Se nessuna
    // riga di table contiene word, ritorna -1.
    public static int searchInRows(char[][] table, String word) {

        word = word.toLowerCase();
        String reversedWord = reverse(word).toLowerCase();
        int indexWord;

        for(int i = 0; i < table.length; i++) {

            // verifica per la parola regolare o rovesciata
            if(getRowAsString(table, i).toLowerCase().contains(word) ||
               getRowAsString(table, i).toLowerCase().contains(reversedWord)) {

                indexWord = i;
                return indexWord;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        char[][] table1 = {
                // 0    1    2    3    4    5
                { 'c', 'C', 'e', 'a', 'c' },        // 0
                { 'c', 'A', 'n', 'E', 'a' },        // 1
                { 'o', 'N', 'i', 's', 'N', 'E' },   // 2
                { 'b', 'E', 'e' },                  // 3
                { 'g', 'a', 't', 't', 'E' }         // 4
        };

        char[][] table2 = {
                // 0    1    2    3    4    5    6
                { 't', 'O', 'p', 'o', 'C', 'a', 'N' },
                { 'F', 'r', 'o', 'g' },
                { 'T', 'a', 'n', 'A', 'r' },
                { 'e', 'N', 'A', 'c', 'i', 'o', 'S' },
                { 'A', 'g', 'u', 'L', 'e', 'B' },
                { 'B', 'o', 'V', 'e' }
        };


        System.out.println("reverse(\"cane\"): " + reverse("cane"));//reverse("cane"): enac

        System.out.println("getRowAsString(table1, 1): " + getRowAsString(table1, 1));//getRowAsString(table1, 1): cAnEa
        System.out.println("getRowAsString(table1, 2): " + getRowAsString(table1, 2));//getRowAsString(table1, 2): oNisNE
        System.out.println("getRowAsString(table1, 3): " + getRowAsString(table1, 3));//getRowAsString(table1, 3): bEe
        System.out.println("getRowAsString(table1, 4): " + getRowAsString(table1, 4));//getRowAsString(table1, 4): gattE
        System.out.println("searchInRows(table1, \"cane\": " + searchInRows(table1, "cane"));//1
        System.out.println("searchInRows(table1, \"isne\": " + searchInRows(table1, "isne"));//2
        System.out.println("searchInRows(table1, \"test\": " + searchInRows(table1, "test"));//-1
        System.out.println("searchInRows(table2, \"rog\": " + searchInRows(table2, "rog"));//1
        System.out.println("searchInRows(table2, \"enac\": " + searchInRows(table2, "enac"));//3
        System.out.println("searchInRows(table2, \"test\": " + searchInRows(table2, "test"));//-1




    }

}
