/*
Si vuole dimostrare il problema della gestione dei numeri da parte dei calcolatori
Scrivere un programma che:
- assegni alla variabile a (double) il numero 1.000001
- assegni alla variabile b (double) il numero 0.000001
- assegni alla variabile c il risultato di a - b
- verifichi se il contenuto della variabile c e' uguale ad 1.0
*/
public class ConfrontoDouble {
    public static void main(String[] args) {
    
        double a = 1.000001;
        double b = 0.000001;
        double c = a - b;
        double valoreAtteso = 1.0;

        System.out.println("Ci si aspetta che:");
        System.out.println("  1.000001");
        System.out.println("- 0.000001");
        System.out.println("----------");
        System.out.println("  1.000000");
        System.out.println("");

        System.out.println("   a = " + a);
        System.out.println(" - b = " + b);
        System.out.println("   ------------");
        System.out.println("   c = " + c);
        System.out.println("");

        // infinity / infinity = NaN
        // division of a finite value by an infity results is a signed infinity
        // Oracle source


        if(c == valoreAtteso) {
            System.out.println("il contenuto della variabile c e' uguale ad 1.0");
        } else {
            System.out.println("il contenuto della variabile c NON e' uguale ad 1.0");
            System.out.println(" c e' diverso da 1.0 -> c = " + c);
        }

    }
    
}
