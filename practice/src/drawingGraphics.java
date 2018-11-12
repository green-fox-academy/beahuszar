import java.awt.*;
import javax.swing.*;

public class drawingGraphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g); //housekeeping stuff
        this.setBackground(Color.GREEN); //background color

        g.setColor(Color.BLUE); // color for graphics object
        g.fillRect(25,25,100,30);

        g.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255))); //RGB values
        g.fillRect(25,65,100,30);

        g.setColor(Color.RED);
        g.drawString("This is some text",25,120);
    }

    public static class forTheGraphics {
        public static void main(String[] args) {
            JFrame f = new JFrame("Title");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            drawingGraphics xxx = new drawingGraphics();
            f.add(xxx);
            f.setSize(800,500);
            f.setVisible(true);
        }
    }
}
