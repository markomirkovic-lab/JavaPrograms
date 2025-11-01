/*
9.5 Negativo?
Scrivete un programma che permette all’utente di inserire un numero.
Il programma dirà se il numero è positivo, negativo oppure 0.
*/
import java.util.Scanner;

public class Es9_5_NegativoPositivoZero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;
        String tipoDiNumero;

        System.out.print("Inserisci un numero: ");
        numero = input.nextInt();
        input.nextLine();

        if(numero < 0) {
            tipoDiNumero = "negativo";
        } else if( numero > 0) {
            tipoDiNumero = "positivo";
        } else {
            tipoDiNumero = "zero";
        }

        System.out.println("Il numero inserito (" + numero + ") e' " + tipoDiNumero);

        input.close();
    }
    
}
