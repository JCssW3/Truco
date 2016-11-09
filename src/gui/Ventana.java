package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ventana extends JFrame implements WindowListener{

	private static final long serialVersionUID = 1L;

	private String titulo;
	private int ancho;
	private int alto;

	public Ventana(String titulo, int ancho, int alto) {

		this.titulo = titulo;

		setTitle(this.titulo);

		this.ancho = ancho;
		this.alto = alto;

		setSize(this.ancho, this.alto);

        Centrar();

	}

	public void Centrar() {

		// Declaro las variables de posición
		int posX, posY;

		Pantalla pantalla = new Pantalla();

		// Calculo la posición central teniendo en cuenta la ventana
        // ATENCIÓN no tiene en cuenta el redimensionamiento en tiempo
        // de ejecución!
		posY = (pantalla.getAlto() / 2) - (this.getHeight() / 2);
		posX = (pantalla.getAncho() / 2) - (this.getWidth() / 2);

		// Establezco la posición centrada
		setLocation(posX, posY);

	}

	public void setIcono(String imagen) {

		// Declaro el elemento Toolkit que va a traer la imagen
		Toolkit tk = Toolkit.getDefaultToolkit();

		// Almaceno la imagen en icono
		Image icono = tk.getImage(imagen);

		// Seteo el icono de la ventana
		setIconImage(icono);

	}

	public void setColorFondo(Color color){

		this.getContentPane().setBackground(color);

	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {
        System.out.println("Se minimizó");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
        Centrar();
	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}