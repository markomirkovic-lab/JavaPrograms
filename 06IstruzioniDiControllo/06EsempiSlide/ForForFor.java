public class ForForFor {
    public static void main(String[] args) {
        
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                k += i - j;
                System.out.println(k);
                
            }
            //for (int j = 0; j < 20; j++) {
            //    k -= j + i;
                //System.out.println(k);
            //}
            System.out.println("---");
            }
            //System.out.println(k);

            //for   i
            //          for    j
            //      0          0        0 + 0 - 0 = 0
            //      0          1        0 + 1 - 1 = 0
            //      0          2

    }
    
}
