/*
7.2 Trapezio
Scrivete un programma che consenta di calcolare e stampare l’area del trapezio:
(baseMaggiore+baseMinore)*altezza/2
*/
import java.util.Scanner;

public class Es7_2_Trapezio {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float baseMaggiore = 0.0f;
        float baseMinore = 0.0f;
        float altezza = 0.0f;
        float areaTrapezio = 0.0f;

        System.out.println("\nCalcolo dell'area di un Trapezio\n********************************\n");
        System.out.print("Inserire base maggiore: ");
        baseMinore = input.nextFloat();
        input.nextLine();
        System.out.print("Inserire base minore: ");
        baseMinore = input.nextFloat();
        input.nextLine();
        System.out.print("Inserire l'altezza: ");
        altezza = input.nextFloat();
        input.nextLine();

        areaTrapezio = (baseMaggiore + baseMinore) * altezza / 2;

        System.out.println("L'area del trapezio: " + areaTrapezio);

        input.close();

        /*
        Calcolo dell'area di un Trapezio
        ********************************

        Inserire base maggiore: 17
        Inserire base minore: 7
        Inserire l'altezza: 7
        L'area del trapezio: 24.5
        */

    }
    
}
