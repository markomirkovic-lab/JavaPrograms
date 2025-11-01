
/*
11.4 Divisori
Nella serie precedente abbiamo realizzato un software per il calcolo dei divisori primi di un 
numero.
Il difetto di quel software era che se un divisore è presente più volte, viene stampato più 
volte. Adattate quel codice per fare in modo che un divisore non venga stampato più di una 
volta.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Es11_4_Divisori {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long numero, divisore;
        long[] divisoreArray;
        boolean find;

        do {
            System.out.print("Inserisci un numero: ");
            numero = input.nextLong();
            // Dimensiono l'array per memorizzare i divisori.
            // Nel caso PEGGIORE possiamo trovare un numero sempre
            // divisibile per 2, come il 1024, log_2(1024) = 10, 2^10 = 1024
            // Quanti divisori potrà avere? 2^x=1024 quindi
            // x=log2(1024), dieci volte 1024 si puo' dividere per 2
            // Questa finezza ci permette di limitare l'occupazione
            // della memoria.
            // Ovviamente non me l’aspetto come soluzione, potreste
            // limitarvi a dimensionare un array grande la metà
            divisoreArray = new long[(int) (Math.log10(numero) / Math.log10(2)) + 1];
            // log_10(1024) = 3
            // log_10(2) = 0.3
            // 3 / 0.3 = 10 + 1 = 11
            //System.out.println(Arrays.toString(divisoreArray));
            //System.out.println(divisoreArray.length);//11
            // Inizializzo tutte le celle a 0
            for (int i = 0; i < divisoreArray.length; i++)
                divisoreArray[i] = 0;
            for (divisore = 2; divisore <= numero / 2; divisore++) {
                if (numero % divisore == 0) {
                    // Lo inserisco nell'array, se non c'è già
                    // Prima lo cerco
                    find = false;
                    for (int i = 0; i < divisoreArray.length; i++)
                        if (divisoreArray[i] == divisore) {
                            find = true; // Trovato!
                            break;
                        }
                    if (!find) {
                        // Non avendolo trovato devo inserirlo
                        // Cerco una cella libera, che contiene 0
                        for (int i = 0; i < divisoreArray.length; i++)
                            if (divisoreArray[i] == 0) {
                                divisoreArray[i] = divisore;
                                break;
                            }
                    }
                    numero = numero / divisore;
                    System.out.print("Resti della divisione: ");
                    System.out.printf("%10d %s", numero, "\n");
                    divisore = 1;
                }
            }
            System.out.println("---------------------------------");
            System.out.print("Divisore -> ");
            // L'ultimo numero è divisore,
            // Applico lo stesso algoritmo di qualche riga sopra
            find = false;
            for (int i = 0; i < divisoreArray.length; i++)
                if (divisoreArray[i] == numero) {
                    find = true; // Trovato!
                    break;
                }
            if (!find) {
                // Non avendolo trovato devo inserirlo
                // Cerco una cella libera, che contiene 0
                for (int i = 0; i < divisoreArray.length; i++)
                    if (divisoreArray[i] == 0) {
                        divisoreArray[i] = numero;
                        break;
                    }
            }
            // Stampiamo i divisori
            for (int i = 0; i < divisoreArray.length; i++)
                if (divisoreArray[i] != 0)
                    System.out.print(divisoreArray[i] + " ");
            System.out.print("\n\nAltro numero? [s/n]");
        } while (input.next().charAt(0) == 's');

    }

}
