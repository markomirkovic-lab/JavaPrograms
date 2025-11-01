public class EsempioConteggio {

    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        while (y < 3) {
            
            x++;

            if (x == 100) {
                System.out.println("Cento!");// Cento! viene stampato 3 volte
                x = 0;
                y++;// 0 1 2
            }
        }
    }
}
