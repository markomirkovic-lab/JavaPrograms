
import java.util.Scanner;

public class Tutorial_7_1 {

    public static void main(String[] args) 
    {
        Scanner tastiera=new Scanner(System.in);    //Instanziamo un oggetto Scanner
        
        float gradiF;
        float gradiC;
        String nomeECognome;
        
        System.out.print("Inserisci il tuo nome e il tuo cognome: ");
        nomeECognome=tastiera.nextLine();   //Leggo una stringa inclusi gli spazi
        
        System.out.print("Inserisci i gradi F: ");
        gradiF=tastiera.nextFloat();        //Leggiamo un float
        tastiera.nextLine();                //Svuoto il buffer (prendere il primo valore immesso dall'utente ignorando gli altri)
        
        gradiC=(gradiF-(float)32)*(float)5/(float)9;  
        
        System.out.println("Buongiorno " + nomeECognome + "\n" 
                            + gradiF + " gradi F corrispondono a "
                            + gradiC + " gradi C.");     
                            
        tastiera.close();

        /*
        Inserisci il tuo nome e il tuo cognome: Marko Mirkovic
        Inserisci i gradi F: 77
        Buongiorno Marko Mirkovic
        77.0 gradi F corrispondono a 25.0 gradi C.
        */
    }
}
