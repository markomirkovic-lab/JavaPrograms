import java.util.Scanner;
/**
* Programma HelloStudent
*/
public class HelloStudent {
    /**
    * Procedura main , viene eseguita al lancio del programma
    */
    public static void main(String[] args) {

        // Inizializza lo scanner per leggere dati da tastiera
        Scanner input = new Scanner(System.in);

        // Mostra a schermo la domanda "Come ti chiami ?"
        System.out.print("Come ti chiami? ");

        // Legge il nome da tastiera
        String name = input.nextLine();

        // Mostra a schermo la frase finale
        System.out.println("Ciao " + name + "!");

        // Finalizza lo scanner
        input.close();
    }
}
