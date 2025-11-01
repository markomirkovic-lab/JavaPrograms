import java.util.Scanner;

public class MonteCarlo {
    public static void main(String[] args) {
        System.out.println("""
                ============================================
                | Pi approximation with Monte Carlo method |
                ============================================
                """);

        Scanner scanner = new Scanner(System.in);

        String inputMessageForTheUser = "How many points should the program generate? ";
        int nrOfPointsToGenerate = 0;
        boolean askUserInput = true;

        while (askUserInput) {
            System.out.print(inputMessageForTheUser);

            while (!scanner.hasNextInt()) {
                System.out.println("Please insert an integer!");
                scanner.nextLine(); // Ignore the value entered by the user as it is not of the desired type (int)
                System.out.print(inputMessageForTheUser);
            }

            nrOfPointsToGenerate = scanner.nextInt();
            if (nrOfPointsToGenerate <= 0) {
                System.out.println("The inserted value is not feasible. Please insert an integer value that is greater than zero!");
                scanner.nextLine(); // empty the buffer
            } else {
                askUserInput = false;
            }
        }

        scanner.close();

        int insideCount = 0;

        for (int i = 0; i < nrOfPointsToGenerate; i++) {
            // generate point in 2D space with random coordinates between -1 and 1
            double x = 2 * Math.random() - 1;
            System.out.println(x);
            double y = 2 * Math.random() - 1;
            System.out.println(y);
            /*
            Explanation:
            The expression 2 * Math.random() - 1 in Java will produce a random number between -1 and 1.
            Here’s how it works:
            Math.random() returns a random double between 0.0 (inclusive) and 1.0 (exclusive) = [0.0,0.99].
            Multiplying Math.random() by 2 scales this range from 0.0 to 2.0.
            Subtracting 1 shifts the range, so the result is between -1.0 and 1.0.
            Thus, the output will be a random double in the range [−1.0,1.0]
            */

            // update the counter if the point is inside the circumference of radius 1
            double distanceFromTheOrigin = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            if (distanceFromTheOrigin < 1) {
                insideCount++;
            }
        }

        // compute the ratio of the inside-count and the total-sample-count
        double ratioInsideTotal = (double) insideCount / nrOfPointsToGenerate;

        // compute pi approximation
        double piApproximation = 4 * ratioInsideTotal;

        // show required information
        System.out.println("Nr of generated point that are inside the circumference of radius 1: " + insideCount);
        System.out.println("Pi approximation: " + piApproximation);
        System.out.println("Difference between the real value and the approximate one: " + (Math.PI - piApproximation));

    }
}
