public class Letterali {
    public static void main(String[] args) {
        double x1 = 5.3456;
        double x2 = 5.0;
        double x3 = 5.;
        int y4 = 5;
        int y5 = 2;
        double z1 = 5. / 2.;
        double z2 = 5 / 2.;
        double z3 = 5. / 2;
        double z4 = 5 / 2;
        int z5 = 5 / 2;

        System.out.println(z1); // 2.5
        System.out.println(z2); // 2.5
        System.out.println(z3); // 2.5
        System.out.println(z4); // 2.0
        System.out.println(z5); // 2
    }
}
