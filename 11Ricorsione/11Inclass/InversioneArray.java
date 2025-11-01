/*
 * Inversione di un array
 */

public class InversioneArray {

    private static int[] invertiArray(int[] array) {

        int[] arrayInvertito = new int[array.length];

        int arrayLength = array.length;

        

        
        arrayInvertito[0] = array[arrayLength-1];



        return arrayInvertito;
    }

    private static void stampaArray(int[] array) {
        
        //int arrayLength = array.length();
        
        /*
        for(int i = 0; i < 5; i++) {
            System.out.println(invertiArray(array));
        }
        */

        for( int elements : array)
        System.out.println(elements);


    }




    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println(invertiArray(array));

        stampaArray(invertiArray(array));


        


    }
    
}
