import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Code with switch: ");

        System.out.println("State 1st number: ");
        double firstNumber = input.nextDouble();
        input.nextLine();

        System.out.println("State the operator (+ or - or * or /): ");
        char operator = input.next().charAt(0);

        System.out.println("State the 2nd number: ");
        double secondNumber = input.nextDouble();

        double result = 0;


        switch(operator) {

            case '+':
            result = firstNumber + secondNumber;
            break;

            case '-':
            result = firstNumber - secondNumber;
            break;

            case '*':
            result = firstNumber * secondNumber;
            break;

            case '/':
            result = firstNumber / secondNumber;
            break;

            default:
            System.out.println("Input error. Wrong number or operator given");

        }

        System.out.println("The operation " + firstNumber + " " + operator + " " + secondNumber + " = " + result);

        
        //----------------------------------------------------------

        
        System.out.println("Code with if loop: ");

        System.out.println("State 1st number: ");
        firstNumber = input.nextDouble();
        input.nextLine();

        System.out.println("State the operator (+ or - or * or /): ");
        operator = input.next().charAt(0);

        System.out.println("State the 2nd number: ");
        secondNumber = input.nextDouble();

        if(operator == '+'){
            result = firstNumber + secondNumber;
        } else if(operator == '-'){
            result = firstNumber - secondNumber;
        } else if (operator =='*'){
            result = firstNumber * secondNumber;
        } else if (operator == '/'){
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Input error. Wrong number or operator given");
        }
        
       
        System.out.println("The operation " + firstNumber + " " + operator + " " + secondNumber + " = " + result);


    }
    
}
