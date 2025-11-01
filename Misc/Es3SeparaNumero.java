/**
 * Esercitazione - Numeri e stringhe
 * Esercizio 3 - Separa numero
 * Scrivete un programma che richieda l’inserimento di un valore in virgola mobile da
 * parte dell’utente. Successivamente il programma dovrà separare la parte intera
 * a quella decimale. Infine, il programma dovrà visualizzare la parte intera, quella
 * decimale, la somma delle due e indicare se la parte decimale è maggiore di quella
 * intera.
 * L’output prodotto dall’esecuzione del programma dovrà essere simile al seguente (in
 * italico l’inserimento fatto dall’utente).
 * Inserisci un numero con la virgola: 123.456
 * Parte intera: 123
 * Parte decimale: 456
 * Somma delle due parti: 579
 * La parte decimale e' maggiore di quella intera
 * Sviluppate due versioni del programma. La prima che legge il numero inserito
 * dall’utente come un valore in virgola mobile. La seconda che invece lo legge come
 * una stringa.
 * Importante: considerate solo dei numeri dove la prima cifra decimale è diversa da 0.
 * 
 */
import java.util.Scanner;

public class Es3SeparaNumero {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero con la virgola: ");

        while(!input.hasNextDouble()) {
            System.out.println("Input sbagliato. Inserisci un numero con la virgola: ");
            input.nextLine();
            while(!input.hasNext()) {
                System.out.println("Input sbagliato. Inserisci un numero con la virgola: ");
                input.nextLine();
            }
        }

        double numero = input.nextDouble();

        input.close();


        int parteIntera = (int) numero;

        double parteDecimale = (numero % 2) -1;

        int length = (int) parteDecimale % 2;

        //double number = parteDecimale;

        //System.out.println("length: " + length);
        
       
        //-----------------------------


        String numeroStringa = String.valueOf(numero);

        int posizioneVirgola = numeroStringa.indexOf(".");

        String parteInteraString = numeroStringa.substring(0, posizioneVirgola);

        String parteDecimaleString = numeroStringa.substring(posizioneVirgola + 1, numeroStringa.length());

        int lunghezza = parteDecimaleString.length();
        //System.out.println("lunghezza: " + lunghezza);

        int moltipliatoreDecimale = (int) Math.pow(10, lunghezza);
        //System.out.println(moltipliatoreDecimale);

        int parteDecimaleInNumero = (int) (parteDecimale * moltipliatoreDecimale);
        System.out.println("parte decimale in numero: " + parteDecimaleInNumero);

        int sommaParti = (int) parteIntera + parteDecimaleInNumero;

        //debug

        System.out.println("Parte intera: " + parteInteraString);
        System.out.println("Parte decimale: " + parteDecimaleString);

        //System.out.println("Parte intera: " + parteIntera);
        //System.out.println("Parte decimale: " + parteDecimale);
        //System.out.println(parteDecimaleInNumero);
        System.out.println("Somma delle parti: " + sommaParti);

        if(parteIntera > parteDecimaleInNumero) {
            System.out.println("La parte intera e' maggiore di quella decimale");
        } else {
            System.out.println("La parte decimale e' maggiore di quella intera");
        }




    }
    
}
