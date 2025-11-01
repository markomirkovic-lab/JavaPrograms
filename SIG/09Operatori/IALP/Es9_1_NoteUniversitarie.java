/*
9.1 Note universitarie
Modificate il codice fornito e adattatelo in modo che se viene inserita una lettera errata 
stampi "Nota non valida".
*/
import java.util.Scanner;

public class Es9_1_NoteUniversitarie {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char nota;
        double notaDecimale = 0;

        System.out.print("Inserire nota dello studiente: ");
        nota = input.next().trim().charAt(0);

        switch (nota) {
            case 'A':
            case 'a':
                notaDecimale = 6;                
                break;
        
            case 'B':
            case 'b':
                notaDecimale = 5.5;
                break;

            case 'C':
            case 'c':
                notaDecimale = 5;
                break;

            case 'D':
            case 'd':
                notaDecimale = 4.5;
                break;

            case 'E':
            case 'e':
                notaDecimale = 4;
                break;

            case 'F':
            case 'f':
                notaDecimale = 3;
                break;

            default:
                // Fornisce un valore fuori range, cosi' si puo' tracciare l'errore
                notaDecimale = 0;
                break;
        }

        if(notaDecimale == 0) {
            System.out.println("Hai inserito un valore errato (" + nota + ") invece di A, B, C, D, E, F.");
        } else {
            System.out.println(nota + " diventa: " + notaDecimale);
        }

        input.close();

    }
    
}
