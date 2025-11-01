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
import java.util.Arrays;
import java.util.Scanner;



public class Int2DayV2 {

    public static final int MAX = 7;
    public static final int MIN = 1;

    public enum GiorniDellaSettimana {
        LUNEDI,    // ordinal() = 0
        MARTEDI,   // ordinal() = 1
        MERCOLEDI, // ordinal() = 2
        GIOVEDI,   // ordinal() = 3
        VENERDI,   // ordinal() = 4
        SABATO,    // ordinal() = 5
        DOMENICA   // ordinal() = 6
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numero = {1, 2, 3, 4, 5, 6 ,7};
        //String[] giorno = {"lunedi'", "martedi'", "mercoledi'", "giovedi'", "venerdi'", "sabato", "domenica"};
        GiorniDellaSettimana[] giorni = GiorniDellaSettimana.values();
        //System.out.println(Arrays.toString(giorni));
        //[LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA]

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

        // Estrapolazione nome del giorno dal numero (input utente)
        for(int i = 0; i < numero.length-1; i++) {

            if(numero[i] == numeroUtente) {
                System.out.println("Il numero " + numeroUtente + " della settimana corrisponde a " + giorni[i].toString().toLowerCase() + ".");
                break;
            }
        }

        input.close();
        
    }
    
}
