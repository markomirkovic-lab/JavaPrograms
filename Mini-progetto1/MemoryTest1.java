import java.util.*;

class Constants {
    static final int MAX_NR_CELLS = 186;
}
class ConsoleInteractionUtils {
    Scanner scanner = new Scanner(System.in);

    int richiestaNumeroGiocatori() {
        int numeroGiocatori;
        do {
            System.out.println("In quanti giocatori vuoi giocare? (Minimo 2, massimo 6)");
            while (!scanner.hasNextInt()) {
                System.out.println("Devi inserire un numero valido.");
                emptyTheScanner();
            }
            numeroGiocatori = scanner.nextInt();
            emptyTheScanner();
            if (numeroGiocatori < 2 || numeroGiocatori > 6) {
                System.out.println("Il numero di giocatori deve essere tra 2 e 6.");
            }
        } while (numeroGiocatori < 2 || numeroGiocatori > 6);
        return numeroGiocatori;
    }

    String controlloLunghezza(String nomeGiocatore){
        while(nomeGiocatore.isEmpty()){
            System.out.println("Nome non valido");
            nomeGiocatore = scanner.nextLine();
        }
        return nomeGiocatore;
    }
    String controlloSpaziNome(String nomeGiocatore){
        for(int i = 0; i<nomeGiocatore.length(); i++){
            while(nomeGiocatore.charAt(i) == ' '){
                System.out.print("il nickname non può contenere spazi, inserisci nuovo nickname: ");
                nomeGiocatore = scanner.nextLine();
            }
        }
        return nomeGiocatore;
    }
    String controlloNumeriNome(String nomeGiocatore) {
        for (int i = 0; i < nomeGiocatore.length(); i++) {
            char carattere = nomeGiocatore.charAt(i);
            if (carattere >= '0' && carattere <= '9') {
                System.out.print("il nome non può contenere numeri, inserisci nuovo nickname: ");
                nomeGiocatore = scanner.nextLine();
            }
        }
        return nomeGiocatore;
    }
    String[] tuttiControlliNomeGiocatore() {
        int numeroGiocatori = richiestaNumeroGiocatori();
        String[] nomiGiocatori = new String[numeroGiocatori];

        for (int i = 0; i < numeroGiocatori; i++) {
            String nomeGiocatore;
            boolean nomeDuplicato;

            do {
                nomeDuplicato = false;
                System.out.println("Inserisci nome giocatore:");
                nomeGiocatore = scanner.nextLine();
                nomeGiocatore = controlloNumeriNome(nomeGiocatore);
                nomeGiocatore = controlloLunghezza(nomeGiocatore);
                nomeGiocatore = controlloSpaziNome(nomeGiocatore);

                // Controllo manuale per i duplicati
                for (int j = 0; j < i; j++) {
                    if (nomiGiocatori[j].equals(nomeGiocatore)) {
                        System.out.println("Nome '" + nomeGiocatore + "' già utilizzato dal giocatore " + (j + 1));
                        nomeDuplicato = true;
                        break;
                    }
                }
            } while (nomeDuplicato);

            nomiGiocatori[i] = nomeGiocatore;
        }

        return nomiGiocatori;
    }

        int readIntegerInRange(int min, int max) {
        int input = 0;
        boolean correctInput = false;
        while (!correctInput) {
            System.out.println("Please enter a number between " + min + " and " + max + ":");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input < min || input > max)
                    System.out.println("Error: number not in range.");
                else
                    correctInput = true;
            } else {
                System.out.println("Error: input is not a number.");
                emptyTheScanner();
            }
        }
        emptyTheScanner();
        return input;
    }


    boolean isValidGridDimensions(int height, int width) {
        return height > 0 && width > 0 && height * width <= Constants.MAX_NR_CELLS && height * width % 2 == 0;
    }

    int[] getGridDimensions() {
        int height = 0;
        int width = 0;
        boolean isValidInputs = false;

        String message = """
                Insert height and width of the grid such that:
                - height > 0,
                - width > 0,
                - height * width < %d
                - height * width %% 2 == 0
                """.formatted(Constants.MAX_NR_CELLS);

        System.out.println(message); // Messaggio con le regole per le dimensioni della griglia
        do {
            System.out.println("Insert height: ");
            height = readIntegerInRange(1, Constants.MAX_NR_CELLS);

            System.out.println("Insert width: ");
            width = readIntegerInRange(1, Constants.MAX_NR_CELLS);

            isValidInputs = isValidGridDimensions(height, width);

            if (!isValidInputs) {
                System.out.println("One or more constraints are not met.");
            }

        } while (!isValidInputs);
        return new int[] { height, width };
    }
    Coordinate getCoordinate(int gridHeight, int gridWidth) {
        String message = String.format("""
                Insert row and column of the coordinate such that:
                - row >= 0,
                - row < %d,
                - col >= 0,
                - col < %d
                """, gridHeight, gridWidth);

        System.out.println(message);
        System.out.println("Insert row: ");
        int row = readIntegerInRange(0, gridHeight - 1);

        System.out.println("Insert column: ");
        int col = readIntegerInRange(0, gridWidth - 1);

        return new Coordinate(row, col);
    }

    void closeScanner() {
        scanner.close();
    }

    // Metodo per svuotare il buffer dello scanner
    void emptyTheScanner() {
        scanner.nextLine();
    }
}
class Card {

}
class Player {
    ConsoleInteractionUtils consoleInteractionUtils;
    String[] giocatori;
    Player(){
        consoleInteractionUtils = new ConsoleInteractionUtils();
        this.giocatori = consoleInteractionUtils.tuttiControlliNomeGiocatore();
    }

}
class Game{

}
class Coordinate{

}
class Grid{

}
public class MemoryTest1 {
    public static void main(String[] args) {

 
    }
}

