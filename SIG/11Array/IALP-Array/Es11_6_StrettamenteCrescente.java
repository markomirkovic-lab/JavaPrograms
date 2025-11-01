/*
11.6 Strettamente crescente
Scrivete un programma che chiede all’utente di inserire dei numeri interi e li inserisce in un 
array. C’è però una condizione, il numero immesso deve essere sempre maggiore dei numeri 
immessi in precedenza.
*/
import java.util.Scanner;

public class Es11_6_StrettamenteCrescente {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        long numero[] = new long[10];

        boolean maggiore;

        long num, max;

        for(int i = 0; i < numero.length; i++) {

            // ciclo do while
            // eseguira 1 sola volta per ogni i se maggiore == true
            // altrimenti continuare a ciclare finche maggiore == false
            do {
                System.out.print("Inserisci un numero: ");
                num = input.nextLong();

                numero[i] = num;

                if(i == 0) {
                    // È il primo numero, sarà sempre il maggiore finora inserito
                    maggiore = true;

                } else {

                    // Assegnazione numero massimo al numero precedente nella lista array
                    // per poter fare il confronto
                    max = numero[i-1];

                    // Altrimenti (else) devo controllare che sia maggiore di quello precedente
                    if(num > max) {     

                        maggiore = true;

                    } else {

                        maggiore = false;
                        System.out.println("Input errato, riprova! ");
                    }
    
                }

            } while(!maggiore);

        }

        for(int i = 0; i < numero.length; i++) {

            System.out.print(numero[i] + " ");
        }

    }
    
}
