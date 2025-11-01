//import java.util.Scanner;



public class EsCap3_1 {

    public static int[][] createMatrix(int x, int m, int n) {

        int number = x;
    
        int[][] matrix = new int[m][n];
    
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = number;
                number++;
            }
        }
    
        return matrix;
    
    }
    
    public static void printMatrix(int[][] matrix) {
    
        for(int[] row : matrix) {
            for(int element : row) {
                System.out.print(element + " \t");
            }
            System.out.println();
        }
    
    }
    
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);


        // Params
        int x = 13;
        int m = 4;
        int n = 8;

        // Matrix creation
        int[][] matrix = createMatrix(x, m, n);

        // Print matrix
        printMatrix(matrix);
       

    }

    
}
