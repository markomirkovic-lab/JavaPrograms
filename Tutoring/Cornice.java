
public class Cornice {

    private static void printMatrix(int[][] array, int rows, int columns) {


        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] == -1 ? "  " : array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        int rows = 10;
        int columns = 5;


        // ctrl + d
        
        int[][] numbers = new int[rows][columns];

        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = (int) (10 * Math.random());
            }
        }

        

        printMatrix(numbers, rows, columns);

        System.out.println();


        // annullare la cornice

        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                if(i == 0 || j == 0 || j == columns-1 || i == rows-1) {
                    numbers[i][j] = -1;
                }
            }
        }

        printMatrix(numbers, rows, columns);
        

    }
    
}
