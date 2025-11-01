import java.util.Scanner;

public class EsempioHasNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");

        // Ciclo che continua fino a quando non viene inserito un numero intero valido
        while (!scanner.hasNextInt()) { // hasNextInt() controlla se il prossimo input è un numero intero, ma non
                                        // consuma il valore
            System.out.print("Input non valido. Inserisci un numero intero: ");
            scanner.nextLine(); // Scarta l'input non valido
        }

        // Una volta ottenuto un intero, lo memorizziamo e lo stampiamo
        int number = scanner.nextInt();
        System.out.println("Hai inserito il numero: " + number);

        scanner.close();
    }
}
