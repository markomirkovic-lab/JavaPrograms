package carte;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La soluzione precedente è funzionale ma impone di scrivere molto codice.
 * 
 * Quando abbiamo un set limitato di valori, allora possiamo usare gli insiemi.
 * 
 * @author gisi
 */
public class Carta_03
{    
    public enum Seme                                //Insieme dei Semi
    {
        CUORI, QUADRI, FIORI, PICCHE;
    }
    
    public enum Carta                                //Insieme delle carte
    {
        ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO, NOVE, DIECI, FANTE, DONNA, RE;
    }
    
    
    public static char CUORI= '\u2661';             //Tutto ciò che è static è relativo alla classe e non ai singoli oggetti
    public static char QUADRI= '\u2662';
    public static char FIORI= '\u2663';
    public static char PICCHE= '\u2660';     
    
 
    
    
    
    private Seme seme;                              //Attributo privato. Ogni oggetto creato ne avrà uno proprio
    private Carta carta;                            //Attributo privato. Ogni oggetto creato ne avrà uno proprio
    
    
    
    /**
     * Costruttore.
     * Serve a inizializzare i valori dell'oggetto.
     * 
     * @param c
     * @param s 
     */
    public Carta_03(Carta_03.Carta c, Carta_03.Seme s)
    {
        this.setCarta(c);
        this.setSeme(s);
    }
    
    
    //-------------------------------------------------------------------------
    public void setSeme(Seme s)
    {
        this.seme=s;
    }
    
    public Seme getSeme()
    {
        return this.seme;
    }
    
    
    //-------------------------------------------------------------------------
    public void setCarta(Carta c)
    {
        this.carta=c;
    }

    public Carta getCarta()
    {
        return this.carta;
    }
    
    
    
    //--------------------------------------------------------------------------
    @Override
    public String toString()
    {
        String out="";
        
        if(this.carta==Carta.ASSO) out+="A";
        else if(this.carta==Carta.FANTE) out+="J";
        else if(this.carta==Carta.DONNA) out+="Q";
        else if(this.carta==Carta.RE) out+="K";
        else 
            out+="" + (this.carta.ordinal()+1);                                 //Questo ordinal ci fornisce l'indice della carta nell'insieme
        
        if(this.seme==Seme.CUORI) out+= Carta_03.CUORI;
        else if(this.seme==Seme.QUADRI) out+= Carta_03.QUADRI;
        else if(this.seme==Seme.FIORI) out+= Carta_03.FIORI;
        else out+= Carta_03.PICCHE; //if(this.seme==Seme.PICCHE) out+= Carta_02.PICCHE;
        
        return out;
    }
    
}
