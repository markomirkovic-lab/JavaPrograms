/*
10.5 Quadrato
Scrivete un programma che chiede all’utente di immettere un numero e poi stampi a 
schermo un quadrato con la dimensione specificata. Es: se il numero è 5 sullo schermo 
apparirà
*****
*   *
*   *
*   *
*****

*/

import java.util.Scanner;

public class Es10_5_QuadratoV3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Immetti la dimensione del quadrato: ");
        int lato = input.nextInt();

        for(int riga = 1; riga <= lato; riga++) {

            for(int colonna = 1; colonna <= lato; colonna++) {

                if( (riga == 1 || riga == lato) || //stampa prima e ultima riga piena
                    (colonna == 1 || colonna == lato) ) {//stampa prima e ultima colonna piena
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    // anche se stampa sopra gli * il disegno non cambia
            }
            System.out.println();
        }

    }
}
