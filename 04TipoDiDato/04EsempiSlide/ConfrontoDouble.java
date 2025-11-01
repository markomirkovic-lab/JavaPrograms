public class ConfrontoDouble {

    static final double EPSILON = 1e-8;

    public static void main(String[] args) {
        double a = 1.000001;
        double b = 0.000001;
        double c = a - b;
        double valoreAtteso = 1.0;

        System.out.println("Approccio con ==");
        System.out.println("----------------");
        if (c == valoreAtteso) {
            System.out.println("c e' UGUALE a " + valoreAtteso);
        } else {
            System.out.println("c e' DIVERSO da " + valoreAtteso);
            System.out.println("c: " + c);
        }

        System.out.println("\n\nApproccio con \"threshold comparison\"");
        System.out.println("------------------------------------");

        if (Math.abs(c - valoreAtteso) < EPSILON) {
            System.out.println("c e' UGUALE a " + valoreAtteso);
        } else {
            System.out.println("c e' DIVERSO da " + valoreAtteso);
            System.out.println("c: " + c);
        }
    }
}
