package gui;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class PruebaGUI {

	public static void main(String[] args) {

		Ventana principal = new Ventana("Prueba", 750, 500);

		principal.setIcono("src/gui/imagenes/icon.png");

        principal.setBackground(Color.ORANGE);

		//principal.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		Etiqueta texto = new Etiqueta("Una prueba de texto", 25, 25);

		principal.setVisible(true);

		principal.add(texto);

		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		principal.addWindowListener(principal);

	}

}
