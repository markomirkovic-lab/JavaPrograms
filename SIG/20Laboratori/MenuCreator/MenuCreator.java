package menucreator;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCreator 
{
    public static void main(String[] args) 
    {        
        Scanner in= new Scanner(System.in);
        ArrayList<Food> menu= new ArrayList();
        
        int scelta;
        do
        {
            System.out.print("[1 Aggiungi pietanza | 2 Esci] Scelta: ");  
            while(!in.hasNextInt()) in.nextLine();
            scelta= in.nextInt();
            in.nextLine();
            
            if(scelta==1)
            {
                Food tmp= new Food();
                
                System.out.println("\n\n\nAggiungi pietanza");
                System.out.println("-----------------");
                System.out.print("Nome pietanza: ");
                String nome= in.nextLine();
                try
                {
                    tmp.setNome(nome); 

                    System.out.print("Prezzo pietanza: ");
                    double prezzo= in.nextDouble();
                    in.nextLine();
                    try
                    {
                        tmp.setPrezzo(prezzo);
                        
                        menu.add(tmp);
                        
                        System.out.println("Aggiunto " + tmp.getNome() + ", CHF " + tmp.getPrezzo() + "\n\n\n");                                    
                        
                        for(int i=0; i<menu.size(); i++)
                        {
                            System.out.printf("| %-50s CHF %5.2f |%n", menu.get(i).getNome(), menu.get(i).getPrezzo());
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }                

                    
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
        }while(scelta!=2);
    }
    
}
