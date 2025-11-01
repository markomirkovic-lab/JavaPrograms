
public class CopiaDelRiferimentoEModifica0 {
    public static void main(String[] args) {
        
        int[] v = {3, 72, 4, 1};
        int[] w = v; // copia del riferimento

        System.out.print("v = ");
        for(int element : v) {
            System.out.print(element + " ");
        }

        System.out.print("\nw = ");
        for(int element : w) {
            System.out.print(element + " ");
        }

        System.out.println("\n\nv.equals(w): " + v.equals(w));
        
        /*
        v = 3 72 4 1 
        w = 3 72 4 1

        v.equals(w): true
        */

    }
    
}
