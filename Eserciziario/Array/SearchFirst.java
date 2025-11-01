/*
https://gitalb.github.io/eserciziario2.0/search/array/2017/04/25/searchfirst.html
SearchFirst Apr 25, 2017 search array Livello 12 

Scrivi la classe SearchFirst che applica una ricerca sequenziale per trovare la 
prima ricorrenza di args[0] in args[1;N] e ne stampa l’indice (partendo da 0). 
Ad esempio:

$ java SearchFirst 3 1 7 5 9 67 4 7 3 7 9
7
Oppure:

$ java SearchFirst 1 1 2 1 3 1 4 
1
Se il valore cercato non è presente il programma stampa il messaggio 
"Valore non trovato".
*/
public class SearchFirst {

    public static int primoIndice(String[] args) {

        String valoreDaCercare = args[0];
        int index = 0;

        for(int i = 0+1; i < args.length; i++) {

            if(args[i].equals(valoreDaCercare)){
                
                index = i;
                return index;
            }
        }

        if(index == 0) {

            System.out.println("Valore non trovato");
            return -1;
        }

        return index;
    }


    public static void main(String[] args) {
        
        if(args.length < 2) {
            System.out.println("Sono necessari almeno 2 elementi");
            return;
        }

        System.out.println(primoIndice(args));

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchFirst 1 1 2 1 3 1 4
        1
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchFirst 1 3 2 1 3 1 4
        3
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchFirst 1 3 2 4 3 4 4
        Valore non trovato
        -1
        */

    }
    
}
