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



public class Int2DayV3 {

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

        /*
        Enum:
        Gli enum in Java hanno un metodo integrato chiamato ordinal(), che restituisce la posizione dell'enum nella dichiarazione (a partire da 0).

        Ad esempio:
        LUNEDI.ordinal() restituisce 0.
        MARTEDI.ordinal() restituisce 1.
        E così via.
        Associazione del numero al giorno:
        Usiamo GiorniDellaSettimana.values() per ottenere un array di tutti i valori dell'enum.
        Poiché ordinal() inizia da 0, sottraiamo 1 dal numero inserito dall'utente per ottenere l'indice corretto.
        */

        // Estrapolazione nome del giorno dal numero (input utente)
        System.out.println("--- primo metodo ---");
        GiorniDellaSettimana giorno = GiorniDellaSettimana.values()[numeroUtente-1];

        System.out.println("Il numero " + numeroUtente + " della settimana corrisponde a " + giorno.toString().toLowerCase() + ".");

        System.out.println("--- secondo metodo ---");

        for(int i = 0; i < giorni.length; i++) {

            if(GiorniDellaSettimana.values()[i].ordinal() == numeroUtente-1) {

                System.out.println("Il numero " + numeroUtente + " della settimana corrisponde a " +
                                  GiorniDellaSettimana.values()[i].toString().toLowerCase() + ".");
            }
        }
        
        input.close();
        
    }
    
}
