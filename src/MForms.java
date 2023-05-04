import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MForms extends JFrame implements ActionListener {

    private final JButton btn1, btn2;
    private final JTextField t1, t2;
    private final JLabel l1, l2;

    public MForms(){
        setSize(320, 130);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

        //Creating Form Components
        l1 = new JLabel("Name: ");
        l2 = new JLabel("Surname: ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");

        add(l1); add(t1); add(l2); add(t2); add(btn1); add(btn2);



        this.btn1.addActionListener(this);
        this.btn2.addActionListener(this);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1)
        {
            dispose();

           MForm2 f2 = new MForm2();
           f2.L1.setText(t1.getText());
           f2.L2.setText(t2.getText());
        }
        if (e.getSource() == btn2)
        {
           t1.setText("");
           t2.setText(" ");
        }

    }
}
