
public class EsempioArrayV3 {

    public static void main(String[] args) {
        
        int[] a = new int[10];

        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(a);

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for(int i = 0; i < a.length; i++) {
            
            if(a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

    }
    
}
