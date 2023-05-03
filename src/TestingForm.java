import javax.swing.*;
import java.awt.event.WindowAdapter;

public class TestingForm extends JFrame{
    private JButton button1;
    private JButton button2;
    private JRadioButton radioButton1;
    private JPanel mainPanel;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Testeo");
        frame.setContentPane(new TestingForm().mainPanel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}


