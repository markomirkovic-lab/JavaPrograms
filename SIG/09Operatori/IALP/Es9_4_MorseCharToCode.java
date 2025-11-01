
/*
9.4 Morse
Scrivete un programma che, leggendo una lettera da tastiera riesca a convertirla in morse.
Scrivete inoltre un secondo programma che svolge l’operazione contraria.

Versione: carattere -> codice morse
*/
import java.util.Scanner;

public class Es9_4_MorseCharToCode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char lettera;
        String morse = "";

        System.out.print("Inserisci una lettera o un numero: ");
        lettera = input.next().trim().charAt(0);

        // Controllo della validita' dell'immisione
        if ((lettera >= 'a' && lettera <= 'z') ||
                (lettera >= 'A' && lettera <= 'Z') ||
                (lettera >= '0' && lettera <= '9')) {
            switch (lettera) {
                case 'A':
                case 'a':
                    morse = ".-";
                    break;
                case 'B':
                case 'b':
                    morse = "-...";
                    break;
                case 'C':
                case 'c':
                    morse = "-.-.";
                    break;
                case 'D':
                case 'd':
                    morse = "-..";
                    break;
                case 'E':
                case 'e':
                    morse = ".";
                    break;
                case 'F':
                case 'f':
                    morse = "..-.";
                    break;
                case 'G':
                case 'g':
                    morse = "--.";
                    break;
                case 'H':
                case 'h':
                    morse = "....";
                    break;
                case 'I':
                case 'i':
                    morse = "..";
                    break;
                case 'J':
                case 'j':
                    morse = ".---";
                    break;
                case 'K':
                case 'k':
                    morse = "-.-";
                    break;
                case 'L':
                case 'l':
                    morse = ".-..";
                    break;
                case 'M':
                case 'm':
                    morse = "--";
                    break;
                case 'N':
                case 'n':
                    morse = "-.";
                    break;
                case 'O':
                case 'o':
                    morse = "---";
                    break;
                case 'P':
                case 'p':
                    morse = ".--.";
                    break;
                case 'Q':
                case 'q':
                    morse = "--.-";
                    break;
                case 'R':
                case 'r':
                    morse = ".-.";
                    break;
                case 'S':
                case 's':
                    morse = "...";
                    break;
                case 'T':
                case 't':
                    morse = "-";
                    break;
                case 'U':
                case 'u':
                    morse = "..-";
                    break;
                case 'V':
                case 'v':
                    morse = "...-";
                    break;
                case 'W':
                case 'w':
                    morse = ".--";
                    break;
                case 'X':
                case 'x':
                    morse = "-..-";
                    break;
                case 'Y':
                case 'y':
                    morse = "-.--";
                    break;
                case 'Z':
                case 'z':
                    morse = "--..";
                    break;
                case '0':
                    morse = "-----";
                    break;
                case '1':
                    morse = ".----";
                    break;
                case '2':
                    morse = "..---";
                    break;
                case '3':
                    morse = "...--";
                    break;
                case '4':
                    morse = "....-";
                    break;
                case '5':
                    morse = ".....";
                    break;
                case '6':
                    morse = "-....";
                    break;
                case '7':
                    morse = "--...";
                    break;
                case '8':
                    morse = "---..";
                    break;
                case '9':
                    morse = "----.";
                    break;
                default:
                    // È inutile in quanto filtrato dall’if
                    // prima dello switch!
                    // morse="";
            } 
            System.out.println(lettera + " in morse è: " + morse);
        } else {
            System.out.println("Valore errato!");
        }
        

        

        input.close();
    }

}
