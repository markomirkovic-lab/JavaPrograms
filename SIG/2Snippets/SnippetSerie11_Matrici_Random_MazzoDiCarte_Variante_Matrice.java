
import java.util.Scanner;


public class SnippetSerie11_Matrici_Random_MazzoDiCarte_Variante_Matrice 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        
        
        
        //--------------------------------------------------------------------
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Questo codice è identico allo snippets del mazzo di carte ma
        //invece di usare un array, usa una matrice!
        //Tutte le parti diverse sono identificahe dal commento //!!!
        
        
        
        //--------------------------------------------------------------------
        //Mazzo di carte
        //   4 semi     cqfp
        //  13 carte    A, 2..10, J, Q, K
        //   2 jolly
        int mazziCarte = 6;
        String[][] mdc= new String[mazziCarte*(4*13+2)][2];        //6 mazzi, 4 semi, 13 carte e 2 jolly
        //!!! Notare la seconda dimensione, useremo la colonna 0 per il valore della carta e la colonna 1 per il seme
        //
        //        [0]   [1]
        //      +-----+-----+
        //  [0] | "A" | "♡" |
        //      +-----+-----+
        //  [1] | "2" | "♡" |
        //      +-----+-----+
        //  [2] | "3" | "♡" |
        //      +-----+-----+
        //  [3] | "4" | "♡" |           mdc[3][0] = "4"     mdc[3][1] = "♡" 
        //      +-----+-----+
        //        ...   ...


        /*
        A♡	2♡	3♡	4♡	5♡	6♡	7♡	8♡	9♡	10♡	J♡	Q♡	K♡	
        A♤	2♤	3♤	4♤	5♤	6♤	7♤	8♤	9♤	10♤	J♤	Q♤	K♤	
        A♣	2♣	3♣	4♣	5♣	6♣	7♣	8♣	9♣	10♣	J♣	Q♣	K♣	
        A♠	2♠	3♠	4♠	5♠	6♠	7♠	8♠	9♠	10♠	J♠	Q♠	K♠	
        jolly🃏	
        jolly🃏
        */
        
        int c=0;                                        //punterà alla carta da generare ogni volta
        for(int mazzo=0; mazzo<6; mazzo++)              //Ciclo sui mazzi di carte
        {
            for(int seme=0; seme<4; seme++)             //Ciclo sui semi, ogni mazzo ne ha 4
            {
                for(int valore=1; valore<=13; valore++) //Ciclo sulle carte, ogni seme ne ha 13
                {
                    //!!! vedete che inserisco nella carta, alla colonna 1, il seme
                    if(seme==0) mdc[c][1]="\u2661";     //cuori
                    else if(seme==1) mdc[c][1]="\u2664";//quadri
                    else if(seme==2) mdc[c][1]="\u2663";//fiori
                    else mdc[c][1]="\u2660";            //picche

                    //!!! vedete che inserisco nella carta, alla colonna 0, il valore
                    if(valore==1) mdc[c][0]="A";
                    else if(valore>1 && valore<11) mdc[c][0]= ""+ valore;
                    else if(valore==11) mdc[c][0]= "J";
                    else if(valore==12) mdc[c][0]= "Q";
                    else mdc[c][0]= "K";

                    c++;        //Incremento il puntatore delle carte, per poter passare alla prossima 
                    
                    //L'indice della carta potevamo calcolarlo
                    //invece di usare un contatore.
                    //Vedete però che è più semplice l'uso di un contatore
                    //mdc[mazzo*4*13+mazzo*2+seme*13+(valore-1)]
                }
            }
            //!!!
            mdc[c][0]= "jolly";          //Aggiungiamo a mano due jolly
            mdc[c][1]= "\ud83c\udccf";
            c++;
            
            mdc[c][0]= "jolly";          //Aggiungiamo a mano due jolly
            mdc[c][1]= "\ud83c\udccf";
            c++;

            
            //Anche qui il valore della carta potevamo calcolarlo
            //mdc[mazzo*4*13+mazzo*2+4*13]
            //mdc[mazzo*4*13+mazzo*2+4*13+1]
        }
        
        
        
        //Stampo le carte
        for(int i=0; i<mdc.length; i++)
        {
            //!!! Adattato usando la matrice
            if(mdc[i][0].equals("A\u2661")) System.out.println("\n");   //Vado a capo all'inizio di ogni mazzo, lo identifico dalla presenza dell'Asso di Cuori
            else if(mdc[i][0].charAt(0)=='A') System.out.println("");   //Vado a capo prima di ogni asso
            else if(mdc[i][0].equals("jolly")) System.out.println("");  //Vado a capo prima di ogni joker
            
            //!!! Adattato usando la matrice
            System.out.print( mdc[i][0] + mdc[i][1] + "\t");                        
        }
        System.out.println("");
        
        
        
        
        
        
        //--------------------------------------------------------------------
        //Mischiamole
        
        //Per poter mischiare le carte utilizzeremo il metodo random()
        //contenuto nella libreria Math.
        //ATTENTI: per le ragioni chie vi so ho spiegato i numeri NON sono veri numeri casuali
        //         sono però sufficientemente casuali per l'uso nei giochi
        
        double aCaso= Math.random();    //Fornisce un numero casuale fra 0 e 1: [0..1[   1 non compreso
        
        //Passo 1
        //Otteniamo il numero di combinazioni volute, ad esempio 6 (per simulare un dado)
        int caso= (int)(Math.random() * 6);     //Otterremo 6 cominazioni diverse, da 0 a 5
        
        //Passo 2
        //Aggiungiamo il numero più piccolo che vogliamo ottenere, nel nostro caso 1
        caso= (int)(Math.random() * 6)+1;
        
        
        //Formula generale: se vogliamo ottenere numeri casuali fra 
        //      min
        //e
        //      max
        //la formula generale è la seguente
        int min= -5;    //Numero minimo 
        int max= 3;     //Numero massimo
        caso= (int)(Math.random() * (max-min+1) )+min;      //Numeri interi [-5..3]
        
        min= 10;    //Numero minimo 
        max= 27;     //Numero massimo
        caso= (int)(Math.random() * (max-min+1) )+min;      //Numeri interi [10..27]
        
        min= (int)'a';    //Numero minimo 
        max= (int)'z';    //Numero massimo
        caso= (int)(Math.random() * (max-min+1) )+min;      //Lettera fra ['a'..'z']
        char letteraACaso= (char)caso;
        
        
        
        
        
        //Per mischiare il mazzo, sceglieremo una carta a caso e la scambieremo
        //con la prima carta del mazzo
        //Effettueremo l'operazione il doppio delle volte rispetto alle carte disponibili
        for(int i=0; i<mdc.length*2; i++)
        {
            //Scegliamo una carta a caso
            int rnd= (int)(Math.random()*mdc.length);
            
            //!!! Avendo una matrice devo copiare sia la carta che il seme
            String tmp= mdc[0][0];     //Carta in cima al mazzo
            mdc[0][0]= mdc[rnd][0];    //la scambio con la careta scelta a caso
            mdc[rnd][0]= tmp;          //La carta che era in cima al mazzo la inserisco nel mazzo
            
            tmp= mdc[0][1];            //Carta in cima al mazzo
            mdc[0][1]= mdc[rnd][1];    //la scambio con la careta scelta a caso
            mdc[rnd][1]= tmp;          //La carta che era in cima al mazzo la inserisco nel mazzo            
        }
        
        
        
        System.out.println("\n\n\n---------------------------------------");
        for(int i=0; i<mdc.length; i++)
        {
            if(i!=0 && i%15==0) System.out.println("");
            
            //!!!
            System.out.print( mdc[i][0] + mdc[i][1] + "\t");                        
        }
        System.out.println("");

        in.close();
        
    }
}
