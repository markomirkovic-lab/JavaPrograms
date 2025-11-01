import java.util.Scanner;

public class LetturaDaTastiera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lettura di un numero intero
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt(); // Legge il numero, lascia '\n' nel buffer

        // Dopo aver letto un numero con nextInt(), rimane il carattere '\n' nel buffer.
        // Il metodo nextLine() viene utilizzato qui per consumare quel '\n' ed evitare
        // problemi nella successiva lettura di una stringa.
        scanner.nextLine();

        // Lettura di una stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        scanner.close();

        // Stampa i risultati
        System.out.println("Numero inserito: " + numero);
        System.out.println("Stringa inserita: " + stringa);
    }
}
