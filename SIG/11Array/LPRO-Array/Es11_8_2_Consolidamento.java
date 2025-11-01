/*
Dichiarate un array di interi di dimensione 10.
Chiedete all’utente di inserire un numero fra 0 e 9, memorizzatelo in cella
Chiedete all’utente di inserire un numero intero, memorizzatelo in valore.
Inserite nella cella indicata da cella il valore
*/
import java.util.Arrays;
import java.util.Scanner;

public class Es11_8_2_Consolidamento {

    public static void main(String[] args) {

        //---------------------------------------------------------------------
        //    Dichiarate un array di interi di dimensione 10.
        //    Chiedete all’utente di inserire un numero fra 0 e 9, memorizzatelo in cella
        //    Chiedete all’utente di inserire un numero intero, memorizzatelo in valore.        
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int cella;
        int valore;
          
        // ciclo do while che richide il valore della cella 1 volta e
        // piu' volte se l'utente inserisce un valore fuori dal range 0-9
        do {
            System.out.print("Inserisci la posizione nell'array. Da 0 a " + array.length + ": ");

            while(!input.hasNextInt()) {

                System.out.print("Inserire p.f. un numero intero: ");
                input.nextLine();
            }
            cella= input.nextInt();
        } while(cella<0 || cella>array.length-1);
     
        // richiesta e memorizzazione del valore da inserire nella cella
        System.out.print("Inserisci un valore: ");
        valore = input.nextInt();

        // inserimento del valore nella cella definita precedentemente definita dall'utente
        array[cella]= valore;

        //System.out.println(" 0  1  2  3  4  5  6  7  8  9 10");
        System.out.println(Arrays.toString(array));
        
    }
    
}
