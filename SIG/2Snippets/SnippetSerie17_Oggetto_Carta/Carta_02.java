package carte;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La soluzione precedente è funzionale ma impone che l'utilizzatore sia a conoscenza dei
 * valori possibili per seme ('C','Q','F','P') e carta (1..13).
 * 
 * Questa non è una soluzione pulita e quindi in questa classe realizzeremo più setter e getter
 * che aumentano l'information hiding della classe, rendendola più facile da usare!
 * 
 * @author gisi
 */
public class Carta_02
{    
    public static char CUORI= '\u2661';             //Tutto ciò che è static è relativo alla classe e non ai singoli oggetti
    public static char QUADRI= '\u2662';
    public static char FIORI= '\u2663';
    public static char PICCHE= '\u2660';     
 
    
    
    
    private char seme;                              //Attributo privato. Ogni oggetto creato ne avrà uno proprio
    private int carta;                              //Attributo privato. Ogni oggetto creato ne avrà uno proprio
    
    
    
    /**
     * Imposta il seme a Cuori
     */
    public void setCuori()
    {
        this.seme='C';
    }

    /**
     * Imposta il seme a Quadri
     */    
    public void setQuadri()
    {
        this.seme='Q';
    }    
    
    /**
     * Imposta il seme a Fiori
     */    
    public void setFiori()
    {
        this.seme='F';
    }
    
    /**
     * Imposta il seme a Picche
     */    
    public void setPicche()
    {
        this.seme='P';
    }        

    /**
     * Restituisce true se il seme è cuori.
     * 
     * @return 
     */
    public boolean isCuori()
    {
        return this.seme=='C';
    }

    /**
     * Restituisce true se il seme è quadri.
     * 
     * @return 
     */    
    public boolean isQuadri()
    {
        return this.seme=='Q';
    }    
    
    /**
     * Restituisce true se il seme è fiori.
     * 
     * @return 
     */    
    public boolean isFiori()
    {
        return this.seme=='F';
    }    
    
    /**
     * Restituisce true se il seme è picche.
     * 
     * @return 
     */    
    public boolean isPicche()
    {
        return this.seme=='P';
    }   
    
    
    
    
    //-------------------------------------------------------------------------
    public void setCarta(int carta) throws Exception
    {
        if(carta<1 || carta>13) throw new Exception("Valori consentiti fra 1 e 13!");
        
        this.carta=carta;
    }
    
    
    /**
     * Questo è un metodo privato che uso all'interno del codice della classe per
     * evitare di inserire un try-catch in tutti i prossimi setter.
     * 
     * @param carta 
     */
    private void setCartaInterno(int carta)
    {
        try
        {
            this.setCarta(carta);
        } 
        catch (Exception ex)
        {
            //Non entrerà mai qui
        }        
    }
    
    public void setAsso()
    {
        this.setCartaInterno(1);               //Notare che uso il setter, così non devo riscrivere i controlli e centralizzo in un solo metodo questa funzione
    }
    
    public void setFante()
    {
        this.setCartaInterno(11);
    }
    
    public void setDonna()
    {
        this.setCartaInterno(12);
    }
    
    public void setRe()
    {
        this.setCartaInterno(13);
    }

    public void set2()
    {
        this.setCartaInterno(2);
    }

    public void set3()
    {
        this.setCartaInterno(3);
    }

    public void set4()
    {
        this.setCartaInterno(4);
    }

    public void set5()
    {
        this.setCartaInterno(5);
    }

    public void set6()
    {
        this.setCartaInterno(6);
    }

    public void set7()
    {
        this.setCartaInterno(7);
    }

    public void set8()
    {
        this.setCartaInterno(8);
    }

    public void set9()
    {
        this.setCartaInterno(9);
    }

    public void set10()
    {
        this.setCartaInterno(10);
    }

    
    
    public int getCarta()
    {
        return this.carta;
    }
    
    public boolean isAsso()
    {
        return this.carta==1;
    }

    public boolean isFante()
    {
        return this.carta==11;
    }
    
    public boolean isDonna()
    {
        return this.carta==12;
    }
    
    public boolean isRe()
    {
        return this.carta==13;
    }
    
    public boolean is2()
    {
        return this.carta==2;
    }
    
    public boolean is3()
    {
        return this.carta==3;
    }
    
    public boolean is4()
    {
        return this.carta==4;
    }
    
    public boolean is5()
    {
        return this.carta==5;
    }
    
    public boolean is6()
    {
        return this.carta==6;
    }
    
    public boolean is7()
    {
        return this.carta==7;
    }
    
    public boolean is8()
    {
        return this.carta==8;
    }
    
    public boolean is9()
    {
        return this.carta==9;
    }
    
    public boolean is10()
    {
        return this.carta==10;
    }
    
    
    
    
    
    //--------------------------------------------------------------------------
    @Override
    public String toString()
    {
        String out="";
        
        if(this.isAsso()) out+="A";
        else if(this.isFante()) out+="J";
        else if(this.isDonna()) out+="Q";
        else if(this.isRe()) out+="K";
        else out+="" + this.carta;
        
        if(this.isCuori()) out+= Carta_02.CUORI;
        else if(this.isQuadri()) out+= Carta_02.QUADRI;
        else if(this.isFiori()) out+= Carta_02.FIORI;
        else out+= Carta_02.PICCHE; //if(this.isQuadri()) out+= Carta_02.PICCHE;
        
        return out;
    }
    
}
