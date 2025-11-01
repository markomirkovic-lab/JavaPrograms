
import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        int scelta;
        boolean ripeti=true;
        do{
            //Ecco il nostro menu
            System.out.println("\n\n\n\n\n*********************");
            System.out.println("1-Super");
            System.out.println("2-Verde");
            System.out.println("3-Diesel");
            System.out.println("4-Bio diesel");
            System.out.println("5-Elettrica");
            System.out.println("6-Supercharge");
            System.out.println("");
            System.out.println("0-Esci");
            System.out.print("--> ");
            
            if(in.hasNextInt())
            {
                scelta=in.nextInt();
                switch(scelta)
                {
                    case 1:
                        System.out.println("Super");
                        break;
                    
                    case 2:
                        System.out.println("Verde");
                        break;
                    
                    case 3:
                        System.out.println("Disel");
                        break;
                    
                    case 4:
                        System.out.println("Bio diesel");
                        break;
                    
                    case 5: 
                        System.out.println("Elettrica");
                        break;

                    case 6:
                        System.out.println("Superchage");
                        break;
                          
                    case 0:
                        ripeti=false;   //Ha scelto di uscire
                }
            }
            in.nextLine();
            
        }while(ripeti);
        
        System.out.println("Programma finito");
    }
    
}

