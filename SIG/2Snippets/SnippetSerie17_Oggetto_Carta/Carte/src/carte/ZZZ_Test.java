package carte;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ZZZ_Test 
{
    public static void main(String[] args) 
    {
        Carta_01 v1= new Carta_01();        
        
        //Carta con valori errati, sappiamo che i setter imposteranno dei default
        v1.setCarta(44);
        v1.setSeme('R');                
        System.out.println(v1.getCarta() + " " + v1.getSeme() );
        
        
        //Impostiamo una donna di fiori
        v1.setCarta(12);                        //Notate che come utilizzatore DEVO sapere che la donna vale 12!
        v1.setSeme('F');                        //Notate che come utilizzatore DEVO sapere che per i fiori devo usare il char 'F'!
        if(v1.getCarta()==12 && v1.getSeme()=='F')
            System.out.println("OK:\t" + v1.getCarta() + " " + v1.getSeme() );
        else
            System.out.println("KO:\t" + v1.getCarta() + " " + v1.getSeme() );
        
        
        
        //----------------------------------------------------------------------
        Carta_02 v2= new Carta_02();       
        
        try
        {
            v2.setCarta(44);                    //Sappiamo che il setter imposterà un default            
        } 
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
        
        v2.setDonna();                          //Per le carte speciali ho un setter dedicato
        v2.setFiori();                          //Per il seme non è più possibile impostare valori non ammessi

        if(v2.isDonna() && v2.isFiori())        //Notate che NON DEVO più sapere come la Donna o i Fiori sono rappresentati
            System.out.println("OK:\t" + v2 );  //Qui interviene il metodo toString
        else
            System.out.println("KO:\t" + v2 );
        
        
        
        
        //----------------------------------------------------------------------
        Carta_03 v3= new Carta_03(Carta_03.Carta.DONNA, Carta_03.Seme.FIORI);               //Grazie al costruttore quando creo una carta la inizializzo
        if(v3.getCarta()==Carta_03.Carta.DONNA && v3.getSeme()==Carta_03.Seme.FIORI)        //Notate che NON DEVO più sapere come la Donna o i Fiori sono rappresentati
            System.out.println("OK:\t" + v3 );  //Qui interviene il metodo toString
        else
            System.out.println("KO:\t" + v3 );

        
        
        //Carta con valore numerico
        v3.setCarta(Carta_03.Carta.SETTE);
        v3.setSeme(Carta_03.Seme.QUADRI);
        if(v3.getCarta()==Carta_03.Carta.SETTE && v3.getSeme()==Carta_03.Seme.QUADRI)        //Notate che NON DEVO più sapere come la Donna o i Fiori sono rappresentati
            System.out.println("OK:\t" + v3 );  //Qui interviene il metodo toString
        else
            System.out.println("KO:\t" + v3 );

        
        
        
        
        //----------------------------------------------------------------------
        Carta_03[] mazzo= new Carta_03[52];                 //Creo il mazzo di carte
        
        int i=0;
        for(Carta_03.Seme s: Carta_03.Seme.values())
        {
            for(Carta_03.Carta c: Carta_03.Carta.values())
            {
                mazzo[i]= new Carta_03(c,s);                   //Creo la carta
                //In assenza del costruttore avremmo dovuto fare
                //mazzo[i].setCarta(c);
                //mazzo[i].setSeme(s);
                i++;
            }
        }
        
        for(int cc=0; cc<mazzo.length; cc++)
        {
            System.out.print( mazzo[cc] + "\t");
            if((cc+1)%13==0) System.out.println("");
        }
        
    }
    
}
