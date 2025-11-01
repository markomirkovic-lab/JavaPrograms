import java.util.Scanner;

public class Vendita {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Prezzo originale prima dello sconto: ");


        double prezzoOriginale = input.nextDouble();

        input.close();

        double quotaDaPagare;

        if (prezzoOriginale < 100) {
            quotaDaPagare = 0.9;
        } else if (prezzoOriginale < 200) {
            quotaDaPagare = 0.8;
        } else {
            quotaDaPagare = 0.75;
        }

        double prezzoScontato = quotaDaPagare * prezzoOriginale;

        System.out.println("Prezzo scontato: " + prezzoScontato);
    }
}
