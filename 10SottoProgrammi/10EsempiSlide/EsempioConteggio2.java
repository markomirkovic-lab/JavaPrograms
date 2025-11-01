public class EsempioConteggio2 {

    private static int calcolaX(int x) {
        int nuovoX = x + 1;
        if (nuovoX == 100) {
            System.out.println("Cento!");
            nuovoX = 0;
        }
        return nuovoX;
       }

    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        while (y < 3) {

            x = calcolaX(x);
            
            if (x % 100 == 0) {
                y++;
            }
        }
        // Resto del programma

    }
    
}
