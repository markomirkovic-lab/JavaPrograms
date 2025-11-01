package labolpronovembreimpiccato;

import java.util.Scanner;

public class Variante_0_Base 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Inserisci la parola da indovinare: ");
        String parola= in.nextLine().trim().toUpperCase();
        
        //Stampo delle righe a vuoto per "cancellare lo schermo"
        for(int i=0; i<25; i++)
        {
            System.out.println("");
        }
        System.out.println("=================================================");
        
        
        
        //Variabili del gioco
        int lunghezza= parola.length();     //Memorizza quanto è lunga la frase da indovinare
        String lettereIndovinate= "";       //Memorizzerà le lettere indovinate
        String lettereSbagliate= "";        //Memorizzerà le lettere errate        
        int restanti= lunghezza;            //Conta quante lettere non abbiamo ancora indovinato
        
                
        do
        {
        } while(restanti>0);                
    }
}
