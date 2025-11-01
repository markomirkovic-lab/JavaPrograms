public class TestInt {
    public static void main(String[] args) {

        int a = 7;
        int b = 2;

        double risultato = a/b;// int/int = int

        System.out.println(risultato);//int assegnato alla variabile = 3.0

        System.out.println("");

        int c = 7;
        double d = 2;

        double risultato2 = c/d;// double/int = conversione in double (casting implicito)

        System.out.println(risultato2);// 3.5

        System.out.println("");

        // int e = 7.6 -> int in double NON COMPILA

        double e = 7;// double in int COMPILA

    }
}
