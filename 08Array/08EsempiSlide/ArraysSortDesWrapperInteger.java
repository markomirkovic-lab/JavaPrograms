
import java.util.Arrays;
import java.util.Collections;


public class ArraysSortDesWrapperInteger {

    public static void main(String[] args) {
        

        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        int[] a2 = { 3, 1, 4, 2, 6, 5 };

        for(int element : a2) {
            System.out.print(element + " ");//3 1 4 2 6 5
        }
        System.out.println("\n");

        

        System.out.println("For inverse sorting of primities Interger wrapper class array must be used: \n");

        Integer[] arrayReverseSort2 = new Integer[a2.length];

        for(int i = 0; i < a2.length; i++)
            arrayReverseSort2[i] = a2[i];

        Arrays.sort(arrayReverseSort2, Collections.reverseOrder());

        for(int element : arrayReverseSort2) {
            System.out.print(element + " ");
        }
        System.out.println();

        /*

        3 1 4 2 6 5 

        For inverse sorting of primities Interger wrapper class array must be used:

        6 5 4 3 2 1
        
        */


    }
    
}

