import java.util.Scanner;

enum Stagione {
    PRIMAVERA, ESTATE, AUTUNNO, INVERNO
}

public class StagioniSwitchTradizionale {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una stagione: ");

        Stagione stagione = Stagione.valueOf(input.nextLine().toUpperCase());

        switch (stagione) {
        case PRIMAVERA: // Importante: non Stagione.PRIMAVERA!!
            System.out.println("Marzo, Aprile, Maggio");
            break;
        case ESTATE:
            System.out.println("Giugno, Luglio, Agosto");
            break;
        case AUTUNNO:
            System.out.println("Settembre, Ottobre, Novembre");
            break;
        case INVERNO:
            System.out.println("Dicembre, Gennaio, Febbraio");
            break;
        }

        input.close();

        /*
        Inserisci una stagione: primavera
        Marzo, Aprile, Maggio
        */
    }
}
