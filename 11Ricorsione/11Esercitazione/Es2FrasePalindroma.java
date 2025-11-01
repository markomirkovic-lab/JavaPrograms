/*
Esercizio 2 - Frase palindroma
Sviluppate un programma in grado di controllare, ricorsivamente, se una frase é
palindroma. Una frase palindroma può essere letta da sinistra verso destra e da
destra verso sinistra senza che il risultato cambi.
Alcuni esempi di frasi palindrome:
• Angolo bar a Bologna
• Assalir i mici mi rilassa
• I topi non avevano nipoti
• Anita fa la fatina

Semplificare il probleme
Caso base
Ricorsione

xx 2 lettere uguali ok
x  1 lettra ok
*/
public class Es2FrasePalindroma {

    private static boolean controlloPalindromo(String stringa) {

        

        String stringToLowerCase = stringa.toLowerCase().trim();

        int stringLength = stringToLowerCase.length();

        if(stringLength <= 1) {
            return true;
        }

        
        int inizio = 0;

        int fine = stringLength;

        Boolean planidroma = stringToLowerCase.charAt(inizio) == stringToLowerCase.charAt(fine -1);

        
        if(planidroma == false)
            return false;

        stringToLowerCase = stringa.toLowerCase().trim().substring(inizio+1, fine-1).trim();

        
        return controlloPalindromo(stringToLowerCase);


        //return planidroma;
    }

    public static void main(String[] args) {
        
        String stringa = "Anita fa la fatina";

        
        System.out.println(controlloPalindromo(stringa));

    }
    
}
