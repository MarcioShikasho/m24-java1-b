package br.com.senaisp.bauru.marcio.licao07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhoSwing extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, 150, 150);
		g.setColor(Color.GREEN);
		g.fillOval(300, 50, 150, 150);
		g.setColor(Color.RED);
		int[] xPontos = {600, 525, 675};
		int[] yPontos = {50, 200, 200};
		g.fillPolygon(xPontos, yPontos, 3);
		
	}
}
