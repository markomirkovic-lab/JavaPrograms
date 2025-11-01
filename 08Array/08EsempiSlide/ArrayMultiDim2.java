public class ArrayMultiDim2 {
    public static void main(String[] args) {
        int[][] nums = { 
                { 99, 85, 98 }, 
                { 98, 57, 78 }, 
                { 92, 77, 76 }, 
                { 94, 32, 11 }, 
                { 99, 34, 22 }, 
                { 90, 46, 54 },
                { 76, 59, 88 }, 
                { 92, 66, 89 }, 
                { 97, 71, 24 }, 
                { 89, 29, 38 } };

        for (int i = 0; i < nums.length; i++) {
            int[] rigaCorrente = nums[i];// una riga dell'array
            for (int j = 0; j < rigaCorrente.length; j++) {
                System.out.print(rigaCorrente[j] + " ");
            }
            System.out.println();
        }
    }
}
