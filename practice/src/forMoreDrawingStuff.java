import javax.swing.*;
import java.awt.*;

public class forMoreDrawingStuff {
    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingMoreStuff p = new drawingMoreStuff();
        p.setBackground(Color.BLACK);
        f.add(p);
        f.setSize(500,270);
        f.setVisible(true);
    }
}
