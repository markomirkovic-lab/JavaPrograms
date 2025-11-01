public class EsempioPrePostIncremento {
    public static void main(String[] args) {
        
        int z = 7;

        z += 1;//z = z + 1;

        System.out.println(z);

        System.out.println("---");

        int a = 0;
        int b = a++; // a = a ; a = a ; a = a + 1   operatore post-incremento
                     // prima viene assegnato il valore di a a b e poi a viene incremento

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("---");

        int c = 0;
        int d = ++c; // c = c + 1; d = c   operatore pre-incremento
                     //prima incrementa il valore della variabile e poi viene utilizzato

        System.out.println("c: " + c);
        System.out.println("d: " + d);

        //pre e post incremento vanno bene per incrementare o decrementare di 1

        //+++

        

        

    }
    
}
