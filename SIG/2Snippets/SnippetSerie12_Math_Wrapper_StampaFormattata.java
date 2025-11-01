package javaapplication2;

public class SnippetsSerie12_Math_Wrapper_StampaFormattata 
{
    public static void main(String[] args) 
    {
        //Dichiariamo primitivi a wrapper
        double primitivo=7.3;
        Double wrapper=12.5;
        
        
        //Classi wrapper. Costanti utili
        if(  7.3/0.0 == Double.POSITIVE_INFINITY ||
            -7.3/0.0 == Double.NEGATIVE_INFINITY )
        {
            System.out.println("Infinito");
        }
        
        
        //Wrapper, converte una stringa
        String numero="12.47e3";
        wrapper= Double.parseDouble(numero);
        System.out.println(wrapper);
        
        
        primitivo=wrapper;                  //Questo equivale a scrivere...
        primitivo=wrapper.doubleValue();    //Unboxing
        
        wrapper=primitivo;                  //Questo equivale a scrivere...
        wrapper=new Double(primitivo);      //Boxing
        
        
        //Random
        int caso;
        
        caso= (int)(Math.random()*6)+1;     //Un dado ha 6 valori che iniziano da 1
        
        caso= (int)(Math.random()*3);       //Morra cinese ha 3 valori. 0:Sasso, 1:Carta, 2:Forbice
        
        //Caso generale, ad esempio vogliamo generare numeri
        //a caso da -5 a 3.
        int min=-5;     //Valore minimo che vogliamo ottenere
        int max=3;      //Valore massimo che vogliamo ottenere
        caso= (int)(Math.random()*(max-min+1))+min;
        
        //Altro esempio: valori da 10 a 27
        min=10;     //Valore minimo che vogliamo ottenere
        max=27;      //Valore massimo che vogliamo ottenere
        caso= (int)(Math.random()*(max-min+1))+min;
        
        
        
        
        //Stampa formattata
        String str="ciao";
        int intero=123;
        double virgola=Math.PI;
        System.out.printf("[%s] [%d] [%f]\n", str, intero, virgola);
        System.out.printf("[%10s] [%10d] [%10.3f]\n", str, intero, virgola);
        System.out.printf("[%-10s] [%-10d] [%-10.2f]\n", str, intero, virgola);
        
        int spazi=7;
        System.out.printf("[%" + spazi + "s] [%" + spazi + "d] [%-10.2f]\n", str, intero, virgola);
    }
    
}
