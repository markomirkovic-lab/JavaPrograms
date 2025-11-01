import java.util.Scanner;
/**
* Programma che esegue calcoli
*/
public class ModifyMyNumber {
    /**
    * Procedura main , viene eseguita al lancio del programma
    */
    public static void main(String[] args) {

    // Inizializza lo scanner per leggere dati da tastiera
    Scanner input = new Scanner(System.in);

    // Mostra a schermo la domanda "Inserisci un numero :"
    System.out.print("Inserisci un numero: ");

    // Legge il numero da tastiera
    int x = input.nextInt();
    int y = 50 + x;
    int z = 3 * y;

    // Mostra a schermo la frase finale
    System.out.println("Risultato: " + z + "!");

    // Finalizza lo scanner
    input.close();

    }
}
