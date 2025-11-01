/*
Es. 11.8
Dichiarate un array di interi di dimensione 10.
Alla prima posizione inserite 0, alla seconda 10, alla terza 20, e così via.
*/

import java.util.Arrays;

public class Es11_8_1_Consolidamento {

    public static void main(String[] args) {
        
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {

            array[i] = 10 * (i);
        }

        System.out.println(Arrays.toString(array));

        /*
        [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        */
    }
    
}
