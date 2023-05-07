import javax.swing.*;
import java.awt.*;

class Figure1 {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.red);
        g2D.fillRect(100, 100, 300, 300);

        g2D.setPaint(Color.black);
        g2D.fillRect(150, 150, 200, 200);

        g2D.setPaint(Color.yellow);
        g2D.fillOval(175, 175, 150, 150);
    }
}