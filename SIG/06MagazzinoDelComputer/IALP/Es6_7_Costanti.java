/*
6.7 Costanti
Scrivete un programma che, grazie all’uso di alcune costanti, sia in grado di calcolare, 
partendo da una variabile che rappresenta un numero di giorni:
• Quante ore sono contenute nei giorni
• Quanti minuti
• Quanti secondi
*/

public class Es6_7_Costanti {

    public static void main(String[] args) {

        final int ORE = 24;
        final int MINUTI = ORE * 60;
        final int SECONDI = MINUTI * 60;

        int giorni, ore, minuti, secondi;
        
        giorni = 220;

        ore = giorni * ORE;
        minuti = giorni * MINUTI;
        secondi = giorni * SECONDI;

        System.out.println("Giorni: " + giorni);
        System.out.println("Ore: " + ore);
        System.out.println("Minuti: " + minuti);
        System.out.println("Secondi: " + secondi);

        /*
        int ore = variable * 24;
        int minuti = variable * (24*60);
        int secondi = variable * (24*60*60);

        System.out.println("Variable: " + variable);
        System.out.println("Ore: " + ore);
        System.out.println("Minuti: " + minuti);
        System.out.println("Secondi: " + secondi);
        */

        /*
        Giorni: 220
        Ore: 5280
        Minuti: 316800
        Secondi: 19008000
        */






    }
    
}
