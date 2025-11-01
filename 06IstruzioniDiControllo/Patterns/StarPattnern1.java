/*
Star Pattern 1


*

* 

* * 

* * * 

* * * * 

* * * * *   


*/

import java.util.Scanner;

public class StarPattnern1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("State with an integer the number of rows: ");

        int rows = scanner.nextInt();// Input

        scanner.close();

        // Logic
        for (int i = 1; i <= rows; ++i) {  //Outer loop for rows

            for (int j = 1; j <= i; ++j) { //Inner loop for Col

            System.out.print("* "); //Print *

            }

        System.out.println(); //New line

        }

    }
    
}
