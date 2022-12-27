import java.awt.*;
import java.applet.*;

public class HelloB extends Applet {
    public void init() {
        setForeground(Color.white);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome To Java Applet", 40, 50);
    }

    public static void main(String[] args) {

    }

}
