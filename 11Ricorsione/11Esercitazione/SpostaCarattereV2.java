public class SpostaCarattereV2 {

    private static String sposta(String str, char ch) {
        int index = str.indexOf(ch);
        if (index == -1)
            return str;

        String tmp = str.substring(0, index) + str.substring(index + 1);
        return sposta(tmp, ch) + ch;
    }

    public static void main(String[] args) {
        String str = "Asterix e Obelix";
        System.out.println(sposta(str, 'i'));
    }
}
