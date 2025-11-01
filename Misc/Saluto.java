/**
Programma che saluta l'utente
chiedendo il nome dell'utente
*/
import java.util.Scanner;

public class Saluto {

    public static void main(String[] args) {

    // Inizializza lo scanner per leggere dati da tastiera
    Scanner input = new Scanner(System.in);

    // Mostra a schermo la domanda "Come ti chiami?"
    System.out.print("Come ti chiami? ");

    // Legge il nome da tastiera
    String nome = input.nextLine();

    // Crea la frase di saluto
    String saluto = "Ciao " + nome + "!";

    // Mostra a schermo la frase finale
    System.out.println(saluto);

    // Finalizza lo scanner
    input.close();
    }

}