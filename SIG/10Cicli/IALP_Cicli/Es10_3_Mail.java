/*
10.3 Mail
Scrivete un programma che consente di determinare se l’email inserito dall’utente è valido, 
seguendo le regole seguenti:
- Deve contenere una sola @
- Non può contenere spazi
- Dopo la @ deve esserci almeno un punto.
*/
import java.util.Scanner;

public class Es10_3_Mail {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un email: ");
        String email = input.next();
        email = email.trim();

        boolean space = false;
        boolean at = false;
        boolean dot = false;
        boolean atAfterDot = false;
        boolean notDoubleDot = false;
        boolean isValid = false;

        int indexAt = 0;
        int cntAt  = 0;
        int indexDot = 0;
        int cntDoubleDots = 0;


        for(int i = 0; i < email.length(); i++) {

            if(email.charAt(i) != ' ') {
                space = true;
            }

            if(email.charAt(i) == '@') {
                indexAt = i;
                at = true;
                cntAt++;
            }

            if(at && email.charAt(i) == '.') {
                indexDot = i;
            }

            if(indexAt < indexDot) {
                atAfterDot = true;
            }

            if((at && email.charAt(i) == '.' && email.charAt(i+1) == '.')) {
                cntDoubleDots++;
            } 

        }

        if(cntDoubleDots == 0) {
            notDoubleDot = true;
        }

        //System.out.println(cntDoubleDots);
        //System.out.println(notDoubleDot);

        if(space && at && cntAt==1 && atAfterDot && notDoubleDot) {
            isValid = true;
            System.out.println("L'email " + email + " e' valida");
        } else {
            System.out.println("L'email " + email + " non e' valida");
        }


    }
    
}
