/*
Realizzate un algoritmo che legge una frase inserita dall’utente e poi la stampi 
rovesciata
*/
import java.util.Scanner;

public class Es10_8_6_FraseAlContrario {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi una frase: ");
        String frase = input.nextLine();
        frase = frase.trim();

        for(int i = frase.length()-1; i >= 0; i--) {

            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }
    
}
