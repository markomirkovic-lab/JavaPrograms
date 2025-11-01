
public class SumFuncs2 {

    private static int sumUpTo1() {
        return 1;// 1 + 0 = 1
    }

    private static int sumUpTo2() {

        int sumTo1 = sumUpTo1();
        return 2 + sumTo1;
    }

    private static int sumUpTo3() {

        // semplificare un problema sfruttando le chiamate delle funzioni

        int sumTo2 = sumUpTo2();
        return 3 + sumTo2;
    }


    private static int sumUpToN (int n) {

        System.out.println("n: " + n);
        // Caso base, condizione importante per evitare un loop infinito
        if(n == 1) {
            return 1;
        }
        int resultNmenoUno = n + sumUpToN(n-1);
        // n = 3
        // n = 2
        // n = 1, resultNmenoUno = 1
        // n = 2, resultNmenoUno = 1 + 2 = 3
        // n = 3, resultNmenoUno = 3 + 3 = 6
        return resultNmenoUno;
    }


    public static void main(String[] args) {

        //funzione che fa somma dei numeri fino a 3
        //int sum = sumUpTo3();

        //System.out.println(sum);

        System.out.println(sumUpToN(3));

        
    }
    
}
