public class NumeriPrimi {

    private static boolean isPrime(int number, int divisor) {

        // exit condition
        if (divisor == 1) {
            return true;
        }

        if(number % divisor == 0) {
            // if divisible is not a prime number
            return false;
        } else {
            return isPrime(number, divisor-1);
        }


    }




    public static void main(String[] args) {


        int number = 9;
        int divisor = number-1;

        System.out.println(isPrime(number, divisor));

    }

    
}
