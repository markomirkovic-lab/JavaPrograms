//package 11Ricorsione.11Inclass;

public class SumIterativo {

    // Modo iterativo
    private static int sumUpToN(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++ ) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sumUpToN(3));
        
    }
    
}
