import java.util.Scanner;

/**
 * Classe che permette di immagazzinare i dati concernenti un cerchio (raggio e
 * punto nello spazio
 * bidimensionale del centro del cerchio)
 */
class Cerchio {
    double raggio;
    double x;
    double y;

    /**
     * Costruttore della classe cerchio
     *
     * @param raggio raggio del cerchio
     * @param x      coordinata x del centro del cerchio
     * @param y      coordinata y del centro del cerchio
     */
    Cerchio(double raggio, double x, double y) {
        this.raggio = raggio == 0 ? Math.random() * 10 + 1 : Math.abs(raggio);
        this.x = x;
        this.y = y;
    }
}

/**
 * Programma per immagazzinare i dati di 5 cerchi. In seguito calcola la somma
 * delle aree dei cerchi
 * e la distanza massima assoluta fra tutti i centri dei cerchi.
 */
public class CerchioTest {

    /**
     * Calcola e restituisce l'area del cerchio
     *
     * @param cerchio cerchio di cui calcolare l'area
     * @return l'area del cerchio
     */
    private static double calcolaArea(Cerchio cerchio) {
        return Math.pow(cerchio.raggio, 2) * Math.PI;
    }

    /**
     * Funzione che calcola e restituisce la distanza massima assoluta fra tutti i
     * centri dei cerchi
     *
     * @param cerchi array contenente le referenze ai cerchi da utilizzare per il
     *               calcolo della
     *               distanza massima assoluta
     * @return la distanza massima assoluta tra tutti i centri dei cerchi
     */
    private static double calcolaDistanzaMassimaCentri(Cerchio cerchi[]) {
        double distanzaMax = 0.;
        for (int i = 0; i < cerchi.length; i++)
            for (int j = i + 1; j < cerchi.length; j++) {
                double distX = Math.abs(cerchi[i].x - cerchi[j].x);
                double distY = Math.abs(cerchi[i].y - cerchi[j].y);
                double distanza = Math.sqrt(distX * distX + distY * distY);
                if (distanzaMax < distanza)
                    distanzaMax = distanza;
            }
        return distanzaMax;
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cerchio cerchi[] = new Cerchio[5];
        double x, y, raggio = 0;

        for (int i = 0; i < cerchi.length; i++) {

            System.out.print("Centro del cerchio (x y): ");
            x = input.nextDouble();
            y = input.nextDouble();
            System.out.print("Raggio del cerchio: ");
            raggio = input.nextDouble();
            while (raggio <= 0.) {
                System.out.print("Il raggio deve essere maggiore di 0. Riprova: ");
                raggio = input.nextDouble();
            }

            cerchi[i] = new Cerchio(raggio, x, y);
        }

        double areaTotale = 0.;
        for (Cerchio cerchio : cerchi)
            areaTotale += calcolaArea(cerchio);
        System.out.println("Area totale: " + areaTotale);

        System.out.println("Distanza massima assoluta: " + calcolaDistanzaMassimaCentri(cerchi));

        input.close();
    }
}
