public class NumeriPrimi2 {

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


        int number = 99999999;
        int divisor =(int) Math.sqrt(number);

        System.out.println(isPrime(number, divisor));

    }

    
}
