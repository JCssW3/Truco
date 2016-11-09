/* ------------------------------------------
 * Clase: valorCartas
 * Versión: 0.1
 * Fecha: 14/09/2016
 * Autor: JCL
 * ------------------------------------------
 */

package enums;

public enum Cartas {

	UNO(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	DIEZ(10),
	ONCE(11),
	DOCE(12);

	// Declaro las variables
	private int numero;

	Cartas(int numero){
		this.numero = numero;
	}

	// Métodos getters
	public int getNumero(){
		return this.numero;
	}

}