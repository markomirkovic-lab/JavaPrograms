/*
10.5 Trim interna
Scrivete un programma che chiede l’immissione di una frase e toglie gli spazi multipli.
Es: Se l’utente inserisce "Ciao           Luca", dovremo ottenere "Ciao Luca"
*/
import java.util.Scanner;

public class Es10_5_TrimInterno {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi qualcosa con spazzi multipli tra parole: ");
        String frase = input.nextLine();
        System.out.println("Frase: \t\t\t" + frase);

        frase = frase.trim();

        String fraseTrimmata = "";

        for(int i = 0; i < frase.length(); i++) {
            
            if(frase.charAt(i) != ' ' && frase.charAt(i) != '\t') {
                
                fraseTrimmata += frase.charAt(i);
                //if(frase.charAt(i+1) )
            }
        }
        
        System.out.println("Frase trimmata: \t" + fraseTrimmata);
    }
    
}
