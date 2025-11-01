import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        //int number = 12345;  // The integer you want to extract digits from


        Scanner input = new Scanner(System.in);

        int number = input.nextInt();


        // Initialize a variable to keep track of the position (index)
        int index = 0;

        // Loop to extract each digit
        while (number > 0) {
            // Extract the last digit using modulo
            int digit = number % 10;

            // Print the digit at the current index (from right to left)
            System.out.println("Digit at index " + index + ": " + digit);

            // Remove the last digit from the number by dividing by 10
            number = number / 10;

            // Move to the next index
            index++;
        }
    }
}
