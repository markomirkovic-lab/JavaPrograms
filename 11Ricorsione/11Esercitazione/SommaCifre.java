public class SommaCifre {
    private static int sommaCifre(int numero) {
        if (numero < 10)
            return numero;
        return numero % 10 + sommaCifre(numero / 10);
    }

    public static void main(String[] args) {
        int numero = 16924540;
        System.out.println(sommaCifre(numero));
    }
}
