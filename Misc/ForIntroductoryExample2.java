/*
 * Scrivere un programma che esegua le seguenti operazioni:
 * - Chiedere all'utente di inserire un numero intero positivo
 * - Stampare a schermo tutti i numeri da quello quello inserito
 *   fino a 0 in ordine decrescente, separati da virgole.
 * - L'ultimo unumero, lo 0, non deve essere seguito da una virgola
 *   Es. di output se l'utente inserice 4: 4, 3, 2, 1
 */

import java.util.Scanner;

public class ForIntroductoryExample2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserici un numero intero positivo: ");

        int userInput = scanner.nextInt();

        scanner.close();

        System.out.println("Con \"while\"");
        int j = userInput;

        while(j >= 0 ){
            System.out.print(j);
            if(j != 0) {
                System.out.print(", ");
            }
            j--;
        }

        System.out.println("");


        // in Java ci sono altre due istruzioni per ciclare:
        // ciclo do while
        // ciclo for
        // cicli for e while sono analoghi
        // l'unica differenza e' la modifica della variabile 
        // nel while e' nel blocco
        // e devo inizializzare la variable fuori dal ciclo
        // quindi for e' piu' compatto (sintassi diversa)


        // Ciclo for

        System.out.println("Con \"for\"");

        // se la condizione e' vera esegue il codice nel blocco
        // poi finita l'esecuzione modifica della variable (i)
        // poi verifica la condizione
        // ...
        for(int i = userInput; i >=0; i--){
            // parte identica al ciclo while
            System.out.print(i);
            if(i != 0) {
                System.out.print(", ");
            }
        }


        

    }
}
