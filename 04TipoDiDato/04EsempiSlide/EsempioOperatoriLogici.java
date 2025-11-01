public class EsempioOperatoriLogici {
    public static void main(String[] args) {
        boolean b;

        b = 3 > 2 || 5 < 7; // b è true
        System.out.println("3 > 2 || 5 < 7 ==> " + b);
        b = 2 > 3 || 5 < 7; // b è ancora true
        System.out.println("2 > 3 || 5 < 7 ==> " + b);
        b = 2 > 3 || 5 > 7; // ora b è false
        System.out.println("2 > 3 || 5 > 7 ==> " + b);
        b = !(3 > 2); // b è false
        System.out.println("!(3 > 2) ==> " + b);
        b = !(2 > 3); // b è true
        System.out.println("!(2 > 3) ==> " + b);
    }
}

