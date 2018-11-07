import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = 40;
        int step = size * 2;
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        for (int i = 0; i <= HEIGHT ; i += step) {
            for (int j = 0; j <= HEIGHT ; j += step) {
                graphics.clearRect(i,j,size,size);
            }
        }
        for (int i = size; i <= HEIGHT ; i += 80) {
            for (int j = size; j <= HEIGHT ; j += 80) {
                graphics.clearRect(i,j,size,size);
            }
        }
    }




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}