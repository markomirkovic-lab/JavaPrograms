import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */

/**
 * Programma che permette a Kara di trovare e raccogliere il quadrifoglio
 * all'uscita del labirinto.
 */
public class Labirinto extends JavaKaraProgram {

    public void myProgram() {
        // Flag per la direzione di movimento
        boolean left2Right = true;
        while (!kara.onLeaf()) {
            // Cerca la prossima uscita
            while ((kara.treeLeft() && kara.treeRight())
                    || (left2Right && kara.treeLeft())
                    || (!left2Right && kara.treeRight())) {
                if (kara.treeFront()) {
                    // In fondo alla riga, inverti la direzione
                    kara.turnLeft();
                    kara.turnLeft();
                    left2Right = !left2Right;
                } else
                    kara.move();
            }
            if (left2Right) {
                // Uscita sulla sinistra
                kara.turnLeft();
                kara.move();
                kara.move();
                kara.turnLeft();
            } else {
                // Uscita sulla destra
                kara.turnRight();
                kara.move();
                kara.move();
                kara.turnRight();
            }
            // Inverti la direzione di movimento
            left2Right = !left2Right;
        }
        // Preleva il quadrifoglio
        kara.removeLeaf();
    }
}
