package serie16;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Codifiche 
{
    public static void main(String[] args) throws IOException 
    {                
        try {
            //Premessa
            //Java in memoria rappresenta sempre i char con la codifica UNICODE
            //  Ad esempio il char 'à' equivale in UNICODE
            //      Decimale    224
            //      Esadecimale 0xE0
            //      Binario     0x11100000
            //
            //  Il charset Cp1252 (ANSI) il char 'à' viene salvato con un solo byte
            //      Decimale    224
            //      Esadecimale 0xE0
            //      Binario     0x11100000
            //
            //  Nella codifica UTF8 il char 'à' viene salvato in due bytes
            //      Decimale    195         160
            //      Esadecimale 0xC3        0xA0
            //      Binario     0b11000011  0b10100000


            //Preparo una stringa con i dati, in questo caso uso del testo con caratteri accentati
            //Per Java quel testo è codificato in UNICODE
            String dati= "aiuola\r\nàíùölä";




            //------------------------------------------------------------------
            //Step 1, prepariamo un file codificato in ANSI puro (CP1252)

            //Preparo un path per scrivere il file
            Path fANSI= Paths.get(".", "resources", "codifica_ansi.txt");            

            //Converto la stringa nei bytes puri che la compongono
            //Indico però che il testo va salvato in formato ANSI (Cp1252)
            byte[] buffer= dati.getBytes(Charset.forName("Cp1252"));            

            //Scrivo il file, lo sovrascrivo se lo trovo già
            Files.write(fANSI, buffer, StandardOpenOption.CREATE);




            //------------------------------------------------------------------
            //Step 2, prepariamo un file codificato in UNICODE (UTF8)

            //Preparo un path per scrivere il file
            Path fUTF8= Paths.get(".", "resources", "codifica_utf8.txt");            

            //Converto la stringa nei bytes puri che la compongono
            //Indico però che il testo va salvato in formato UTF8
            buffer= dati.getBytes(Charset.forName("UTF-8"));            

            //Scrivo il file, lo sovrascrivo se lo trovo già
            Files.write(fUTF8, buffer, StandardOpenOption.CREATE);            




            //-----------------------------------------------------------------
            //Prova numero 1, apro il file ma con una codifica diversa!
            //  Cosa succede?
            //  Quando incontra la lettera 'à' trova il byte 0xE0 (0b11100000 oppure 224)
            //  che secondo la codifica UTF-8 significa che il carattere specificato è composto da almeno un altro byte
            //  quindi lo legge e trova 0xED (0b11101101 oppure 237) e la combinazione dei due NON ha alcun significato in UTF-8
            //  il risultato è che il carattere non è decifrabile.
            //  Passa quindi a decodificare il byte seguente...
            //  questo avviene per tutte le lettere seguenti, per le quali solo la 'l' viene interpretata.

            //Trasferisco il file in memoria
            buffer = Files.readAllBytes(fANSI);

            //Trasformo l’array in stringa, usando la codifica ERRATA
            //Il file è stato generato utilizzando la codifica ANSI
            String testo= new String(buffer, Charset.forName("UTF-8"));             
            System.out.println("Prova 1: leggo ANSI come se fosse UTF-8");
            System.out.println("Leggo un file ANSI come se fosse UTF-8. Le lettere non ASCII non verranno interpretate correttamente:");
            System.out.println(testo);
            System.out.println("\n\n\n");





            //-----------------------------------------------------------------
            //Prova numero 2, apro il file usando la codifica corretta
            //  Cosa succede?
            //  Quando incontra la lettera 'à' trova il byte 0xE0 (0b11100000 oppure 224)
            //  che in ANSI ha il significato del char 'à' e quindi viene convertita da Java nel corrispettivo 'à' UNICODE.

            //Trasformo l’array in stringa, usando la codifica corretta
            //parto dal buffer già usato in precedenza
            testo= new String(buffer, Charset.forName("Cp1252")); 
            System.out.println("Prova 2: leggo ANSI come se fosse ANSI");
            System.out.println("Leggo un file ANSI come se fosse ANSI. Tutto va bene:");
            System.out.println(testo);
            System.out.println("\n\n\n");            




            //-----------------------------------------------------------------
            //Prova numero 3, apro il file con la codifica corretta!
            //  Cosa succede?
            //  Quando incontra la lettera 'à' trova il byte 0xC3 (0b11000011 oppure 195)
            //  che secondo la codifica UTF-8 significa che il carattere specificato è composto da almeno un altro byte
            //  quindi lo legge e trova 0xA0 (0b10100000 oppure 160) e la combinazione dei due in UTF8 significa 'à'
            //  Java prende i due byte e li converte nel relativo carattere UNICODE 'à' (224 oppure 0xE0 oppure 0x11100000)
            //  Passa quindi a decodificare il byte seguente...            

            //Trasferisco il file in memoria
            buffer = Files.readAllBytes(fUTF8);

            //Trasformo l’array in stringa, usando la codifica corretta
            testo= new String(buffer, Charset.forName("UTF-8"));  
            System.out.println("Prova 3: leggo UTF-8 come se fosse UTF-8");
            System.out.println("Leggo un file UTF-8 come se fosse UTF-8. Tutto funziona bene:");
            System.out.println(testo);
            System.out.println("\n\n\n");   




            //-----------------------------------------------------------------
            //Prova numero 4, apro il file ma con una codifica diversa!
            //  Cosa succede?
            //  Quando incontra la lettera 'à' trova il byte 0xC3 (0b11000011 oppure 195)
            //  che secondo la codifica ANSI corrisponde al char 'Ã'
            //  quindi lo legge e lo converte in UNICODE.
            //  Il byte seguente, 0xA0, viene convertito in UNICODE, ovvero il carattere NO-BREAK SPACE

            //Trasformo l’array in stringa, usando la codifica corretta
            //parto dal buffer già usato in precedenza
            testo= new String(buffer, Charset.forName("Cp1252"));    
            System.out.println("Prova 4: leggo UTF-8 come se fosse ANSI");
            System.out.println("Leggo un file UTF-8 come se fosse ANSI. Vi sono degli errori:");
            System.out.println(testo);
            System.out.println("\n\n\n");               

        }
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
        }        
    }
}