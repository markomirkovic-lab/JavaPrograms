import java.util.Scanner;

public class SeparaCifreInClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire un numero: ");
        int numero = input.nextInt();
        input.close();

        // controllo che il numero ha 5 cifre
        if (numero < 10000 || numero > 99999) {
            System.out.println("Numero non valido!!");
        } else {
            /*
            // Versione con 5 variabili
            int unita = numero % 10;
            int decina = numero / 10 % 10;
            int centinaia = numero / 100 % 10;
            int migliaia = numero / 1000 % 10;
            int decimigliaia = numero / 10000 % 10;

            System.out.println(decimigliaia + "   " + migliaia + "   " + centinaia + "   " + decina + "   " + unita);
            */

            /*
            // Versione con stringa
            String n = "" + numero;

            int i = 0;
            while (i < 5) {
                System.out.print(n.charAt(i) + "   ");
                i++;
            }
            */

            // per sapere la grandezza del numero:
            //  - con stringhe
            //  - o / 10 e poi sottrare (vedi es SeparaNumeroDouble.java)
            // (o usare, da verifica, il modulo % 1, se da 0 non ci sono numeri dietro la virgola)
            // Versione con while
            int divisore = 10000;
            while (divisore > 0) {
                System.out.print(numero / divisore % 10 + "   ");
                divisore = divisore / 10;
            }
        }
    }
}