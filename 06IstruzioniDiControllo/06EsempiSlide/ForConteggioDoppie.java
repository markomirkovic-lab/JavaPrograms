public class ForConteggioDoppie {
    public static void main(String[] args) {
        String frase = "Se oggi seren non è, doman seren sarà,"
                + " se non sarà seren si rasserenerà";
        int cnt = 0;
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) == frase.charAt(i - 1)) {
                cnt++;
            }
        }
        System.out.println("Conteggio = " + cnt);
        //Conteggio = 2
    }
}
