public class CleanString {
    private static String stringClean(String str) {

        // quando la stringa e' lunga 1 e' la condizione di uscita
        if (str.length() < 2)
            return str;

        // prendo il primo char lo confronto con secondo
        // se secondo e' diverso rimane
        // se il primo e' uguale al secondo va rimosso


        char c = str.charAt(0);// cosa succede con c nella fase di riavolgimento?
        String string = stringClean(str.substring(1));// fase di riavolgimento

        // non appendo
        // if (string.startsWith("" + c))
        if (string.charAt(0) == c)//viene pulito il resto della stringa
            return string;
        return c + string;// altrimenti appendo
    }

    // private static String stringClean(String s) {
    // return s.length() < 2 ? s : s.charAt(0) == s.charAt(1) ?
    //      stringClean(s.substring(1)) : s.charAt(0) + stringClean(s.substring(1));
    // }

    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza")); // yza
        System.out.println(stringClean("abbbcdd")); // abcd
        System.out.println(stringClean("Hello")); // Helo
        System.out.println(stringClean("XXabcYY")); // XabcY
        System.out.println(stringClean("112ab445")); // 12ab45
        System.out.println(stringClean("Hello Bookkeeper")); // Helo Bokeper
    }
}
