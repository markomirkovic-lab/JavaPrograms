public class SnippetSerie13_Exception_MagicSquare 
{    
    /**
     * Riceve una matrice e:
     * - se rappresenta un quadrato magico restituisce il numero magico
     * - se le sue dimensioni sono errate, oppure non è un quadrato magico, solleva un'eccezione
     * 
     * @param toCheck       La matrice da verificare
     * @return              Il numero magico della matrice
     * @throws Exception    Solleva un'eccezione se non è un quadrato magico oppure se ha problemi nelle dimensioni
     */
    public static int getMagic(int[][] toCheck) throws Exception
    {
        try
        {        
            //Calcolo il numero magico
            int magic=0;
            for(int c=0; c<toCheck.length; c++)
            {
                magic+= toCheck[0][c];
            }


            //Verifico tutte le righe;
            int sum;
            for(int r=1; r<toCheck.length; r++)
            {
                sum=0;
                for(int c=0; c<toCheck.length; c++)
                {
                    sum+= toCheck[r][c];
                }            
                if(magic!=sum) throw new Exception("NON è un quadrato magico alla riga " + r);      //Sollevo l'eccezione indicando la riga dove si è verificata. Verrà intercettata dal try-catch di questo metodo!
            }


            //Verifico tutte le righe;
            for(int c=0; c<toCheck.length; c++)
            {
                sum=0;            
                for(int r=0; r<toCheck.length; r++)
                {
                    sum+= toCheck[r][c];
                }            
                if(magic!=sum)  throw new Exception("NON è un quadrato magico alla colonna " + c);         
            }


            //Verifico le diagonale
            sum=0;
            for(int d=0; d<toCheck.length; d++)
            {
                sum+= toCheck[d][d];
            }
            if(magic!=sum)  throw new Exception("NON è un quadrato magico");

            sum=0;
            for(int d=0; d<toCheck.length; d++)
            {
                sum+= toCheck[d][toCheck.length-1-d];
            }
            if(magic!=sum) throw new Exception("NON è un quadrato magico");
            
            return magic;            
        }
        catch(ArrayIndexOutOfBoundsException aiobe)
        {
            //Intercetto un'irregolarità nella matrice (magari non è quadrata o ha colonne inferiori al numero di righe, ...
            //Rilancio l'eccezione, con un messaggio generico
            throw new Exception("Il formato della matrice contiene delle incongruenze!");
        }
        catch(Exception e)
        {
            throw e;        //Il codice nel try-catch ha sollevato un'eccezione. La intercetto e la risollevo a mia volta.
        }
    }
    
    
    
    public static boolean isMagic(int[][] toCheck)
    {
        try
        {
            getMagic(toCheck);      //Se getMagic solleva l'eccezione, viene intercettata e NON usicrà da isMagic, che restituirà solo true o false
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    



    
    
    public static void main(String[] args)
    {
        try
        {
            //Qui andrà tutto bene
            int[][] qm= { { 2, 7, 6},
                          { 9, 5, 1},
                          { 4, 3, 3} };

            System.out.println( isMagic(qm) );
            System.out.println( getMagic(qm) );
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        
        
        
        try
        {
            //Qui abbiamo un quadrato non magico, verrà sollevata l'eccezione
            int[][] qm2= { { 2, 7, 6},
                           { 9, 5, 1},
                           { 4, 3, 33} };

            System.out.println( isMagic(qm2) );
            System.out.println( getMagic(qm2) );
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
        
        try
        {
            //Qui abbiamo un quadrato non magico a causa delle dimensioni della matrice, verrà sollevata l'eccezione
            int[][] qm2= { { 2, 7, 6, 23},
                           { 9, 5, 1},
                           { 4, 3} };

            System.out.println( isMagic(qm2) );
            System.out.println( getMagic(qm2) );
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }    
    
}
