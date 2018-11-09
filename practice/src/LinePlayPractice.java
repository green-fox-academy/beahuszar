import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayPractice {
    public static void mainDraw(Graphics graphics) {

        int x1 = 0;
        int y1 = 0;
        int hDiv = HEIGHT / 4;
        int wDiv = WIDTH / 4;
        int x2 = wDiv;
        int y2 = hDiv;

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

       for (int j = 0; j < 100 * hDiv; j += hDiv) {
           x1 += j;
           x2 += j;
           y1 += j;
           y2 += j;
            for (int i = 20; i < hDiv; i += 20) {
                graphics.setColor(new Color(181, 74, 244));
                graphics.drawLine(x1 + i, y1, x2, y1 + i);
                graphics.drawLine(x1 + i, y1 + hDiv, x2, y1 + i + hDiv);
                graphics.drawLine(x1 + i + wDiv, y1, x2 + wDiv, y1 + i);
                graphics.setColor(Color.GREEN);
                graphics.drawLine(x1, y1 + i, x1 + i, y2);
                graphics.drawLine(x1 + wDiv, y1 + i, x1 + i + wDiv, y2);
                graphics.drawLine(x1, y1 + i+ hDiv, x1 + i, y2+ hDiv);
            }
        }



    }


    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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