/*
MediaArray Mar 21, 2017 array Livello 9 

Scrivi il programma MediaArray che:

Crea un array di double di dimensione 50
Riempie l’array con 50 valori casuali compresi nell’intervallo [-10.0; 10.0]
Stampa il contenuto dell’array
Calcola la media dei valori contenuti nell’array
Stampa a terminale la media
*/

import java.util.Arrays;

public class MediaArray {

    public static void main(String[] args) {
        
        double[] array = new double[50];

        double somma = 0.0;
        double media = 0.0;

        for(int i = 0; i < array.length; i++) {

            array[i] = (double) (Math.random() * 20.0) - 10.0;

            somma += array[i];
        }

        for(double numeri : array){
            System.out.print(numeri + " ");
        }
        System.out.println("");

        System.out.println(Arrays.toString(array));

        // Calcolo media + stampa
        media = somma / (double) array.length;
        System.out.println("Media e' " + somma + " \\ " + ((double) array.length) + " = " + media);

        /*
        
        [-8.877287191406399, 2.7057096129790192, -4.0118888910017585, 5.108438518371985, 1.4074514472736421, 
        8.938739427454756, -8.580932199056718, -5.178574024359291, 6.386953191944656, -9.624721426802434, 
        -9.224335897165677, 4.1956601741751065, -7.11637375266184, 0.8584915175296981, -6.638824274050101, 
        9.11297920574085, -1.3621700305223534, 5.058874219440222, -5.004807052529201, -2.2019216807967563, 
        -6.345477312238592, 1.0484208492885916, -8.079066280912864, -2.439835983318668, -9.528558333667021, 
        -1.2534543999650243, 2.9361471257668974, 7.404232434572538, -3.042181641527484, 2.246181083402238, 
        -7.80548921669814, -2.501099668925444, 1.8346695781040907, -4.858242733450857, -7.981054736260589, 
        0.4135107376654972, 5.314739004151344, 9.719045550929753, -2.4121867811817026, 3.588016075887648, 
        -4.907815394309356, -6.7698635085746055, -6.500505660546896, -2.3250767001937556, 1.3691572558514693, 
        7.465097561842629, -4.009639361428389, 1.1933561797300474, 3.688421868578242, -8.554860276713443]
        Media e' -65.14195178958445 \ 50.0 = -1.302839035791689

        */
    }
    
}
