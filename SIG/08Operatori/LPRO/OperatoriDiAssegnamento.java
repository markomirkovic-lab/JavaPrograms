

public class OperatoriDiAssegnamento {

    public static void main(String[] args) {
        

        int a;

        a = 5;
        System.out.println(a);
        a += 5;// 5 + 5 = 10
        System.out.println(a);
        a -= 3;//10 - 3 =  7
        System.out.println(a);
        a *= 3;//7 * 3  = 21
        System.out.println(a);
        a /= 7;//21 / 3 =  7
        System.out.println(a);
        a %= 2;//7 % 2 = 1
        System.out.println(a);

        /*
        5
        10
        7
        21
        3
        1
        */

        a = 1;

        a += 2 * ++a;
        // = 1 + 2 * 2   a vale 2
        // = 1 + 4
        // = 5 

    }
    
}
