import java.util.Scanner;

public class IstrCondConAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci giorno, mese e anno: ");
        int giorno = scanner.nextInt();
        int mese = scanner.nextInt();
        int anno = scanner.nextInt();
        scanner.close();
        // Calcola il giorno seguente
        // ...
        // Gestisci il caso dell'ultimo giorno dell'anno
        if (giorno == 31 && mese == 12) {
        giorno = 1;
        mese = 1;
        anno++;
        }
        // ...
        System.out.println("anno: " + anno);
    }
}
