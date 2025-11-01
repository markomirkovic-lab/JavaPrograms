public class ContaOccorrenze {

    // Sottoprogramma ricorsivo per contare le occorrenze di un carattere in una
    // stringa
    private static int contaOccorrenze(String str, char carattere) {
        // Caso base: se la stringa è vuota
        if (str.isEmpty()) {
            return 0;
        }

        // Controllo del primo carattere
        int conteggio = (str.charAt(0) == carattere) ? 1 : 0;

        // Chiamata ricorsiva sul resto della stringa
        return conteggio + contaOccorrenze(str.substring(1), carattere);
    }

    public static void main(String[] args) {
        String input = "ciao a tutti";
        char lettera = 'i';

        int conteggio = contaOccorrenze(input, lettera);
        System.out.println("La lettera '" + lettera + "' in '" + input + "'' appare " + conteggio + " volte.");
    }
}
