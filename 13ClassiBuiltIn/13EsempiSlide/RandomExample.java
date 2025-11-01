import java.util.Random;

public class RandomExample {

    //static Random random = new Random();

    public static void main(String[] args) {

        Random random = new Random();

        int num1 = (int) (Math.random() * 6) + 1;

        /*
        L’istruzione random.nextInt(N) genera un numero intero pseudo￾casuale 
        distribuito uniformemente tra 0 (compreso) e N (escluso).
        */

        int num2 = random.nextInt(6) + 1;

        double num3 = random.nextDouble(6) + 1;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);

        /*
        num1: 6
        num2: 5
        num3: 1.6496447965190892
        */

    }

}
