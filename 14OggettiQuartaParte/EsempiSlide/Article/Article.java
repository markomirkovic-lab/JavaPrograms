import java.util.Random;

public class Article {
    static int nextId;

    // Static initialization block
    static {
        Random generator = new Random();
        // Set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // Do something useful
}
