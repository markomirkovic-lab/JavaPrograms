/*
10.6 Media
Scriviamo il programma che calcola la media del modulo facendo in modo che l’utente 
debba inserire dei valori corretti (note fra 1 e 6).
*/
import java.util.Scanner;

public class Es10_6_Media {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double ialp, alpr, lapr, media;

        do {
            System.out.print("Immeti la nota di IALP: ");
            ialp = input.nextDouble();
        } while(ialp<0 || ialp>6);

        do {
            System.out.print("Immeti la nota di ALPR: ");
            alpr = input.nextDouble();
        } while(alpr<0 || alpr>6);

        do {
            System.out.print("Immeti la nota di LAPR: ");
            lapr = input.nextDouble();
        } while(lapr<0 || lapr>6);

        media = (ialp+lapr+alpr*2)/4;
        System.out.println("La media e' " + media);

    }
    
}
