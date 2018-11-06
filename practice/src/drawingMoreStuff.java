import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class drawingMoreStuff extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.drawLine(10,25,200,45); //line drawing, 10 over 25 down, downhill line (0,0 left upper corner)

        g.setColor(Color.RED);
        g.drawRect(10,55, 100, 30); //10 over 55 down 100 wide 30 pixels tall

        g.setColor(Color.GREEN);
        g.fillOval(10, 95, 100,30); //same as rect but rounded edges,

        g.setColor(Color.ORANGE);
        g.fill3DRect(10,160,100,50, true); //raised:true --> 3D


    }
}
