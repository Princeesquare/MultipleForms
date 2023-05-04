import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MForm2 extends JFrame implements ActionListener {

    public JLabel L1, L2;
    public MForm2() {
        setSize(200, 130);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

       L1 = new JLabel("Name ");  L2 = new JLabel("Surname");

       add(L1); add(L2);




        setVisible(true);
    }

    public void setName(String n) {
        L1.setText("Name: ");
    }
    public void setSurname(String n) {
        L2.setText("Surname: ");
    }

    @Override

    public void actionPerformed(ActionEvent e){

    }

}
