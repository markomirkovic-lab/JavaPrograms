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

public class Es9_7_TipoDiTriangoloV2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double a,b,c;   
        String risultato= "";       
 
        System.out.print("Inserisci i tre lati di un triangolo: "); 
        a = input.nextDouble(); 
        b = input.nextDouble(); 
        c = input.nextDouble(); 
        input.nextLine(); 

        if(a > 0 && b > 0 && c > 0) {

            if(a==b & b==c) {
                risultato = "Equilatero";
            } else if( (a==b && a!=c) ||
                       (a==c && a!=b) ||
                       (b==c && b!=a) ) {
                risultato = "Isoscle";
            } else {
                risultato = "Saleno";
            }
    
            if( (a*a) == (b*b+c*c) ||
                (b*b) == (a*a+c*c) ||
                (c*c) == (a*a+b*b) ) {
                    risultato += " rettangolo";
                }
    
            System.out.println(risultato);
        } else {
            System.out.println("Inserire tre valori maggiori di 0.");
        }

        

        input.close();
    }
    
}
