package carte;


/**
 * Variante di base per esprimere una carta da gioco.
 * 
 * Essa ha due attributi:
 * - un seme, qui rappresentato da un char con i valori 'C','Q','F','P'
 * - un valore, qui rappresentato da un intero da 1 a 13
 * 
 * @author gisi
 */
public class Carta_01
{    
    private char seme;                              //Attributo privato. Ogni oggetto creato ne avrà uno proprio
    private int carta;                              //Attributo privato. Ogni oggetto creato ne avrà uno proprio
    
    
    
    /**
     * Setter per l'attributo seme.
     * I settere hanno sempre queste caratteristiche:
     * - restituiscono in void
     * - ricevono in argomento il valore da attribuire al'attributo
     * - al loro interno verificano e si assicurano che non venga assegnato un valore errato
     * 
     * Se al setter viene inviato un char non ammesso, si imposterà il seme a Cuori.
     * 
     * @param seme  Uno dei seguenti valori: 'C', 'Q', 'F', 'P'
     */
    public void setSeme(char seme)
    {
        //Siccome chi usa il setter può comunque inviarmi qualsiasi char, 
        //allora mi assicuro che il valore inviato sia fra quelli ammessi.
        //In caso contrario assegno arbitrariamente un valore.
        //Meglio sarebbe sollevare un'eccezione!
        if(seme!='C' && seme!='Q' && seme!='F' && seme!='P')
            this.seme= 'C';     //Sarebbe meglio sollevare un'eccezione
        else
            this.seme= seme;
    }
    
    
    /**
     * Il tipico getter non riceve argomenti e restituisce il tipo dell'attributo.
     * 
     * @return 
     */
    public char getSeme()
    {
        return this.seme;
    }    
    
    
    
    /**
     * Anche questo setter verifica se il valore della carta sia autorizzato, altrimenti per default imposterà 1.
     * @param carta
     * @return 
     */
    public void setCarta(int carta)
    {
        if(carta<1 || carta>13) this.carta=1;   //Meglio sarebbe sollevare un'eccezione!
        else this.carta= carta;
    }
    
    
    public int getCarta()
    {
        return this.carta;
    }
  
}
