/*
6.1 Fahrenheit e Celsius
Per poter convertire i gradi da Fahrenheit a Celsius dobbiamo sottrarre 32, moltiplicare per 5
e dividere per 9.
Scrivete il programma di conversione elaborato nell’esercizio 3.1.
Quanta memoria sarà occupata?
*/
import java.util.Scanner;

public class Es6_1_FahrenheitCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean coretto;

        double fahrenheit = 0;
        double celsius = 0;

        do {
            System.out.print("Inserici la temperatura in gradi F (numero intero o con decimali): ");

            if(input.hasNextDouble()) {
                coretto = true;
                fahrenheit = input.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;

            } else {
                System.out.println("Input errato, riprova!");
                coretto = false;
                input.nextLine();
            }

        } while(!coretto);

        System.out.println("Fahrenheit: \t" + fahrenheit + " gradi");
        System.out.println("Celsius: \t" + celsius + " gradi");
       
        input.close();
        
    }
    
}
