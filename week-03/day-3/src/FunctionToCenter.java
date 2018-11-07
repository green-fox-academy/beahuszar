import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int step = 10;
        for (int i = 0; i <= HEIGHT; i += step) {
            for (int j = 0; j <= HEIGHT ; j += step) {
                drawLine(i,0,graphics);
                drawLine(0,j,graphics);
                drawLine(HEIGHT,j,graphics);
                drawLine(i,HEIGHT,graphics);
            }
        }
    }

    public static void drawLine (int input1, int input2, Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.drawLine(input1,input2,WIDTH/2,HEIGHT/2);
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