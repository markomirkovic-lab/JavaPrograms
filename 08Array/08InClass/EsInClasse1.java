/*
Esercizio svolto in classe
Scrivere un programma che:
chieda all'utente 10 numeri interi, minori di 100
li salvi in un array
stampi i valori che sono in una cella dell'array con indice dispari
stampi il valore massimo contenuto nell'array
 */
import java.util.Scanner;

public class EsInClasse1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeri[] = new int[10];

        int valoreMassimo = 0;

        System.out.println("Scrivi 10 numeri interi minori di 100: ");

        for(int i = 0; i < numeri.length; i++) {
            numeri[i] = input.nextInt();
        
        }

        for(int i = 0; i < numeri.length; i++) {
            if(numeri[i] % 2 != 0) {
                System.out.print(numeri[i] + " ");
            }
        }

        // importante: assegnazione valore massimo al primo numero dell'array
        valoreMassimo = numeri[0];

        for(int i = 0; i < numeri.length; i++) {

            if(numeri[i] > valoreMassimo) {
                valoreMassimo = numeri[i];
            }
        }    

        System.out.println("Valore masssimo: " + valoreMassimo);

        
        input.close();


    }
    
}
