public class Figura_Esercizio_Blog
{
    public static void main(String[] args)
    {
        int SIZE= 7;
        int PRIMA= 0;
        int ULTIMA= SIZE-1;
        
        for(int r=0; r<SIZE; r++)
        {
            for(int c=0; c<SIZE; c++)
            {
                if(r==PRIMA && c==PRIMA ||
                   r==PRIMA && c==ULTIMA ||
                   r==ULTIMA && c==PRIMA ||
                   r==ULTIMA && c==ULTIMA)
                {
                    System.out.print("+");
                }
                else if(r==PRIMA ||
                        r==ULTIMA)
                {
                    System.out.print("-");
                }
                else if(c==PRIMA || 
                        c==ULTIMA)
                {
                    System.out.print("|");
                }
                else if(r>=PRIMA+2 && r<=ULTIMA-2 &&
                        c>=PRIMA+2 && c<=ULTIMA-2)
                {
                    System.out.print(".");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
        System.out.println("\n\n\n");
        int RIGHE= 10;
        int COLONNE= 10;
        PRIMA= 0;
        int ULTIMARIGA= RIGHE-1;
        int ULTIMACOLONNA= COLONNE-1;
        
        for(int r=0; r<RIGHE; r++)
        {
            for(int c=0; c<COLONNE; c++)
            {
                if(r==PRIMA && c==PRIMA ||
                   r==PRIMA && c==ULTIMACOLONNA ||
                   r==ULTIMARIGA && c==PRIMA ||
                   r==ULTIMARIGA && c==ULTIMACOLONNA)
                {
                    System.out.print("+");
                }
                else if(r==PRIMA ||
                        r==ULTIMARIGA)
                {
                    System.out.print("-");
                }
                else if(c==PRIMA || 
                        c==ULTIMACOLONNA)
                {
                    System.out.print("|");
                }
                else if(r>=PRIMA+2 && r<=ULTIMARIGA-2 &&
                        c>=PRIMA+2 && c<=ULTIMACOLONNA-2)
                {
                    System.out.print(".");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }        
    }
}
