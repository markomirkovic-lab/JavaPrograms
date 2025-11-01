/*
Realizzate un algoritmo che continua a chiedere all’utente l’inserimento di un 
numero intero pari fino a che non lo immette
*/
import java.util.Scanner;

public class Es10_8_7_IndovinaNumero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int numeroRandom = 0;

        do {
            
            System.out.print("Inserici un numero intero, positivo e pari: ");

            numero = input.nextInt();

            numeroRandom = (int) (Math.random() * 10) + 1;
            System.out.println(numeroRandom);
            

        } while(numero != numeroRandom && numero % 2 == 0);

        if(numero == numeroRandom && numero > 0) {
            System.out.println("Bravo hai indovinato il numero!");
        }

    }
    
}
