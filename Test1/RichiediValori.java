import java.util.Scanner;

public class RichiediValori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti valori vuoi inserire? ");
        while (!input.hasNextInt()) {
            System.out.print("Serve un intero. Riprova: ");
            input.nextLine();
        }
        int nrValori = input.nextInt();
        input.nextLine();

        if (nrValori < 5 || nrValori > 12) {
            System.out.println("Il numero di valori inserito non e' valido. Il programma termina!");
        } else {
            int cntImmissioni = 0;
            String stringaFinale = "";
            double sommaDouble = 0.;
            long sommaInteri = 0L;
            int cntInteri = 0;

            while (cntImmissioni++ < nrValori) {
                System.out.print("Valore " + cntImmissioni + ": ");
                if (input.hasNextInt()) {
                    sommaInteri += input.nextInt();
                    input.nextLine();
                    cntInteri++;
                } else if (input.hasNextDouble()) {
                    sommaDouble += input.nextDouble();
                    input.nextLine();
                } else {
                    String tmp = input.nextLine();
                    if (stringaFinale.length() > 0)
                        stringaFinale += '-';
                    if (tmp.length() > 3)
                        stringaFinale += tmp.substring(0, 3);
                    else
                        stringaFinale += tmp;
                }
            }
            System.out.println("\nStringa finale: " + stringaFinale);
            System.out.println("Somma interi: " + sommaInteri);
            if (cntInteri == 0)
                System.out.println("Media interi: 0.0");
            else
                System.out.println("Media interi: " + sommaInteri * 1. / cntInteri);
            System.out.println("Somma double: " + sommaDouble);
        }
        input.close();
    }
}
