/*
Realizzate un algoritmo che stampi tutte le lettere da ‘c’ a ‘q’
*/

public class Es10_8_5_StampaLettere {
    
    public static void main(String[] args) {

        char charInizio = 'c';
        int intInizio = (int) charInizio;
        char charFine = 'q';
        int intFine = (int) charFine;

        for(int i = intInizio; i <= intFine; i++) {

            System.out.print((char) i + " ");
        }

        //--
        System.out.println("\n");

        System.out.println("carattere: intero corrispettivo");
        for(char k='c'; k<='q'; k++)
        {
            System.out.println(k + ": " + (int)k);
        }
        
    }
}
