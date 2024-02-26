package snake2;

//import java.awt.Graphics;
import java.util.Random;

public class Food {

    private final int posX;
    private final int posY;

    public Food() {
        posX = generatePos(Snake.WIDTH);
        posY = generatePos(Snake.HEIGHT);
    }

    private int generatePos(int size) {
        Random random = new Random();
        return random.nextInt(size / Snake.TICK_SIZE) * Snake.TICK_SIZE;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}