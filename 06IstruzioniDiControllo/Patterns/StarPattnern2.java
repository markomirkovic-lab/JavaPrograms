/*
Star Pattern 2


* * * * * 

* * * * 

* * * 

* * 

*   


*/
import java.util.Scanner;

public class StarPattnern2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("State with an integer the number of rows: ");

        int rows = scanner.nextInt();// Input

        scanner.close();
		
		for(int i = rows; i >= 1; --i) {  //For Loop for Row 

            for(int j = 1; j <= i; ++j) { //For Loop for Col

                System.out.print("* "); //Prints *

            }

            System.out.println(); //Get to newline

        }
		

    }
    
}
