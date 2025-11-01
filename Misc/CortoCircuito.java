import java.util.Scanner;

public class CortoCircuito {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un valore per x: ");
        //double x = input.nextDouble();
        int x = input.nextInt();
        //se fosse int: eccezione

        System.out.println("Inserisci un valore per y: ");
        //double y = input.nextDouble();
        int y = input.nextInt();
        //se fosse int: eccezione

        //rappresentazione in formato binario del numero con la virgola
        //in caso dei double il numero non totalmente preciso

        input.close();

        //funziona con i double
        //System.out.println("y / x " + y/x);
        //System.out.println("x " + x);

        /*
        if(y / x > 1) {
            System.out.println("y / x > 1");
        } else {
            System.out.println("y / x = 1");
        }
        */

        // SHORT CIRCUIT EVALUTION
        if(x!=0 && y / x > 1) {//quando prima condizione di un && e' falso non va a controllare la seconda parte della condizione
            System.out.println("Divisione intera: y / x > 1");
        } else {
            System.out.println("x e' uguale a zero, oppure la divisone intera: y / x = 1");
        }


    }
    
}
