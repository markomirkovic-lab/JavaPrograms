public class ArrotondamentiPrintF {

    public static void main(String[] args) {
        double number = 1234.56789;

        // Stampa con due cifre decimali
        System.out.printf("Numero con 2 decimali: %.2f%n", number);

        // Stampa con quattro cifre decimali
        System.out.printf("Numero con 4 decimali: %.4f%n", number);

        // Allineamento a destra con larghezza 10 e 2 decimali
        System.out.printf("Allineato a destra: %10.2f%n", number);

        // Allineamento a sinistra con larghezza 10 e 2 decimali
        System.out.printf("Allineato a sinistra: %-10.2f%n", number);
    }
    
}
