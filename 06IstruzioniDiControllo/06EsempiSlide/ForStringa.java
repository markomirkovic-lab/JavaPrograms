public class ForStringa {
    public static void main(String[] args) {
        
        String frase = "Quanto e' interessante la programmazione";

        for(int pos=0; pos<frase.length();pos++){
         System.out.println("Carattere alla posizione " + pos + " : " + frase.charAt(pos));   
        }
    }
    
}
