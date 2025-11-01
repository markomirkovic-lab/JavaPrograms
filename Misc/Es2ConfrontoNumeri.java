/**
Esercitazione - Primi programmi
Esercizio 2 - Confronto numeri

Scrivete un programma capace di richiedere all’utente l’immissione di due numeri
con la virgola. Successivamente, il programma dovrà identificare il numero maggiore
e mostrare a schermo tale numero seguito dalle parole “è maggiore”. Se i due
numeri dovessero essere uguali, il programma dovrà visualizzare il messaggio “I due
numeri sono uguali”.

 */
import java.util.Scanner;

public class Es2ConfrontoNumeri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Scrivi due numeri con la virgola: ");

        while(!input.hasNextDouble()) {
            System.out.println("Input non valido. Scrivi due numeri con la virgola: ");
            input.nextLine();// Scart input precedente
        }

        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();

        input.close();

        if(numero1 > numero2){
            System.out.println(numero1 + " e' maggiore");
        } else if(numero1 < numero2) {
            System.out.println(numero2 + " e' maggiore");
        } else {
            System.out.println("I due numeri sono uguali");
        }


    }
    
}
