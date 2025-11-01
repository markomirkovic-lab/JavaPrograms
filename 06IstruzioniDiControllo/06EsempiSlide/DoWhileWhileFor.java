import java.util.Scanner;

public class DoWhileWhileFor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.print("Inserire un valore tra 1 e 10: ");

            while(scanner.hasNextInt()==false){
                scanner.nextLine();
                System.out.print("Formato errato! Inserire un valore tra 1 e 10: ");
            }

            numero = scanner.nextInt();
            scanner.nextLine();

        } while(numero<1 || numero>10);

        scanner.close();

        System.out.println("Tabellina del numero: " + numero);

        for(int i = 1; i<10; i++){
            System.out.println(i + " x " + numero + " = " + (i*numero));
        }

    }
    
}
