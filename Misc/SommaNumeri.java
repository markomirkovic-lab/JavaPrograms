public class SommaNumeri {
    public static void main(String[] args) {
        // Stabilire il limite
        int limite = 50;
        System.out.println("Calcolo della somma dei numeri");
        int somma = 0;
        int x = 0;
        while (x <= limite) {
        System.out.print(somma);
        somma = somma + x;
        System.out.println(" + " + x + " = " + somma);
        x++;
        }
        System.out.println("------------- =");
        System.out.println("Risultato: " + somma);
    }

}
