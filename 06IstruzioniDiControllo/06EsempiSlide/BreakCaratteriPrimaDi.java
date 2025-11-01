public class BreakCaratteriPrimaDi {
    public static void main(String[] args) {
        String frase = "Lasciate ogni speranza, voi ch'entrate.";
        char c = '\'';
        int cnt = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == c)
                break;
            cnt++;
        }
        if (cnt == frase.length())
            System.out.println("Carattere non trovato!");
        else {
            System.out.print("Ci sono " + cnt);
            System.out.println(" caratteri prima di '" + c + "'.");
        }
    }
}
