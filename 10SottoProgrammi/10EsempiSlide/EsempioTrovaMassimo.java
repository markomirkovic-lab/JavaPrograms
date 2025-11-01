public class EsempioTrovaMassimo {

    private static int trovaMassimo(int n1, int n2) {

        int max = 0;
        if(n1 > n2) {
            max = n1;
        } else{
            max = n2;
        }
        return max;
    }


    public static void main(String[] args) {
        
        int max = trovaMassimo(200, 438);
        System.out.println("Massimo: " + max);// 438
        // Oppure, in modo analogo
        System.out.println("Massimo: " + trovaMassimo(200, 438));// 438
    }
}
