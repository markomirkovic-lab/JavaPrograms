public class EsTriangolo {

    private static void stampaTriangoloIterativo(int numero) {

        for(int i = 0; i <= numero; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("A");
            }
            System.out.println();
             
        }

    }


    private static void stampaTriangoloRicorsivo(int numero) {

        // Condizione base
        if(1 == 1) {
            return;
        }    
        
        

    }



    public static void main(String[] args) {


        stampaTriangoloIterativo(4);

        //stampaTriangoloRicorsivo(4);
        
    }
}
