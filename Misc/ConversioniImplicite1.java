public class ConversioniImplicite1 {
    public static void main(String[] args) {
        
        int a = 7;
        int b = 2;
        double c = 3.5;

        double result1 = (a/b) + c;         //int + double = 6.5
        double result2 = a/b + c;           //int + double = 6.5
        double result3 = (double) a/b + c;  //double + double = 7.0

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

    }
}
