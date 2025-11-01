/*
https://gitalb.github.io/eserciziario2.0/class/array/2020/12/08/shoppingcart.html
ShoppingCart Dec 8, 2020 class array Livello 15 

Per un sistema di acquisti online devi implementare le classi seguenti:

Classe Article
Rappresenta un articolo in vendita nel negozio. Un Article è caratterizzato 
da un codice di prodotto costituito da una stringa contenente una lettera 
maiuscola seguita da 4 cifre (ad esempio "A1234") e memorizzato nell’attributo 
code (read only). La classe Article deve esportare:

Article(String code): è il costruttore, se il codice code non è valido 
solleva una IllegalArgumentException con il messaggio:

  "Invalid article code <code>"
String toString(): ritorna la rappresentazione testuale dell’articolo nel 
formato:

  "Article code <code>"
boolean equals(Article a): ritorna true se l’articolo corrente possiede lo 
stesso codice dell’articolo a, false altrimenti.

Inoltre deve contenere il metodo package private:

boolean isCodeValid(String code): 
ritorna true se code è un codice di articolo valido, false altrimenti.

Classe Item
Rappresenta una voce dell’elenco contenuto in un ShoppingCart. 
Lo stato di un Item è caratterizzato da un articolo (Article, read only) e 
dalla relativa quantità (int quantity, read-write, valore minimo 1, default 1). 
Inoltre deve esportare i metodi seguenti:

Item(int quantity, Article article): costruttore, istanzia un Item associato 
all’articolo article nella quantità definita da quantity. La quantità deve 
essere superiore a 0, in caso contrario viene applicato il valore di default.

Item(Article article): costruttore, istanzia un Item associato all’articolo 
article nella quantità di default.

String toString(): ritorna la rappresentazione testuale del Item nel formato:

  "Article code <code> (<quantity>)"   ad esempio `"Article code A1234 (2)"`.
Classe ShoppingCart
Rappresenta un carrello degli acquisti e deve esportare i metodi seguenti:

ShoppingCart(): costruttore, istanzia un carrello vuoto.

int indexOf(Article article): ritorna l’indice del Item associato 
all’articolo article nell’elenco items. Se non ne trova nessuno ritorna -1.

void addArticle(Article article): se nel carrello è già presente un Item 
associato all’articolo article, ne incrementa la quantità. In caso contrario 
aggiunge al carrello un nuovo Item associato all’articolo article.

void removeArticle(Article article): se nel carrello è presente un Item 
associato all’articolo article, ne decrementa la quantità. Se la quantità
 decrementata è pari a 0, l’Item viene rimosso dal carrello.

String toString(): ritorna una stringa contenente l’elenco di Item presenti 
nel carrello secondo il formato illustrato nell’esempio seguente:

      - Article code A1234 (2)
      - Article code B7254 (1)

*/
public class ShoppingCartV1 {
    

    public static void main(String[] args) {
        

        
    }
}
