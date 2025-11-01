import java.util.Scanner;

public class Es9_4_MorseCodeToCharV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String morse;
        char lettera;

        System.out.print("Inserire un codice morse: ");
        morse = input.next().trim();

        if (morse.equals(".-"))
            lettera = 'A';
        else if (morse.equals("-..."))
            lettera = 'B';
        else if (morse.equals("-.-."))
            lettera = 'C';
        else if (morse.equals("-.."))
            lettera = 'D';
        else if (morse.equals("."))
            lettera = 'E';
        else if (morse.equals("..-."))
            lettera = 'F';
        else if (morse.equals("--."))
            lettera = 'G';
        else if (morse.equals("...."))
            lettera = 'H';
        else if (morse.equals(".."))
            lettera = 'I';
        else if (morse.equals(".---"))
            lettera = 'J';
        else if (morse.equals("-.-"))
            lettera = 'K';
        else if (morse.equals(".-.."))
            lettera = 'L';
        else if (morse.equals("--"))
            lettera = 'M';
        else if (morse.equals("-."))
            lettera = 'N';
        else if (morse.equals("---"))
            lettera = 'O';
        else if (morse.equals(".--."))
            lettera = 'P';
        else if (morse.equals("--.-"))
            lettera = 'Q';
        else if (morse.equals(".-."))
            lettera = 'R';
        else if (morse.equals("..."))
            lettera = 'S';
        else if (morse.equals("-"))
            lettera = 'T';
        else if (morse.equals("..-"))
            lettera = 'U';
        else if (morse.equals("...-"))
            lettera = 'V';
        else if (morse.equals(".--"))
            lettera = 'W';
        else if (morse.equals("-..-"))
            lettera = 'X';
        else if (morse.equals("-.--"))
            lettera = 'Y';
        else if (morse.equals("--.."))
            lettera = 'Z';
        else if (morse.equals("-----"))
            lettera = '0';
        else if (morse.equals(".----"))
            lettera = '1';
        else if (morse.equals("..---"))
            lettera = '2';
        else if (morse.equals("...--"))
            lettera = '3';
        else if (morse.equals("....-"))
            lettera = '4';
        else if (morse.equals("....."))
            lettera = '5';
        else if (morse.equals("-...."))
            lettera = '6';
        else if (morse.equals("--..."))
            lettera = '7';
        else if (morse.equals("---.."))
            lettera = '8';
        else if (morse.equals("----."))
            lettera = '9';
        else
            lettera = 0; // Inserisco un carattere non valido, il valore UNICODE 0
        if (lettera == 0)
            System.out.println("Combinazione morse non valida!");
        else
            System.out.println(morse + " corrisponde a " + lettera);
    }

}
