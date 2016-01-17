import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JFrame;


public class StockInterfaceApplet extends Applet
{
	
	@Override
	public void init()
	{
		this.add(new StockInterface());

	}
}
