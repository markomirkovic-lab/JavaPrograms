/*
 * Esercizio da mal di testa
 * Se la riga è dispari, bisogna stampare PRIMA uno meno
 * Se la riga è pari, bisogna stampare DOPO la riga un meno
 * Se la riga è pari, bisogna stampare un # nelle colonne pari
 * In tutti gli altri casi dovremo stampare uno spazio
 * Al termine della riga devo andare a capo
 * 
 */

import java.util.Scanner;

public class ForRigaColonna1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        //int numeroUtente = scanner.nextInt();
        int numeroUtente = 1;

        do{
            System.out.print("Inserici un numero intero e positivo: ");

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Errore dato inserito. Inserici un numero intero: ");
            }

            numeroUtente = scanner.nextInt();
            scanner.nextLine();

        } while(numeroUtente<1);

        scanner.close();
                
        //Se la riga è dispari, bisogna stampare PRIMA uno meno
        //Se la riga è pari, bisogna stampare DOPO la riga un meno
        for(int riga=0; riga<numeroUtente; riga++ ){
            // Il codice che inserite qui sara' eseguito prima
            // prima di iniziare a ellaborare la cella di una riga

            if(riga%2 == 0){
                System.out.print(" ");
            } else {
                System.out.print("-");// Se dispari stampa "-"
            }

            // Se la riga è pari, bisogna stampare un # nelle colonne pari
            // In tutti gli altri casi dovremo stampare uno spazio
            for(int colonna = 0; colonna<numeroUtente; colonna++){
                // Questo codice verra eseguito 
                // per ogni cella (della matrice) a due dimensioni
                if(riga%2==0 && colonna%2==0){
                    System.out.print("#");
                } else{
                    System.out.print(" ");
                }
            }

            // Il codice che inserirete qui sarà eseguito
            // DOPO aver trattato una riga completa della
            // matrice a due dimensioni
            if(riga%2==0) {
                System.out.print("-"); //Se pari stampo un -
                }
                else {
                System.out.print(" ");
                }
                //Al termine della riga devo andare a capo
                System.out.println("");
        }

    }
}
