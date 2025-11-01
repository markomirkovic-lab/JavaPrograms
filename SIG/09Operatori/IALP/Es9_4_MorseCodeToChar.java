
/*
9.4 Morse
Scrivete un programma che, leggendo una lettera da tastiera riesca a convertirla in morse.
Scrivete inoltre un secondo programma che svolge l’operazione contraria.

Versione codice morse -> carattere
*/
import java.util.Scanner;

public class Es9_4_MorseCodeToChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String morse;
        char lettera;
 
        System.out.print("Inserire un codice morse: ");
        morse = input.next().trim();


        switch (morse) {
            case ".-":
                lettera = 'A';
                break;
            case "-...":
                lettera = 'B';
                break;
            case "-.-.":
                lettera = 'C';
                break;
            case "-..":
                lettera = 'D';
                break;
            case ".":
                lettera = 'E';
                break;
            case "..-.":
                lettera = 'F';
                break;
            case "--.":
                lettera = 'G';
                break;
            case "....":
                lettera = 'H';
                break;
            case "..":
                lettera = 'I';
                break;
            case ".---":
                lettera = 'J';
                break;
            case "-.-":
                lettera = 'K';
                break;
            case ".-..":
                lettera = 'L';
                break;
            case "--":
                lettera = 'M';
                break;
            case "-.":
                lettera = 'N';
                break;
            case "---":
                lettera = 'O';
                break;
            case ".--.":
                lettera = 'P';
                break;
            case "--.-":
                lettera = 'Q';
                break;
            case ".-.":
                lettera = 'R';
                break;
            case "...":
                lettera = 'S';
                break;
            case "-":
                lettera = 'T';
                break;
            case "..-":
                lettera = 'U';
                break;
            case "...-":
                lettera = 'V';
                break;
            case ".--":
                lettera = 'W';
                break;
            case "-..-":
                lettera = 'X';
                break;
            case "-.--":
                lettera = 'Y';
                break;
            case "--..":
                lettera = 'Z';
                break;
            case "-----":
                lettera = '0';
                break;
            case ".----":
                lettera = '1';
                break;
            case "..---":
                lettera = '2';
                break;
            case "...--":
                lettera = '3';
                break;
            case "....-":
                lettera = '4';
                break;
            case ".....":
                lettera = '5';
                break;
            case "-....":
                lettera = '6';
                break;
            case "--...":
                lettera = '7';
                break;
            case "---..":
                lettera = '8';
                break;
            case "----.":
                lettera = '9';
                break;
            default:
                lettera = 0;
        }
        if (lettera == 0)
            System.out.println("Combinazione morse non valida!");
        else
            System.out.println(morse + " corrisponde a " + lettera);
    }

}
