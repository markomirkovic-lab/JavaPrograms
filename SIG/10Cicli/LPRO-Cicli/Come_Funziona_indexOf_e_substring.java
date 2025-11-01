/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.util.Scanner;

/**
 *
 * @author giuda
 */
public class Come_Funziona_indexOf_e_substring {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        
        //Cercare due marker in una stringa
        //e prelevare quanto sta in mezzo
         
        //           01234567890123456789012345
        String tmp= "tanto va la <gatta> al lardo";
        
        int inizio=-1, fine=-1;
        String finale="";

        /*
        System.out.print("Inserisici inizio: ");
        inizio = input.nextInt();
        input.nextLine();

        System.out.print("Inserisici fine: ");
        fine = input.nextInt();
        input.nextLine();
        */
       
        for(int i=0; i<tmp.length(); i++)
        {
            if(tmp.charAt(i)=='<')
            {
                inizio=i;
                break;
            }
        }
        
        for(int i=0; i<tmp.length(); i++)
        {
            if(tmp.charAt(i)=='>')
            {
                fine=i;
                break;
            }
        }    
        
        
        if(inizio>=0 && fine>=0)
        {
            
            for(int i=inizio+1; i<fine; i++)
            {
                finale+= tmp.charAt(i);
            }
        }
        
        System.out.println("index inizio : " + (inizio));
        System.out.println("index fine   : " + (fine-1));
        System.out.println(finale);
        
    }
    
}
