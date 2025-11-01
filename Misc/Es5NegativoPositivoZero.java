/**
Esercitazione - Primi programmi
Esercizio 5 - Negativo, positivo, zero

Scrivete un programma in grado di richiedere all’utente l’immissione di 10 valori
numerici e di contare e visualizzare quanti numeri positivi, negativi e uguali a zero
sono stati inseriti.
 */
import java.util.Scanner;

public class Es5NegativoPositivoZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Scrivere 10 valori numerici: ");

        while(!input.hasNextDouble()) {
            System.out.println("Input non valido. Scrivere 10 valori numerici separati da spazzi: ");
            input.nextLine();
            input.nextLine();
        }

        /*
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        double numero3 = input.nextDouble();
        double numero4 = input.nextDouble();
        double numero5 = input.nextDouble();
        double numero6 = input.nextDouble();
        double numero7 = input.nextDouble();
        double numero8 = input.nextDouble();
        double numero9 = input.nextDouble();
        double numero10 = input.nextDouble();
        */

        // Counter
        int positivi = 0;
        int negativi = 0;
        int zero = 0;

        for(int i = 1; i<11; i++){
            double numero = input.nextDouble();
                if(numero > 0) {
                    positivi++;
                } else if(numero < 0) {
                    negativi++;
                } else {
                    zero++;
                }
        }

        input.close();

        System.out.println("I numeri che hai inserito sono: ");
        System.out.println("numeri positivi: " + positivi);
        System.out.println("numeri negativi: " + negativi);
        System.out.println("numeri zeri: " + zero);

    }
    
}
