/*
https://gitalb.github.io/eserciziario2.0/class/array/2020/12/08/wallet.html
Wallet Dec 8, 2020 class array Livello 15 

Per un app di gestione dei prestiti personali devi implementare le classi 
seguenti:

Classe Person
Rappresenta una persona (creditore o debitore). Un oggetto Person è 
caratterizzato da un nome costituito da una stringa contenente una 
lettera maiuscola seguita almeno 2 lettere minuscole (ad esempio "Alb") 
e memorizzato nell’attributo name (read only). La classe Person deve 
esportare:

Person(String name): è il costruttore, se il nome name non è valido 
solleva una IllegalArgumentException con il messaggio:

  "Invalid name <name>"
String toString(): ritorna la rappresentazione testuale contenente il nome 
della persona.

boolean equals(Person p): ritorna true se la persona corrente possiede lo 
stesso nome della persona p, false altrimenti.

Inoltre deve contenere il metodo package private:

boolean isNameValid(String name): ritorna true se name è un nome di 
persona valido, false altrimenti.

Classe Loan
Rappresenta una voce dell’elenco di prestiti contenuto in un Wallet. 
Lo stato di un Loan è caratterizzato da una persona (Person, read 
only) e dal relativo bilancio (double amount, read-write, default 10).
Un bilancio positivo rappresenta un credito, uno negativo un debito. 
Inoltre Loan deve esportare i metodi seguenti:

Loan(Person person, double amount): costruttore, istanzia un Loan 
associato alla persona person con una somma definita da amount. 
La somma deve essere diversa da 0, in caso contrario viene
 applicato il valore di default.

Loan(Person person): costruttore, istanzia un Loan associato alla 
persona person con la somma di default.

String toString(): ritorna la rappresentazione testuale del Loan 
nel formato:

  "<segno><amount> <name>"   ad esempio `"+3.0 Alb"`.

Classe Wallet
Rappresenta un portafoglio dei prestiti e deve esportare i metodi 
seguenti:

Wallet(): costruttore, istanzia un portafoglio vuoto.

int indexOf(Person person): 
ritorna l’indice del Loan associato alla persona person nell’elenco 
loans. Se non ne trova nessuno ritorna -1.

void addLoan(Person person, double amount) : 
se nel portafoglio non è già presente un Loan associato a person, 
aggiunge al portafoglio un nuovo Loan. In caso contrario ne aggiorna 
il bilancio. Se il bilancio aggiornato è pari a 0, il Loan viene 
rimosso dal portafogli.

String toString(): ritorna una stringa contenente l’elenco di Loan 
presenti nel portafoglio secondo il formato illustrato nell’esempio 
seguente:

      +2.0 Alb
      -1.0 Mike

Inoltre deve contenere il metodo package private:

void removeLoan(int index): rimuove dal portafoglio il Loan 
all’indice index.
*/

public class WalletV1 {


    public static void main(String[] args) {
        
    }
    
}
