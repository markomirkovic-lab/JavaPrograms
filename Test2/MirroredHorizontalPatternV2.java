import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 * 
 * 
 * Divdere il mondo array / 2
 * 
 * JK percorre la colonna si ferma alla prima cella colonna
 * scrivere nelle celle array quanti valori ci sono
 * via giu' come va su
 * ruoto, avanti uno, ruota
 * arrivata al trono lo scavalca alto, sinistra, giu
 * deposito quadrifogli in base agli indici precedenti
 */
public class MirroredHorizontalPatternV2 extends JavaKaraProgram {
    //
    // you can define your methods here:
    //
    public void myProgram() {
        int worldSize = world.getSizeX();
        int patternLength = (worldSize - 1) / 2;
        int[] leafCounter = new int[patternLength];

        // Read the pattern
        for (int i = 0; i < patternLength; i++) {
            kara.turnRight();

            while (kara.onLeaf()) {
                leafCounter[i]++;//contattore cella array
                kara.move();
            }

            kara.turnLeft();
            kara.turnLeft();

            for (int j = 0; j < leafCounter[i]; j++) {
                kara.move();
            }

            if (i != patternLength - 1) {
                kara.turnRight();
                kara.move();
            }
        }

        // Climbing over the tree
        kara.turnRight();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.turnRight();

        // Write the reverse pattern
        for (int i = patternLength - 1; i >= 0; i--) {
            for (int j = 0; j < leafCounter[i]; j++) {
                kara.putLeaf();
                kara.move();
            }

            kara.turnLeft();
            kara.turnLeft();

            for (int j = 0; j < leafCounter[i]; j++) {
                kara.move();
            }

            if (i != 0) {
                kara.turnRight();
                kara.move();
                kara.turnRight();
            }

        }

    }
}
