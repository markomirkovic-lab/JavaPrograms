
public class Unari {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        // If post increment before an operation
        // operation will carry new values
        //a++;//a = 1
        //b++;//b = 1
        // result would be same like pre-increment
        // during before or during an operation

        // If post increment during operation
        // operation will carry the previous value

        int ab = a++ + b;// 0 + 0 = 0

        System.out.println("ab: " + ab);// 0
        System.out.println("a: " + a);  // 1
        System.out.println("b: "+ b);   // 0
        System.out.println("a: " + a);  // 1
        System.out.println("b: "+ b);   // 0

        System.out.println("---");

        int ab2 = a + b++;// 1 + 0 = 1

        System.out.println("ab2: " + ab2);// 1
        System.out.println("a: " + a);    // 1
        System.out.println("b: "+ b);     // 1

        System.out.println("---");

        int ab3 = a + b;// 1 + 1 = 2
        System.out.println("ab3: " + ab3);// 2
        System.out.println("a: " + a);    // 1
        System.out.println("b: "+ b);     // 1

        System.out.println("---");

        int ab4 = a-- + b--;// 1 + 1 = 2
        System.out.println("ab4: " + ab4);// 2
        System.out.println("a: " + a);    // 1
        System.out.println("b: "+ b);     // 1

        System.out.println("---");
        
        int ab5 = a + b;// 0 + 0 = 0
        System.out.println("ab5: " + ab5);// 0
        System.out.println("a: " + a);    // 0
        System.out.println("b: "+ b);     // 0

        System.out.println("---");
        
    }    
}
