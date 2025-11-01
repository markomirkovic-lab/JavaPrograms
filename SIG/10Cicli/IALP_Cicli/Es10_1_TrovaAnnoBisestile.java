/*
Trova l'anno bisestile
*/
import java.util.Scanner;

public class Es10_1_TrovaAnnoBisestile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int annoInizio;
        int annoFine;
        
        System.out.println("Inserici un anno da: ");
        annoInizio = input.nextInt();

        System.out.println("Inserici un anno a: ");
        annoFine = input.nextInt();

        for(int i = annoInizio; i < annoFine; i++) {

            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {

                System.out.println("L'anno " + i + " e' bisestile");
            } else {
                //System.out.println("L'anno " + i + " non e' bisestile");
            }
        }

    }
    
}
