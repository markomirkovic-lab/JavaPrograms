// Scrivere una procedura ricorsiva che dato un numero 
// intero positivo n stammpi: 
/*
n
n-1
n-2
....
2
1
0
*/

public class CountDownAndUp {

    private static void countDown(int n) {

        System.out.println(n);

        if(n == 0) {
            return;
        }

        countDown(n-1);

    }


    public static void main(String[] args) {

        System.out.println("Count down");
        countDown(10);
        
    }
    
}
