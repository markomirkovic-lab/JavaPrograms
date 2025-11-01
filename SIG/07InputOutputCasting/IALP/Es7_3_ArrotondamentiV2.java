/*
7.3 Arrotondamenti
La variabile pi contiene il valore 3.141592654.
Scrivete un programma che consente di arrotondare pi a due cifre significativa (3.14).
*/
import java.util.Scanner;;

public class Es7_3_ArrotondamentiV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero con decimali: ");
        double variable = input.nextDouble();

        System.out.printf("%.2f%n", variable);

        //---

        //Math.round(variable) = 3.0, tronca le decimali
        //                 double   double
        variable = Math.round(variable*100.0) / 100.0;
        //   Math.round(3.141592654 * 100) / 100
        //   Math.ronund(314.1592654) / 100
        //   314 / 100 = 3.14

        System.out.println(variable);

        //---

        int variableIntero = (int) variable;            //3
        double variableDecimale = (variable % (int) variable);//0.14592654
        variableDecimale = (variableDecimale * 100);    //14.1592654
        variableDecimale = (int) variableDecimale;      //14
        variableDecimale = variableDecimale / 100;      //0.14

        //   3        + 0.14
        variable = variableIntero + variableDecimale;

        System.out.println(variable);

        input.close();
        
    }
    
}
