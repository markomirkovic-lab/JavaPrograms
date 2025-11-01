/*
Esercizio 2 - Minimo e massimo - con ciclo do while
Scrivete un programma capace di richiedere all’utente di inserire, in maniera
ripetuta, dei numeri in virgola mobile. La richiesta di nuovi valori dovrà terminare non
appena l’utente inserirà il valore 0. Al termine il programma dovrà visualizzare a
schermo il valore minimo e quello massimo inseriti.
L’output dovrà essere simile al seguente (in italico l’inserimento fatto dall’utente):
Numero: -1.35
Numero: 5.75
Numero: 2.23
Numero: -6.54
Numero: 0
Numero minimo: -6.54
Numero massimo: 5.75
Sviluppate due versioni del programma; la prima che utilizzi l’istruzione while e la
seconda che utilizzi l’istruzione do …while.
Suggerimento: la costante Double.MAX_VALUE rappresenta il valore massimo
rappresentabile con il tipo di dato double
*/

import java.util.Scanner;

public class Es2MinimoMassimoCicloDoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String richiestaNormale = "Scrivere un numero con virgola mobile: \nPer terminare il programma scrivere 0 \nNumero: ";

        String richiestaRipetuta = "Ha inserito un numero sbagliato. \nScrivere un numero con virgola mobile: \n" + 
                        "Per terminare il programma scrivere 0 \nNumero: ";

        boolean continuaUtente = true;

        double  inputUtente = 1.0;
        double  minimo = 0.0;
        double  massimo = 0.0;

        System.out.print(richiestaNormale);

        do {
            while (!scanner.hasNextDouble()) {
                    System.out.print(richiestaRipetuta);
                    scanner.nextLine();
            }
            
            inputUtente = scanner.nextDouble();

            if(inputUtente > massimo){
                massimo = inputUtente;
            }
            if(inputUtente < minimo){
                minimo = inputUtente;
            }
            if(inputUtente != 0){
                System.out.print("Numero: ");
            }
            if ( inputUtente == 0){
                continuaUtente = false;
            }
        } while(continuaUtente);

        scanner.close();

        System.out.println("Numero minimo: " + minimo);
        System.out.println("Numero massimo: " + massimo);

    }
    
}
