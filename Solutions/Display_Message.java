import java.awt.*;
import java.applet.*;

public class Display_Message extends Applet {
    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("MV Boli", Font.PLAIN, 24));
        setForeground(Color.GREEN);
        setBackground(Color.BLACK);
        /* the above 3 lines are optional */
        g.drawString("Hello World!", 80 , 150);
    }
}

// <APPLET code="Display_Message.java" height="300" width="300"> </APPLET>