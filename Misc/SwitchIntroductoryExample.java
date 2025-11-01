import java.util.Scanner;

public class SwitchIntroductoryExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Scrivi il numero della settimana: ");

        int userInput = input.nextInt();
        
        String nomeGiorno;

        if (userInput == 1) {
            nomeGiorno = "Luendi'";
        } else if (userInput == 2) {
            nomeGiorno = "Martedi'";
        } else if (userInput == 3) {
            nomeGiorno = "Mercoledi'";
        } else if (userInput == 4) {
            nomeGiorno = "Giovedi'";
        } else if (userInput == 5) {
            nomeGiorno = "Venerdi'";
        } else if (userInput == 6) {
            nomeGiorno = "Sabato";
        } else if (userInput == 7) {
            nomeGiorno = "Domenica'";
        } else {
            nomeGiorno = "Giorno non valido";
        }

        System.out.println("Il giorno e': " + nomeGiorno);


        //--

        //System.out.print("Scrivi il numero della settimana: ");

        //userInput = input.nextInt();
        

        switch(userInput) {

            
            case 1:
                nomeGiorno = "Lunedi'";
                break;
            
            case 2:
                nomeGiorno = "Martedi'";
                break;

            case 3:
                nomeGiorno = "Mercoledi'";
                break;

            case 4:
                nomeGiorno = "Giovedi'";
                break;

            case 5:
                nomeGiorno = "Venerdi'";
                break;

            case 6:
                nomeGiorno = "Sabato";
                break;

            case 7:
                nomeGiorno = "Domenica";
                break;

            default:
                nomeGiorno = "Giorno non valido";
    

        }

        System.out.println("Il giorno e' (bis): " + nomeGiorno);
    }
    
}
