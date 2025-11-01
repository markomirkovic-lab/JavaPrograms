import java.util.Scanner;

public class SnippetLetturaValoriNumerici {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valore;

        int min = 1;
        int max = 6;

        String richiesta = "Introdurre un valore intero compreso tra " + min + " e " + max + ": ";
        String msgSeFormatoErrato = "Il valore immesso non ha il formato corretto. ";

        do {

            System.out.print(richiesta);

            while (!input.hasNextInt()) {

                input.nextLine();
                System.out.println(msgSeFormatoErrato);
                System.out.print(richiesta);

            }
            valore = input.nextInt();
            input.nextLine();

        } while(valore < min || valore > max);

        System.out.println("\n\nHai inserito: " + valore);

        input.close();

    }

}
