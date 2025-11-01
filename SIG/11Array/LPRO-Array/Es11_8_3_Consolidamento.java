/*
Dichiarate un array di 12 elementi di tipo stringa e inizializzatelo con i valori dei 
giorni dei mesi (gennaio, indice 0, giorni 31, febbraio, indice 1, giorni 28, ...).
Fate la stessa cosa con un array di tipo stringa, inserendo i mesi dell’anno.
Chiedete all’utente di scegliere un mese e stampate il nome e i giorni.
*/

import java.util.Scanner;

public class Es11_8_3_Consolidamento {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] giorniMese = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] mesi = {"Genanio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", 
                         "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};

        
        System.out.print("Scegli un mese (numero): ");
        int mese = input.nextInt();
        mese--;

        System.out.println("Il mese e': " + mesi[mese] + ", " + "e ha numero dei giorni: " + giorniMese[mese]);

    }
    
}
