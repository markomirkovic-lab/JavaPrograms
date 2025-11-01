import java.util.Scanner;

public class MonteCarloV2 {
    public static void main(String[] args) {
        System.out.println("""
                ============================================
                | Pi approximation with Monte Carlo method |
                ============================================
                """);

        Scanner scanner = new Scanner(System.in);

        String inputMessageForTheUser = "How many points should the program generate? ";
        int nrOfPointsToGenerate = 0;
        
        System.out.print(inputMessageForTheUser);
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            nrOfPointsToGenerate = scanner.nextInt();
        }
        while (!hasNextInt || nrOfPointsToGenerate <= 0) {
            System.out.println("The inserted value is not feasible. Please insert an integer value that is greater than zero!");
            scanner.nextLine(); // Ignore the value entered by the user as it is not of the desired type (int)
            System.out.print(inputMessageForTheUser);
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                nrOfPointsToGenerate = scanner.nextInt();
            }
        }

        scanner.close();

        int insideCount = 0;

        for (int i = 0; i < nrOfPointsToGenerate; i++) {
            // generate point in 2D space with random coordinates between -1 and 1
            double x = 2 * Math.random() - 1;
            double y = 2 * Math.random() - 1;

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
