/*
Scrivere un programma che:
- assegni alla variabile a (double) il numero 1.000001
- assegni alla variabile b (double) il numero 0.000001
- assegni alla variabile c il risultato di a - b
- verifichi se il contenuto della variabile c e' uguale ad 1.0
*/

public class ConfrontoDouble {

    static final double EPSILON = 1e-8;

    public static void main(String[] args) {
        double a = 1.000001;
        double b = 0.000001;
        double c = a - b;
        double valoreAtteso = 1.0;

        System.out.println("Approccio con ==");
        System.out.println("----------------");
        if (c == valoreAtteso) {
            System.out.println("c e' UGUALE a " + valoreAtteso);
        } else {
            System.out.println("c e' DIVERSO da " + valoreAtteso);
            System.out.println("c: " + c);
        }

        // I numeri in virgola mobile (double) possono non essere rappresentati
        // in modo esatto a causa della precisione limitata. Pertanto, non è affidabile
        // confrontare i double con '=='. Usiamo invece una soglia (EPSILON) per
        // controllare se la differenza tra i numeri è abbastanza piccola da
        // considerarli uguali.

        System.out.println("\n\nApproccio con \"threshold comparison\"");
        System.out.println("------------------------------------");
        if (Math.abs(c - valoreAtteso) < EPSILON) {
            System.out.println("c e' UGUALE a " + valoreAtteso);
        } else {
            System.out.println("c e' DIVERSO da " + valoreAtteso);
            System.out.println("c: " + c);
        }
    }
}