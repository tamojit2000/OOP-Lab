import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;


class Grid_Layout{
  public static void main(String[] args) {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();

    JButton btn1=new JButton("Button 1");
    JButton btn2=new JButton("Button 2");
    JButton btn3=new JButton("Button 3");
    JButton btn4=new JButton("Button 4");
    JButton btn5=new JButton("Button 5");
    JButton btn6=new JButton("Button 6");
    panel.add(btn1);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(btn4);
    panel.add(btn5);
    panel.add(btn6);

    panel.setLayout(new GridLayout(3, 2, 75, 75));
    frame.add(panel);
    frame.setTitle("Grid Layout Example");
    frame.setSize(800, 300);

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
