public class Conversioni {
    public static void main(String[] args) {
        // Conversioni tra tipi primitivi
        int ii = 33554435;
        float ff = ii;

        System.out.println("Int: " + ii);
        System.out.println("Float: " + ff);

        double dd = 1234.56;
        short ss = (short) dd;

        System.out.println("Double: " + dd);
        System.out.println("Short: " + ss);

        // Conversioni implicite
        char car1 = 'a'; // La lettera a è il numero 97
        char car2 = 'b'; // La lettera b è il numero 98
        int var = car1 + car2; // È come se stesse facendo 97 + 98
        System.out.println(var); // Stamperà 195

        float a = 4.5f;
        double b = a;
        System.out.println(b);

        int var1 = 10;
        long var2 = var1;
        System.out.println(var2);

        short var11 = 120;
        int var22 = var11;
        System.out.println(var22);

        // Conversione implicite nelle espressioni
        int aa = 4;
        float bb = -1.0f;
        double cc = 2.4;
        int ddd = 9;
        double espr = (aa - bb) * cc / ((ddd * 4) + 6.7f);
        System.out.println(espr);
    }
}
