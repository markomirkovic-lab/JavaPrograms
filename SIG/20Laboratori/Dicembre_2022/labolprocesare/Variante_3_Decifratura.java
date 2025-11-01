package labolprocesare;

import java.util.Scanner;


/** ggg:
 * Partendo dalla versione precedente, vado a inserire il codice per decifrare. Cercae la stringa //ggg:
 */
public class Variante_3_Decifratura 
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
                        System.out.print("Numero intero [0-26] della cifratura? "); //... do un messagigo di errore
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
                String cesare="";
                
                if(opzione=='D')    
                {
                    cifratura= 26-cifratura;     //ggg: Se decifro con ad esempio 5 posizioni, significa effettuare un cifratura di 26-posizioni, ovvero 21. Questa tecnica mi permette di non verificare mai i valori <0
                }    

                //Scorro tutte le lettere della frase
                for(int i=0; i<frase.length(); i++)
                {
                    //Memorizzo la lettera attuale, utilizzando il suo valore UNICODE
                    int tmp= (int)frase.charAt(i);
                    
                    //È una minuscola?
                    if( tmp>='a' && tmp<='z')
                    {
                        tmp= tmp - 'a';         //Riporto il valore della lettera minuscola (che in UNICODE va da 91 a 122) nel range da 0 a 26!
                        tmp= tmp + cifratura;   //Aggiungo lo posizioni di cifratura
                        tmp= tmp % 26;          //Con l'operatore modulo/resto eseguo i riporti oltre il numero 25. Esempio la 'z', avrà valore 26, con cifratura 3, diventa 29 e dopo il modulo sarà 3!
                        tmp= tmp + 'a';         //Riporto il valore numerico da 0 a 26 nel range UNICODE da 91 a 122.
                    }
                    else if( tmp>='A' && tmp<='Z')
                    {
                        tmp= tmp - 'A';         //Riporto il valore della lettera minuscola (che in UNICODE va da 65 a 90) nel range da 0 a 26!
                        tmp= tmp + cifratura;   //Aggiungo lo posizioni di cifratura
                        tmp= tmp % 26;          //Con l'operatore modulo/resto eseguo i riporti oltre il numero 25. Esempio la 'z', avrà valore 26, con cifratura 3, diventa 29 e dopo il modulo sarà 3!
                        tmp= tmp + 'A';         //Riporto il valore numerico da 0 a 26 nel range UNICODE da 91 a 122.
                    }
                    
                    cesare= cesare + (char)tmp; //Accodo alla stringa finale il carattere
                }                

                System.out.println( cesare);
                
            }
        } while(opzione!='X');
    }
}
