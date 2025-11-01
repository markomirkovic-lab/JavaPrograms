public class SnippetSerie10_cicli_figure_geometriche_parte_2 
{
    public static void main(String[] args) 
    {
        //------------------------------------------------------------------------

        /*

        .....
        .....
        .....
        .....
        .....
        
        */

        //Algoritmo di base
        int LATO=5;             //Figura 5x5
        int ULTIMA=LATO-1;
        int PRIMA=0;        
        for(int r=PRIMA; r<LATO; r++)           //Per ogni riga
        {
            for(int c=PRIMA; c<LATO; c++)       //Per ogni colonna della riga
            {
                System.out.print(".");          //Qui avrete tutte le combinazioni di r e c: 0-0 0-1 0-2 0-3 0-4 1-0 1-1 ... 4-4
            }
            System.out.println("");             //Terminata la riga vado a capo
        }
        
        
        
        //------------------------------------------------------------------------

        /*
        
        Area 5x5. Riga superiore
        #####
        .....
        .....
        .....
        .....

        */

        //Disegno la riga superiore
        System.out.println("\n\n\n\nArea 5x5. Riga superiore");
        LATO=5;                                 //Figura 5x5
        ULTIMA=LATO-1;
        PRIMA=0;        
        for(int r=PRIMA; r<LATO; r++)           //Per ogni riga
        {
            for(int c=PRIMA; c<LATO; c++)       //Per ogni colonna della riga
            {
                if(r==PRIMA)                    //Si tratta della prima riga?
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(".");          
                }
            }
            System.out.println("");             //Terminata la riga vado a capo
        }
        
        
        
        //------------------------------------------------------------------------

        /*
        
        Area 5x5. Riga superiore e inferiore
        #####
        .....
        .....
        .....
        #####

        */


        //Disegno la riga superiore e inferiore
        System.out.println("\n\n\n\nArea 5x5. Riga superiore e inferiore");
        LATO=5;                                 //Figura 5x5
        ULTIMA=LATO-1;
        PRIMA=0;        
        for(int r=PRIMA; r<LATO; r++)           //Per ogni riga
        {
            for(int c=PRIMA; c<LATO; c++)       //Per ogni colonna della riga
            {
                if(r==PRIMA ||                  //Si tratta della prima riga?
                   r==ULTIMA)                   //Si tratta dell'ultima riga?
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(".");          
                }
            }
            System.out.println("");             //Terminata la riga vado a capo
        }
        
        
        
        //------------------------------------------------------------------------

        /*

        Area 5x5. T
        #####
        ..#..
        ..#..
        ..#..
        ..#..
                
        */

        //Disegno una T
        System.out.println("\n\n\n\nArea 5x5. T");
        LATO=5;                                 //Figura 5x5
        ULTIMA=LATO-1;
        PRIMA=0;        
        for(int r=PRIMA; r<LATO; r++)           //Per ogni riga
        {
            for(int c=PRIMA; c<LATO; c++)       //Per ogni colonna della riga
            {
                if(r==PRIMA ||                  //Si tratta della prima riga?
                   c==LATO/2)                   //Si tratta della colonna centrale?
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(".");          
                }
            }
            System.out.println("");             //Terminata la riga vado a capo
        }
        
        
        
        
        //------------------------------------------------------------------------

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

        //Fiocco di neve
        System.out.println("\n\n\n\nArea 15x15. Fiocco di neve con bordo");
        LATO=15;
        ULTIMA=LATO-1;
        PRIMA=0;        
        for(int r=PRIMA; r<LATO; r++)
        {
            for(int c=PRIMA; c<LATO; c++)
            {
                if(c==LATO/2 && r!=PRIMA && r!=ULTIMA && r!=c ||       //Colonna centrale tranne: primo e l'ultimo punto, il punto centrale
                   r==LATO/2 && c!=PRIMA && c!=ULTIMA && r!=c ||       //Riga centrale tranne: primo e l'ultimo punto, il punto centrale
                   r==c && r!=PRIMA && r!=ULTIMA && r!=LATO/2 ||       //Diagonale da sx a dx tranne: primo e l'ultimo punto, il punto centrale
                   r+c==ULTIMA && r!=PRIMA && r!=ULTIMA && r!=LATO/2)  //Diagonale da dx a sx tranne: primo e l'ultimo punto, il punto centrale
                {
                    System.out.print("#");
                }
                else if(r==0 || c==0 || r==ULTIMA || c==ULTIMA)         //Bordi con un carattere diverso
                {
                    System.out.print("@");
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
        
        
        
        //------------------------------------------------------------------------

        /*
        Area 8x8. Scacchiera
        #.#.#.#.
        .#.#.#.#
        #.#.#.#.
        .#.#.#.#
        #.#.#.#.
        .#.#.#.#
        #.#.#.#.
        .#.#.#.#
        */

        System.out.println("\n\n\n\nArea 8x8. Scacchiera");        
        LATO= 8;
        ULTIMA= LATO-1;
        for(int r=PRIMA; r<LATO; r++)
        {
            for(int c=PRIMA; c<LATO; c++)
            {
                if(r%2==0 && c%2==0 ||      //Riga pari e Colonna pari
                   r%2==1 && c%2==1)        //Riga dispari e Colonna dispari
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(".");  //Riga pari e Colonna dispari
                                            //Riga dispari e Colonna pari
                }
            }
            System.out.println("");
        }  
        
        
        
        
        //------------------------------------------------------------------------

        /*
        Area 8x9. Albero di Natale
        .....*.....
        ....*.*....
        ...*...*...
        ..*.....*..
        .*.......*.
        ***********
        .....*.....
        .....*.....
        */

        //Albero di Natale
        System.out.println("\n\n\n\nArea 8x9. Albero di Natale");        
        int RIGHE= 8;              //Figura 8X11
        int COLONNE=11;          
        int ULTIMARIGA=RIGHE-1;
        int ULTIMACOLONNA=COLONNE-1;        
        PRIMA=0;        
        for(int r=PRIMA; r<RIGHE; r++)           //Per ogni riga
        {
            for(int c=PRIMA; c<COLONNE; c++)    //Per ogni colonna della riga
            {
                if(c-r<=ULTIMACOLONNA/2 && c==ULTIMACOLONNA/2+r ||          //Discesa a sinistra
                   c+r>=ULTIMACOLONNA/2 && c==ULTIMACOLONNA/2-r ||          //Discesa a destra
                   ULTIMACOLONNA/2-r==0 ||                                  //Riga finale  
                   ULTIMACOLONNA/2-r<0 && c==ULTIMACOLONNA/2)               //Gambo
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(".");
                }          
            }
            System.out.println("");             //Terminata la riga vado a capo
        }        
    }
}
