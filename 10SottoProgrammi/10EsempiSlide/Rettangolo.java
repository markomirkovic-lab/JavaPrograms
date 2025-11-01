public class Rettangolo {

    private static int area(int x1, int x2, int y1, int y2) {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    private static int area(int base, int altezza) {
        return base * altezza;
    }

    private static double area(double base, double altezza) {
        return base * altezza;
    }

    public static void main(String[] args) { 

        // x e y dei 2 punti
        System.out.println("Area = " + area(4, 2, 1, 5));

        // b e h
        System.out.println("Area = " + area(2, 4));

        // b e h
        System.out.println("Area = " + area(2.2, 4.4));
    }
}
