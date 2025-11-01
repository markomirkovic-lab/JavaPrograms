import java.util.Scanner;

class Constants {
    static final int MAX_NR_CELLS = 186;
}

class ConsoleInteractionUtils {
    Scanner scanner = new Scanner(System.in);

    int readIntegerInRange(int min, int max) {
        int input = 0;
        boolean correctInput = false;
        while (!correctInput) {
            System.out.println("Please enter a number between " + min + " and " + max + ":");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input < min || input > max)
                    System.out.println("Error: number not in range.");
                else
                    correctInput = true;
            } else {
                System.out.println("Error: input is not a number.");
                emptyTheScanner();
            }
        }
        emptyTheScanner();
        return input;
    }

    String readStringAndEnsureIsNotEmptyOrWhiteSpaces() {
        String input = "";
        boolean correctInput = false;
        while (!correctInput) {
            System.out.println("Please enter a string:");
            input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                System.out.println("Error: string is empty or contains only white spaces.");
            } else {
                correctInput = true;
            }
        }
        return input;
    }

    boolean isValidGridDimensions(int height, int width) {
        return height > 0 && width > 0 && height * width <= Constants.MAX_NR_CELLS && height * width % 2 == 0;
    }

    int[] getGridDimensions() {
        int height = 0;
        int width = 0;
        boolean isValidInputs = false;

        String message = """
                Insert height and width of the grid such that:
                - height > 0,
                - width > 0,
                - height * width < %d
                - height * width %% 2 == 0
                """.formatted(Constants.MAX_NR_CELLS);

        System.out.println(message);
        do {
            System.out.println("Insert height: ");
            height = readIntegerInRange(1, Constants.MAX_NR_CELLS);

            System.out.println("Insert width: ");
            width = readIntegerInRange(1, Constants.MAX_NR_CELLS);

            isValidInputs = isValidGridDimensions(height, width);

            if (!isValidInputs) {
                System.out.println("One or more constraints are not met.");
            }

        } while (!isValidInputs);
        return new int[] { height, width };
    }

    Coordinate getCoordinate(int gridHeight, int gridWidth) {
        String message = String.format("""
                Insert row and column of the coordinate such that:
                - row >= 0,
                - row < %d,
                - col >= 0,
                - col < %d
                """, gridHeight, gridWidth);

        System.out.println(message);
        System.out.println("Insert row: ");
        int row = readIntegerInRange(0, gridHeight - 1);

        System.out.println("Insert column: ");
        int col = readIntegerInRange(0, gridWidth - 1);

        return new Coordinate(row, col);
    }

    void closeScanner() {
        scanner.close();
    }

    void emptyTheScanner() {
        scanner.nextLine();
    }
}

public class Grid {

    Card[][] grid;

    Grid(int height, int width) {
        /*
         * Printable unicode characters are 95.
         * We use:
         * - the space (decimal 32) to indicate empty cell,
         * - '!' (decimal 33) the back of a card.
         * This leaves 93 characters available.
         * As each character is used for two cards, we have 186 possible cards.
         * Sqrt(186) = 13.64, so maximum square grid is 13 x 13.
         */
        if (height <= 0 || width <= 0 || height * width > Constants.MAX_NR_CELLS || height * width % 2 != 0) {
            height = 13;
            width = 13;
        }

        // TO BE COMPLETED
    }

    void print() {
        // Print indices for columns
        System.out.print("    "); // initial space for row indices
        for (int i = 0; i < grid[0].length; i++) {
            System.out.printf(" %2d ", i);
        }
        System.out.println();

        // Print grid content
        for (int i = 0; i < grid.length; i++) {
            // Print top border for row
            System.out.print("    "); // initial space for row indices
            for (int j = 0; j < grid[i].length * 4 + 1; j++) {
                System.out.print("-");
            }
            System.out.println();

            // Print row index
            System.out.printf(" %2d |", i);

            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null) {
                    grid[i][j].print();
                } else {
                    System.out.print("   ");
                }
                System.out.print("|");
            }
            System.out.println();
        }

        // Print bottom border for last row
        System.out.print("    "); // initial space for row indices
        for (int i = 0; i < grid[0].length * 4 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

public class MemoryTest {
    public static void main(String[] args) {

    }
}
