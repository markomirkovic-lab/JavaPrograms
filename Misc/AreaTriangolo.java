/**
Il programma calcola l'area di un triangolo,
partendo da base e altezza forniti dall'utente,
usando la formula (base * altezza) / 2
 */
import java.util.Scanner;

public class AreaTriangolo {

    // Procedura main: inizio del programma
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Area di un triangolo base * altezza / 2");

        System.out.println("Inserisci la dimensione della base: ");

        double base = input.nextDouble();

        System.out.println("Inserisci la dimensione dell'altezza: ");

        double altezza = input.nextDouble();

        input.close();

        double area = (base * altezza) / 2;

        System.out.println("L'area di un triangolo con base " + base +
                           " e l'altezza " + altezza + " e' " + area);
    }
}
