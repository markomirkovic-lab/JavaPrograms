/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snippets;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SnippetSerie16_Manipolare_Paths_e_Files_parte3_Leggere_CSV 
{
    public static void main(String[] args) 
    {
        Path in= Paths.get(".", "UTF8.csv");
        
        try {
            //Per trattare i files CSV è utile caricarli già suddivisi in righe
            List<String> lineeGiàSeparate= Files.readAllLines(in, Charset.forName("UTF-8"));

            //Ora ho un array (una List, la spiegheremo in dettaglio più avanti)
            //dove ogni cella contiene una riga
            //Parto dalla riga 1 in quanto la riga 0 contiene solitamente le intestazioni, verificatelo ogni volta.
            int sommaAssenze=0;
            System.out.println(String.format("%25s"));
            for(int i=1; i< lineeGiàSeparate.size(); i++)   
            {
                //Estraggo la linea attuale
                String lineaAttuale= lineeGiàSeparate.get(i);
                
                //Attenti, lo split ha un difetto, l'ultimo campo, se vuoto, non genererà una stringa vuota
                //Es: "campo A, campo B, " restituisce un array di due elementi
                String[] campi= lineaAttuale.split(",");
                
                //Converto il 4 campo in intero
                int oreAssenza= Integer.parseInt(campi[3].trim());
                sommaAssenze+= oreAssenza;
                
                //Stampo per mostrare il contenuto
                System.out.print( String.format("%-25s | %-25s | %-25s | %5d %n", campi[0], campi[1], campi[2], oreAssenza) );                
            }
            
            System.out.println("Totale assenze: " + sommaAssenze);

        } 
        catch (IOException ex) 
        {
            Logger.getLogger(SnippetSerie16_Manipolare_Paths_e_Files_parte3_Leggere_CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
