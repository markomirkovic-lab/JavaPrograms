import java.util.Scanner;

public class SnippetSerie11_Matrici_Random_MazzoDiCarte 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        //--------------------------------------------------------------------
        //Riassunto Matrici
        int[] array= { 2,3,4,5};
                                         //     0 1 2 3 
        int[][] matrice= { {1,1,1,1},    //  0  1 1 1 1
                           {2,2,7,2},    //  1  2 2 7 2       Coordinata del 7 matrice[1][2]
                           {3,3,3,3} };  //  2  3 3 3 3

        
                                         //     0 1 2 3 4
        int[][] m= { {1,1,1},            //  0  1 1 1 
                     {2,2,2,2,2},        //  1  2 2 2 2 2
                     {3,3}        };     //  2  3 3 

        
        for(int r=0; r<m.length; r++)
        {
            for(int c=0; c<m[r].length; c++)    // m[r].length!!!!!!!
            {
                System.out.print("[" + m[r][c] + "] ");
            }
            System.out.println("");
        }  
        
        
        
        //--------------------------------------------------------------------
        //Mazzo di carte
        //   4 semi     cqfp
        //  13 carte    A, 2..10, J, Q, K
        //   2 jolly
        String[] mdc= new String[6*(4*13+2)];           //6 mazzi, 4 semi, 13 carte e 2 jolly
        
        int c=0;                                        //punterà alla carta da generare ogni volta
        for(int mazzo=0; mazzo<6; mazzo++)              //Ciclo sui mazzi di carte
        {
            for(int seme=0; seme<4; seme++)             //Ciclo sui semi, ogni mazzo ne ha 4
            {
                for(int valore=1; valore<=13; valore++) //Ciclo sulle carte, ogni seme ne ha 13
                                {
                    char semeCarta;                     //In base al seme, determino il carattere
                    if(seme==0) semeCarta='\u2661';     //cuori
                    else if(seme==1) semeCarta='\u2664';//quadri
                    else if(seme==2) semeCarta='\u2663';//fiori
                    else semeCarta='\u2660';            //picche

                    String carta;                       //In base al valore determino la carta
                    if(valore==1) carta="A";
                    else if(valore>1 && valore<11) carta= "" + valore;
                    else if(valore==11) carta= "J";
                    else if(valore==12) carta= "Q";
                    else carta= "K";

                    mdc[c++]= carta + semeCarta;   
                    
                    //L'indice della carta potevamo calcolarlo
                    //invece di usare un contatore.
                    //Vedete però che è più semplice l'uso di un contatore
                    //mdc[mazzo*4*13+mazzo*2+seme*13+(valore-1)]= carta + semeCarta;
                }
            }
            mdc[c++]= "jolly";          //Aggiungiamo a mano due jolly
            mdc[c++]= "jolly";
            
            //Anche qui il valore della carta potevamo calcolarlo
            //mdc[mazzo*4*13+mazzo*2+4*13]= "jolly";
            //mdc[mazzo*4*13+mazzo*2+4*13+1]= "jolly";
        }
        
        
        
        //Stampo le carte
        for(int i=0; i<mdc.length; i++)
        {
            if(mdc[i].equals("A\u2661")) System.out.println("\n");   //Vado a capo all'inizio di ogni mazzo, lo identifico dalla presenza dell'Asso di Cuori
            else if(mdc[i].charAt(0)=='A') System.out.println("");   //Vado a capo prima di ogni asso
            else if(mdc[i].equals("jolly")) System.out.println("");  //Vado a capo prima di ogni joker
            
            System.out.print( mdc[i] + "\t");                        
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
            
            String tmp= mdc[0];     //Carta in cima al mazzo
            mdc[0]= mdc[rnd];       //la scambio con la careta scelta a caso
            mdc[rnd]= tmp;          //La carta che era in cima al mazzo la inserisco nel mazzo
        }
        
        
        
        System.out.println("\n\n\n---------------------------------------");
        for(int i=0; i<mdc.length; i++)
        {
            if(i!=0 && i%15==0) System.out.println("");
            
            System.out.print( mdc[i] + "\t");                        
        }
        System.out.println("");
        
    }
}
