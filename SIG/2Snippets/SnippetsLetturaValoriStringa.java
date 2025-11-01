/*
Introdurre una password di lunghezza compresa fra 3 e 5 caratteri e che contenga almeno una maiuscola, una minuscola, una cifra: Pa11


Hai inserito: "Pa11"
*/

import java.util.Scanner;

public class SnippetsLetturaValoriStringa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String richiesta = "Introdurre una password di lunghezza compresa fra 3 e 5 caratteri "
                + "e che contenga almeno una maiuscola, una minuscola, una cifra: ";
        String msgSeFormatoErrato = "Formato frase errato! ";
        String pwd;

        do {
            pwd = "";

            System.out.print(richiesta);

            pwd = input.nextLine().trim();

            if (pwd.length() >= 3 && pwd.length() <= 5) {
                int minuscole = 0, maiuscole = 0, cifre = 0;

                for (int i = 0; i < pwd.length(); i++) {
                    if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z')
                        minuscole++;
                    else if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z')
                        maiuscole++;
                    else if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9')
                        cifre++;
                }

                if (minuscole == 0 || maiuscole == 0 || cifre == 0) {
                    System.out.println(msgSeFormatoErrato);
                    pwd = "";// Se non rientra nei criteri (altrimenti pwd sara' uguale all'input utente)
                }
            } else {
                pwd = "";// Se non rientra nei criteri (altrimenti pwd sara' uguale all'input utente)
            }

        } while (pwd.equals(""));

        System.out.println("\n\nHai inserito: \"" + pwd + "\"");

        input.close();
    }

}
