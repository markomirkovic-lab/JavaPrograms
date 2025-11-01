/*
Esercizio 6.3 - Rimozione duplicati
Usate un array monodimensionale per risolvere il seguente problema: scrivete
un’applicazione che legga da tastiera cinque numeri, ciascuno compreso tra i valori
10 e 100 inclusi. Dopo l’acquisizione di ogni numero, memorizzatelo solamente se non
è un duplicato di un numero già inserito in precedenza. Dopo aver richiesto i cinque
numeri, visualizzate l’insieme completo di valori unici memorizzati
*/
import java.util.Arrays;
import java.util.Scanner;

public class Es6_3_RimozioneDuplicati {

    static final int LENGTH = 5;

    public static void main(String[] args) {

        // Inizializza lo scanner per leggere dati da tastiera
        Scanner input = new Scanner(System.in); 

        // variabili
        boolean duplicato;
        int numberCounter = 0;

        // array di numeri
        int[] arrayNumber = new int[LENGTH];

        // Richiedi i 5 valori
        for(int i = 0; i < arrayNumber.length; i++) {

            System.out.print("Inserici un numero intero tra 10 e 100: ");
            int number = input.nextInt();
            input.nextLine();

            // Controllo se i valori sono entro i limiti minimo/massimo
            while(number < 10 || number > 100) {

                System.out.print("Errore. Riprova, inserici un numero intero tra 10 e 100: ");
                number = input.nextInt();
                input.nextLine();
            }

            //Controllo se il valore inserito e' un duplicato
            duplicato = false;
            for(int j = 0; j < numberCounter; j++) {

                if(number == arrayNumber[j]) {
                    duplicato = true;
                    break;
                }
            }

            // Memorizza il valore inserito solo se non e' un duplicato
            if(!duplicato) {
                arrayNumber[numberCounter++] = number;
            }

        }
        
        // stampa tutto l'array
        //System.out.println(Arrays.toString(arrayNumber));
        System.out.print("Tutti i numeri: \t");
        for(int element : arrayNumber) {
            System.out.print(element + " ");
        }
        System.out.println();

        // stampa solo valori unici memorizzati
        System.out.print("Numeri unici: \t\t");
        for(int i = 0; i < numberCounter; i++) {
            System.out.print(arrayNumber[i] + " ");
        }

        input.close();
    }
    
}
