import java.util.Scanner;

public class HelloWorldScanner {
    public static void main(String[] args){

        System.out.println("Scrivi il tuo nome: ");

        Scanner input = new Scanner(System.in);

        String nomeUtente = input.nextLine();

        input.close();

        System.out.println("Hello World!!!");
        System.out.println(nomeUtente);

        /*
        Scrivi il tuo nome: 
        Marko
        Hello World!!!
        Marko
        */

    }
    
}
