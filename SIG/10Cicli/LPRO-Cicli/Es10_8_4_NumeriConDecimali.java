/*
Reallizzate un algoritmo che conti (stampando a schermo) da 15 a 32, per ogni 
numero, devono essere stampati i decimali:
15
.1
.2
.3
...
.9

16
.1
e così via fino al 32
*/

public class Es10_8_4_NumeriConDecimali {

    public static void main(String[] args) {

        /*
        // ciclo for
        int numeroInizio = 15;
        int numeroFine = 32;
        double decimali = 1.0;
        double cntrDecimali = 0.1;
        for(numeroInizio = 15; numeroInizio < numeroFine+1; numeroInizio++) {

            System.out.println(numeroInizio);

            cntrDecimali = 0.1;// azzero il counter per ogni ciclo
            for(int i = 1; i < 10; i++) {
                System.out.printf("\t");
                System.out.printf("%.1f \t\n", (1.0-cntrDecimali));
                cntrDecimali += 0.1;
            }
        }
        */



         for(int k=15; k<=32; k++)
        {
            System.out.println(k);
            
            for(int l=1; l<=9; l++)
            {
                System.out.println("\t." + l);
            }
        }
        
    }
    
}
