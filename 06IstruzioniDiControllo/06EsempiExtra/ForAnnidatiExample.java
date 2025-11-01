/*  
Scrivere un programma, che utilizzando dei cicli, stampi
1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 
*/

public class ForAnnidatiExample {

    static final int NR_ELEMENTI = 5;

    public static void main(String[] args) {
        for (int i = 1; i < NR_ELEMENTI; i++) { // ciclo sulle righe

            for (int j = 1; j < NR_ELEMENTI; j++) { // ciclo sugli elementi di una riga
                System.out.print(j + " ");
            }
            // a capo per ogni riga
            System.out.println();
        }
    }
}
