
public class DiagonaleBassoAlto 
{
    public static void main(String[] args) 
    {

        int lato = 7;

        for (int r = 0; r < lato+1; r++)
        {
            for (int c = 0; c < lato+1; c++) 
            {
                if (c == 7-r)
                {
                    System.out.print("*");
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

