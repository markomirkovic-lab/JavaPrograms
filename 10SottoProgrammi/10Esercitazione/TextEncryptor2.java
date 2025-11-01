import java.util.Scanner;

public class TextEncryptor {

    // algoritmo di Fisher-Yates per mescolare un array
    private static void shuffleArray(char[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            char a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static char[] getAllPrintablepCharacters() {
        char[] encryptorArray = new char[95];
        for (int i = 0; i < encryptorArray.length; i++) {
            encryptorArray[i] = (char) (i + 32);
        }
        return encryptorArray;
    }

    private static char[] getEncryptor() {
        char[] charMap = getAllPrintablepCharacters();
        shuffleArray(charMap);
        return charMap;
    }

    public static String encryptText(String text, char[] charMap) {
        String encryptedString = "";
        for (int i = 0; i < text.length(); ++i) {
            char currentChar = text.charAt(i);
            int mapIndex = currentChar - 32;
            encryptedString += charMap[mapIndex];
        }
        return encryptedString;
    }

    private static int findIndexInCharMap(char character, char[] charMap) {
        for (int i = 0; i < charMap.length; ++i) {
            if (charMap[i] == character) {
                return i;
            }
        }
        return -1;
    }

    public static String decryptText(String encryptedText, char[] charMap) {
        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); ++i) {
            int mapIndex = findIndexInCharMap(encryptedText.charAt(i), charMap);
            if (mapIndex != -1) {
                decryptedText += (char) (mapIndex + 32);
            }
        }
        return decryptedText;
    }

    public static String reverseString(String original) {
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return reversed;
    }

    public static String alternateCase(String text) {
        String alternateCase = "";
        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if (currentCharacter >= 'a' && currentCharacter <= 'z') {
                alternateCase += (char) (currentCharacter - 32); // Convert to uppercase by subtracting 32
            } else if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                alternateCase += (char) (currentCharacter + 32); // Convert to lowercase by adding 32
            } else {
                alternateCase += currentCharacter;
            }
        }
        return alternateCase;
    }

    public static void main(String[] args) {
        char[] charMap = getEncryptor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to encrypt:");
        String userInput = scanner.nextLine();

        String encryptedText = encryptText(userInput, charMap);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decryptText(encryptedText, charMap);
        System.out.println("Decrypted Text: " + decryptedText);

        if (decryptedText.equals(userInput)) {
            System.out.println("The deciphered text corresponds to the original.");
        } else {
            System.out.println("ERROR: The decrypted text does NOT match the original.");
        }

        String reversedEncryptedText = reverseString(encryptedText);
        System.out.println("Reversed Encrypted Text: " + reversedEncryptedText);

        String alternateCaseEncryptedText = alternateCase(encryptedText);
        System.out.println("Alternate Case Encrypted Text: " + alternateCaseEncryptedText);

        scanner.close();
    }
}