
public class CorniceInvDiagonal {

    private static void printMatrix(int[][] array, int rows, int columns) {


        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] == -1 ? "  " : array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        int rows = 20;
        int columns = 20;


        // ctrl + d
        
        int[][] numbers = new int[rows][columns];

        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = (int) (10 * Math.random());
            }
        }

        

        printMatrix(numbers, rows, columns);

        System.out.println();


        // annullare dentro la cornice
        // A + B + C + D -> 

        /*
        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                if(!(i == 0 || j == 0 || j == columns-1 || i == rows-1)) {
                    numbers[i][j] = -1;
                }
            }
        }
        */

        for(int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                //Bubble pushing
                if(i != 0 && j != 0 && j != columns-1 && i != rows-1
                   && (i+j != rows-1) && i!=j) {
                    numbers[i][j] = -1;
                }
            }
        }

        printMatrix(numbers, rows, columns);
        

    }
    
}
