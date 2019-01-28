import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Linhas extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		final int centroY = getHeight()/2 - 5;
		final int centroX = getWidth()/2 - 5;
		final SecureRandom aleatorio = new SecureRandom();
		
		
		for(int i = 0; i < aleatorio.nextInt(10000000); i++) {
			
			g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			
			g2d.draw(new Line2D.Double(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()), 
					aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight())));
			
		}
		
		
	}
	
}
