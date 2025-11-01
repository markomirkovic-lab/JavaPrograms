/*
10.7 Numeri amici (difficile)
Due numeri sono detti amici se la somma dei divisori del primo numero è uguale al secondo 
numero e la somma dei divisori del secondo numero è uguale al primo.
N.B: Non viene considerato se stesso come divisore.
Scrivete un programma che sia in grado di calcolare i numeri amici fino ad un massimo 
introdotto da tastiera.
Es: 220 e 284 sono numero amici.
I divisori di 220 sono: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 (sum = 284)
I divisori di 284 sono: 1, 2, 4, 71, 142 (sum = 220)
*/

import java.util.Scanner;

public class Es10_7_NumeriAmici {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Variabili
        int max;
        int primoNumero;
        int sommaPrimo = 0;
        int secondoNumero;
        int sommaSecondo = 0;
        int divisori;
        int cntPrimo = 0;
        int cntSecondo = 0;

        // Inserimento numero massimo
        System.out.print("Inserisci il numero max: ");
        max = input.nextInt();

        // Incremento il primo numero fino al numero max inserito
        for(primoNumero = 1; primoNumero <= max; primoNumero++) {

            // Calcolo somma divisori (/2 perche' il numero non e' divisibile per se stesso)
            for(divisori = 1; divisori <= primoNumero/2; divisori++) {
                
                if(primoNumero % divisori == 0) {
                    sommaPrimo += divisori;
                    cntPrimo++;
                }
            }

            // Secondo numero
            secondoNumero = sommaPrimo;

            // Calcolo divisori secondo numero (/2 perche' il numero non e' divisibile per se stesso)
            for(divisori = 1; divisori <= secondoNumero/2; divisori++) {

                if(secondoNumero % divisori == 0) {
                    sommaSecondo += divisori;
                    cntSecondo++;
                }
            }

            // Quando trova dei numeri amici lo stampa a schermo
            if(primoNumero==sommaSecondo && primoNumero != secondoNumero) {

                System.out.println(primoNumero + " e " + secondoNumero + " sono amici.");
            }

            // Portare le somme di divisori a 0
            sommaPrimo=sommaSecondo=0;
        }
        //System.out.println(cntPrimo);
        //System.out.println(cntSecondo);
    }
    
}
