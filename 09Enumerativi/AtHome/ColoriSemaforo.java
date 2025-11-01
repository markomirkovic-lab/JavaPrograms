enum Semaforo {
    ROSSO, GIALLO, VERDE
}


public class ColoriSemaforo {
    public static void main(String[] args) {
        
        Semaforo colore = Semaforo.VERDE;


        if(colore == Semaforo.VERDE) {
            System.out.println("Go!");
        } else if( colore == Semaforo.GIALLO) {
            System.out.println("Prepare!");
        } else {
            System.out.println("Wait!");
        }

        //Go

        Semaforo adesso;
        adesso = Semaforo.VERDE;
        

        int index = adesso.ordinal();
        System.out.println(index);//2
        System.out.println(Semaforo.VERDE.ordinal());//2

       
       
        //String[] coloriSemaforoo;
        
        //coloriSemaforoo = ColoriSemaforo.values();
        

        //String adessoString = Semaforo.valueOf(adesso);

        System.out.println((Semaforo.VERDE));//VERDE
       

        // valueOf()
        Semaforo verde = Semaforo.valueOf("VERDE");
        System.out.println(verde);//VERDE
    

        String verdeString = Semaforo.VERDE + "";
        System.out.println(verdeString.toLowerCase());//verde
        String verdeString2 = verde.toString();
        System.out.println(verdeString2.toLowerCase());//verde
        String verdeString3 = Semaforo.VERDE.toString();
        System.out.println(verdeString3.toLowerCase());//verde

        System.out.println(Semaforo.values() [2]);//VERDE

        int counter = 0;

        for (Semaforo colori : Semaforo.values()) {
            System.out.print("colori semaforo " + (colori.ordinal()+1) + " : " + colori);
            if(colori.ordinal() < Semaforo.values().length - 1) {
                System.out.print(", ");
            }
            counter++;
        }
        
        //System.out.println(Semaforo.values().length);//3



    }
}
