import java.util.Scanner;

public class Es2MinimoMassimoWhileInClass {

    //static final double Double.MAX_VALUE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Richiesta ripetuta nuovi valori double
        // La richiesta di nuovi valori dovrà terminare non
        // appena l’utente inserirà il valore 0. 

        boolean richiestaTrue = true;

        double numero;

        double massimo = 0;

        double minimo = 0;

        System.out.println("Inserire numeri con virgola: ");
        System.out.println("Numero: ");


        while(richiestaTrue){
        
            // Ciclo che continua fino a quando non viene inserito un numero double valido
            // hasNextDouble NON legge o consuma quello che c'e' nel buffer
            //   || !scanner.hasNextDouble()
            while(!scanner.hasNextDouble() ) {
                System.out.print("Input non valido. Inserisci un numero con la virgola: ");

                scanner.nextLine(); // Scarta l'input non valido (svuotamento buffer)
            }

            // Una volta ottenuto un double, lo memorizziamo e lo stampiamo
            System.out.print("Numero: ");
            numero = scanner.nextDouble();


            // Controllo minimo e massimo
            if(numero > minimo){
                massimo = numero;
            } else {
                minimo = numero;
            }



            // Se l'utente inserisce il numero "0" cambia il flag di richiestaTrue
            if(numero == 0) {
                richiestaTrue = false;
            }
        
        }

        

        // Al termine il programma dovrà visualizzare a
        // schermo il valore minimo e quello massimo inseriti.
        System.out.println("Minimo: " + minimo);
        System.out.println("Massimo: " + massimo);


    }
    
}
