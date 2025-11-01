/*
6.2 Bancomat
Di che tipo sarà la variabile che memorizza la scelta dell’utente dell’esercizio 3.3?
Un sistema bancomat consente di prelevare o di versare dei soldi.
Il prelievo è dato dal pulsante P, mentre il versamento dal pulsante V. 
L’utente deve poter scegliere l’opzione, inserire l’importo, e vedere il saldo finale.
E la variabile per l’importo?
E quella del saldo finale?
*/

import java.util.Scanner;

public class Es6_2_Bancomat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // double
        // double

        double importo = 0.0;
        double saldo = 10000.0;
        boolean coretto;
        int scelta = -1;


        do {
            System.out.print("Scegli la operazione : \n");
            System.out.println("1. prelevamento\n2. versamento\n0. esci\n---> ");
    
            if(input.hasNextInt()) {

                scelta = input.nextInt();

                switch (scelta) {
                    case 1:
                        System.out.print("Digita l'importo di prelievo: ");
                        importo = input.nextDouble() * -1;
                        saldo += importo;
                        System.out.println("Hai prelevato " + importo);
                        System.out.println("Il tuo saldo attuale = " + saldo);
                        System.out.println();
                        break;

                    case 2:
                        System.out.print("Digita l'importo di versamento: ");
                        importo = input.nextDouble();
                        saldo += importo;
                        System.out.println("Hai versato " + importo);
                        System.out.println("Il tuo saldo attuale = " + saldo);
                        System.out.println();
                        break;
                    
                    case 0:
                        System.out.println("Grazie e arrivederci!");
                        scelta = 0;
                        break;
                
                    default:
                        break;
                }

            } else {
                System.out.println("Scelta errata, riprova!");
                input.nextLine();
                System.out.println();
            }


        } while(scelta!=0);

        input.close();

    }
    
}
