import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Rectangle {
  public static void mainDraw(Graphics graphics){
      squareDraw(HEIGHT,graphics);
  }

  public static void squareDraw (int input, Graphics graphics) {

    graphics.setColor(Color.BLACK);
    graphics.fillRect(input / 3,0,input / 3 ,input / 3);
    graphics.setColor(Color.RED);
    graphics.fillRect((input / 3) * 2,input / 3,input / 3 ,input / 3);
    graphics.setColor(Color.ORANGE);
    graphics.fillRect(input / 3,(input / 3) * 2,input / 3 ,input / 3);
    graphics.setColor(Color.BLUE);
    graphics.fillRect(0,input / 3,input / 3,input / 3);


    graphics.setColor(Color.RED);
    graphics.fillRect(input / 3,0,(input / 3) / 3 ,(input / 3) / 3 );
    graphics.setColor(Color.YELLOW);
    graphics.fillRect((input / 3) * 2,input / 3,(input / 3) / 3  ,(input / 3) / 3 );
    graphics.setColor(Color.GREEN);
    graphics.fillRect(input / 3,(input / 3) * 2,(input / 3) / 3  ,(input / 3) / 3 );
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,input / 3,(input / 3) / 3 ,(input / 3) / 3 );

  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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
