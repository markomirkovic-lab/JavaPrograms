//package SimulazioneTest;

/*
Scrivete un programma che aiuti l’utente a calcolare il tempo necessario per
lo scaricamento di un file basandosi sulla dimensione dello stesso e la 
velocità di download dell’utente.

L’utente immette la dimensione del file d in megabyte (MB) e la velocità 
di download v in megabit al secondo (Mbps).

Successivamente il programma dovrà calcolare il tempo di download T in 
minuti utilizzando la formula seguente:

T = 1/60 * ((d * 8) / v)


Assicuratevi che i valori introdotti dall'utente siano sensati. Nel 
caso in cui non lo fossero, l'utente deve poter reinserire le informazioni 
che risultano essere errate.

Sviluppate due versioni del programma: una che per i calcoli utilizzi 
solo tipi di dato interi, l’altra che utilizzi solo numeri e operatori 
in virgola mobile.

Testate le due versioni del programma con i seguenti valori: 

d = 10 e v = 7. 

C’è una differenza? Qual è? Perché? Rispondete a queste domande in un 
commento all’interno del programma della versione che utilizza valori 
in virgola mobile.

Importante: date per scontato che il tipo di dato inserito dall'utente 
sia corretto.

*/

import java.util.Scanner;

public class CalcoloTempoNecessario {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);



        scanner.close();
    }
    
}
