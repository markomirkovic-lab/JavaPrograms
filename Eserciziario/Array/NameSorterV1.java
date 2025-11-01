/*
https://gitalb.github.io/eserciziario2.0/array/sort/2018/05/15/namesorter.html
NameSorter May 15, 2018 array sort Livello 14 

NameSorter
Crea la classe NameSorter che dato un elenco di nomi forniti come argomenti da 
linea di comando, li ordina alfabeticamente. A tale scopo la classe deve 
contenere il metodo:

public static void sortNames(String[] names)
Che ordina l’array names fornito come parametro.

Alla fine il programma deve stampare i nomi in ordine alfabetico, esempio:

$ java NameSorter Zorro Luca Andrea Antonio
Andrea 
Antonio
Luca
Zorro
*/

import java.util.Arrays;

public class NameSorterV1 {

    // creazione array
    public static String[] arrayString(String[] args) {

        String[] arrayString = new String[args.length];

        for(int i = 0; i < args.length; i++) {

            arrayString[i] = args[i];
        }

        return arrayString;
    }

    // se esistenti, scambia i valori dei due elementi di a 
    // che si trovano in i e j.
    public static void swap(String[] a, int i, int j) {

        if(i >= 0 && i < a.length && j >=0 && j < a.length) {

            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    }


    // ordina l’array names fornito come parametro
    public static void sortNames(String[] names) {


        for(int i = 0; i < names.length; i++) {

            // il minimo della prima cella
            int letteraInferiore = i;

            for(int j = i+1; j < names.length; j++) {

                //    se quello che sta prima              >      di quello che sta dopo
                //    letteraInferiore = i                 >      j = i+1
                if(names[letteraInferiore].charAt(0) > names[j].charAt(0)) {

                    letteraInferiore = j;

                }

                // se non sono uguai, vuol dire che quello che sta prima > di quello che sta dopo
                // e quindi -> swap delle due posizioni
                if(letteraInferiore != i) {
                    swap(names, i, j);
                }
            }

        }

    }

    public static void main(String[] args) {
        
        if(args.length < 2) {

            System.out.println("Errore. Ci vogliono almeno due elementi");
            return;
        }

        String[] names = arrayString(args);

        System.out.println(Arrays.toString(names));

        sortNames(names);

        System.out.println(Arrays.toString(names));


    }
    
}
