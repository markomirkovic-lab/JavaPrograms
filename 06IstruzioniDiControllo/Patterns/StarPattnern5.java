
/*
Star Pattern 5


* * * * *

  * * * *

    * * *

      * *

        *  

*/
import java.util.Scanner;

public class StarPattnern5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("State with an integer the number of rows: ");

        int rows = scanner.nextInt();// Input

        scanner.close();// Closing scanner
		
		for (int i = rows; i >= 1; i--) { 

            for (int j = rows; j > i; j--) { 
            
                System.out.print(" "); // Prints Blank space
            
            }
            
            for (int k = 1; k <= i; k++) {
            
                System.out.print("*"); //Prints *
                
                int counter = 1;
                if(k==counter)
                {
                    //System.out.print(" ");
                    counter = counter + k; 
                    
                }
               
            //System.out.print("");
            
            }
            
            System.out.println(" "); //Prints blank spaces
                        
            }
		

    }
}
