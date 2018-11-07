import java.awt.*;
import java.awt.event.*;
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

}
