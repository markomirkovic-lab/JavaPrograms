/*
9.7 Calcolatrice
Scrivete un programma che chiede all’utente di inserire due numeri e l’operazione da 
applicare (può scegliere fra '+', '-' , '*', '/'). Poi esegue l’operazione e stampa il 
risultato.
*/

import java.util.Scanner;

public class Es9_7_Calcolatrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double primoNumero;
        double secondoNumero;
        double risultato = 0;
        // double somma;
        // double sottrazione;
        // double motltiplicazione;
        // double divisione;
        char operatore;

        System.out.print("Inserire il primo numero: ");
        primoNumero = input.nextDouble();
        input.nextLine();

        System.out.print("Inserire il l'operatore numero: ");
        operatore = input.next().trim().charAt(0);
        input.nextLine();

        System.out.print("Inserire il secondo numero: ");
        secondoNumero = input.nextDouble();
        input.nextLine();

        switch (operatore) {
            case '+':
                risultato = primoNumero + secondoNumero;
                // System.out.println("Risultato somma = " + somma);
                break;

            case '-':
                risultato = primoNumero - secondoNumero;
                //System.out.println("Risutlato sottrazione = " + sottrazione);
                break;

            case '*':
            case 'x':
            case 'X':
                risultato = primoNumero * secondoNumero;
                //System.out.println("Risulato moltiplicazione = " + motltiplicazione);
                break;

            case '/':
            case ':':
                risultato = primoNumero / secondoNumero;
                //System.out.println("Risultato divisione = " + divisione);
                break;

            default:
                operatore = 0;
                risultato = 0;
                //System.out.println("Errore.");
                break;
        }

        if(operatore == 0) {
            System.out.println("\nOperazione non valida!");
        } else {
            System.out.println("\nRisulato: " + risultato);
        }

    }

}
