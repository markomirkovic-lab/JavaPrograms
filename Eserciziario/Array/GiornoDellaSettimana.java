/*
Spiegazione del codice:

Enum:
Ogni giorno della settimana è associato a un numero 
(ad esempio, LUNEDI è associato a 1, MARTEDI a 2, ecc.).

Il metodo getGiornoByNumero(int numero) scorre tutti i 
valori dell'enum e restituisce il giorno corrispondente 
al numero inserito.

Programma principale:

Utilizza Scanner per leggere l'input dell'utente.

Chiama il metodo getGiornoByNumero per ottenere il giorno 
corrispondente al numero inserito.

Gestisce l'eccezione nel caso in cui l'utente inserisca 
un numero non valido (ad esempio, un numero fuori dall'intervallo 1-7).
*/

import java.util.Scanner;

public class GiornoDellaSettimana {

    public enum GiorniDellaSettimana {
        LUNEDI(1),
        MARTEDI(2),
        MERCOLEDI(3),
        GIOVEDI(4),
        VENERDI(5),
        SABATO(6),
        DOMENICA(7);
    
        private final int numero;
    
        // Costruttore
        GiorniDellaSettimana(int numero) {
            this.numero = numero;
        }
    
        // Metodo per ottenere il numero
        public int getNumero() {
            return numero;
        }
    
        // Metodo per ottenere il giorno in base al numero
        public static GiorniDellaSettimana getGiornoByNumero(int numero) {
            for (GiorniDellaSettimana giorno : GiorniDellaSettimana.values()) {
                if (giorno.getNumero() == numero) {
                    return giorno;
                }
            }
            throw new IllegalArgumentException("Numero non valido: " + numero);
        }
    }

    public static void main(String[] args) {

        // Crea uno scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire un numero
        System.out.print("Inserisci un numero (1-7) per ottenere il giorno della settimana: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Ottieni il giorno corrispondente
        try {
            GiorniDellaSettimana giorno = GiorniDellaSettimana.getGiornoByNumero(numero);
            System.out.println("Il giorno corrispondente è: " + giorno.toString().toLowerCase());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Chiudi lo scanner
        scanner.close();
    }
    
}
