import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots2 {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] myArray = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] myArray2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}};

            connectIt(myArray2, graphics);
    }

    public static void connectIt (int[][] input, Graphics graphics){
        int[] xArray = new int[input.length];
        int[] yArray = new int[input.length];

        graphics.setColor(Color.GREEN);

        for (int i = 0; i < input.length; i++) {
            xArray[i] = input[i][0];
            yArray[i] = input[i][1];
        }
        graphics.fillPolygon(xArray,yArray,input.length);

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