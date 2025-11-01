import java.util.Scanner;

public class CalcolaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int somma = 0;
        int count = 0;
        int max = -1;
        
        System.out.print("Inserisci un numero intero (negativo per uscire): ");
        int numero = input.nextInt();

        while (numero >= 0) {
            somma = somma + numero;
            count = count + 1;

            if (max < numero) {
                max = numero;
            }

            System.out.print("Inserisci un numero intero (negativo per uscire): ");
            numero = input.nextInt();
        }
        
        if (count > 0) {
            double media = somma * 1.0 / count;
            System.out.println("La media dei numeri inseriti è: " + media);
            System.out.println("Il valore massimo inserito è: " + max);
        } else {
            System.out.println("Nessun numero inserito, impossibile calcolare la media.");
        }
        
        input.close();
    }
}