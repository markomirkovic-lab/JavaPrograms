public class SommaNumeriSemplice {
    public static void main(String[] args) {
        // Stabilire il limite
        int limite = 50;
        //System.out.println("Calcolo della somma dei numeri");
        int somma = 0;
        int x = 0;
        while (x <= limite) {
        
        somma = somma + x;
        x++;
        }
        System.out.println("Risultato: " + somma);
    }

}
