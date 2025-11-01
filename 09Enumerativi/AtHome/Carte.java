enum SemeCarta{
    CUORI, QUADRI, FIORI, PICCHE
   }
   

public class Carte {
    public static void main(String[] args) {
        
        SemeCarta seme = SemeCarta.valueOf("FIORI");

        System.out.println(seme);
    }
    
}
