import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

class Q3{
  public static void main(String[] args) {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    panel.setBackground(Color.lightGray);
    frame.add(panel);
    frame.setTitle("Grid Layout Example");
    frame.setSize(800, 300);
    frame.setResizable(true);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel.addMouseMotionListener(new MouseMotionListener(){

      @Override
      public void mouseMoved(MouseEvent e) {

      }

      @Override
      public void mouseDragged(MouseEvent e) {

        Graphics G=frame.getGraphics();
        G.setColor(Color.red);
        G.fillRect(e.getX(), e.getY(), 2, 2);

      }
    });

  }
}
