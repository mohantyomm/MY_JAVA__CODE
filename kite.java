import java.applet.Applet;
import java.awt.Graphics;
 
public class kite extends Applet {
	public void paint(Graphics g) {
		g.drawLine(50,100,100,50);
		g.drawLine(50,100,100,150);
		g.drawLine(100,150,100,200);
		g.drawLine(50,100,150,100);
		g.drawLine(100,50,100,150);
		g.drawLine(100,50,150,100);
		g.drawLine(150,100,100,150);
	}
}
