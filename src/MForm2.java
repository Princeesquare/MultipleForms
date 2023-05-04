import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MForm2 extends JFrame implements ActionListener {

    public JLabel L1, L2;
    public MForm2() {
        setSize(200, 130);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

       L1 = new JLabel("Name: ");  L2 = new JLabel("Surname: ");

       add(L1); add(L2);

       // Customizing the Window Close Button to Confirm Close Operation
       addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent windowEvent){
               if (JOptionPane.showConfirmDialog(null,
                       "Do you want to close this window?",
                       "Really closing?", JOptionPane.YES_NO_OPTION,
                       JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
                   dispose();
            }
        });
        setVisible(true);
    }

    public void setName(String n) {
        L1.setText("Name: "+ n);
    }
    public void setSurname(String n) {
        L2.setText("Surname: "+ n);
    }

    @Override

    public void actionPerformed(ActionEvent e){

    }

}
