/*
11.3 Fiori
Scrivete un programma che memorizza in un array i nomi di alcuni fiori e in un secondo 
array il costo di ogni mazzo di fiori.
L’utente può immettere il nome del fiore e il programma restituirà il prezzo al mazzo di quel 
fiore.
*/

import java.util.Scanner;

public class Es11_3_FioriV2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nomeFiore[] = {"Rose", "Margherite", "Tulipani"};
        double costoMazzoDiFiore[] = {10, 7, 11};
        String fiore;
        double prezzo;
        boolean trova;

        do {
            System.out.println("Gestione fiori");

            System.out.print("Inserisci il nome del fiore: ");
            fiore = input.next();
            fiore = fiore.trim();
            input.nextLine();

            trova = false;

            for(int i = 0; i < nomeFiore.length; i++) {
                
                if(fiore.equalsIgnoreCase(nomeFiore[i])) {
                    System.out.println("Il fiore " + fiore + " costa " + costoMazzoDiFiore[i] + " al mazzo.");
                    trova = true;
                    break;
                }
            }

        } while(!trova);


        input.close();
    }
    
}
