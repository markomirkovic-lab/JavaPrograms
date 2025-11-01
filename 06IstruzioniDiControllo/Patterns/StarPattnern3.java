/*
Star Pattern 3


* 

* * 

* * * 

* * * * 

* * * * * 

* * * * 

* * * 

* * 

*   

*/


import java.util.Scanner;

public class StarPattnern3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("State with an integer the number of rows: ");

        int rows = scanner.nextInt();// Input

        scanner.close();// Closing scanner
		
		for (int i = 0; i <= rows - 1; i++) { //For Loop for Row 

            for (int j = 0; j <= i; j++) { //For Loop for Col
            
                System.out.print("*" + " "); //prints * and blank space
            
            }
            
        System.out.println(""); // new line
        
        }
        
        
        for (int i = rows - 1; i >= 0; i--) { //For Loop for Row
            // rows-1 as first loop already executed 4 rows (3 rows to go for the pattern)
            
            for (int j = 0; j <= i - 1; j++) { //For Loop for Col
            // i-1 as first loop already executed 4 columns (3 columns to go for the pattern)
            
                System.out.print("*" + " "); //prints * and blank space
            
            }
            
        System.out.println("");// new line
            
        }
		
    }
    
}
