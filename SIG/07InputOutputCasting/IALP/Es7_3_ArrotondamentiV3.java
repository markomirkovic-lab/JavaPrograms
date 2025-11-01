import java.util.Scanner;

public class Es7_3_ArrotondamentiV3 {

    public static void main(String args[]) {

        Scanner tastiera = new Scanner(System.in);

        double nro;
        double arrotondato;

        System.out.print("Inserire un numero con la virgola: ");
        nro = tastiera.nextDouble();
        // Arrotondiamo a tre cifre dopo la virgola
        arrotondato = ((int) (nro * 1000)) / 1000.0;
        // È importante che sia 1000.0 e non 1000
        System.out.println("Arrotondato " + arrotondato);

        tastiera.close();
        
    }

}
