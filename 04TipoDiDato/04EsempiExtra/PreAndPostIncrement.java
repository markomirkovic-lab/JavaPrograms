public class PreAndPostIncrement {
    public static void main(String[] args){

        int a = 0;
        int b = a++; // b = a; a = a + 1;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int c = 0;
        int d = ++c; // c = c + 1; d = c;

        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }
}
