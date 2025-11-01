/*
Esercizio 10.2 - Cerchio
Sviluppate una classe che permetta di immagazzinare i dati concernenti un cerchio
(raggio e punto nello spazio bidimensionale del centro del cerchio). Sviluppate inoltre
le procedure/funzioni necessarie a:
• calcolare l’area di un cerchio
• calcolare la distanza tra i centri di due cerchi
• calcolare la distanza massima assoluta tra tutti i centri dei cerchi
Utilizzate questa classe e queste procedure/funzioni in un programma che
immagazzina i dati di 5 cerchi. In seguito, il programma dovrà calcolare la somma
delle aree dei cerchi e la distanza massima assoluta fra tutti i centri dei cerchi.
*/

import java.util.Scanner;

/**
 * Classe che permette di immagazzinare i dati concernenti un cerchio
 * (raggio e punto nello spazio bidimensionale del centro del cerchio)
 */
class Cerchio {
    double raggio;
    double x;
    double y;


    /**
     * Costruttore classe cerchio
     * 
     * @param raggio raggio del cerchio
     * @param x coordinata x del centro del cerchio
     * @param y coordinata y del centro del cerchio
     */
    Cerchio(double raggio, double x, double y){
        this.raggio = raggio == 0 ? Math.random() * 10 + 1 : Math.abs(raggio);
        this.x = x;
        this.y = y;
    }
}

/**
 * Programma per immagazzinare i dati di 5 cerchi. In seguito calcola:
 * - la somma delle areee dei cerchi;
 * - la distanza tra due cerchi;
 * - la distanza massima fra tutti i centri dei cerchi;
 */
public class Es10_2_Cerchio {
    
    /**
     * Funzione che calcola l’area di un cerchio
     * 
     * @param cerchio cerchio di calcolare l'area
     * @return l'area del cerchio
     */
    private static double calcolaArea(Cerchio cerchio){

        return (cerchio.raggio * cerchio.raggio) * Math.PI;
    }

     /**
     * Funzione che calcola la distanza tra i centri di due cerchi
     * 
     * @param cerchio1 primo cerchio
     * @param cerchio2 secondo cerchio
     * @return distanza tra due cerchi
     */
    private static double calcolaDistanzaDueCerchi(Cerchio cerchio1, Cerchio cerchio2) {

        double distX = Math.abs(cerchio2.x - cerchio1.x);
        double distY = Math.abs(cerchio2.y - cerchio1.y);
        double distanza = Math.sqrt(distX * distX + distY * distY);

        return distanza;
    }

    /**
     * Funzione che calcola la distanza massima assoluta tra tutti i centri dei cerchi
     * 
     * @param cerchi array contentente le referenze ai cerchi da utilizzare per il calcolo
     *               della distanza massima assoluta
     * @return la distanza massima assoluto tra tutti i centri dei cerchi
     */
    private static double calcolaDistanzaMassimaCentri(Cerchio cerchi[]) {

        double distanzaMax = 0;

        for(int i = 0; i < cerchi.length; i++) {
            for(int j = 0; j < cerchi.length; j++) {
                double distX = Math.abs(cerchi[i].x - cerchi[j].x);
                double distY = Math.abs(cerchi[i].y - cerchi[j].y);
                double distanza = Math.sqrt(distX * distX + distY * distY);
                if(distanzaMax < distanza) {
                    distanzaMax = distanza;
                }
            }
        }
        return distanzaMax;
    }


    /**
     * Procedura main - parte principale del programma
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Immagazzina i dati di 5 cerchi
        Cerchio cerchi[] = new Cerchio[5];
        // Variabli
        double x, y, raggio = 0;

        // caricamento dati da input utente
        for(int i = 0; i < cerchi.length; i++) {

            System.out.print((i+1) + " Centro del cerchio (x ; y): ");
            x = input.nextDouble();
            y = input.nextDouble();
            System.out.print((i+1) + " Raggio del cerchio: ");
            raggio = input.nextDouble();

            while(raggio <= 0.0) {
                System.out.print("Il raggio deve essere maggiore di 0. Riprova: ");
                raggio = input.nextDouble();
            }

            cerchi[i] = new Cerchio(raggio, x, y);
          }

        // calcolo area totale  
        double areaTotale = 0.0;
            for(Cerchio cerchio : cerchi) {
                areaTotale += calcolaArea(cerchio);
            }

        // stampa 
        System.out.println("Area totale: " + areaTotale);
        System.out.println("Distanza massima assoluta: " + calcolaDistanzaMassimaCentri(cerchi));

        // chiusura scanner
        input.close();


        /*
        Centro del cerchio (x ; y): 2 3
        Raggio del cerchio: 5
        Centro del cerchio (x ; y): 3 4
        Raggio del cerchio: 6
        Centro del cerchio (x ; y): 4 5
        Raggio del cerchio: 7
        Centro del cerchio (x ; y): 6 7
        Raggio del cerchio: 8
        Centro del cerchio (x ; y): 8 9
        Raggio del cerchio: 10
        Area totale: 860.7963870836033
        Distanza massima assoluta: 8.48528137423857
        */
    }
    
}
