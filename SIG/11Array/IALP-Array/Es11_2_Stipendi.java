/*
11.1 Stipendi
Scrivete un programma che chiede all’utente di inserire il numero di dipendenti della sua 
ditta.
Verrà poi richiesto il nome di ogni dipendente e lo stipendio mensile.
Al termine viene stampato il nome affiancato allo stipendio
*/
import java.util.Scanner;

public class Es11_2_Stipendi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numeroDipendenti;
        String nome[];
        double stipendo[];        

        System.out.print("Inserisci il numero (numero intero) dei dipendenti: ");
        numeroDipendenti = input.nextInt();
        input.nextLine();
        System.out.println("La ditta ha " + numeroDipendenti + " dipendenti.");

        nome = new String[numeroDipendenti];
        stipendo = new double[numeroDipendenti];

        for(int i = 0; i < nome.length; i++) {

            System.out.print("Inserisci il nome del dipendente nr. " + (i+1) + ": ");
            nome[i] = input.nextLine();

            System.out.print("Inserisci lo stipendio del dipendente nr. " + (i+1) + ": ");
            stipendo[i] = input.nextDouble();
            input.nextLine();

        }

        for(int i = 0; i < nome.length; i++) {

            System.out.print("Nome e stipendio del dipendente nr. " + (i+1) + ": " + nome[i] + ", " + stipendo[i] + "\n");

        }


        input.close();


    }

    
}