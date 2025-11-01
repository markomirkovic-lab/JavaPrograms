import java.util.Scanner;

public class ScaricamentoFileInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la dimensione del file: ");
        int dimensioneFile = input.nextInt();
        while (dimensioneFile <= 0) {
            System.out.println("La dimensione del file deve essere un numero positivo maggiore di zero.");
            System.out.print("Inserisci la dimensione del file: ");
            dimensioneFile = input.nextInt();
        }

        System.out.print("Inserisci la velocita' di download: ");
        int velocitaDownload = input.nextInt();
        while (velocitaDownload <= 0) {
            System.out.println("La velocita' deve essere un numero positivo maggiore di zero");
            System.out.print("Inserisci la velocita' di download: ");
            velocitaDownload = input.nextInt();
        }

        input.close();

        int tempoDownload = 1 / 60 * (dimensioneFile * 8) / velocitaDownload;

        System.out.println("Tempo di download in minuti: " + tempoDownload);
    }
}