/*
10.3 Mail
Scrivete un programma che consente di determinare se l’email inserito dall’utente è valido, 
seguendo le regole seguenti:
- Deve contenere una sola @
- Non può contenere spazi
- Dopo la @ deve esserci almeno un punto.
*/
import java.util.Scanner;

public class Es10_3_MailV2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un email: ");
        String email = input.next();
        email = email.trim();

        // Variabili inizializzate
        int posizione = 0;
        int cntAt = 0;
        int posizioneAt = 0;
        int punti = 0;
        int spazi = 0;


        for(posizione = 0; posizione < email.length(); posizione++) {

            if(email.charAt(posizione) == '@') {
                cntAt++;
                posizioneAt = posizione;
            } else if(email.charAt(posizione) == ' ') {
                spazi++;
            }
        }

        for(posizione = posizioneAt; posizione < email.length(); posizione++) {

            if(email.charAt(posizione) == '.') {
                punti++;
            }
        }

        if(spazi != 0 || cntAt !=1  || punti == 0) {
            System.out.println("Email non valida!");
        } else {
            System.out.println("Email valida!");
        }

    }
    
}

