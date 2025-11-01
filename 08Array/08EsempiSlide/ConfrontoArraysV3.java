
public class ConfrontoArraysV3 {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        int[] a2 = { 1, 2, 3, 4, 6, 6 };

        boolean uguale = true;
        // confronto lunghezza
        if (a1.length != a2.length)
            uguale = false;
        else {
            //confronto elementi dell'array
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    uguale = false;
                    break;
                }
            }
        }

        System.out.println("a1 uguale a a2? " + (uguale ? "Sì" : "No"));
        //a1 uguale a a2? No
    }
}
