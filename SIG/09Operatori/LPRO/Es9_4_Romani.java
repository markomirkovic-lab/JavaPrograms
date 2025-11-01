
/*
9.4 Romani 2
Scrivete anche il programma che fa il contrario, ovvero legge dei numeri e stampa il
corrispettivo romano a video.
Se il numero immesso non ha un corrispettivo allora stamperà: valore non valido.
( I, V, X, L,   C,   D,    M) = 
(1, 5, 10, 50, 100, 500, 1000).
*/
import java.util.Scanner;

public class Es9_4_Romani {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char carattere;
        int decimale;

        System.out.print("Immeti la cifra decimale: ");
        decimale = input.nextInt();
        input.nextLine();

        switch (decimale) {
            case 1:
                carattere = 'I';
                break;

            case 5:
                carattere = 'V';
                break;

            case 10:
                carattere = 'X';
                break;

            case 50:
                carattere = 'L';
                break;

            case 100:
                carattere = 'C';
                break;

            case 500:
                carattere = 'D';
                break;

            case 1000:
                carattere = 'M';
                break;

            default:
                carattere = '-';
                break;
        }

        if (carattere == '-') {
            System.out.println("Valore non valido!");
        } else {
            System.out.println("La cifra decimale (" + decimale + ") equivale alla cifra romana: " + carattere);
        }

        input.close();

    }

}
