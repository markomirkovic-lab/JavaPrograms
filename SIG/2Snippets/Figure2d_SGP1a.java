public class Figure2d_SGP1a        
{
    public static void main(String[] args) {
        /*
            Lettra R

             ***** 0     04
             ** *  1     13
             * *   2     22
             ** *  3     31
             *   * 4     40
             01234

             ************
             **        *
             * *      *
             *  *    *
             *   *  *
             *    **
             *    **
             *   *  *
             *  *    *
             * *      *  
             **        *
             *          *
        
             */
        int righe=12;
        int colonne=12;
        int ultimariga= righe-1;
        int ultimacolonna= colonne-1;
        
        
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(r==0 ||
                   c==0 ||
                   r==c ||
                   r+c==righe-1)
                    System.out.print("*");                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("\n\n\n\n"); 
        
        
        /*

        Scacchiera
        
        * * * *
         * * * *
        * * * *
         * * * *
        * * * *
         * * * *
        * * * *
         * * * *

        */
        
        
        righe=8;
        colonne=8;
        ultimariga= righe-1;
        ultimacolonna= colonne-1;
        
        
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                //if((c+r)%2==0)
                if(r%2==0 && c%2==0 ||
                   r%2==1 && c%2==1)
                    System.out.print("*");                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        } 
        System.out.println("\n\n\n\n");
        


        /*

        Freccia
        
        *
         *
          *
           *
            *
             *
              *
             *
            *
           *
          *
         *
        *

        */
        
        righe=13;
        colonne=7;
        ultimariga= righe-1;
        ultimacolonna= colonne-1;
        
        
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(c==r ||
                   r>righe/2 && r-righe/2+c==colonne-1)
                    System.out.print("*");                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        } 
        System.out.println("\n\n\n\n");        
        
        
        for(int r=0; r<righe/2; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(c==r)
                    System.out.print("*");                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for(int r=0; r<righe/2; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(c+r==ultimacolonna )
                    System.out.print("*");                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }        
    }
    
}
