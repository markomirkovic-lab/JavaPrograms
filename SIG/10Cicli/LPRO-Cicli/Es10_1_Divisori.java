/*
10.1 Divisori
Scrivete un programma che:
• Chiede all’utente di inserire un numero, che chiameremo max
Chiede all’utente di inserire un secondo numero, che chiameremo div
• Per tutti i numeri da 1 a max, divisibili per div, verrà stampato
• Al termine il programma stamperà
• Chiederà all’utente se vuole proseguire o uscire (premendo 'q' oppure 'Q')
se l’utente preme qualsiasi altro tasto il programma ricomincia.

*/
import java.util.Scanner;

public class Es10_1_Divisori {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char tasto = 'q';

        int cnt = 0;

        do {
            
            cnt = 0;// reset counter

            System.out.print("Inserici max: ");
            int max = input.nextInt();
    
            System.out.print("Inseri div: ");
            int div = input.nextInt();
            int i = 1;

            for(i = 1; i <= max; i++) {
                
                if(i % div == 0) {
                    System.out.println(div + " DIVISIORE DI " + i);
                    cnt++;
                    //System.out.println(cnt);
                }
            }

        System.out.println("Trovati " + cnt + " divisibili per " + max);
        System.out.println("");
        input.nextLine();
        System.out.print("Inserisci una lettera (q o Q per terminare): ");  
        tasto = input.next().trim().charAt(0);

        } while (tasto != 'q' && tasto != 'Q');

    input.close();

    }
    
}
