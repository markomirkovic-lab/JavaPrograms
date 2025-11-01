/*
Esempio di programma introduttivo
al mondo della programmazione in Java
*/


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = input.nextLine();

        System.out.print("Inserisci l'eta': ");
        int eta = input.nextInt();
       
        // Chiudo lo scanner
        input.close(); 

        System.out.println();
        System.out.println("\nHello World!!!"); // \n stampa un'andata a capo
        System.out.println(nomeUtente);
        System.out.println(eta);
    }
}