import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

class Border_Layout{
  public static void main(String[] args) {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();

    JButton btn1=new JButton("Button 1");
    JButton btn2=new JButton("Button 2");
    JButton btn3=new JButton("Button 3");
    JButton btn4=new JButton("Button 4");
    JButton btn5=new JButton("Button 5");
    JButton btn6=new JButton("Button 6");

    panel.add(btn1,BorderLayout.WEST);
    panel.add(btn2,BorderLayout.CENTER);
    panel.add(btn3,BorderLayout.EAST);
    panel.add(btn4,BorderLayout.WEST);
    panel.add(btn5,BorderLayout.CENTER);
    panel.add(btn6,BorderLayout.EAST);

    frame.add(panel);
    frame.setTitle("Border_Layout");
    frame.setSize(800, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
