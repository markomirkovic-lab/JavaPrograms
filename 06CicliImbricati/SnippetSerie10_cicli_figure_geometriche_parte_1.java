/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gisi
 */
public class SnippetSerie10_cicli_figure_geometriche_parte_1 
{
    public static void main(String[] args) 
    {
        /*
            Se dovete disegnare una figura geometrica a due dimensioni
            1. Disegnatela su un foglio
            2. Scrivete di fianco alle righe l'indice della riga
            3. Scrivete sotto le colonne l'indice della colonna
            4. Esempio, la figura seguente è un quadrato 5x5
        
                0*****    
                1 *  *    
                2  * *    
                3   **    
                4    *    
                 01234       
        
            5. Scrivete il motore che vi permette di far passare tutte le celle della figura geometrica
        */
        
        int dimensione= 5;
        
        for(int riga=0; riga<dimensione; riga++)
        {
            for(int colonna=0; colonna<dimensione; colonna++)
            {
               System.out.print(" ");   //Stamperà la cella vuota
            }
            System.out.println("");     //Questo va a capo dopo aver stampato ogni riga
        }
        
        
        /*
            6. Ora troviamo le regole che ci dicono dove stampare la cella
                0*****    
                1 *  *    
                2  * *    
                3   **    
                4    *    
            7. Le regole sono:
                    A. sulla prima riga
                    B. sull'ultima colonna
                    C. ogni volta che riga equivale a colonna
        */
        dimensione= 5;
        for(int riga=0; riga<dimensione; riga++)
        {
            for(int colonna=0; colonna<dimensione; colonna++)
            {
                //Inserisco qui le regole. Perché qui? Semplice:
                //è l'unico posto dell'algoritmo che pass ain rassegna tutte le
                //combinazioni di riga e colonna
                if( riga==0 ||                  //Regola A
                    colonna== dimensione-1 ||   //Regola B
                    riga==colonna)              //Regola C
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");     //Questo va a capo dopo aver stampato ogni riga
        }       
        
        
        
        System.out.println("\n\n\n\n");
        /*
            Secondo esercizio. 
            Disegniamo questa figura:
        
                *
               **
              * *
             *  *
            *****  
        
            Le regole sono:
                ultima riga
                ultima colonna
                somma di riga e colonna è pari alla dimensione-1        
        */
        
        dimensione= 5;
        for(int riga=0; riga<dimensione; riga++)
        {
            for(int colonna=0; colonna<dimensione; colonna++)
            {
                //Inserisco qui le regole. Perché qui? Semplice:
                //è l'unico posto dell'algoritmo che pass ain rassegna tutte le
                //combinazioni di riga e colonna
                if( riga==dimensione-1 ||       //Regola A
                    colonna== dimensione-1 ||   //Regola B
                    riga+colonna==dimensione-1) //Regola C
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");     //Questo va a capo dopo aver stampato ogni riga
        } 
    }
    
}
