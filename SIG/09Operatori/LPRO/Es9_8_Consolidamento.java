/*
9.8 Esercizi di consolidamento
1. Dichiarare e inizializzare le variabili tempMin e tempMax, con i 
   valori 10 e 20
2. Scegliere un valore compreso tra 0 e 30 e assegnarla alla variabile 
   tempAttuale (da dichiarare)
3. Se il valore di tempAttuale è inferiore a tempMin o superiore a 
   tempMax stampare "Temperatura fuori controllo"
4. Se il valore di tempAttuale è compreso fra tempMin e tempMax 
   stampare "Temperatura corretta" 
*/
import java.util.Scanner;

public class Es9_8_Consolidamento {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tempMin = 10.0;
        double tempMax = 20.0;

        double tempAttuale;
        
        System.out.print("Inserire la temperatura attuale: ");
        tempAttuale = input.nextDouble();
        input.nextLine();

        if(tempAttuale < tempMin || tempAttuale > tempMax) {
            System.out.println("Temperatura fuori controllo");
        } else if (tempAttuale >= tempMin && tempAttuale <= tempMax) {
            System.out.println("Temperatura corretta");
        }

        input.close();

    }
    
}
