public class SpostaCarattere {
    private static String sposta(String str, char ch) {
        if (str.length() == 1)
            return str;
        char first = str.charAt(0);
        String tmp = str.substring(1);
        if (first == ch) {
            return sposta(tmp, ch) + ch;
        }
        return first + sposta(tmp, ch);
    }

    public static void main(String[] args) {
        String str = "Asterix e Obelix";
        System.out.println(sposta(str, 'i'));
    }
}
