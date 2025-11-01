import java.util.Scanner;

enum Stagione {
    PRIMAVERA, ESTATE, AUTUNNO, INVERNO
}

public class StagioniNuovoSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una stagione: ");

        Stagione stagione = Stagione.valueOf(input.nextLine().toUpperCase());

        switch (stagione) {
        // Importante: non Stagione.PRIMAVERA!!
        case PRIMAVERA -> System.out.println("Marzo, Aprile, Maggio");
        case ESTATE -> System.out.println("Giugno, Luglio, Agosto");
        case AUTUNNO -> System.out.println("Settembre, Ottobre, Novembre");
        case INVERNO -> System.out.println("Dicembre, Gennaio, Febbraio");
        }

        input.close();

        /*
        Inserisci una stagione: primavera
        Marzo, Aprile, Maggio
        */
    }
}
