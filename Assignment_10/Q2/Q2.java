import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Q2{
  static JFrame frame=new JFrame();
  static JPanel panel=new JPanel();

  static JButton btn1=new JButton("Button 1");
  static JButton btn2=new JButton("Button 2");
  static JButton btn3=new JButton("Button 3");
  static JButton btn4=new JButton("Button 4");
  static JButton btn5=new JButton("Button 5");
  static JButton btn6=new JButton("Button 6");

  static JLabel label=new JLabel("Label");

  public static void main(String[] args) {


    panel.add(btn1);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(btn4);
    panel.add(btn5);
    panel.add(btn6);

    panel.add(label);

    panel.setLayout(new GridLayout(3, 2, 75, 75));
    frame.add(panel);
    frame.setTitle("Grid Layout Example");
    frame.setSize(800, 300);

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    btn1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        Click();
      }
    });

    btn2.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        Click();
      }
    });

    btn3.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        Click();
      }
    });

    btn4.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        Click();
      }
    });

    btn5.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        Click();
      }
    });

    btn6.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        Click();
      }
    });

  }

  static void Click(){
    label.setText("Clicked");
  }

}
