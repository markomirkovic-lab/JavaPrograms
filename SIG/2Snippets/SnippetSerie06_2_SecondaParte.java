public class SnippetSerie06_2_SecondaParte 
{
    public static void main(String[] args) 
    {
        float temperatura= (float)34.7;             //Casting esplicito da float a double
        int lunghezza= (int)123L;                   //Casting esplicito da long a int
        
        int lettera= 100;
        System.out.println( (char)lettera );        //Casting esplicito da int a char   d
        System.out.println( (char)(lettera+1) );    // e
        
        int lettera2= (int)'d';                     //Casting esplicito da char a int  
        System.out.println( lettera2+1 );           //100 + 1 = 101
        
        System.out.println( (int)'a' + (int)'b');   //97 + 98 = 195
               
        System.out.println( " fa " + 7+5);          //Casting implicito da int a String     fa  75
        
        //         01234567890123456789
        String n= "scuola specializzata";
        //         01234567891111111111
        //                   0123456789
        
        System.out.println( n.length() );
        System.out.println("Il primo: " + n.charAt(0));                 // 's'
        System.out.println("Il nono: " + n.charAt(8));                  // 'p'
        System.out.println("L\'ultimo: " + n.charAt(n.length()-1) );          // 'a'
        
        System.out.println( n.indexOf("spec") );                        //mi da la posizione della prima sottostringa   7
        System.out.println( n.indexOf("a") );                           // 5
        
        System.out.println( n.substring(5));                            //estrae la sottostringa che inizia dalla posizione 5
        System.out.println( n.substring(n.indexOf(" ")+1) );                   //estrae partendo dalla posizione che segue il carattere ' '
        System.out.println( n.substring(0, n.indexOf(" ") ) );      //parte dall'indice 0 e temrina prima dello spazio
        System.out.println( n.substring(5, n.length() ) );
        
        System.out.println( n.replace("a", "A"));
        System.out.println( n.replace("zz", "DOPPIAZETA"));
        
        System.out.println( n.toUpperCase() );
        
        System.out.println("   aaaa    bbbb   ".trim());                //Toglie gli spazi esterni ma mantiene quelli interni
        
        System.out.println("aaa".equals("bbb"));
        System.out.println("aaa".equals("AAA"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));
        
    }
    
}
