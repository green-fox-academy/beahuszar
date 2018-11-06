import javax.swing.*;

public class forTheGraphics {
    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawingGraphics xxx = new drawingGraphics();
        f.add(xxx);
        f.setSize(800,500);
        f.setVisible(true);
    }
}
