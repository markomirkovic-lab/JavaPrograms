import java.util.Scanner;

public class ArrayEs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        // Input dei numeri
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.print("Inserisci la componente [" + i + "] dell' array (minore di 100): ");
                while (!input.hasNextInt()) {
                    System.out.println("Inserire un numero intero");
                    input.nextLine();
                }

                array[i] = input.nextInt();
                input.nextLine();

            } while (array[i] >= 100);
        }

        // Stampa valori con indice dispari
        System.out.print("Valori con indice dispari: ");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

        // Trova il massimo
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Il numero massimo e': " + max);

        input.close();

        /*
        Inserisci la componente [0] dell' array (minore di 100): 200
        Inserisci la componente [0] dell' array (minore di 100): 201
        Inserisci la componente [0] dell' array (minore di 100): 90
        Inserisci la componente [1] dell' array (minore di 100): 30
        Inserisci la componente [2] dell' array (minore di 100): 15
        Inserisci la componente [3] dell' array (minore di 100): 18
        Inserisci la componente [4] dell' array (minore di 100): -9
        Inserisci la componente [5] dell' array (minore di 100): 14
        Inserisci la componente [6] dell' array (minore di 100): 91
        Inserisci la componente [7] dell' array (minore di 100): 50
        Inserisci la componente [8] dell' array (minore di 100): 55
        Inserisci la componente [9] dell' array (minore di 100): 25
        Valori con indice dispari: 30 18 14 50 25 
        Il numero massimo e': 91
        */
    }
}