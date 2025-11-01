import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations {
    private static final int DIMENSION = 5;

    private static int readInteger(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Please insert an integer. Retry: ");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    private static void fillMatrixWithRandomNumbers(int[][] matrix, int minimumValue, int maximumValue) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)//matrix[i] e' la riga
                matrix[i][j] = (int) (Math.random() * (maximumValue - minimumValue + 1)) + minimumValue;
                // riga i colonna j, 0 1 , prima riga + seconda colonna
    }

    private static int[][] copyMatrixWithInvertedRows(int[][] matrix) {
        int[][] copy = new int[matrix.length][matrix[0].length];// copia di dimensioni identiche [noRighe][noColonne]
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                copy[copy.length - i - 1][j] = matrix[i][j] % 2 == 0 ? matrix[i][j] : matrix[i][j] * 2;
        return copy;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix)// cicla solo sulle righe (non la matrice) = array monodimensionale
            System.out.println(Arrays.toString(row));
    }

    private static void printLeftDiagonal(int[][] matrix) {
        int[] leftDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            leftDiagonal[i] = matrix[i][i];
        System.out.println("\nLeft diagonal original matrix: " + Arrays.toString(leftDiagonal));
    }

    private static void printRightDiagonal(int[][] matrix) {
        int[] rightDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            rightDiagonal[i] = matrix[i][matrix.length - i - 1];
        System.out.println("Right diagonal original matrix: " + Arrays.toString(rightDiagonal));
    }

    private static void printMaxValueAndIndexes(int[][] copy) {
        int max = copy[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                if (max <= copy[i][j]) {
                    max = copy[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("\nMaximum value in copy matrix: " + max + ", row: " + maxRow + ", col: " + maxCol);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimumValue = readInteger(scanner, "Minimum value: ");
        int maximumValue = readInteger(scanner, "Maximum value: ");

        scanner.close();

        // controllo se l'utente ha fatto il min e max invertito
        if (minimumValue > maximumValue) {
            int tmp = minimumValue;
            minimumValue = maximumValue;
            maximumValue = tmp;
        }

        int[][] matrix = new int[DIMENSION][DIMENSION];

        fillMatrixWithRandomNumbers(matrix, minimumValue, maximumValue);

        int[][] copy = copyMatrixWithInvertedRows(matrix);

        System.out.println("\nOriginal matrix");
        printMatrix(matrix);

        System.out.println("\nCopy matrix");
        printMatrix(copy);

        printLeftDiagonal(matrix);

        printRightDiagonal(matrix);

        printMaxValueAndIndexes(copy);
    }
}