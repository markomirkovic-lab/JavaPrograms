/*
9.3 Romani
Scrivete un programma che legga da tastiera una cifra romana fra le seguenti I, V, X, L, C,
D, M e stampi a video il rispettivo valore (1, 5, 10, 50, 100, 500, 1000).
*/
import java.util.Scanner;

public class Es9_3_Romani {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char carattere;
        int decimale;

        System.out.print("Immeti la cifra romana: ");
        carattere = input.next().trim().charAt(0);
        input.nextLine();

        switch (carattere) {
            case 'I':
            case 'i':
                decimale = 1;
                break;

            case 'V':
            case 'v':
                decimale = 5;
                break;
            
            case 'X':
            case 'x':
                decimale = 10;
                break;
        
            case 'L':
            case 'l':
                decimale = 50;
                break;

            case 'C':
            case 'c':
                decimale = 100;
                break;

            case 'D':
            case 'd':
                decimale = 500;
                break;

            case 'M':
            case 'm':
                decimale = 1000;
                break;

            default:
                decimale = -1;
                break;
        }

        if(decimale == -1) {
            System.out.println("Hai inserito la cifra romana (" + carattere + ") non valida!");
        } else {
            System.out.println("La cifra romana (" + carattere + ") equivale al decimale: " + decimale);
        }

        input.close();
        
    }
    
}
