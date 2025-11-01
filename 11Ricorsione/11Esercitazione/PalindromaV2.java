public class PalindromaV2 {
    private static boolean palindroma(String frase) {
        if (frase.length() <= 1)
            // Zero o un carattere rimasti, la frase é palindroma
            return true;
        // Confronta il primo e l'ultimo carattere ignorando le maiuscole e minuscole
        if (Character.toLowerCase(frase.charAt(0)) != Character.toLowerCase(frase.charAt(frase.length() - 1)))
            // Primo e ultimo carattere diversi, la frase non é palindroma
            return false;
        // Aggiunto trim() per rimuovere eventuali spazi all'inizio e
        // alla fine della stringa
        String nuovaFrase = frase.substring(1, frase.length() - 1).trim();
        return palindroma(nuovaFrase);
    }

    public static void main(String[] args) {
        String frase = "Assalir i mici mi rilassa";
        System.out.println(frase + " -- Palindroma? " + palindroma(frase));
    }
}
