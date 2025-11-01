
class MailingList {
    String descrizione;
    String[] utenti = new String[10];
    //Utente utente;
    //Utente emailUtente;
    int cntUtenti;

    MailingList(String descrizione, String[] utenti){
        this.descrizione = descrizione;
        this.utenti = utenti;
    }

    // sommaUtenti(){
    //     for()
    // }


    boolean aggiungereUtente(Utente utente){
        if(utente == null) {
            return false;
        }

        if(cntUtenti == utenti.length) {
            return false;
        }

        utenti[cntUtenti++] = utente;
        return true;


    }

    // mostrareMailingList() {

    // }

    // contareMembriInComune() {

    // }


}

class Utente{
    String utente;
    String indirizzoEmail;

    Utente(String utente, String indirizzoEmail){
        this.utente = utente;
        this.indirizzoEmail = indirizzoEmail;
    }

    Utente(String utente){
        this.utente = utente;
    }
}

    


 





public class MailingTest {


    public static void main(String[] args) {
        



        
    }
    
}
