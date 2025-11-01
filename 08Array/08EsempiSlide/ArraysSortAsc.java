import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSortAsc {

    public static void main(String[] args) {
        

        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        int[] a2 = { 3, 1, 4, 2, 6, 5 };

        for(int element : a2) {
            System.out.print(element + " ");//3 1 4 2 6 5
        }
        System.out.println();

        int[] arraySort = new int[a2.length];
        int[] arraySort2 = new int[a2.length];
        int[] arrayReverseSort = new int[a2.length];

        //arraySort = a2.clone();
        arraySort = Arrays.copyOf(a2, a2.length);

        for(int element : arraySort) {
            System.out.print(element + " ");//3 1 4 2 6 5
        }
        System.out.println();

        System.arraycopy(a2, 0, arraySort2, 0, a2.length);
        System.arraycopy(a2, 0, arrayReverseSort, 0, a2.length);

        for(int element : arraySort2) {
            System.out.print(element + " ");//3 1 4 2 6 5
        }
        System.out.println();

        // Sorting

        System.out.println();
        System.out.println("Sorting\n");

        Arrays.sort(arraySort);
        for(int element : arraySort) {
            System.out.print(element + " ");
        }
        System.out.println();//1 2 3 4 5 6

        System.out.println();


        Arrays.sort(arrayReverseSort, 0, 5);
        //Arrays.sort(arrayReverseSort, 5, 0);
        //ArrayUtilities.reverseOrder(arrayReverseSort);
        for(int element : arrayReverseSort) {
            System.out.print(element + " ");
        }
        System.out.println();//

        System.out.println();


        //---

        System.out.println("For inverse sorting of primities Interger wrapper class array must be used: ");

        Integer[] arrayReverseSort2 = new Integer[a2.length];

        for(int i = 0; i < a2.length; i++)
            arrayReverseSort2[i] = a2[i];

        Arrays.sort(arrayReverseSort2, Collections.reverseOrder());

        for(int element : arrayReverseSort2) {
            System.out.print(element + " ");
        }
        System.out.println();

        //

        System.out.println();
        System.out.println("Alternatively, sort first and reivse order with for cycle: \n");

        int[] arrayReverseSort3 = new int[a2.length];

        System.arraycopy(a2, 0, arrayReverseSort3, 0, a2.length);

        Arrays.sort(arrayReverseSort3);

        for(int element : arrayReverseSort3) {
            System.out.print(element + " ");
        }

        System.out.println();
        
        for(int i = 0; i < a2.length; i++) {
            
            int temp = arrayReverseSort3[arrayReverseSort3.length-1-i];

            arrayReverseSort3[i] = temp;

                
        }
            
        for(int element : arrayReverseSort3) {
            System.out.print(element + " ");
        }
        System.out.println(); 
                


    }
    
}
