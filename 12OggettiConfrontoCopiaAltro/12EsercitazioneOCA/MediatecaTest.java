import java.util.Arrays;
import java.util.Random;

/**
 * Classe che rappresenta un artista.
 */
class Artista {
	String nome;
	String cognome;
	String nomeGruppo;

	/**
	 * Costruttore per un artista con nome e cognome
	 * 
	 * @param nome
	 *                node dell'artista
	 * @param cognome
	 *                cognome dell'artista
	 */
	Artista(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	/**
	 * Costruttore per un gruppo o per un artista con un nome d'arte
	 * 
	 * @param nomeGruppo
	 *                   nome del gruppo o nome d'arte dell'artista
	 */
	Artista(String nomeGruppo) {
		this.nomeGruppo = nomeGruppo;
	}

	/**
	 * Metodo che mostra le informazioni relative all'artista
	 */
	void mostra() {
		if (nomeGruppo == null)
			System.out.print(nome + " " + cognome);
		else
			System.out.print(nomeGruppo);
	}

	/**
	 * Metodo che confronta due artisti
	 * 
	 * @param artista
	 *                artista utilizzato per il confronto
	 * @return restituisce true se i due artisti sono uguali, false altrimenti.
	 */
	boolean confronta(Artista artista) {
		if (artista == null)
			return false;

		if (this == artista)
			// Referenza allo stesso oggetto
			return true;

		if (nomeGruppo != null) {
			if (artista.nomeGruppo == null)
				return false;
			return nomeGruppo.equals(artista.nomeGruppo);
		}

		if (nome == null) {
			if (artista.nome != null)
				return false;
		} else if (!nome.equals(artista.nome))
			return false;
		if (cognome == null) {
			if (artista.cognome != null)
				return false;
		} else if (!cognome.equals(artista.cognome))
			return false;
		return true;
	}
}

/**
 * Classe che rappresenta un brano musicale
 */
class Brano {
	String titolo;
	int durata;
	Artista specialGuest;

	private static final int DURATA_DEAFULT = 150;

	/**
	 * Costruttore per un brano senza special guest
	 * 
	 * @param titolo
	 *               titolo del brano
	 * @param durata
	 *               durata in secondi
	 */
	Brano(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata <= 0 ? DURATA_DEAFULT : durata;
	}

	/**
	 * Costruttore per un brano con uno special guest
	 * 
	 * @param titolo
	 *                     titolo del brano
	 * @param durata
	 *                     durata in secondi
	 * @param specialGuest
	 *                     special guest
	 */
	Brano(String titolo, int durata, Artista specialGuest) {
		this(titolo, durata);
		this.specialGuest = specialGuest;
	}

	/**
	 * Metodo che mostra le informazioni relative al brano, comprese quelle dello
	 * special guest se questo e' presente
	 */
	void mostra() {
		System.out.print(titolo + ", " + durata / 60 + ":" + (durata % 60 < 10 ? "0" : "") + durata % 60);
		if (specialGuest != null) {
			System.out.print(", special guest: ");
			specialGuest.mostra();
		}
		System.out.println();
	}
}

/**
 * Enumerativo che rappresenta i generi musicali
 */
enum GenereMusicale {
	JAZZ, CLASSICA, METAL, REGGAE, COUNTRY, BLUES, POP, SCONOSCIUTO
}

/**
 * Classe che rappresenta un album musicale
 */
class Album {
	String titolo;
	Artista artista;
	int anno;
	GenereMusicale genere = GenereMusicale.SCONOSCIUTO;
	Brano[] brani;
	int cntBrani;

	private static final int NUMERO_BRANI_DEAFULT = 12;
	private static final int ANNO_DEAFULT = 1995;

	/**
	 * Costruttore
	 * 
	 * @param titolo
	 *                titolo dell'album
	 * @param artista
	 *                artista dell'album
	 * @param anno
	 *                anno di uscita dell'album
	 * @param genere
	 *                genere musicale dell'album
	 * @param nrBrani
	 *                numero di brani presenti nell'album
	 */
	Album(String titolo, Artista artista, int anno, GenereMusicale genere, int nrBrani) {
		this.titolo = titolo;
		this.artista = artista;
		this.anno = anno < 1900 ? ANNO_DEAFULT : anno;
		this.genere = genere;
		brani = new Brano[nrBrani <= 0 ? NUMERO_BRANI_DEAFULT : nrBrani];
	}

	/**
	 * Metodo che mostra le informazioni relative all'album
	 * 
	 * @param mostraBrani
	 *                    se true, mostra anche i dettagli dei singoli brani. Se
	 *                    false, i dettagli dei brani non sono visualizzati
	 */
	void mostra(boolean mostraBrani) {
		System.out.println("Album: " + titolo + ", " + anno + ", " + genere.toString().toLowerCase());
		if (artista != null) {
			System.out.print("Artista: ");
			artista.mostra();
		}
		if (mostraBrani) {
			if (cntBrani == 0)
				System.out.println("Nessun brano.");
			else {
				System.out.println("\nBrani (" + cntBrani + "):");
				for (int i = 0; i < cntBrani; i++)
					brani[i].mostra();
			}
		}
		System.out.println();
	}

	/**
	 * Metodo per l'aggiunta di un brano all'album
	 * 
	 * @param brano
	 *              brano da aggiungere all'album
	 */
	void aggiungiBrano(Brano brano) {
		if (brano == null || cntBrani >= brani.length)
			return;
		brani[cntBrani++] = brano;
	}

	/**
	 * Metodo che controlla se l'artista dell'albun e' uguale a quello desiderato
	 * 
	 * @param artista artista usato per il controllo
	 * @return true se l'artista dell'album e' quello desiderato, false altrimenti
	 */
	boolean confronta(Artista artista) {
		if (artista == null)
			return this.artista == null;
		return this.artista.confronta(artista);
	}

	/**
	 * Metodo che controlla se l'anno di pubblicazione dell'album e' uguale a quello
	 * desiderato
	 * 
	 * @param anno anno usato per il controllo
	 * @return true se l'anno di pubblicazione dell'album e' quello desiderato,
	 *         false
	 *         altrimenti
	 */
	boolean confronta(int anno) {
		return this.anno == anno;
	}

	/**
	 * Metodo che controlla se il titolo dell'album e' quello desiderato
	 * 
	 * @param titolo titolo dell'album usato per il controllo
	 * @return true se il titolo dell'album e' quello desiderato, false altrimenti
	 */
	boolean confronta(String titolo) {
		if (titolo == null)
			return this.titolo == null;
		return this.titolo.equals(titolo);
	}
}

/**
 * Classe che rappresenta una playlist
 */
class Playlist {
	String nome;
	Brano[] brani;
	int cntBrani;

	private static final int NR_BRANI_DEAFULT = 12;

	/**
	 * Costruttore
	 * 
	 * @param nome
	 *                nome della playlist
	 * @param nrBrani
	 *                numero di brani che compongono la playlist. Se negativo o
	 *                uguale
	 *                a 0, il numero di brani e' 12
	 */
	Playlist(String nome, int nrBrani) {
		this.nome = nome;
		brani = new Brano[nrBrani <= 0 ? NR_BRANI_DEAFULT : nrBrani];
	}

	/**
	 * Metodo per l'aggiunta di un brano alla playlist
	 * 
	 * @param brano
	 *              brano da aggiungere alla playlist
	 */
	void aggiungi(Brano brano) {
		if (brano != null && cntBrani < brani.length)
			brani[cntBrani++] = brano;
	}

	/**
	 * Metodo per la rimozione dell'ultimo brano dalla playlist
	 * 
	 * @return restituisce il brano rimosso dalla playlist o null se la playlist e'
	 *         vuota
	 */
	Brano rimuovi() {
		if (cntBrani == 0)
			return null;
		Brano branoRimosso = brani[--cntBrani];
		brani[cntBrani] = null;
		return branoRimosso;
	}

	/**
	 * Metodo per la visualizzazione dei dettagli della playlist (nome e brani
	 * presenti)
	 */
	void mostra() {
		System.out.println("Nome: " + nome);
		if (cntBrani == 0)
			System.out.println("Nessun brano");
		else
			for (int i = 0; i < cntBrani; i++)
				brani[i].mostra();
	}
}

/**
 * Classe che rappresenta una mediateca
 */
class Mediateca {
	Album[] albums = new Album[30];
	int cntAlbum;

	/**
	 * Metodo per aggiungere un album alla mediateca. Ridimensiona l'array di album
	 * quando questo e' pieno
	 * 
	 * @param album
	 *              album da aggiugnere alla mediateca
	 */
	void aggiungi(Album album) {
		if (album == null)
			return;
		if (cntAlbum == albums.length) {
			// Crea un array più grande poiche' quello usato attualmente e' pieno
			Album[] tmp = new Album[albums.length * 2];
			System.arraycopy(albums, 0, tmp, 0, albums.length);
			albums = tmp;
		}
		albums[cntAlbum++] = album;
	}

	/**
	 * Metodo per la ricerca degli album di un determinato artista
	 * 
	 * @param artista
	 *                artista da ricercare
	 * @return restituisce un array contenente tutti gli album dell'artista in
	 *         questione o null se non sono presenti album dell'artista. L'array
	 *         restituito non contiene elementi uguali a null.
	 */
	Album[] cerca(Artista artista) {
		Album[] tmp = new Album[cntAlbum];
		int cnt = 0;
		for (int i = 0; i < cntAlbum; i++) {
			Album album = albums[i];
			if (album.confronta(artista))
				tmp[cnt++] = album;
		}
		return cnt == 0 ? null : Arrays.copyOf(tmp, cnt);
	}

	/**
	 * Metodo per la ricerca degli album pubblicati in un determinato anno
	 * 
	 * @param anno
	 *             anno utilizzato per la ricerca
	 * @return restituisce un array contenente tutti gli album pubblicati nell'anno
	 *         in questione o null se non sono presenti album pubblicati in
	 *         quell'anno. L'array restituito non contiene elementi uguali a null.
	 */
	Album[] cerca(int anno) {
		Album[] tmp = new Album[cntAlbum];
		int cnt = 0;
		for (int i = 0; i < cntAlbum; i++) {
			Album album = albums[i];
			if (album.confronta(anno))
				tmp[cnt++] = album;
		}
		return cnt == 0 ? null : Arrays.copyOf(tmp, cnt);
	}

	/**
	 * Metodo per la rimozione di un album con un determinato titolo
	 * 
	 * @param titoloAlbum
	 *                    titolo dell'album da rimuovere
	 */
	void rimuovi(String titoloAlbum) {
		for (int i = cntAlbum - 1; i >= 0; i--) {
			Album album = albums[i];
			if (!album.confronta(titoloAlbum))
				continue;
			int j;
			for (j = i; j < cntAlbum - 1; j++)
				albums[j] = albums[j + 1];
			albums[j] = null;
			cntAlbum--;
		}
	}

	/**
	 * Metodo per la visualizzazione dell'intera mediateca.
	 * 
	 * @param mostraBrani
	 *                    se true, mostra anche i dettagli di ogni brano. Se false
	 *                    non sono visualizzati i dettagli dei singoli
	 *                    brani di ogni album
	 */
	void mostra(boolean mostraBrani) {
		if (cntAlbum == 0) {
			System.out.println("Nessun album presente.\n");
			return;
		}

		for (int i = 0; i < cntAlbum; i++)
			albums[i].mostra(mostraBrani);
		System.out.println();
	}

	/**
	 * Metodo che restituisce una array contenete tutti i brani presenti nella
	 * mediateca
	 * 
	 * @return array contenete tutti i brani presenti nella mediateca o nulla se non
	 *         e' presente alcun brano
	 */
	Brano[] ottieniTuttiIBrani() {
		// Trova il numero di brani presenti nell'intera mediateca
		int cntBrani = 0;
		for (int i = 0; i < cntAlbum; i++)
			cntBrani += albums[i].cntBrani;

		if (cntBrani == 0)
			return null;

		// Crea un array contenente tutti i brani presenti nella mediateca
		Brano[] brani = new Brano[cntBrani];
		int cnt = 0;
		for (int i = 0; i < cntAlbum; i++) {
			Album album = albums[i];
			for (int j = 0; j < album.cntBrani; j++)
				brani[cnt++] = album.brani[j];
		}
		return brani;
	}

	/**
	 * Metodo per la creazione di una playlist casuale
	 * 
	 * @param nome
	 *                nome della playlist
	 * @param nrBrani
	 *                numero di brani presenti nella playlist
	 * @return restituisce una playlist generata casualmente o null se nessun brano
	 *         e' presente. La playlist generata casualmente potrebbe contenere dei
	 *         brani ripetuti piu' volte.
	 */
	Playlist creaPlaylistCasuale(String nome, int nrBrani) {
		// Crea un array contenente tutti i brani presenti nella mediateca
		Brano[] brani = ottieniTuttiIBrani();

		if (brani == null)
			// Nessn brano presente
			return null;

		// Crea una playlist con il numero di brani richiesti. I brani sono scelti
		// casualmente tra tutti quelli presenti nella mediateca
		Random random = new Random();
		Playlist playlist = new Playlist(nome, nrBrani);
		for (int i = 0; i < nrBrani; i++)
			playlist.aggiungi(brani[random.nextInt(brani.length)]);
		return playlist;
	}
}

/**
 * Classe di test per la classe Mediateca
 */
public class MediatecaTest {
	/**
	 * Procedura che mostra gli album contenuti nell'array di album ricevuto come
	 * parametro
	 * 
	 * @param albums      album da visualizzare
	 * @param mostraBrani se true vengono mostrati anche i brani che compongono
	 *                    l'album. Se false, viene mostrato solo il titolo
	 *                    dell'album e il nome dell'artista
	 */
	private static void mostraRisultati(Album[] albums, boolean mostraBrani) {
		if (albums == null) {
			System.out.println("Nessun album trovato!!\n");
			return;
		}
		for (Album album : albums)
			album.mostra(false);
	}

	/**
	 * Procedura main - parte principale del programma.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Crea la mediateca
		Mediateca mediateca = new Mediateca();

		// Crea gli artisti e i relativi album aggiungendo anche i brani ad ogni album
		Artista acdc = new Artista("AC/DC");
		Album album1 = new Album("Ballbreaker", acdc, 1995, GenereMusicale.METAL, 11);
		album1.aggiungiBrano(new Brano("Hard as Rock", 271));
		album1.aggiungiBrano(new Brano("Cover You in Oil", 273));
		album1.aggiungiBrano(new Brano("The Furor", 251));
		album1.aggiungiBrano(new Brano("Boogie Man", 247));
		album1.aggiungiBrano(new Brano("The Honey Roll", 335));
		album1.aggiungiBrano(new Brano("Burnin' Alive", 306));
		album1.aggiungiBrano(new Brano("Hail Ceasar", 314));
		album1.aggiungiBrano(new Brano("Love Bomb", 194));
		album1.aggiungiBrano(new Brano("Caught with Your Pants Down", 255));
		album1.aggiungiBrano(new Brano("Whiskey on the Rocks", 275));
		album1.aggiungiBrano(new Brano("Ballbreaker", 271));

		Album album2 = new Album("The Book of Souls", new Artista("Iron Maiden"), 2015, GenereMusicale.METAL, 1);
		album2.aggiungiBrano(new Brano("Empire of the Clouds", 1081));

		Album album3 = new Album("13", new Artista("Black Sabbath"), 2015, GenereMusicale.METAL, 1);
		album3.aggiungiBrano(new Brano("End of the Beginning", 486));

		Album album4 = new Album("Stagioni", new Artista("Francesco", "Guccini"), 2000, GenereMusicale.POP, 2);
		album4.aggiungiBrano(new Brano("Addio", 250));
		album4.aggiungiBrano(new Brano("E un giorno ...", 325));

		Album album5 = new Album("Metallica", new Artista("Metallica"), 1991, GenereMusicale.METAL, 1);
		album5.aggiungiBrano(new Brano("Enter Sandman", 331));

		Album album6 = new Album("Rock or Bust", acdc, 2015, GenereMusicale.METAL, 2);
		album6.aggiungiBrano(new Brano("Rock or Bust", 183));
		album6.aggiungiBrano(new Brano("Play Ball", 167));

		mediateca.aggiungi(album1);
		mediateca.aggiungi(album2);
		mediateca.aggiungi(album3);
		mediateca.aggiungi(album4);
		mediateca.aggiungi(album5);
		mediateca.aggiungi(album6);

		// Mostra il contenuto dell'intera mediateca con i dettagli di ogni brano
		mediateca.mostra(true);

		// Cerca vari artisti e mostra il risultato di tale ricerche
		System.out.println("Cerca artista AC/DC");
		mostraRisultati(mediateca.cerca(acdc), false);
		System.out.println("Cerca artista Iron Maiden");
		mostraRisultati(mediateca.cerca(new Artista("Iron Maiden")), false);
		System.out.println("Cerca artista Led Zeppelin");
		mostraRisultati(mediateca.cerca(new Artista("Led Zeppelin")), false);
		System.out.println("Cerca anno 1991");
		mostraRisultati(mediateca.cerca(1991), false);

		// Rimuovi un album dalla mediateca e mostra il nuovo contenuto
		System.out.println("Rimuovi album \"Rock or Bust\"");
		mediateca.rimuovi("Rock or Bust");

		// Mostra il contenuto dell'intera mediateca con i dettagli di ogni brano
		mediateca.mostra(true);

		// Crea e mostra due playlist casuali
		System.out.println("Playlist 1 - 5 brani");
		mediateca.creaPlaylistCasuale("Random 1", 5).mostra();
		System.out.println();

		System.out.println("Playlist 2 - 15 brani");
		mediateca.creaPlaylistCasuale("Random 2", 15).mostra();
	}
}
