package menucreator;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCreatorComplete 
{
    public static void main(String[] args) 
    {        
        Scanner in= new Scanner(System.in);
        ArrayList<Food> menu= new ArrayList();
        
        
        int scelta;
        do
        {
            System.out.print("[1 Aggiungi pietanza | 2 Esci] Scelta: ");  
            while(!in.hasNextInt())
            {                
                in.nextLine();
                System.out.print("[1 Aggiungi pietanza | 2 Esci] Scelta: ");  
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
            
        }while(scelta!=2);
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
}
