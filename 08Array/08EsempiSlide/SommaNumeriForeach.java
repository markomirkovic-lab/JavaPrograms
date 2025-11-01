public class SommaNumeriForeach {
    public static void main(String[] args) {
        int[] numeri = { 1, 3, 5, 2, 12, 8, 21, 56, 3, 23 };
        int somma = 0;
        int cntr = 0;

        for (int numero : numeri) {
            System.out.println("Elemento " + ++cntr + " : " + "\t" + numero);
            somma += numero;
        }
        System.out.println("Somma: " + somma);

        /*
        Elemento 1 :    1
        Elemento 2 :    3
        Elemento 3 :    5
        Elemento 4 :    2
        Elemento 5 :    12
        Elemento 6 :    8
        Elemento 7 :    21
        Elemento 8 :    56
        Elemento 9 :    3
        Elemento 10 :   23
        Somma: 134
        */
    }
}
