import java.util.Scanner;

public class SnippetSerie10_manipolazione_stringhe_e_numeri 
{
    public static void main(String[] args) 
    {
        
        
        //-------------------------------------------------------------
        //Controllare se una stringa contiene solo caratteri consentiti
        String daControllare= "ssse";        
                
        boolean check= true;        
        for (int i = 0; i < daControllare.length(); i++) 
        {
            char c= daControllare.charAt(i);
            
                                        //Sono consentite, aggiungete ocn l'OR (||) i caratteri validi
            if(!(c>='a' && c<='z' ||    //Lettere minuscole
                 c>='A' && c<='Z' ||    //Lettere maiuscole
                 c>='0' && c<='9' ||    //Cifre
                 c=='.'))               //Il punto
            {
                check= false;
                break;
            }            
        }        
        if(!check) System.out.println("Caratteri errati");   
        else System.out.println("Tutto ok");

        //Bis

        daControllare= "ssse";        
                
        check= true;        
        for (int i = 0; i < daControllare.length(); i++) 
        {
            char c= daControllare.charAt(i);
            
                                        //Sono consentite, aggiungete ocn l'OR (||) i caratteri validi
            if((c>='a' && c<='z' ||    //Lettere minuscole
                 c>='A' && c<='Z' ||    //Lettere maiuscole
                 c>='0' && c<='9' ||    //Cifre
                 c=='.'))               //Il punto
            {
                check= true;
                break;
            } else {
                check = false;
            }           
        }        
        if(!check) System.out.println("Caratteri errati");   
        else System.out.println("Tutto ok");

        
        
        
        //-------------------------------------------------
        //Convertire una stringa che contiene solo caratteri 
        //numerici nel rispettivo valore numerico.
        //Questo lavoro viene svolto ad esempio dalla nextInt();
        String numero= "123";
        int valore= 0;
        for (int i = 0; i < numero.length(); i++) 
        {
            char c= numero.charAt(i);       //Prelevo il carattere
            //1
            //2
            //3
            valore= valore*10 + (c-'0');    //Trasformo il carattere in valore numerico (int)
            //            val numerico del char
            //  0 * 10 + (49 - 48) =   0 + 1 =   1
            //  1 * 10 + (50 - 48) =  10 + 2 =  12
            // 12 * 10 + (51 - 48) = 120 + 3 = 123
            System.out.println("c: " + c);                  // 1
            System.out.println("valore: " + valore);        // 0*10 + 1 - 
            System.out.println("valore*10: " + valore*10);
            System.out.println("c-'0': " + (c-'0'));
            
            //NOTA BENE. L'operazione c-'0' serve a calcolare il valore numerico
            //           di un char, sapendo che i char hanno valori
            //           incrementali che seguono l'ordinamento ascendente
            //              '0' ha valore numerico 48
            //              '1'                    49 e così via
            //           quindi '5'-'0' darà 5     53 - 48 = 5
            //
            //           Il calcolo vi consente di evitare questo lungo e 
            //           fastidioso switch:
            //              int cifra;
            //              switch(c)
            //              {
            //                  case '0':
            //                      cifra= 0;
            //                      break;
            //                  case '1':
            //                      cifra= 1;
            //                      break;
            //                  case '2':
            //                      cifra= 2;
            //                      break;
            //                  case '3':
            //                      cifra= 3;
            //                      break;
            //                  case '4':
            //                      cifra= 4;
            //                      break;
            //                  case '5':
            //                      cifra= 5;
            //                      break;
            //                  case '6':
            //                      cifra= 6;
            //                      break;
            //                  case '7':
            //                      cifra= 7;
            //                      break;
            //                  case '8':
            //                      cifra= 8;
            //                      break;
            //                  case '9':
            //                      cifra= 9;
            //                      break;
            //                  default:
            //                      cifra= 0;
            //              }
            //              valore= valore*10 + cifra; 
        }
        System.out.println(valore);//123 (valore int)
        System.out.println(valore+4);//123 + 4 = 127 (valore int)
        System.out.println("");
        
        
        //-------------------------------------------------
        String cifraCompleta = "";
        //Estrarre le signole cifre da un numero
        while(valore!=0)                    //While perché non sappiamo quante volte ripetere il ciclo: con 123 lo farà 3 volte, con 5678914 lo farà 7
        {
            int cifra= valore%10;           //Con % estraggo la cifra a destra 
            // 123 % 10 = 3
            //  12 % 10 = 2
            //   1 / 10 = 1

            valore=valore/10;               //Con / tolgo la cifra a destra
            // 123 / 10 = 12
            //  12 / 10 =  1
            //   1 / 10 =  0
            
            
            cifraCompleta = cifraCompleta + cifra;
            //System.out.println(cifraCompleta);
            //            = ""   + 3 = "3"
            //            = "3"  + 2 = "32"
            //            = "32" + 1 = "321"
            System.out.println(cifra);
            
        }     
        System.out.println(cifraCompleta);          
    }
    
    
}



