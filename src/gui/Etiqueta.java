package gui;

import java.awt.*;
import javax.swing.JPanel;

public class Etiqueta extends JPanel {

	private static final long serialVersionUID = 1L;
	private String texto;
	private int xPos;
	private int yPos;

	public Etiqueta(String texto, int xPos, int yPos){

		this.texto = texto;
		this.xPos = xPos;
		this.yPos = yPos;

	}

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		g.drawString(this.texto, this.xPos, this.yPos);

	}

}
