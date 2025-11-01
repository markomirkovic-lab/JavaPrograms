/*
10.2 Datediff
Scrivete un programma che:
• Chiede all’utente di inserire una data di partenza nel formato ISO (YYYYMMDD)
• Chiede all’utente di inserire una data di arrivo nel formato ISO
• Se la data di arrivo è superiore alla data di partenza il programma calcolerà e 
  stamperà il numero di giorni che intercorrono fra le due date
• Se la data di arrivo è inferiore alla data di partenza il programma stamperà
Il programma non considera gli anni bisestili, febbraio avrà quindi sempre 28 giorni.
*/
import java.util.Scanner;

public class Es10_2_DateDiff {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la data di partenza (formato ISO: YYYYMMDD): ");
        int dataPartenza = input.nextInt();


        System.out.print("Inserisci la data di arrivo (formato ISO: YYYYMMDD): ");
        int dataArrivo = input.nextInt();

        // Estrazione numeri
        // YYYYMMDD
           

        int annoPartenza = dataPartenza / 10000;
        //System.out.println(anniPartenza);

        int mesePartenza = (dataPartenza % 10000) / 100;
        //System.out.println(mesiPartenza);

        int giornoPartenza = dataPartenza % 100;
        //System.out.println(giorniPartenza);

        int annoArrivo = dataArrivo / 10000;
        //System.out.println(anniArrivo);

        int meseArrivo = (dataArrivo % 10000) / 100;
        //System.out.println(mesiArrivo);

        int giornoArrivo = dataArrivo % 100;
        //System.out.println(giorniArrivo);


        if(dataArrivo < dataPartenza) {
            System.out.println("Data di arrivo e' inferiore alla data di partenza.");
        } else {

            
            // Calcolo dei giorni tra le due date
            int giorniTotali = 0;

            // Lunghezza dei mesi (febbraio ha 28 giorni, come richiesto)
            int giorniMese = 0;

            // Iterare mese per mese
            while (annoPartenza < annoArrivo || (annoPartenza == annoArrivo && mesePartenza < meseArrivo)) {
                switch (mesePartenza) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        giorniMese = 31;
                        break;
                    case 4: case 6: case 9: case 11:
                        giorniMese = 30;
                        break;
                    case 2:
                        giorniMese = 28;
                        break;
                }

                giorniTotali += giorniMese - giornoPartenza;
                // Dal mese successivo inizia dal primo giorno
                giornoPartenza = 1;

                mesePartenza++;
                if(mesePartenza > 12) {
                    mesePartenza = 1;
                    annoPartenza++;
                }
            
            }

            // Aggiungere i giorni rimanenti dell'ultimo mese
            giorniTotali += giornoArrivo - giornoPartenza;

            System.out.println("Il numero giorni tra due date e': " + giorniTotali);

                      

        }

        

        
        input.close();
    }
    
}
