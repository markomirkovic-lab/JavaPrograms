
import java.util.Scanner;

public class DiagonaliBassoAltoV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int righe;
        int colonne;
        int numeroDiagonali;
        int cnt = 0;
        int r = 0;
        int c = 0;
        int nColonneDiagonali;
        int intervalloColonneDiagonali = -1;

        System.out.print("Inserisci il numero di righe (numero intero): ");
        righe = input.nextInt();
        input.nextLine();

        System.out.print("Insersici il numero di colonne (numero intero): ");
        colonne = input.nextInt();
        input.nextLine();

        System.out.print("Inserisci il numero di diagnali (numero intero): ");
        numeroDiagonali = input.nextInt();
        //numeroDiagonali += 1;
        input.nextLine();

        System.out.print("Inserisci il numero di intervallo tra diagnali (numero intero): ");
        intervalloColonneDiagonali = input.nextInt();
        input.nextLine();

        System.out.println("Stampa diagonali - diagonaleN con l'eventuale spazio\n****************************************************\n\n");

        for (r = 0; r < righe; r++) {
            for (c = 0; c < colonne + 1 + numeroDiagonali + intervalloColonneDiagonali; c++) {
                if (c + r + numeroDiagonali == righe - 1 + numeroDiagonali) // or if (c + r == colonne - 1 + numeroDiagonali)
                {
                    //System.out.print("*");
                    for(nColonneDiagonali = 0; nColonneDiagonali < numeroDiagonali; nColonneDiagonali++) {
                        if(intervalloColonneDiagonali == 0) {
                            System.out.print("*");
                        } else if (intervalloColonneDiagonali != 0){

                            // stampa diagonali
                            for(int colonneStampa = 0;
                                colonneStampa < intervalloColonneDiagonali; 
                                colonneStampa = colonneStampa + 1 + intervalloColonneDiagonali) {
                                //                                  aggiunta intervallo richiesto
                                System.out.print("*");

                                // stampa spazi
                                for(int colonneNonStampa = 0;
                                colonneNonStampa < intervalloColonneDiagonali; 
                                colonneNonStampa++) {

                                    System.out.print(" ");
                                }
                            }
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        input.close();
    }

}
