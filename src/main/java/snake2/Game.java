package snake2;

//import java.awt.Graphics;

import javax.swing.*;

public class Game extends JFrame {

    public Game() {
        this.add(new Snake());
        this.setTitle("Snake Game");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}