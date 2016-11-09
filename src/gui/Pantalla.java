package gui;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Pantalla {

	private Toolkit pantalla;
	private Dimension dimensionPantalla;
	private int altoPantalla;
	private int anchoPantalla;

	public Pantalla() {

		// Crea un objeto que va a contener info sobre la resolución
		// del monitor.

		pantalla = Toolkit.getDefaultToolkit();
		dimensionPantalla = pantalla.getScreenSize();

		altoPantalla = dimensionPantalla.height;
		anchoPantalla = dimensionPantalla.width;

	}

	public int getAncho() {
		return anchoPantalla;
	}

	public int getAlto() {
		return altoPantalla;
	}

}
