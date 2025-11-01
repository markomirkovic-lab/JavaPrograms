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

public class Es2_MediaV2 {

    static final int NUMERO = 7;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroInput;

        int[] array = new int[NUMERO];

        System.out.println("Inserire 7 numeri interi positivi");

        for(int i = 0; i < NUMERO; i++) {

            System.out.print("Inserici il numero: ");
            numeroInput = input.nextInt();
            input.nextLine();
            
            while(numeroInput < 0){

                System.out.print("Numero non valido! Inserisci un numero: ");
                numeroInput = input.nextInt();
                input.nextLine();
            }

            array[i] = numeroInput;
        }


        int min = array[0];
        int max = array[0];
        double sum = 0;
        double average = 0;

        for(int i = 0; i < NUMERO; i++) {

            if(min > array[i]) {

                min = array[i];
            }

            if(max < array[i]) {

                max = array[i];
            }

            sum += array[i];

        }

        average = sum / array.length;

        System.out.println(Arrays.toString(array));
        System.out.println("Numero minimo: " + min);
        System.out.println("Numero massimo: " + max);
        //System.out.println("Somma: " + sum);
        System.out.println("Media dei valori inseriti: " + ((int) average));

        input.close();
    }
    
}
