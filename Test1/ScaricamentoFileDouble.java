import java.util.Scanner;

public class ScaricamentoFileDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la dimensione del file: ");
        double dimensioneFile = input.nextDouble();
        while (dimensioneFile <= 0) {
            System.out.println("La dimensione del file deve essere un numero positivo maggiore di zero.");
            System.out.print("Inserisci la dimensione del file: ");
            dimensioneFile = input.nextDouble();
        }

        System.out.print("Inserisci la velocita' di download: ");
        double velocitaDownload = input.nextDouble();
        while (velocitaDownload <= 0) {
            System.out.println("La velocita' deve essere un numero positivo maggiore di zero");
            System.out.print("Inserisci la velocita' di download: ");
            velocitaDownload = input.nextDouble();
        }

        input.close();

        double tempoDownload = 1. / 60. * (dimensioneFile * 8.) / velocitaDownload;

        System.out.println("Tempo di download in minuti: " + tempoDownload);
    }
}

/*
 * Il tempo di download nella versione che utilizza solo tipi di dato interi e'
 * sempre 0. Indipendentemente dai valori immessi dall'utente.
 * In Java, infatti, la divisione fra numeri interi produce un risultato intero,
 * dato dal troncamento della parte decimale.
 * Il risultato di 1/60 e' 0 in quanto entrambi gli operandi sono di tipo int.
 * Ne consegue che indipendentemente da quello che poi segue nella formula, il
 * tempo calcolato e' zero.
 * 
 * Nella versione con numeri a virgola mobile, al fine di avere una divisione
 * con un numero a virgola mobile come risultato, bisogna fare in modo che
 * almeno uno dei due operandi (di ogni operazione) sia un numero in virgola
 * mobile.
 */