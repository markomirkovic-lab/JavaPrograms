import java.util.Arrays;

public class EsempioArrayV4 {
    public static void main(String[] args) {
        
        double[] a = {23.4, -7.3, 8.55};

        for(int cella = 0; cella < a.length; cella++) {
            System.out.print("[" + a[cella] + "]");
        }
        System.out.println("");

        System.out.println(Arrays.toString(a));

        /*
        [23.4][-7.3][8.55]
        [23.4, -7.3, 8.55]
        */

    }
    
}
