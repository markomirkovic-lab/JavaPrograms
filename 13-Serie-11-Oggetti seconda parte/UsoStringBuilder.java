/**
 * Programma che usa la classe StringBuilder per concatenare le iniziali di ogni parola presente
 * all'interno di un paragrafo. Inserisce uno spazio tra due vocali consecutive
 */
public class UsoStringBuilder {

	/**
	 * Funzione che controlla se il carattere è una vocale
	 * 
	 * @param ch
	 *            carattere da controllare
	 * @return true se è una vocale, false se non lo è
	 */
	private static boolean vocale(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
				|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}

	/**
	 * Procedura main - parte principale del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String paragrafo = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit."
				+ " Ut purus elit, vestibulum ut, placerat ac, adipiscing vitae,"
				+ " felis. Curabitur dictum gravida mauris. Nam arcu libero, nonummy"
				+ " eget, consectetuer id, vulputate a, magna. Donec vehicula augue"
				+ " eu neque. Pellentesque habitant morbi tristique senectus et netus"
				+ " et malesuada fames ac turpis egestas. Mauris ut leo. Cras viverra"
				+ " metus rhoncus sem. Nulla et lectus vestibulum urna fringilla"
				+ " ultrices. Phasellus eu tellus sit amet tortor gravida placerat."
				+ " Integer sapien est, iaculis in, pretium quis, viverra ac, nunc."
				+ " Praesent eget sem vel leo ultrices bibendum. Aenean faucibus."
				+ " Morbi dolor nulla, malesuada eu, pulvinar at, mollis ac, nulla."
				+ " Curabitur auctor semper nulla. Donec varius orci eget risus."
				+ " Duis nibh mi, congue eu, accumsan eleifend, sagittis quis, diam."
				+ " Duis eget orci sit amet orci dignissim rutrum.";

		// Rimuovi tutti i caratteri non alfa numerici (esclusi gli spazi)
		paragrafo = paragrafo.replaceAll("[^a-zA-Z0-9 ]", "");
		// Crea un array di String contenete le singole parole
		String parole[] = paragrafo.split(" ");

		// Concatena le iniziali di ogni parola separando con uno spazio due vocali consecutive
		StringBuilder strConcat = new StringBuilder();
		char charPrecedente = ' ';
		for (String parola : parole) {
			char charAttuale = parola.charAt(0);
			if (vocale(charPrecedente) && vocale(charAttuale))
				strConcat.append(' ');
			strConcat.append(charAttuale);
			charPrecedente = charAttuale;
		}

		System.out.println("Stringa concatenata: " + strConcat.toString());
	}
}
