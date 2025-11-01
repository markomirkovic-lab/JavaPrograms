/*
Star Pattern 4

           * 

         * * 

       * * * 

     * * * * 

   * * * * *   

*/

import java.util.Scanner;

public class StarPattnern4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("State with an integer the number of rows: ");

        int rows = scanner.nextInt();// Input

        scanner.close();// Closing scanner

		
        int i, j;

        for (i = 0; i < rows; i++) {  

            for (j = 2 * (rows - i)-3; j >= 0; j--) { //For Loop for Row
            //       2 * (4 - 0) - 3 = 5
            //       2 * (4 - 1) - 3 = 4
            //       2 * (4 - 2) - 3 = 3
                System.out.print(" "); // Print Spaces

            }

            for (j = 0; j <= i; j++) { //For Loop for col

                System.out.print("* "); // Print Star

            }

        System.out.println();// Next Line

        }
 
    }
}
