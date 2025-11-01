/*
7.3 Arrotondamenti
La variabile pi contiene il valore 3.141592654.
Scrivete un programma che consente di arrotondare pi a due cifre significativa (3.14).
*/

public class Es7_3_Arrotondamenti {

    public static void main(String[] args) {
        
        double pi = 3.141592654;

        System.out.printf("%.2f%n", pi);

        //---

        //Math.round(pi) = 3.0, tronca le decimali
        //                 double   double
        pi = Math.round(pi*100.0) / 100.0;
        //   Math.round(3.141592654 * 100) / 100
        //   Math.round(314.1592654) / 100
        //   314 / 100 = 3.14

        System.out.println(pi);

        //---

        int piIntero = (int) pi;            //3
        double piDecimale = (pi % (int) pi);//0.14592654
        piDecimale = (piDecimale * 100);    //14.1592654
        piDecimale = (int) piDecimale;      //14
        piDecimale = piDecimale / 100;      //0.14

        //   3        + 0.14
        pi = piIntero + piDecimale;

        System.out.println(pi);
        
    }
    
}
