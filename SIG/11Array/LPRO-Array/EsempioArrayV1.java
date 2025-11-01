import java.util.Scanner;

public class EsempioArrayV1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Dimensione Array
        int valori;
        System.out.println("Vuoi calcolare la media di quanti valori?");
        while(!input.hasNextInt()) {
            input.nextLine();
        }
        valori = input.nextInt();
        input.nextLine();

        // Dichiarazione - instanziamento di un Array
        double[] valore;// Dichiaro
        valore = new double[valori];// Occupo la memoria HEAP (istanziamento di array)





        

    }
    
}
