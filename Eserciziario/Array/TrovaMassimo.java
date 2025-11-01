/*
TrovaMassimo Mar 21, 2017 array Livello 9 

Scrivi il programma TrovaMassimo che:

Crea un array di interi di dimensione 100
Riempie l’array con 100 valori casuali compresi nell’intervallo [-100; 0]
Stampa il contenuto dell’array
Trova il valore massimo contenuto nell’array
Stampa a terminale il massimo
*/

import java.util.Arrays;

public class TrovaMassimo {

    public static void main(String[] args) {

        int[] array = new int[100];

        int max = 0;
        int min = 0;

        for(int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 101) - 100;
        }

        System.out.println(Arrays.toString(array));

        // trova massimo
        max = array[0];
        // trova minimo
        min = array[0];

        for(int i = 0; i < array.length; i++) {

            if(max < array[i]) {
                max = array[i];
            }

            if(min > array[i]) {
                min = array[i];
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        /*
        [-48, -20, -92, -87, -10, -48, -67, -21, -74, -56, 
        -25, -56, -42, -88, -52, -29, -42, -44, -76, -14, 
        -39, -58, -71, -75, -37, -36, -79, -48, -90, -30, 
        -79, -96, -99, -42, -96, -38, -68, -69, -32, -23, 
        -4, -84, -16, -99, -92, -53, -90, -21, -88, -4, 
        -22, -52, -35, -16, -97, -14, -3, -24, -47, -21, 
        -68, -4, -86, -5, -17, -95, -77, -96, -1, -70, -8, 
        0, -69, -100, -57, -95, -85, -49, -83, -67, -45, 
        -5, -9, -53, -46, -16, -98, -27, -53, -62, -80, 
        -81, -99, -85, -42, -43, -82, -96, -50, -85]
        Max: 0
        Min: -100
        */

    }
    
}
