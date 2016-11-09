/* ------------------------------------------
 * Clase: Mazo
 * Versión: 0.1
 * Fecha: 18/09/2016
 * Autor: JCL
 * ------------------------------------------
 */

package poo;

import enums.Palos;
import enums.Cartas;

import java.util.Arrays;
import java.util.Collections;

public class Mazo {

	private Carta[] mazo;

	public Mazo() {

		// Declaro el array valoresCartas y palos
		Cartas[] valoresCartas = Cartas.values();
		Palos[] palos = Palos.values();

		// Declaro el array mazo
		this.mazo = new Carta[40];

		byte indice = 0;

		// Recorro ambos arrays para poder armar las cartas
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				this.mazo[indice] = new Carta(valoresCartas[j], palos[i]);
				indice++;
			}
		}

	}

	public void mezclar() {

		// Mezcla las cartas
		Collections.shuffle(Arrays.asList(this.mazo));

	}

	public Carta getCarta(int i) {

		// Devuelve una carta especifica del mazo
		return this.mazo[i-1];

	}

}