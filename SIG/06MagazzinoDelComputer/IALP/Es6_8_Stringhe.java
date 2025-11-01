/*
6.8 Stringhe
Scrivete un programma che dichiari le variabili atte a memorizzare 
• Il nome di una persona
• Il cognome di una persona
• Il suo giorno di nascita
• Il suo mese di nascita
• Il suo anno di nascita
Inizializzate le variabili con i vostri dati e, usando una variabile di tipo String, stampate 
Il tuo nome è nome, il tuo cognome è cognome, sei nato il giorno.mese.anno
 */

public class Es6_8_Stringhe {

    public static void main(String[] args) {
        

        String nome;
        String cognome;
        int giorno;
        int mese;
        int anno;

        nome = "Marko";
        cognome = "Mirkovic";
        giorno = 1;
        mese = 6;
        anno = 2002;

        String finale = "Il tuo nome è " + nome + ", il tuo cognome è " + cognome + ", sei nato il " + giorno + "." + mese+"."+anno;

        System.out.println(finale);

        //Il tuo nome è Marko, il tuo cognome è Mirkovic, sei nato il 1.6.2002
        
    }
    
}
