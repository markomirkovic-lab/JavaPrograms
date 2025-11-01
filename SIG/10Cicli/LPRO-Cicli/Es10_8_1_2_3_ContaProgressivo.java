/*
Reallizzate un algoritmo che conti (stampando a schermo)
*/

public class Es10_8_1_2_3_ContaProgressivo {
    
    public static void main(String[] args) {


        //  da 1 a 10
        for(int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        
        // 1 2 3 4 5 6 7 8 9 10 

        System.out.println();//--

        // da 10 a 1
        for(int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();//--

        // da 1 a 10, ogni 4
        int n = 10;
        for(int i = 4; i < n; i += 4) {
                System.out.print(i + " ");  
        }




    }
}
