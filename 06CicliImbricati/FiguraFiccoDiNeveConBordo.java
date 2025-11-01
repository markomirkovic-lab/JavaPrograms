/*

Area 15x15. Fiocco di neve con bordo
        @@@@@@@@@@@@@@@
        @#.....#.....#@
        @.#....#....#.@
        @..#...#...#..@
        @...#..#..#...@
        @....#.#.#....@
        @.....###.....@
        @######.######@
        @.....###.....@
        @....#.#.#....@
        @...#..#..#...@
        @..#...#...#..@
        @.#....#....#.@
        @#.....#.....#@
        @@@@@@@@@@@@@@@

*/
import java.util.Scanner;

public class FiguraFiccoDiNeveConBordo {


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int lato;
        String messaggio = "Inserici (numero intero dispari diverso da zero) la grandezza \n" + //
                           "del lato della figura simetrica (lato x lato): ";
        
        System.out.print(messaggio);
        lato = input.nextInt();
        input.nextLine();
        System.out.println("");
        
        int righe = lato;
        int colonne = lato;

        // Indici
        int prima = 0;
        int ultima = lato-1;

        /*
        if(c==LATO/2 && r!=PRIMA && r!=ULTIMA && r!=c ||    //Colonna centrale tranne: primo e l'ultimo punto, il punto centrale
        r==LATO/2 && c!=PRIMA && c!=ULTIMA && r!=c ||       //Riga centrale tranne: primo e l'ultimo punto, il punto centrale
        r==c && r!=PRIMA && r!=ULTIMA && r!=LATO/2 ||       //Diagonale da sx a dx tranne: primo e l'ultimo punto, il punto centrale
        r+c==ULTIMA && r!=PRIMA && r!=ULTIMA && r!=LATO/2)  //Diagonale da dx a sx tranne: primo e l'ultimo punto, il punto centrale

        if(
        c==LATO/2 && r!=c ||       //Colonna centrale tranne: primo e l'ultimo punto, il punto centrale         (DIVERSO)
        r==LATO/2 && r!=c ||       //Riga centrale tranne: primo e l'ultimo punto, il punto centrale            (DIVERSO)
        r==c && r!=LATO/2 ||       //Diagonale da sx a dx tranne: primo e l'ultimo punto, il punto centrale     (uguale)
        r+c==ULTIMA && r!=LATO/2)  //Diagonale da dx a sx tranne: primo e l'ultimo punto, il punto centrale     (uguale)


        */
        
        for (int r = prima; r < righe; r++)             // Per ogni riga
        {
            for (int c = prima; c < colonne; c++)       // Per ogni colonna della riga
            {
                //        0                             // Combinazioni di r e c
                
                if(r == prima || c == prima || r == ultima || c == ultima) {
                    System.out.print("@");
                } else if((r > prima && r < ultima) && (c > prima && c < ultima)) {
                                                                //                              DIVERSO
                    if( (c == colonne/2 && r != righe/2) ||     // c==LATO/2 && r!=c ||         r!=c
                        (r == c && r != righe/2) ||             // r==c && r!=LATO/2 ||
                        (r + c == ultima && r != righe/2) ||    // r+c==ULTIMA && r!=LATO/2
                        (r == righe/2 && c != colonne/2)) {     // r==LATO/2 && r!=c ||         r!=c
                        System.out.print("#");
                    } else {
                    System.out.print(".");            
                    }
                } 
            }
            System.out.println("");               // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    
    }
}

