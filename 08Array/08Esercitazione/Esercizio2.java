/*
Esercizio 2 - Media
Scrivete un programma che richieda all’utente l’inserimento di 7 numeri interi positivi.
Nel caso in cui l’utente inserisca un valore non corretto, visualizzare un messaggio di
errore e ripetere la richiesta. Tutti i numeri validi inseriti (devono essere 7) dovranno
essere salvati in un array.
Una volta completato l’inserimento, il programma dovrà determinare il numero
maggiore e quello minore e calcolare la media dei valori inseriti. La media dovrà
essere calcolata come un valore in virgola mobile ma visualizzata senza la sua parte
decimale.
L’output dovrà essere simile al seguente (in italico l’inserimento fatto dall’utente):
Inserisci un numero = 3
Inserisci un numero = 5
Inserisci un numero = 6
Inserisci un numero = -1
Numero non valido! Inserisci un numero = -5
Numero non valido! Inserisci un numero = 32
Inserisci un numero = 34
Inserisci un numero = -23
Numero non valido! Inserisci un numero = 10
Inserisci un numero = 0
Numero minimo: 0
Numero massimo: 34
Media dei valori inseriti: 12
*/
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numeri = new int[7];

        System.out.println("Scrivi 7 numeri interi positivi.");


        // Richiesta di 7 valori interi positivi
        for(int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci un numero " + (i+1) + " = ");
            int numero = input.nextInt();


            
            //Richiesta ripetuta nel caso il valore e' minore di zero
            while(numero < 0){
                System.out.print("Inserisci un numero " + (i+1) + " = ");
                numero = input.nextInt();
            }
            numeri[i] = numero;
            
            
            /*
            //Richiesta ripetuta nel caso il valore non e' di tipo intero
            while (!input.hasNextInt()) {
                System.out.print("Inserisci un numero " + (i+1) + " = ");
                numero = input.nextInt();
            }
            //Richiesta ripetuta nel caso il valore e' minore di zero
            while(numero < 0) {
                System.out.print("Inserisci un numero " + (i+1) + " = ");
                //Richiesta ripetuta nel caso il valore non e' di tipo intero
                while (!input.hasNextInt()) {
                    System.out.print("Inserisci un numero " + (i+1) + " = ");
                    input.nextLine();
                }
            }
            numeri[i] = numero;
            */
        }



        int numeroMaggiore = numeri[0];
        int numeroMinore = numeri[0];
        int sommaNumeri = numeri[0];
        double mediaNumeri = 0.0;
            

        for(int i = 0; i < numeri.length; i++) {

            sommaNumeri += numeri[i];

            if(numeroMaggiore < numeri[i]) {
                numeroMaggiore = numeri[i];
            }

            if(numeroMinore > numeri[i]) {
                numeroMinore = numeri[i];
            }
        }
 
        mediaNumeri = sommaNumeri / numeri.length;


        for(int i = 0; i < numeri.length; i++) {

            System.out.print(numeri[i]);

            if(i < numeri.length -1 ) {
                System.out.print(", ");
            }

        }

        System.out.println("");
        System.out.println("Numero minimo: " + numeroMinore);
        System.out.println("Numero massimo: " + numeroMaggiore);
        System.out.println("Media dei valori inseriti: " + ((int) mediaNumeri));

        input.close();
    }
    
}
