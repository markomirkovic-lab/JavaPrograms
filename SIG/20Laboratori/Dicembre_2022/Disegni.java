package javaapplication3;

public class Disegni {
    public static void main(String[] args) 
    {
        /*
             ***** 0     04
             ** *  1     13
             * *   2     22
             ** *  3     31
             *   # 4     40
             01234
        */
        int righe=7;
        int colonne=7;
        int ultimariga= righe-1;
        int ultimacolonna= colonne-1;
        
        
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(r==ultimariga && c==ultimacolonna)
                    System.out.print("#");
                else if(r==0 || 
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
        
        
        //-----------------------
        righe=7;
        colonne=4;
        ultimariga= righe-1;
        ultimacolonna= colonne-1;
        
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(c==0 ||
                   r<=righe/2 && r==c ||
                   r>righe/2 && r+c==righe-1)
                    System.out.print("*");                
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
