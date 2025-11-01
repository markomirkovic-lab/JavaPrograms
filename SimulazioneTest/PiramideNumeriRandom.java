
/*
Scrivete un programma che stampi a schermo una piramide di cifre casuali
(numeri tra 0 e 9 compresi). L'utilizzatore del programma dovrà poter
definire la dimensione della piramide, specificando il numero di elementi
della base. Il programma dovrà verificare che il numero intero
specificato sia positivo e dispari e richiedere l'eventuale immissione
di un nuovo numero qualora non lo sia. Assumete che il tipo di dato 
inserito dall'utente sia corretto.

Esempio di piramide:

      2
    3 9 2
  5 6 0 2 6
6 3 4 8 2 3 5

*/
import java.util.Scanner;

public class PiramideNumeriRandom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String richiestaNumero = "Scrivi un numero positivo e dispari: ";
        String richiestaNumeroRipetuta = "Errore nell'inserimento. Scrivi un numero positivo e dispari: ";

        
        //int inputUtente = scanner.nextInt();
        int inputUtente;

        do{
          // input utente
          System.out.print(richiestaNumero);
          // controllo input utente
          while(!scanner.hasNextInt()){
              scanner.nextLine();
              System.out.print(richiestaNumeroRipetuta);
              
          }
            inputUtente = scanner.nextInt();
          } while(inputUtente<0 || inputUtente % 2 == 0);

        int output;
        int max = 9;
        int min = 0;
        
        for(int i = 0; i < inputUtente; i++){

            output = (int) Math.random() * (max-min + 1);
            System.out.println(output);

            for(int j = 0; j < inputUtente; j++){
              
            }

        }
       
        
        //System.out.println("ok");

        //inputUtente>0 && inputUtente % 2 ==0


        scanner.close();
    }
    
}
