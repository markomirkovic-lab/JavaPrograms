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
SA 2024 - Esercitazione - Array Pagina 1 di 2
Bachelor in Ingegneria Informatica
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
import java.util.Arrays;
import java.util.Scanner;;

public class Es2_Media {

    static final int NUMERO = 7;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroInput;

        int[] array = new int[NUMERO];

        System.out.println("Inserire 7 numeri interi positivi");

        for(int i = 0; i < NUMERO; i++) {

            System.out.print("Inserici il numero " + (i+1) + ": ");
            
            if(input.hasNextInt()) {

                numeroInput = input.nextInt();

                if(numeroInput >= 0) {

                    array[i] = numeroInput;
                    input.nextLine();

                } else {

                    System.out.println("Errore. Il numero deve essere maggiore di 0, riprova.");
                    input.nextLine();
                    i--;
                }
                
            } else {

                System.out.println("Errore. Il numero deve essere un intero, riprova. ");
                input.nextLine();
                i--;
            }

        }


        int min = array[0];
        int max = array[0];
        double sum = 0;
        double averege = 0;

        for(int i = 0; i < NUMERO; i++) {

            if(min > array[i]) {

                min = array[i];
            }

            if(max < array[i]) {

                max = array[i];
            }

            sum += array[i];

        }

        averege = sum / array.length;

        int averegeInt = (int) averege;

        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Somma: " + sum);
        //System.out.println("Media: " + ((int) averege));
        System.out.println("Media: " + averegeInt);

        input.close();
    }
    
}
