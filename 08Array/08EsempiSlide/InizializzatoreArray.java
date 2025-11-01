public class InizializzatoreArray {
    public static void main(String[] args) {
        
        String[] frutti = { "Pera", "Mela", "Kiwi", "Uva" };

        String str = "";

        for (int i = 0; i < frutti.length; i++) {
            String frutto = frutti[i];
            str += frutto;

            if (i < frutti.length - 1)
                str += ", ";
        }

        System.out.println(str);
    }
}
