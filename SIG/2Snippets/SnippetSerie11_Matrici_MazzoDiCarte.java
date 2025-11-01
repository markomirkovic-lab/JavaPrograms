import java.util.Scanner;

public class SnippetSerie11_Matrici_MazzoDiCarte 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
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
        
        
        
        //Mazzo di carte
        //   4 semi     cqfp cuori (cuore) quadri (rombo) fiori (trifoglio) picche (punta di lancia o quore roversciato)
        //  13 carte    A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J (fante), Q (queen), K (king)
        //   2 jolly
        /*
        1 mazzo = 54 carte:
        Ac 2c 3c 4c 5c 6c 7c 8c 9c 10c Jc Qc Kc 
        Aq 2q 3q 4q 5q 6q 7q 8q 9q 10q Jq Qq Kq 
        Af 2f 3f 4f 5f 6f 7f 8f 9f 10f Jf Qf Kf 
        Ap 2p 3p 4p 5p 6p 7p 8p 9p 10p Jp Qp Kp 
        jolly jolly 
        */
        int mazziDiCarte = 1;
        String[] mdc= new String[mazziDiCarte*(4*13+2)];//6 mazzi, 4 semi, 13 carte e 2 jolly
        // dimensione array per il totale di carte

        //4 cicli (che totaliazzano la dimensione dell'array):
        // for per mazzo/mazzi di carte
        //  for per semi
        //   for per valori
        
        int c=0;                                        //punterà alla carta da generare ogni volta
        for(int mazzo=0; mazzo<mazziDiCarte; mazzo++)   //Ciclo sui mazzi di carte
        {
            for(int seme=0; seme<4; seme++)             //Ciclo sui semi, ogni mazzo ne ha 4
            {
                for(int valore=1; valore<=13; valore++) //Ciclo sulle carte, ogni seme ne ha 13
                                {
                    char semeCarta;                     //In base al seme, determino il carattere
                    if(seme==0) semeCarta='c';
                    else if(seme==1) semeCarta='q';
                    else if(seme==2) semeCarta='f';
                    else semeCarta='p';

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
        
        // Stampa mazzo/i di carte
        for(int i=0; i<mdc.length; i++)
        {
            System.out.print( mdc[i] + " ");
        }

        in.close();
    }
}
