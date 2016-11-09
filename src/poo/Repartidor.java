/* ------------------------------------------
 * Clase: Repartidor
 * Versión: 0.1
 * Fecha: 18/09/2016
 * Autor: JCL
 * ------------------------------------------
 */

package poo;

public class Repartidor {

	public void Repartir(Jugador j1, Jugador j2, Mazo mazo) {

		// El repartidor baraja
		mazo.mezclar();

		// Cambio los estados de los jugadores
		j1.cambiarEstado();
		j2.cambiarEstado();
		
		// Pone las 6 cartas sobre la mesa
		Carta[] cj1 = { mazo.getCarta(1), mazo.getCarta(3), mazo.getCarta(5) };
		Carta[] cj2 = { mazo.getCarta(2), mazo.getCarta(4), mazo.getCarta(6) };

		// Cada jugador agarra las 3 que le correponde
		j1.setCartas(cj1);
		j2.setCartas(cj2);

	}

}