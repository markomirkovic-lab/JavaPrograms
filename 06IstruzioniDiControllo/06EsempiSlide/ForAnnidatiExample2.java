public class ForAnnidatiExample {

   static final int NR_ELEMENTI = 5;
    public static void main(String[] args) {

        // Cicla sulla righe
        for(int i = 1; i < NR_ELEMENTI; i++ ){

            // Elementi singola riga
            for (int j = 1; j < NR_ELEMENTI; j++){
                System.out.print(j + " ");
            }
            System.out.println("");

        }
        
    }
    
}
