import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int x1 = 0;
        int y1 = 0;
        int hDiv = HEIGHT / 2;
        int wDiv = WIDTH / 2;

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        for (int i = 20; i < hDiv; i += 20) {
            graphics.setColor(new Color(181,74,244));
            graphics.drawLine(x1 + i,0,wDiv,y1 + i); //upper left
            graphics.drawLine(wDiv + i,0,WIDTH ,y1 + i); //upper right
            graphics.drawLine(x1 + i,hDiv,wDiv,hDiv + i); //lower left
            graphics.drawLine(wDiv + i,hDiv,WIDTH ,hDiv + i); //lower right
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0,y1 + i,x1 + i,hDiv);
            graphics.drawLine(wDiv,y1 + i,wDiv + i,hDiv);
            graphics.drawLine(0,hDiv + i,x1 + i,HEIGHT );
            graphics.drawLine(wDiv,hDiv + i,wDiv + i, HEIGHT );
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