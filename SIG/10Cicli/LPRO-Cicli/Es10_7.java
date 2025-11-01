import java.util.Scanner;

public class Es10_7 {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        int max, nr1, somd1=0, nr2, somd2=0, d;

        //Inserimento numero massimo            
        max=in.nextInt();
        
        
        //Incremento il primo numero fino al numero inserito
        for(nr1=1; nr1<=max; nr1++)
        {
            //Calcolo somma divisori nr
            for(d=1; d<nr1/2+1; d++)
            {
                if(nr1%d==0) 
                    somd1+=d;
                    
            }
            System.out.print(d + " ");

            //Creo il secondo numero			
            nr2=somd1;

            //Calcolo somma divisori secondo numero
            for(d=1;d<nr2/2+1;d++)
            {
                if(nr2%d==0)
                    somd2+=d;
            }

            //Quando trovo dei numeri amici lo stampo a schermo		
            if(nr1==somd2 && nr1!=nr2)
                System.out.println(nr1 + " e " + nr2 + " sono amici");


            //Porto le somme dei divisori a 0			
            somd1=somd2=0;
        }
        
    }
    
}
