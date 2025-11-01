
public class SnippetSerie06
{
    public static void main(String[] args) 
    {
        //Le variabili vanno DICHIARATE
        byte variabile;              //Dichiarazione, le variabili hanno sempre nomi che INIZIANO CON UNA MINUSCOLA
        
        //Il primo assegnamento viene anche detto INIZIALIZZAZIONE
        variabile= 12;              //Inizializzazione
        
        
        //Per esprimere dei numeri si usano dei LETTERALI numerici
        //Nel caso degli interi possono essere scritti in quattro basi numeriche diverse
        variabile= 28;                      //assegno il numero 28 espresso in decimale
        variabile= 0b11100;                 //assegno il numero 28 espresso in binario, infatti inizia con 0b
        variabile= 034;                     //assegno il numero 28 espresso in ottale, infatti inizia con 0
        variabile= 0x1C;                    //assegno il numero 28 espresso in esadecimale, infatti inizia con 0x        
        
        variabile= 03 + 0b10 + 0xC + 11;    //Nei calcoli posso mischiare i letterali espressi in varie basi: 3 in ottale + 2 in binario + 12 in esadecimale + 11 decimale = 28
        System.out.println(variabile);      //la stampa avverrà sempre in base 10 
        
        
        
        
        
        //Potete anche dichiarare più variabili in una volta sola, TUTTE DELLO STESSO TIPO
        //è sufficiente separare i nomi da una virgola
        byte v1, v2, v3;                //Dichiarate 3 variabili di tipo byte
        
        
        
        //In ordine di grandezza...
        byte b= 0b10011;                //1B. Dichiarato e inizializzato una variabile di tipo byte.
        short s= 23;                    //2B. Dichiarato e inizializzato una variabile di tipo short.
        int i= -2341;                   //4B. Dichiarato e inizializzato una variabile di tipo int. È lo standard di Java per i numeri interi!
        long l= 123345876L;             //8B. Dichiarato e inizializzato una variabile di tipo long. Notare che il letterale è seguito da una L maiuscola
        
        float f= 3.14F;                 //4B. Dichiarato e inizializzato una variabile di tipo float, a virgola mobile, detta anche a precisione SINGOLA. Notare che il letterale è seguito da una F maiuscola
        double d= 2.71;                 //8B. Dichiarato e inizializzato una variabile di tipo double. È lo standard di Java per i numeri in vigola mobile, detti anche a precisione doppia!
        
        char carattere= 'a';            //2B. Il char consente di esprimere UNA sola lettera della codifica unicode. 
        

        
        //----------------------------------------------------------------------------------------------------------------------
        //Caratteristiche dei char
        System.out.println("\n\n\nCaratteristiche dei char:");       //Qualche riga vuota per separare

        //Stranezze sui caratteri
        //Ricordatevi che i letterali usati per scrivere i char, ad esempio 'a', in realtà sono destinati agli umani, per Java sono solo numeri (in questo caso il 97)
        //Questo vi permette di manipolarli con operazioni matematiche
        carattere= 'a' + 1;                 //'a' + 1 == 'b'
        System.out.println(carattere);      //stamperà 'b'
        
        carattere= 97 + 1;              
        System.out.println(carattere);      //stamperà 'b', 97 è infatti il codice unicode di 'a'
        
        carattere= 12 * '\t' + 2;
        System.out.println(carattere);      //stamperà 'n' il cui valore unicode è 110. '\t' ha valore 9 e quindi 12 * 9 + 2 = 110.        
                
        
        //----------------------------------------------------------------------------------------------------------------------
        //Caratteristiche dei numeri interi nei PC.
        System.out.println("\n\n\nCaratteristiche dei numeri interi");       //Qualche riga vuota per separare
        
        //Lavorando coni numeri interi dovete prestare attenzione alle divisioni.
        //Infatti vengono svolte esaminando unicamente la parte intera, i resti non vegnono eliminati
        //Esempio: se vogliamo effettuare la seguente divisione, come facevano alle elementari
        //      135 : 4 =  3            Il 4 sta nel 13 3 volte. 13 / 4 = 3 con resto 1. 
        //                              Riporto l'uno e abbasso il 5 e procedo
        //       15 : 4 =  33           Il 4 sta nel 15 3 volte. 15 / 4 = 3 con resto 3.
        //                              Avendo esaurito la parte intera. mi fermo.
        //Quindi 135 / 4 fra interi mi darà 33 (invece di 33.75).
        System.out.println( 135 / 4 );
        
        
        
        

        //----------------------------------------------------------------------------------------------------------------------
        //Caratteristiche dei numeri in vigola mobile nei PC.
        System.out.println("\n\n\nCaratteristiche dei numeri in vigola mobile (precisione singola e doppia)");       //Qualche riga vuota per separare
        
        //In un PC NON avete cifre infinite ma limitate alla grandezza del tipo.
        //Ad esempio un float dispone di 32bit mentre un double ne ha 64.
        //Questo ha un impatto notevole quando si trattano numeri con la virgola.
        //Non è infatti garantito che un numero in virgola mobile in base 10 sia sempre rappresentabile ESATTAMENTE con i bit a disposizione
        float nonFunziona= 0.001345F + 0.001123F;   //Verrebbe da dire che il risultato sarà 
                                                    //      0.001345
                                                    //    + 0.001123
                                                    //    ----------
                                                    //      0.002468
        System.out.println(nonFunziona);            //E invece otteniamo 0.0024680002 che è il numero più vicino approssimabile in BASE 2 usando il float
        
        double funziona= 0.001345 + 0.001123;  
        System.out.println(funziona);               //Usando il double, e quindi avendo 64bit a disposizione, l'errore non avviene
        
        
        

        //Per questa ragione il default in Java per i numeri con la virgola è il double!
        //Attenti però, anche il double non è esente da problemi, anche con numeri apparentemente banali.
        //Lo vedrete in dettaglio a NUAC:
        System.out.println("\n30.1 * 3.0:");      
        double n1= 3.0;
        double n2= 30.1;
        double n3= n1 * n2;                         //L'evidenza ci porta a credere che stamperà 90.3, e invece...
        System.out.println(n3);                     //      90.30000000000001
        
        
        
        
        //Ecco infine un ultimo esempio
        System.out.println("\n+0.2:");      
        n1= 0.2;                                    //Partiamo con 0.2
        System.out.println(n1);                     //È stato rappresentato correttamente
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 0.4
        System.out.println(n1);                     //È stato rappresentato correttamente
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 0.6
        System.out.println(n1);                     //Problema di arrotondamento: 0.6000000000000001
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 0.8000000000000001
        System.out.println(n1);                     //Problema di arrotondamento: 0.8
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 1.0
        System.out.println(n1);                     //È stato rappresentato correttamente
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 1.2
        System.out.println(n1);                     //È stato rappresentato correttamente
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 1.4
        System.out.println(n1);                     //È stato rappresentato correttamente
        n1= n1 + 0.2;                               //Aggiungiamo 0.2, otteniamo 1.6
        System.out.println(n1);                     //Problema di arrotondamento: 1.5999999999999999
        
        
        System.out.println("");
        
        //Qualche informazione sulle stringhe
        int prova;
        String ff;
        
        ff= "ciao sono Java!";
        //   012345678901234      15 lunghezza
        //             11111
        
        System.out.println( ff.charAt(0) );                         //Stamperà 'c'
        System.out.println( ff.charAt(14) );                        //Stamperà '!'
        System.out.println( ff.length() );                          //Stamperà 15, la stringa è lunga 15 caratteri, numerati da 0 a 14
        System.out.println( ff.charAt( ff.length()-1 ) );           //Stamperà '!', ovvero l'ultima lettera della stringa, indipendentemente dalla sua lunghezza
        
        System.out.println( ff.toUpperCase() );                     //Stamperà la stringa trasformandola in maiuscolo. NON cambia il valore della stringa memorizzata nella variabile f
        System.out.println( ff.indexOf("o J") );                    //Stamperà 8, ovvero la posizione nella stirnga da dove inzia la sottostringa "o J"
        System.out.println( ff.replace("sono", "sarei") );          //Nella stringa memorizzata nella variabile f cambia la sottostringa "sono" in "sarei". NON cambia il valore della stringa memorizzata nella variabile f
        
        ff= ff.replace("sono", "sarei");                            //Come sopra ma riassegna a f la nuova stringa
        System.out.println(ff);                                     //Ora ff ha un nuovo valore
        
        String f2= "   \t   Simone     Giudice   ";                    //Ecco una stringa che ha degli spazi e tabulatori prima, spazi dopo e spazi nel mezzo 
        System.out.println( "[" + f2.trim() + "]" );                //trim() elimina gli spazi prima e dopo lasciando inalterati quelli interni
        System.out.println( "[" + f2 + "]" );                       //confontatela con una stringa non "trimmata"
        
        System.out.println("Simone".equals("simone"));              //equals, da usare per confrontare tutti i tipi NON primitivi. Attenti Java è case sensitive, "Simone" e "simone" NON sono uguali, verrà stapato false
        System.out.println("Simone".equals("Simone"));
        
        System.out.println("Simone".equalsIgnoreCase("Simone"));    //Con questo metodo confrontate una stringa ignorando le maiuscole e minuscole
        System.out.println("Simone".toLowerCase().equals("Simone".toLowerCase()));   //di fatto ecco quello che succede all'interno di equalsIgnoreCase
        
        //            0123456789
        String data= "04.10.2022";                                  //Se volessimo estrarre il mese dalla stringa che rappresenta una data
        
        String mese= "" + data.charAt(3) + data.charAt(4);          //metodo 1: concateno ad una stringa vuota i due char delle posizioni del mese
        System.out.println( mese );          
        
        mese= data.substring(3,5);                                  //metodo 2: estraggo dalla posizione 3 compresa, alla posizione 5 non compresa
        System.out.println( mese );                  
        
        
        
        //             0123456789012345
        String testo= "abc <scuola> ghi";                           //Se volessimo estrarre del testo racchiuso tra due delimitatori, in questo esempio "<" e ">", possiamo combinare quanto visto sopra
        int partenza= testo.indexOf("<");                           //Con indexOf cerco dove partire
        int fine= testo.indexOf(">");                               //Con indexof cerco dove finire
        String estrai= testo.substring(partenza+1,fine);            //Con substring estraggo la stringa contenuta (quindi parto da +1)        
        System.out.println(estrai);
        
        System.out.println( testo.substring(testo.indexOf("<")+1,testo.indexOf(">")) );     //Posso anche combinare tutto insieme, grazie alle parentesi Java valuterà nel modo seguente:
        //                  testo.substring(4+1                 ,testo.indexOf(">"))        //Parte dalla parentesi più interna e valuta da sinistra a destra, quindi per primo valuta indexOf("<") restituisce 4, poi
        //                  testo.substring(5                   ,testo.indexOf(">"))        //esegue 4+1
        //                  testo.substring(5                   ,11                )        //passa a indexOf(">") che restituisce 11
        //                  "scuola"                                                        //Poi valuta substring(5,11) e ottiene la stringa "scuola"
        //Infine esegue la println 
    }
}
