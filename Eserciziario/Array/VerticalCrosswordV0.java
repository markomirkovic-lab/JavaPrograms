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

public class VerticalCrosswordV0 {

    // Ritorna la dimensione della riga più larga (con il maggior numero 
    // di colonne) contenuta nella matrice table.
    public static int getMaxWidth(char[][] table) {

        int maxWidth = table[0].length;

        for(int i = 0; i < table.length; i++) {

            for(int j = 0; j <table[i].length; j++) {

                if(maxWidth < table[i].length) {

                    maxWidth = table[i].length;
                }
            }
        }

        return maxWidth;
    }

    // Ritorna la stringa ottenuta concatenando tutti i caratteri presenti 
    // nella colonna col della matrice table. Le righe troppo corte per 
    // possedere un carattere nella colonna specificata da col vengono 
    // ignorate
    public static String getColAsString(char[][] table, int col) {

        StringBuilder stringWords = new StringBuilder();
        
        // riga
        for(int i = 0; i < table.length; i++) {
            
            if(col < table[i].length) {

                stringWords.append(table[i][col]);
            }    
        }
      
        String colWords = new String(stringWords);

        return colWords;
    }

    // Ritorna l’indice della colonna della matrice table che contiene la 
    // parola word (non sensibile al caso dei caratteri). Se word è 
    // presente in più colonne, ritorna l’indice della prima ricorrenza. 
    // Se nessuna colonna di table contiene word, ritorna -1.
    public static int searchInCols(char[][] table, String word) {

        word = word.toLowerCase();
        int maxWidth = getMaxWidth(table);

        for(int i = 0; i < table.length; i++) {
            
            // esatto matching della parola
            if(getColAsString(table, i).toLowerCase().equalsIgnoreCase(word)) {
                return i;
            }

            // esatto o parziale matching della parola
            if(getColAsString(table, i).toLowerCase().contains(word)) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        // Contiene il codice utile a verificare e dimostrare il buon 
        // funzionamento di tutti i metodi che hai scritto.

        // matriceChar1.length = 5

        //     0    1    2    3    4    5
        // 0 {'c', 'C', 'e', 'C', 'c'},	        matriceChar[0].length = 5
        // 1 {'c', 'a', 'n', 'a', 'a'},         matriceChar[1].length = 5
        // 2 {'c', 'p', 'a', 'N', 'n', 'E'},    matriceChar[2].length = 6
        // 3 {'a', 'e', 'e'},			        matriceChar[3].length = 3
        // 4 {'a', 'b', 'c', 'e', 'e'}          matriceChar[4].length = 5

        // if(col < table[i].length)
        //     3  <  5
        //     3  <  5
        //     3  <  6
        //     3  <  3   false
        //     3  <  5 

        char[][] matriceChar1 = {//   0    1    2    3    4    5
                                    {'c', 'C', 'e',	'C', 'c'},	
                                    {'c', 'a', 'n',	'a', 'a'},
                                    {'c', 'p', 'a', 'N', 'n', 'E'},
                                    {'a', 'e', 'e'},			
                                    {'a', 'b', 'c',	'e', 'e'}
                                };
        
        char[] [] matriceChar2 = {//  0    1    2    3    4    5
                                    {'G', 'a', 't', 't', 'o'},		
                                    {'r', 'b', 'a', 'u'},	
                                    {'R', 'A', 'p', 'U', 'n', 'Z', 'h'},	
                                    {'r', 'u', 'p'}
                                 };
        
        System.out.println("getMaxWidth(matriceChar1): " + getMaxWidth(matriceChar1));//6                         
        System.out.println("getMaxWidth(matriceChar2): " + getMaxWidth(matriceChar2));//7
        //System.out.println();
        
        System.out.print("getColAsString(matriceChar1, 5): ");
        String colWords = getColAsString(matriceChar1, 5);
        System.out.println(colWords);//E
        //System.out.println();

        System.out.print("searchInCols(matriceChar1, \"cane\"): ");
        System.out.println(searchInCols(matriceChar1, "cane"));//3
        //System.out.println();
        System.out.print("searchInCols(matriceChar2, \"cane\"): ");
        System.out.println(searchInCols(matriceChar2, "cane"));//-1
        //System.out.println();
        System.out.print("searchInCols(matriceChar2, \"ABAU\"): ");
        System.out.println(searchInCols(matriceChar2, "ABAU"));//1
        //System.out.println();
        System.out.print("searchInCols(matriceChar2, \"BAU\"): ");
        System.out.println(searchInCols(matriceChar2, "BAU"));//1

        /*
        getMaxWidth(matriceChar1): 6
        getMaxWidth(matriceChar2): 7
        getColAsString(matriceChar1, 5): E
        searchInCols(matriceChar1, "cane"): 3
        searchInCols(matriceChar2, "cane"): -1
        searchInCols(matriceChar2, "ABAU"): 1
        searchInCols(matriceChar2, "BAU"): 1
        */
    }
    
}
