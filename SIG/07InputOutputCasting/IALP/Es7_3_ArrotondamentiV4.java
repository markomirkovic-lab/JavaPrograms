
import java.util.Scanner;

public class Es7_3_ArrotondamentiV4 {

    public static void main(String args[]) {

        Scanner tastiera = new Scanner(System.in);

        double nro;
        double arrotondato;

        System.out.print("Inserire un numero con la virgola: ");
        nro = tastiera.nextDouble();

       
        // Parte intera
        int parteIntera = (int) nro;

        // Parte decimale
        double parteDecimale = nro % parteIntera;

        // quarta decimale
        double quartaDecimale = ((int) (parteDecimale * 10000)) % 10;
        // 0.14689 * 10000 % 10
        // 1468.9 % 10
        // 8.9
        // int (8.9) = 8

        System.out.println(quartaDecimale);

        if(quartaDecimale >= 5) {
            nro += 0.001;
        }
              
        // Arrotondiamo a tre cifre dopo la virgola
        arrotondato = ((int) (nro * 1000)) / 1000.0;
        // È importante che sia 1000.0 e non 1000
        System.out.println("Arrotondato " + arrotondato);

        tastiera.close();
        
    }

}
