/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/searchlast.html
SearchLast Apr 25, 2017 search array Livello 12 

Scrivi la classe SearchLast che applica una ricerca sequenziale per trovare 
l’ultima ricorrenza di args[0] in args[1;N] e ne stampa l’indice (partendo da 0). 
Ad esempio:

$ java SearchLast 3 1 7 5 9 67 4 7 3 7 9
7Oppure:

$ java SearchLast 1 1 2 1 3 1 4 
4

Se il valore cercato non è presente il programma stampa il messaggio "Valore non trovato".
*/
public class SearchLastV1 {

    public static int indice(String[] args) {

        String valoreDaCercare = args[0];
        int index = 0;

        for(int i = 0; i < args.length; i++) {

            if(args[i].equals(valoreDaCercare)) {

                index = i;
            }
        }

        if(index > args.length) {

            System.out.println("Valore non trovato");
        } else {

            return index;
        }

        return -1;
    }

    public static void main(String[] args) {

        if(args.length < 2) {
            System.out.println("Sono necessari almeno 2 elementi");
            return;
        }

        System.out.println(indice(args));

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchLastV1 3 1 7 5 9 67 4 7 3 7 9
        8
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchLastV1 1 1 2 1 3 1 4         
        5
        */
        
    }
    
}
