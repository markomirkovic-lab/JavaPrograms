/*
https://gitalb.github.io/eserciziario2.0/array/2017/03/21/int2day.html
Int2Day Mar 21, 2017 array Livello 9 

Scrivi il programma Int2Day che riceve un intero come argomento da linea 
di comando e stampa il nome del giorno della settimana corrispondente, 
secondo l’associazione definita nella tabella seguente:

numero	elemento
1	    "lunedì"
2	    "martedì"
3	    "mercoledì"
4	    "giovedì"
5	    "venerdì"
6	    "sabato"
7	    "domenica"

Per argomenti non appropriati o al di fuori dell’intervallo consentito, 
il programma stampa "Valore non valido.".
*/
import java.util.Scanner;

public class Int2Day {

    public static final int MAX = 7;
    public static final int MIN = 1;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numero = {1, 2, 3, 4, 5, 6 ,7};
        String[] giorno = {"lunedi'", "martedi'", "mercoledi'", "giovedi'", "venerdi'", "sabato", "domenica"};
        //System.out.println(numero.length);
        //System.out.println(giorno.length);

        int numeroUtente;

        do {

            System.out.print("Inserici un numero intero tra 1 e 7: ");

            while(!input.hasNextInt()) {

                System.out.println("Valore non valido. Riprova!");
                input.nextLine();
            }

            numeroUtente = input.nextInt();
            input.nextLine();
            System.out.println("Numero utente: " + numeroUtente);

        } while(numeroUtente < MIN || numeroUtente > MAX);
//

        for(int i = 0; i < numero.length-1; i++) {

            if(numero[i] == numeroUtente-1) {
                System.out.println("Il numero " + numeroUtente + " della settimana corrisponde a " + giorno[i] + ".");
                break;
            }
        }

        input.close();
        
    }
    
}
