/*
6.5 Memoria
Quanta memoria occupa questo programma? Ci sono istruzioni che ancora non conoscete 
all’interno ma provate a cercare le dichiarazioni di variabili.
*/

public class Es6_5_Memoria {

    public static void main(String[] args) {


        /*
        Tipo	Dimensione (bit)	Valore minimo	Valore massimo	        Esempio
        byte	8	                -128	        127	                    byte b = 10;
        short	16	                -32,768	        32,767	                short s = 200;
        int	    32	                -2^31	        2^31 - 1	            int i = 1000;
        long	64	                -2^63	        2^63 - 1	            long l = 5000L;
        float	32	                ±1.4E-45	    ±3.4028235E38	        float f = 3.14f;
        double	64	                ±4.9E-324	    ±1.7976931348623157E308	double d = 3.14;
        char	16	                '\u0000' (0)	'\uffff' (65,535)	    char c = 'A';
        boolean	1 (non specificato)	false	        true	                boolean flag = true;
        */

        String saluti;
        int i;                                  //32 bit
        double f;                               //64 bit
        
        saluti="Benvenuti in Java";             //16 bit per carattere
                                                //16 * 17 = 272 bit
        
        for(int j=0; j<saluti.length(); j++)    //32 bit
        System.out.println(saluti.charAt(j));
        
        long t=saluti.length();                 //64 bit
        System.out.println(t);

                                    //Totale 32+64+16*17+32+64=464bit

        System.out.println("totale bit: " + (int) (Integer.SIZE+Double.SIZE+(saluti.length()*Character.SIZE)+Integer.SIZE+Long.SIZE)); 

        /*
        totale bit: 464
        272
        */
    }
    
}
