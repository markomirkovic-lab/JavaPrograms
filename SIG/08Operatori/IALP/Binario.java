public class Binario {
    public static void main(String[] args) {
        int numero = 10;

        // Estraggo manualmente i bit (dall'ultimo al primo)
        int bit0 = numero % 2;         // Bit meno significativo
        numero = numero / 2;
        int bit1 = numero % 2;         // Secondo bit
        numero = numero / 2;
        int bit2 = numero % 2;         // Terzo bit
        numero = numero / 2;
        int bit3 = numero % 2;         
        numero = numero / 2;
        int bit4 = numero % 2;         
        numero = numero / 2;
        int bit5 = numero % 2;         
        numero = numero / 2;
        int bit6 = numero % 2;         
        numero = numero / 2;
        int bit7 = numero % 2;         // Bit più significativo (opzionale se si sa che 7 è 3 bit)      
        
        
        
        

        // Combino i bit in ordine per rappresentare il numero binario
        System.out.println("Numero binario: " + bit7 + bit6 + bit5 + bit4 + bit3 + bit2 + bit1 + bit0);
    }
}
