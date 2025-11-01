import java.util.Scanner;

public class SnippetSerie09_switch 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        char romano;
        int decimale;

        System.out.print("Inserisci una cifra romana: ");
        romano = in.nextLine().trim().charAt(0);
        
        switch (romano) 
        {
            case 'i':               //Inserite con dei case successivi tutte le opzioni che devono reagire allo stesso modo, equivale ad un or || nell'if
            case 'I':
                decimale = 1;
                break;
            case 'v':
            case 'V':
                decimale = 5;
                break;
            case 'x':
            case 'X':
                decimale = 10;
                break;
            case 'l':
            case 'L':
                decimale = 50;
                break;
            case 'c':
            case 'C':
                decimale = 100;
                break;
            case 'd':
            case 'D':
                decimale = 500;
                break;
            case 'm':
            case 'M':
                decimale = 1000;
                break;
            default:
                decimale = 0; //Per qualsiasi altra possibilità lo imposto a 0 
        }

        if (decimale == 0) 
        {
            System.out.println("Opzione non possibile");
        }
        else
        {
            System.out.println("Il valore della cifra " + romano + " è " + decimale);            
        }
    }
}
