package menucreator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuCreatorCompleteEdEsteso 
{
    public static void main(String[] args) 
    {        
        Scanner in= new Scanner(System.in);
        String defaultName= ".\\menu.csv";        
        
        ArrayList<Food> menu= readMenu(Paths.get(defaultName));
        printMenu(menu);
        
        
        int scelta;
        do
        {
            System.out.print("[1 Aggiungi pietanza | 2 Salva menu | 3 Esci] Scelta: ");  
            while(!in.hasNextInt())
            {                
                in.nextLine();
                System.out.print("[1 Aggiungi pietanza | 2 Salva menu | 3 Esci] Scelta: ");  
            }
            scelta= in.nextInt();
            in.nextLine();
            
            
            
            if(scelta==1)
            {
                Food tmp= new Food();       //Creo un oggetto Food vuoto
                
                System.out.println("\n\n\nAggiungi pietanza");
                System.out.println("-----------------");
                
                
                //Ciclo per leggere il nome della pietanza
                //Lo richiede se il setter della classe Food solleva un'eccezione
                for(boolean isValid=false; !isValid; )
                {
                    System.out.print("Nome pietanza: ");
                    String nome= in.nextLine();

                    try
                    {
                        tmp.setNome(nome); 
                        isValid= true;
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                
                //Ciclo per leggere il prezzo della pietanza
                //Lo richiede se il setter della classe Food solleva un'eccezione
                for(boolean isValid=false; !isValid; )
                {                
                    System.out.print("Prezzo pietanza: ");
                    double prezzo= in.nextDouble();
                    in.nextLine();
                    try
                    {
                        tmp.setPrezzo(prezzo);
                        isValid=true;
                    }                            
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }                   
                }
                
                
                //Aggiungo alla lista
                menu.add(tmp);

                
                //Stampo
                System.out.println("Aggiunto " + tmp.getNome() + ", CHF " + tmp.getPrezzo() + "\n\n\n");                                    
                printMenu(menu);
            }
            else if(scelta==2)
            {
                if(writeMenu(Paths.get(defaultName), menu))
                    System.out.println("\"" + defaultName + "\" writed!");
            }
            
        }while(scelta!=3);
    }  
    
    
    
    public static void printMenu(ArrayList<Food> f)
    {
        String marginUp= String.format("%027d", 0).replace('0','-');            //ggg: furbata!
        String marginDown= String.format("%064d", 0).replace('0','-');          //ggg: furbata!

        System.out.println(marginUp + "~~ MENU ~~" + marginUp);
        for(int i=0; i<f.size(); i++)
        {
            System.out.printf("| %-50s CHF %5.2f |%n", f.get(i).getNome(), f.get(i).getPrezzo());
        }
        System.out.println(marginDown);                
    }
    
    
    
    
    public static ArrayList<Food> readMenu(Path f)
    {
        ArrayList<Food> m= new ArrayList();
        
        try
        {
            List<String> all= Files.readAllLines(f, Charset.forName("UTF-8"));
            for(int i=0; i<all.size(); i++)
            {
                String[] csv= all.get(i).split(";");      //Divido il file CSV nelle sue due parti
                
                try
                {
                    Food tmp= new Food(csv[0], Double.parseDouble(csv[1]));
                    
                    m.add(tmp);
                } 
                catch (Exception ex)
                {
                    //Qualcosa è andato storto 
                    System.out.println("Errore alla riga " + i + " del file \"" + f.toAbsolutePath() + "\"!");
                }
            }
            
            return m;       //Restituisco la lista
        } 
        catch (IOException ex)
        {
            return m;       //Restituisco la lista vuota 
        }
    }
    
    
    
    public static boolean writeMenu(Path f, ArrayList<Food> m)
    {
        try
        {
            Files.deleteIfExists(f);
            
            String out= "";
            for(int i=0; i<m.size(); i++)
                out+= m.get(i).getNome() + ";" + m.get(i).getPrezzo();
            
            Files.write(f, out.getBytes(Charset.forName("UTF-8"))); 
            
            return true;
        } 
        catch (IOException ex)
        {
            System.out.println("Errore in scritture del file \"" + f.toAbsolutePath() + "\"!\n\t" + ex.getMessage());
            
            return false;
        }
    }
}
