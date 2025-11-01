public class StessaCosa {

    public static void main(String[] args) {
        // Variante 1
        int x = 10, y = 15, z = 20;
        if (x < y) {
            System.out.println("x minore di y");
        } else if (x < z) {
            System.out.println("x minore di z");
        } else if (x > z) {
            System.out.println("x maggiore di z");
        }

        // Variante 2
        int x2 = 10, y2 = 15, z2 = 20;
        if (x2 < y2) {
            System.out.println("x2 minore di y2");
        }
        if (x2 < z2) {
            System.out.println("x2 minore di z2");
        }
        if (x2 > z2) {
            System.out.println("x2 maggiore di z2");
        }
    }
}
