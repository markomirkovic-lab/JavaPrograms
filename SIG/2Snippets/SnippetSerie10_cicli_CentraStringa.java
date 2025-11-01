public class SnippetSerie10_cicli_CentraStringa 
{
    public static void main(String[] args) 
    {
        //Formattare una stringa a destra di uno spazio
        String input= "SSSE";                               //Stringa da formattare
        //             0123
        int spazi= 10;                                      //La stringa sarà da formattare su 10 spazi
        String output= "";                                  //Stringa finale
        
        
        //Se devo allineare a destra, dovrò prima inserire tanti caratteri quanti
        //ne ottengo da spazi-input.length().
        //Se ho una stringa da 6 caratteri, dovrò inserire a sinistra 4 caratteri.
        //Se ho una stringa da 8 caratteri, dovrò inserire a sinistra 2 caratteri.
        //                10-4=6
        for(int sx=0; sx< spazi-input.length(); sx++)       //Ecco il ciclo che inserirà i caratteri a sinistra
        {   
            output= output+'-';                             //Inserisco dei '-' per rendere visibile il risultato            
        }
        output=output+input;                                //Inserisco la stringa da allineare a destra
        
        System.out.println(output);//------SSSE
        //                                 0123
        //                           01234567890  
        //                           012345       
        
        
        
        
        
        //----------------------------------------------------------------------
        //Formattare una stringa al centro
        input= "SIG";                                      //Stringa da formattare
        spazi= 10;                                         //La stringa sarà da formattare su 10 spazi
        output= "";                                        //Stringa finale
        
        
        //Se devo allineare al centro, dovrò
        //  inserire a sinistra la metà degli spazi disponibili
        //  inserire la stringa
        //  inserire a destra l'altra metà        
        //Se ho una stringa da 6 caratteri, dovrò inserire a sinistra 2 caratteri e a destra altri 2.
        //Se ho una stringa da 8 caratteri, dovrò inserire a sinistra 1 carattere e a destra altri 2.
        //                (10 - 3) / 2 = 7 - 2 = 3
        for(int sx=0; sx< (spazi-input.length())/2; sx++)    //Ecco il ciclo che inserirà i caratteri a sinistra
        {   
            output= output+'-';                             //Inserisco dei '-' per rendere visibile il risultato 
            //"---"   
        }
        
        
        output=output+input;                                //Inserisco la stringa da centrare
        
        //Se ho caratteri dispari come riempimento, scelgo di inserire uno spazio vuoto a destra
        if( (spazi-input.length())%2==1 )
        {
            output=output+' ';
            //" "
        }        
        
        //                (10 - 3) / 2 = 7 - 2 = 3
        for(int dx=0; dx< (spazi-input.length())/2; dx++)   //Ecco il ciclo che inserirà i caratteri a destra
        {   
            output= output+'-';                             //Inserisco dei '-' per rendere visibile il risultato 
            //"---"           
        }                
        
        System.out.println(output);//---SIG ---
        //                           0123456789   10                               
    }
    
}
