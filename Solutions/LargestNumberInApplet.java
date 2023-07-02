import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// <applet code="LargestApplet" height="800" width="800"></applet>
public class LargestNumberInApplet extends Applet implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2;
    Button b1;

    public void init() {
        l1 = new Label("Enter the first number");
        l2 = new Label("Enter the second number");
        l3 = new Label();
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Find");
        setLayout(null);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(l3);
        l1.setBounds(200, 200, 150, 20);
        t1.setBounds(360, 200, 100, 20);
        l3.setBounds(360, 280, 150, 20);

        l2.setBounds(200, 230, 150, 20);
        t2.setBounds(360, 230, 100, 20);
        b1.setBounds(390, 250, 30, 20);

        b1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (a > b)
            l3.setText("The largest number is:" + a);
        else
            l3.setText("The largest number is:" + b);
    }
}
