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

        //Variante 2
        //x = 10, y = 15, z = 20;
        if (x < y) {
            System.out.println("x minore di y");
        }
        if (x < z) {
            System.out.println("x minore di z");
        }
        if (x > z) {
            System.out.println("x maggiore di z");
        }
    }
}
