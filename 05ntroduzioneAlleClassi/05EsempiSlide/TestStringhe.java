public class TestStringhe {
    public static void main(String[] args) {
        String testStr = "Ciao, Mondo!";
        String newStr = "ciao, Mamma!";
        int i = 0, j = 4;
        System.out.println("La prima stringa è " + testStr);
        System.out.println("La seconda stringa è " + newStr);
        System.out.println("È " + testStr.equals(newStr) + " che le due stringhe sono uguali");
        System.out.print("Ignorando la differenza tra minuscole e maiuscole, allora ");
        System.out.println(testStr.equalsIgnoreCase(newStr));
        System.out.println("La prima stringa è lunga " + testStr.length() + " caratteri");
        System.out.println("Il primo carattere della prima stringa è " + testStr.charAt(0));
        System.out.println("La sottostringa compresa tra " + i + " e " + j + " è " + testStr.substring(i, j));
        System.out.println("La prima stringa in maiuscolo è: " + testStr.toUpperCase());
    }
}
