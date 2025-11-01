/*
Questo programma ordina i nomi da args in ordine alfabetico e li stampa uno per riga.

Spiegazione del codice:

Metodo sortNames:
Questo metodo prende un array di stringhe (String[] names) come parametro e lo ordina 
alfabeticamente utilizzando il metodo Arrays.sort().

Metodo main:
Il metodo main è il punto di ingresso del programma. Prende i nomi forniti come 
argomenti da linea di comando (args).

Se non vengono forniti argomenti, il programma stampa un messaggio e termina.

Se ci sono argomenti, il programma chiama il metodo sortNames per ordinare i nomi.

Infine, il programma stampa i nomi ordinati, uno per riga.

Esecuzione del programma:
Per eseguire il programma, puoi compilarlo e poi eseguirlo dalla linea di comando, 
passando i nomi come argomenti:

java NameSorter Zorro Luca Andrea Antonio

Output atteso:

Andrea
Antonio
Luca
Zorro
*/

import java.util.Arrays;

public class NameSorterV2 {

    public static void sortNames(String[] names) {

        Arrays.sort(names);
    }


    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.out.println("Nessun nome fornito.");
            return;
        } else if (args.length < 2) {
            System.out.println("Inserire almeno 2 nomi.");
            return;
        }

        // Ordina i nomi
        sortNames(args);

        // Stampa i nomi ordinati
        for(String name : args) {
            System.out.println(name);
        }

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java NameSorterV2 Zorro Luca Andrea Antonio      
        Andrea
        Antonio
        Luca
        Zorro
        */

    }
    
}
