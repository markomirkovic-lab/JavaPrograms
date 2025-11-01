public class ArrayMultiDim {
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
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
