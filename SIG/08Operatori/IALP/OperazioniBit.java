public class OperazioniBit {

    // Metodo ausiliario per la conversione in binario con prefisso "0b"
    private static String toBinaryString(byte value) {
        return "0b" + String.format("%8s", Integer.toBinaryString(value & 0xFF)).replace(' ', '0');
    }


    public static void main(String[] args) {

        byte valore = 0b00000001; // 1
        byte shiftato = (byte) (valore << 1); // Sposta i bit a sinistra di 1 posizione

        // stampa i valori
        System.out.printf("Valore originale: %s%n", Integer.toBinaryString(valore & 0xFF));
        System.out.printf("Valore shiftato:  %s%n", Integer.toBinaryString(shiftato & 0xFF));
        
        // Converti i valori in stringa binaria di 8 bit con prefisso "0b"
        String binarioOriginale = "0b" + String.format("%8s", Integer.toBinaryString(valore & 0xFF)).replace(' ', '0');
        String binarioShiftato = "0b" + String.format("%8s", Integer.toBinaryString(shiftato & 0xFF)).replace(' ', '0');
        
        // Stampa i risultati
        System.out.println("Valore originale: " + binarioOriginale);
        System.out.println("Valore shiftato:  " + binarioShiftato);


        //--
        
        System.out.println();

        byte valore2 = 0b00000111; // 7
        byte shiftato2 = (byte) (valore2 << 1); // Sposta i bit a sinistra di 1 posizione

        // stampa i valori
        System.out.printf("Valore originale: %s%n", Integer.toBinaryString(valore2 & 0xFF));
        System.out.printf("Valore shiftato:  %s%n", Integer.toBinaryString(shiftato2 & 0xFF));
        
        // Converti i valori in stringa binaria di 8 bit con prefisso "0b"
        String binarioOriginale2 = "0b" + String.format("%8s", Integer.toBinaryString(valore2 & 0xFF)).replace(' ', '0');
        String binarioShiftato2 = "0b" + String.format("%8s", Integer.toBinaryString(shiftato2 & 0xFF)).replace(' ', '0');
        
        // Stampa i risultati
        System.out.println("Valore originale: " + binarioOriginale2);
        System.out.println("Valore shiftato:  " + binarioShiftato2);
    }
}
