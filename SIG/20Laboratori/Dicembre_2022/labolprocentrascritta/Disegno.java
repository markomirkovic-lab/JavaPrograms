/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labolprocentrascritta;

/**
 *
 * @author gisi
 */
public class Disegno 
{
    public static void main(String[] args) {
        int righe=9;
        int colonne=9;
        int ultimariga=righe-1;
        int ultimacolonna=colonne-1;
        
        
        /*
        
            #########
            ##     # 
            # #   #  
            #  # #   
            #   #    
            #  # #   
            # #   #  
            ##     # 
            #       #
        
        */
        
        for(int r=0; r<righe; r++)
        {
            for(int c=0; c<colonne; c++)
            {
                if(r==0 && c==0 ||                          //Se è la prima riga e la prima colonna OPPURE
                   r==0 && c==ultimacolonna ||              //Se è la prima riga e l'ultima colonna OPPURE
                   r==ultimariga && c==0 ||                 //Se è l'ultima riga e la prima colonna OPPURE
                   r==ultimariga && c==ultimacolonna ||     //Se è l'ultima riga e l'ultima colonna OPPURE
                   r==c ||                                  //Se è la prima diagonale OPPURE
                   r+c==colonne-1 ||                        //Se è la seconda diagonale OPPURE
                   r==0 ||                                  //Se è la prima riga OPPURE
                   c==0)                                    //Se è la prima colonna
                {
                    System.out.print("#");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
