import java.applet.*;
import java.awt.*;

public class Figure2 extends Applet{

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        int[] x1points = {50, 250, 250};
        int[] y1points = {250, 250, 50};
        int npoints = 3;
        g.fillPolygon(x1points, y1points, npoints);

        g.setColor(Color.yellow);
        int[] x2points = {250, 450, 250};
        int[] y2points = {250, 250, 50};
        g.fillPolygon(x2points, y2points, npoints);

        g.setColor(Color.green);
        int[] x3points = {250, 450, 250};
        int[] y3points = {250, 250, 450};
        g.fillPolygon(x3points, y3points, npoints);
    }
}

// <APPLET code="Figure2.java" height="500" width="500">
// </APPLET>