import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        int x1 = 40;
        int y1 = 40;

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        graphics.setColor(new Color(181,74,244));
        for (int i = HEIGHT - 30; i > 0 ; i -= 20) {
            graphics.drawLine(x1 + i,0,WIDTH,i);
        }

        graphics.setColor(Color.GREEN);
        for (int i = WIDTH - 30; i > 0 ; i -= 20) {
            graphics.drawLine(0,y1 + i,i,HEIGHT);
        }

    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Bea's Art");
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