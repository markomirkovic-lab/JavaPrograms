import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class FormatArrayNumber {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.#####");

        double doubleTest = 76.08299578138121;
        String test = df.format(doubleTest);
        System.out.println(test);
        System.out.println();

        df.setRoundingMode(RoundingMode.CEILING);
        //10.724830866731494
        //10.72484

        for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324)) {
            Double d = n.doubleValue();
            System.out.println(df.format(d));
        }
        System.out.println();

        int righe = 4, colonne = 10;

        double[][] laMiaMatrice = new double[righe][colonne];

        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++) {
                laMiaMatrice[i][j] = Math.random() * 100;
            }

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print((laMiaMatrice[i][j]) + " ");
                //System.out.print(Arrays.toString(laMiaMatrice[i]) + " ");
                //System.out.print(Arrays.toString(laMiaMatrice));
            }
        System.out.println("");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++) {
                Double d = laMiaMatrice[i][j];
                System.out.print(df.format(d) + " ");
            }

        System.out.println();
        System.out.println();
    
        df.setRoundingMode(RoundingMode.FLOOR);
        //41.26779979227516 
        //41.26779

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                Double d2 = laMiaMatrice[i][j];
                System.out.print(df.format(d2) + " ");
            }
        }
        
        System.out.println("----");
        System.out.println();
        System.out.println();

        //righe
        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++) {
                
                double d3 = Math.round(laMiaMatrice[i][j] * 100000.0) / 100000.0;
                System.out.print(d3 + " ");
            }

        //5 decimali -> 5 zeri -> 100000.0

        //40.484414956246404
        //40.48441
        
        //82.10697664638055
        //82.10698

        System.out.println();
        System.out.println();

        double variable = 3.141592654;
        variable = Math.round(variable*100.0) / 100.0;
        //   Math.round(3.141592654 * 100) / 100
        //   Math.ronund(314.1592654) / 100
        //   314 / 100 = 3.14

        System.out.println(variable);
      

    }
    
}
