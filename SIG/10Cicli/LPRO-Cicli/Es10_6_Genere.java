/*
10.6 Genere
Scrivete un software che legga il vostro nome e determina se è maschile o femminile.
Se termina per a sarà femminile, altrimenti maschile.
Se il nome è Andrea il programma risponde Sia maschile che femminile.
Il programma ripete le operazioni fino a che l’utente inserisce il nome QUIT.
*/

import java.util.Scanner;

public class Es10_6_Genere {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome = "";

        do {
            System.out.print("Digita un nome (o 'quit' per terminare): ");
            nome = input.nextLine();
            nome = nome.trim();

            if((nome.charAt(nome.length()-1) == 'a' || nome.charAt(nome.length()-1) == 'A')
                && (!nome.equals("Andrea") || !nome.equals("QUIT")) ) {

                System.out.println("Il " + nome + " e' feminile.");

            } else if (nome.equals("Andrea")) {

                System.out.println("Il " + nome + " e' feminile e maschile.");                
            } else {

                if(!nome.equalsIgnoreCase("QUIT")) {
                    System.out.println("Il " + nome + " e' maschile.");
                }
            }
        } while (!nome.equalsIgnoreCase("QUIT"));
        //       !nome.toLowerCase().equals("quit")

        input.close();

    }
    
}
