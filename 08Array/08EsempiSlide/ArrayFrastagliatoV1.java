
public class ArrayFrastagliatoV1 {
    public static void main(String[] args) {

        // array multidimensionali frastagliati (jagged) 
        int[][] nums = { 
            { 0, 1 }, 
            { 10, 11, 12, 13 }, 
            { 20, 21, 22 } };
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //foreach

        for (int[] riga : nums) {
            for (int valore : riga) {
                System.out.print(valore + " ");
                    }
            System.out.println();
        }

        System.out.println();

        //copia

        int[][] mioArrCopia = new int[nums.length][];
        System.arraycopy(nums, 0, mioArrCopia, 0, nums.length);

        /*
        for (int i = 0; i < nums.length; i++) {
            mioArrCopia[i] = new int[nums[i].length];
            for (int j = 0; j < nums[i].length; j++) {
                mioArrCopia[i][j] = nums[i][j];
            }
          }
        
        */
         
        for (int i = 0; i < mioArrCopia.length; i++) {
            for (int j = 0; j < mioArrCopia[i].length; j++) {
                System.out.print(mioArrCopia[i][j] + ", ");
            }
            System.out.println();
        }
 
    }
}
