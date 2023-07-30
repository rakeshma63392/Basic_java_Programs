import java.awt.*;
import java.applet.*;



public class LineRect {
    public void paint(Graphics g) {
        g.drawLine(10, 10, 50, 50);
        g.drawRect(10, 60, 40, 30);
        g.fillRect(60, 10, 30, 80);

    }

    public class applet extends LineRect {
        public static void main(String args[]) {

        }
    }
}