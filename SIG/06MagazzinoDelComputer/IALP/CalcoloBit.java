public class CalcoloBit {
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

        System.out.println("Bit per tipo di dati primitivi in Java:");
        System.out.println("byte: " + Byte.SIZE + " bit");
        System.out.println("short: " + Short.SIZE + " bit");
        System.out.println("int: " + Integer.SIZE + " bit");
        System.out.println("long: " + Long.SIZE + " bit");
        System.out.println("float: " + Float.SIZE + " bit");
        System.out.println("double: " + Double.SIZE + " bit");
        System.out.println("char: " + Character.SIZE + " bit");
        
        // Per i booleani non è definito:
        System.out.println("boolean: non specificato, dipende dall'implementazione della JVM");
    }
}

