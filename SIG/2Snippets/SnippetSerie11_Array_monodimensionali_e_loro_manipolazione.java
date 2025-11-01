
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SnippetSerie11_Array_monodimensionali_e_loro_manipolazione {
    
public static void main(String[] args) 
    {
        //--------------------------------------------------------------
        //Dichiarazione, con new e inizializzazione.

        //Utilizzata quando il contenuto dell'array è già oto
        int[] giorni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};                
        String[] giorniSettimana= {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
        
        
        
        
        //--------------------------------------------------------------
        //Dichiarazione classica, la dimensione è data da un letterale o da una variabile
        double[] prezzi;                // Dichiarazione
        int elementi= 13;
        prezzi= new double[elementi];   // Instanziazione. 0..12.   0..prezzi.length
        
        
        prezzi[0] = 321355;             //La prima cella dell'array
        prezzi[4] = 123.47;             //Assegno un valore alla 5a cella
        prezzi[prezzi.length-1]= 444;   //Assegno un valore all'ultima cella

        
        //Stampo il contenuto della 5a cella
        System.out.println( prezzi[4] );
        
        //Stampiamo tutte le celle
        for(int i=0; i<prezzi.length; i++)
        {
            System.out.print( prezzi[i]);

            if(i != prezzi.length-1) {
            System.out.print(", ");
            }
        }
        System.out.println("");
        

        
        //--------------------------------------------------------------
        //Eliminiamo dalla memoria il vecchio array e ne creiamo uno nuovo
        prezzi = new double[5];     //prezzi = {1.1, 2.2, 3.3, 4.4, 5,5}; NON FUNZIONERÀ perchè potete farlo solo al momento della dichiarazione




        //--------------------------------------------------------------	
        //Facciamo una copia dell'array
        double[] c= prezzi.clone();
        
        //Ecco cosa fa al suo interno .clone()
        c=new double[prezzi.length];        //...crea un array grande quanto quello da copiare
        for(int i=0; i<prezzi.length; i++)  //Scorre l'array
        {
            c[i]=prezzi[i];                 //Copia ogni singola cella
        }
        
        
        
        
        
        //--------------------------------------------------------        
        //Operazione evoluta 1
        //Ricerca di un valore nell'array.
        //Lo scopo è quello di trovare un valore.
        //Una volta trovate dobbiamo memorizzare l'indice della cella
        //nella quale si trova.
        System.out.println("\n\n---------------------\nOperazione di base 1: Ricerca valore nell'array");
        
        double[] listaDiValori= { 1.1, 2.2, 3.3, 4.4 };
        double valoreDaTrovare=  2.2;
        int indiceTrovato= -1;                      //-1 perché non è un indice valido
        for(int i=0; i<listaDiValori.length; i++)
        {
            if(listaDiValori[i]==valoreDaTrovare)
            {
                indiceTrovato= i;                   //Memorizzo l'indice
                break;                              //Interrompo il ciclo
            }
        }
        System.out.println("Array: " + Arrays.toString(listaDiValori));
        if(indiceTrovato==-1) System.out.println("Valore " + valoreDaTrovare + " non trovato!");
        else System.out.println("Valore " + valoreDaTrovare + " trovato all\'indice: " + indiceTrovato);
        

        
        
        
        //--------------------------------------------------------
        //Operazione evoluta 2
        //Scambiare le celle
        //Scambio celle 1 e 4, scelta a caso per questo esempio
        System.out.println("\n\n---------------------\nOperazione di base 2: Scambio celle 1 e 2");
        System.out.println("Prima: " + Arrays.toString(listaDiValori));
        double tmp;                          //valore temporaneo
        tmp=       listaDiValori[0];         //Inserisco la prima cella 
        listaDiValori[0]= listaDiValori[1];  //Nella prima cella inserisco il valore della seconda
        listaDiValori[1]= tmp;               //Nella seconda inserisco il valore temporaneo
        System.out.println("Dopo: " + Arrays.toString(listaDiValori));
        
        
        
        
        
        
        //--------------------------------------------------------        
        //Operazione evoluta 3
        //Inserire una nuova cella        
        //Vogliamo inserire il valore 11 nella cella con indice 3
        //
        //      indice    0     1     2     3     4     5
        //      valore  2.3, -1.5,  7.8,  4.4, -5.3,  9.8               <----a
        //                |     |     |     \     \     \    
        //                |     |     |      \     \     \                  
        //                |     |     |       \     \     \               
        //                |     |     |        \     \     \            
        //                |     |     |         \     \     \                    
        //                |     |     |          \     \     \            
        //      valore  2.3, -1.5,  7.8, 11.1,  4.4, -5.3,  9.8         <----a
        //      indice    0     1     2     3     4     5     6
        System.out.println("\n\n---------------------\nOperazione di base 3: Inserire una nuova cella");
        
        double[] a= { 2.3, -1.5, 7.8, 4.4, -5.3, 9.8};   //Abbiamo un array
        System.out.println("Prima:\t" + Arrays.toString(a));
        
        double[] tmpa= new double[a.length+1];  //Creare un array più grande di una cella
        
        int indiceNuovaCella= 3;                //La nuova cella sarà quella con indice 3. Per aggiungere in fondo: a.length. Per aggiungere in cima: 0
        double nuovoValore= 11.1;               //Inseriremo il valore 1111
        
        for(int i=0; i<a.length; i++)           //Scorriamo tutto il vecchio array
        {
            if(i<indiceNuovaCella)              
            {
                tmpa[i]= a[i];                  //Tutte le celle prima di quella nuova le copieremo
            }
            else if(i>=indiceNuovaCella)
            {
                tmpa[i+1]= a[i];                //Le celle seguenti vanno spostate a destra di 1
            }
        }
        tmpa[indiceNuovaCella]= nuovoValore;    //Infine inserisco il nuovo valore nella cella voluta
        
        a= tmpa;                                //Sostituisco il vecchio array con il nuovo
        tmpa= null;                             //Elimino l'array temporaneo
        //!!!!!!!!!
        System.out.println("Dopo:\t" + Arrays.toString(a));
        System.out.println(Arrays.toString(tmpa));//null

        
        
        
        
        //--------------------------------------------------------        
        //Operazione evoluta 4
        //Elimnare una nuova cella        
        //Vogliamo eliminare il valore 4.4 (si trova nella cella con indice 3
        //
        //      indice    0     1     2     3     4     5
        //      valore  2.3, -1.5,  7.8,  4.4, -5.3,  9.8               <----a
        //                |     |     |          /     /
        //                |     |     |         /     /
        //                |     |     |        /     /
        //                |     |     |       /     /
        //                |     |     |      /     /
        //                |     |     |     /     /
        //      valore  2.3, -1.5,  7.8, -5.3,  9.8                     <----a
        //      indice    0     1     2     3     4
        System.out.println("\n\n---------------------\nOperazione di base 4: Eliminare una cella");
        
        
        double[] b= { 2.3, -1.5, 7.8, 4.4, -5.3, 9.8};   //Abbiamo un array
        System.out.println("Prima:\t" + Arrays.toString(b));
        
        double[] tmpb= new double[b.length-1];  //Creare un array più piccolo di una cella
        
        indiceNuovaCella= 3;                    //La cella da eliminare sarà quella con indice 3. Per eliminare l'ultima: b.length-1. Per eliminare la prima: 0.

        
        for(int i=0; i<b.length; i++)           //Scorriamo tutto il vecchio array
                {
            if(i<indiceNuovaCella)              
            {
                tmpb[i]= b[i];                  //Tutte le celle prima di quella nuova le copieremo
            }
            else if(i>indiceNuovaCella)
            {
                tmpb[i-1]= b[i];                //Le celle seguenti vanno spostate a sinistra di 1
            }
        }
        b= tmpb;                                //Sostituisco il vecchio array con il nuovo
        tmpb= null;                             //Elimino l'array temporaneo.
        
        
        System.out.println("Dopo:\t" + Arrays.toString(b));   
        System.out.println();     
        
        
        
        
        
        
    }    
}
