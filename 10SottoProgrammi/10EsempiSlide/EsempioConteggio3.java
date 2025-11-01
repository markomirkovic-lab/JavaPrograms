public class EsempioConteggio3 {

    private static int calcolaX(int x, int y) {

        int nuovoX = x;
        int nuovoY = y;

        while (nuovoY < 3) {

            nuovoX = nuovoX + 1;

            if (nuovoX == 100) {
                System.out.println("Cento!");
                //nuovoX = 0;
                nuovoY++;
            }
        }
        return nuovoX;
    }

    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        x = calcolaX(x, y);
            
 
        // Resto del programma

    }
    
}
