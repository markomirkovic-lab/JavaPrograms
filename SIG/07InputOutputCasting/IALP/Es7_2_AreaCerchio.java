/*
7.2 Area
Un programma per calcolare l’area del cerchio ha definito le seguenti variabili
 float raggio;
 int area; 
 final double PI=3.14;
Scrivete il resto del programma che dovrà:
- Leggere il raggio immesso dall’utente
- Calcolare e stampare l’area
*/
import java.util.Scanner;

public class Es7_2_AreaCerchio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;
        float raggio = 1;
        int areaCerchio = 0;
        boolean corretto;

        do{

            System.out.print("Inserire raggio: ");


            if(input.hasNextFloat()) {
                raggio = input.nextFloat();
                corretto = true;
            } else {
                System.out.println("Input errato. Riprova!");
                input.nextLine();
                corretto = false;
            }
        } while(!corretto);


        //1
        areaCerchio = (int) ((double) (raggio * raggio * PI));
        System.out.println("Con raggio " + raggio + " l'areaCerchio e': " + areaCerchio);
        System.out.println();
        //2
        areaCerchio = (int) raggio * (int) raggio * (int) PI;
        System.out.println(areaCerchio);
        System.out.println();
        //3
        areaCerchio = (int) (raggio*raggio*PI);//(casting implicito da float a double)
        System.out.println(areaCerchio);
        System.out.println();

        input.close();

    }
    
}
