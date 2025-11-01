/*
11.3 Media di temperature
Scrivete un software in grado di memorizzare 12 temperature da -50 a +50 gradi, 
una ogni due ore.
Il programma deve poter stampare tutte le temperature e calcolare la media di 
quelle inserite.

*/

//import java.util.Arrays;
import java.util.Scanner;

public class Es11_3_MediaDiTemperature {

    static final double MIN_TEMPERATURA = -50.0;
    static final double MAX_TEMPERATURA = 50.0;

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] temperature = new double[12];

        String messaggio = "Programma temperature in gradi centigradi \n"+
                           "Inserisci temperature tra -50 e 50 gradi centigradi";

        System.out.println(messaggio);

        int counter = 0;
 
        while(counter < temperature.length) {
            System.out.print("Inserisci temperatura numero " + (counter + 1) + " :");
        
            if(input.hasNextDouble()) {
                double tempTemperatura = input.nextDouble();

                if(tempTemperatura >= MIN_TEMPERATURA && tempTemperatura <= MAX_TEMPERATURA) {
                    temperature[counter] = tempTemperatura;
                    counter++;
                } else {
                    System.out.println("Errore: La temperatura deve essere compresa tra -50 e 50 gradi.");
                } 
            } else {
                System.out.println("Input errato. Riprova!");
                input.nextLine();
            }
            
        }

        // stampa
        System.out.println("Temperature memorizzate: ");
        for(int i = 0; i < temperature.length; i++) {
            System.out.println(temperature[i] + " gradi C ");
        }

        System.out.println("");

        double mediaTemperature = 0;;
        double sommaTemperature = 0;

        // calcolo somma temperature
        for(int i = 0; i < temperature.length; i++) {
            sommaTemperature += temperature[i];
        }

        // calcolo e stampa media temperature
        if(temperature.length > 0) {
            mediaTemperature = sommaTemperature / temperature.length;
            System.out.println("Media temperature: " + mediaTemperature + " gradi C");
        }
        
        input.close();

    }

}
