package labolprocesare;

import java.util.Scanner;


/** ggg:
 * Partendo dalla versione precedente, vado a inserire il codice di tutte le parti che si interfacciano con l'utente
 */
public class Variante_1_Base_Interfaccia_Utente 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        
        //Ciclo principale dell'applicazione
        char opzione= ' ';
        do
        {            
            //Presentazione menu all'utente
            //do-while che viene riproposto se non viene scelta una delle opzioni
            do
            {
                System.out.print("\n\n\n\n(C)odifica o (D)ecodifica e(X)it? ");
                opzione= in.nextLine().trim().toUpperCase().charAt(0);
            } while(opzione!='C' && opzione!='D' && opzione!='X');                  //Elenco delle opzioni: 'C' oppure 'D' oppure 'X'

            

            //Se l'utente non ha richiesto di terminare l'applicazione
            if(opzione=='C' || opzione=='D')                                        //Oppure if(opzione!='X')
            {
                //Chiedo all'utente di inserire la codifica
                //do-while che chiede all'utente di inserire un numero da 0 a 26
                //al suo interno verifica anche che l'utente abbia inserito un numero
                int cifratura=0;
                do
                {
                    System.out.print("Numero intero [0-26] della cifratura? ");
                    while(!in.hasNextInt())                                         //Se l'utente non fornisc eun numero intero...
                    {                        
                        in.nextLine();                                              //... lo elimino dal buffer e...
                        System.out.print("Numero intero [0-26] della cifratura? "); //... do un messaggio di errore
                    }
                    cifratura= in.nextInt();
                    in.nextLine();
                } while(cifratura<0 || cifratura>26);                               //Il ciclo viene riproposto se ha inserito valori errati



                //Chiedo all'utente di inserire la frase
                String frase= "";
                do
                {
                    System.out.print("Frase: ");
                    frase= in.nextLine().trim();
                } while(frase.equals(""));                                          //La frase non può essere vuota


                //Qui dovrò inserire il codice che effettua la codifica o la decodifica
            }
        } while(opzione!='X');
    }
}
