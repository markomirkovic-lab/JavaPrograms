/*
9.7 Triangolo
Si scriva un programma che legga da tastiera i valori delle lunghezze dei tre lati di un
triangolo (detti A, B e C), e determini:
• se il triangolo è equilatero
• se il triangolo è isoscele
• se il triangolo è scaleno
• se il triangolo è rettangolo
*/

import java.util.Scanner;

public class Es9_7_TipoDiTriangolo {

    // Metodo semplice per calcolare la radice quadrata
    public static double radiceQuadrata(double numero) {
        double stima = 0.0; // Valore iniziale
        double incremento = 0.00000001; // Precisione

        // Incremento progressivo per trovare la radice quadrata
        while (stima * stima < numero) {
            stima += incremento;
        }

        return stima;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cnt = 0;
        double latoA;
        double latoB;
        double latoC;
        String tipoDiTriangolo = "";
        double latoIpotenusa;

        System.out.println("Determinare un triangolo in base ai lati\n****************************************");

        do {
            System.out.print("Inserisci primo lato: ");
            latoA = input.nextDouble();
            input.nextLine();

            System.out.print("Inserisci secondo lato: ");
            latoB = input.nextDouble();
            input.nextLine();

            System.out.print("Inserisci terzo lato: ");
            latoC = input.nextDouble();
            input.nextLine();

            cnt++;

        } while (cnt < 1);

        if (latoA > 0 && latoB > 0 && latoC > 0) {

            latoIpotenusa = latoA;

            if (latoIpotenusa < latoB)
                latoIpotenusa = latoB;
            if (latoIpotenusa < latoC)
                latoIpotenusa = (float) latoC;

            if (latoA == latoB && latoB == latoC) {
                tipoDiTriangolo = "equilatero";
            } else {
                if ((latoA == latoB && latoB != latoC) ||
                        (latoA == latoC && latoC != latoB) ||
                        (latoB == latoC && latoC != latoA)) {
                    tipoDiTriangolo = "isoscele";
                }
                if ((latoA != latoB) && (latoB != latoC) && (latoA != latoC)) {
                    tipoDiTriangolo = "scaleno";
                }

            }

            if (latoC == (float) (radiceQuadrata((latoA * latoA) + (latoB * latoB)))) {
                tipoDiTriangolo += " e rettangolo";
            }
            if (latoB == (float) (radiceQuadrata((latoA * latoA) + (latoC * latoC)))) {
                tipoDiTriangolo += " e rettangolo";
            }
            if (latoA == (float) (radiceQuadrata((latoB * latoB) + (latoC * latoC)))) {
                tipoDiTriangolo += " e rettangolo";
            }

            /*
            System.out.println(latoC);
            System.out.println(radiceQuadrata((latoA * latoA) + (latoB * latoB)));
            System.out.println(latoB);
            System.out.println(radiceQuadrata((latoA * latoA) + (latoC * latoC)));
            System.out.println(latoA);
            System.out.println(radiceQuadrata((latoB * latoB) + (latoC * latoC)));
            */


        } else {
        System.out.println("Inserire tre valori maggiori di 0.");
        }

        input.close();

        System.out.println("Il triangollo e' del tipo: " + tipoDiTriangolo);

    }

}
