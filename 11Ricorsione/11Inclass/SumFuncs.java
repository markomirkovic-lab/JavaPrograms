
public class SumFuncs {

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

    /*
        Funzioni vengono messe in pausa durante le fasi

        Fase di svolgimento
        SumUpToN(3) -> sumUptoN(2)
            sumUptoN(2) -> chiama sumUpToN(1)
        Fase di rivolgimento
                sumUpToN(1) -> return 1;
            sumUptoN(2) -> 2 + 1 = 3
        sumUpToN(3) -> return 3 + 3 = 6
     */


    public static void main(String[] args) {

        //funzione che fa somma dei numeri fino a 3
        int sum = sumUpTo3();

        System.out.println(sum);

        
    }
    
}
