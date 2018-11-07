import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] myArray = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        for (int i = 0; i < myArray.length; i++) {
            connectIt(myArray, graphics);
        }
    }

    public static void connectIt (int[][] input, Graphics graphics){
        int[][] newArray = input;

        graphics.setColor(Color.GREEN);

        for (int i = 0; i < newArray.length ; i++) {
            for (int j = 0; j < newArray.length; j++) {
                graphics.drawLine(newArray[i][0],newArray[j][1],newArray[i][0],newArray[j][1]);
            }
        }

/*        graphics.drawLine(newArray[0][0],newArray[0][1],newArray[1][0],newArray[1][1]);
        graphics.drawLine(newArray[1][0],newArray[1][1],newArray[2][0],newArray[2][1]);
        graphics.drawLine(newArray[2][0],newArray[2][1],newArray[3][0],newArray[3][1]);
        graphics.drawLine(newArray[3][0],newArray[3][1],newArray[0][0],newArray[0][1]);*/
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