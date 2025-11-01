/*
Esercizio svolto in classe
Scrivere un programma che:
chieda all'utente 10 numeri interi, minori di 100
li salvi in un array
stampi i valori che sono in una cella dell'array con indice dispari
stampi il valore massimo contenuto nell'array
 */
import java.util.Scanner;

public class EsInClasse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] prova = new int[10];

        for(int i = 0; i < prova.length; i++) {
            do{
                System.out.print("Inserici la componente [" + i + "] dell'array: ");
                System.out.println();
                while(!input.hasNextInt()){
                    System.out.println("Inserire un numero intero: ");
                    input.nextLine();
                }

                prova[i] = input.nextInt();
                input.nextLine();

            } while(prova[i]>=100);
        }

        for(int i = 1; i<prova.length; i+=2) {
            System.out.println(prova[i] + " ");


        }

        // approccio non coretto

        int max = 0;

        for(int i=1; i<prova.length; i++) {
            if(prova[i]>=prova[i-1]) {//>= risolve se i numeri sono uguali ma non basta
                max = prova[i];
            }
        }

        System.out.println();
        System.out.println("Il numero massimo e' " + max);

        System.out.println("");

        // approccio corretto:
        // suppongo che il max e' il valore piu' grande nella prima cella

        max = prova[0];

        for(int i=1; i<prova.length; i++) {// se per esempio voglio max di primi 5 elementi
                                           // mettere 5 invece di prova.length
            if(prova[i]>max) {//confronto tra celle
                max = prova[i];
            }
        }

        System.out.println();
        System.out.println("Il numero massimo e' " + max);

        input.close();

    }
    
}
