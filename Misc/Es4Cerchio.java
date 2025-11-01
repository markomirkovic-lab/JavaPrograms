/**
Esercitazione - Primi programmi
Esercizio 4 - Cerchio

Implementate un programma che richieda all’utente l’immissione del raggio di un
cerchio (valore con la virgola). Successivamente, il programma dovrà calcolare e
mostrare a schermo il diametro, la circonferenza e l’area. Per il valore di π utilizzate
una costante.
d = 2r C = 2πr A = πr2
*/
import java.util.Scanner;

public class Es4Cerchio {

    static final double PI = 3.141592653589793;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Scrivere un il raggio (numero con la virgola)");

        while(!input.hasNextDouble()) {
            System.out.println("Input non valido. Scrivere un il raggio (numero con la virgola)");
            input.nextLine();
        }

        double raggio = input.nextDouble();

        input.close();

        double diametro = 2 * raggio;
        double circonferenza = 2 * PI * raggio;
        double area = PI * (raggio * raggio);

        System.out.println("Il cerchio con il raggio: " + raggio + " ha: ");
        System.out.println("circonferenza: " + circonferenza);
        System.out.println("area: " + area);
        System.out.println("Formule usate: D = 2r, C = 2PIr, A = PIr2");
    }

}
