import java.util.Scanner;

public class PiramideInClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Base piramide (dispari): ");

        int base = scanner.nextInt();

        while(base % 2 == 0 || base < 0){
            System.out.print("La base deve essere dispari. Riprova");
            base = scanner.nextInt();
        }

        scanner.close();

        //righe
        for(int i = 0; i <= (base/2); i++){
            //spazzi (ad ogni riga stampa 2 spazzi in meno)
            for(int j = i; j < base / 2; j++)
                System.out.print("  ");
            //elementi da stampare (in base al no. di righe, 1a indice 0, )
            for (int j = 0; j < (i * 2 + 1); j++){
                System.out.print((int) (Math.random() * 10) + " ");
            }
            System.out.println();
        }

    }
    
}
