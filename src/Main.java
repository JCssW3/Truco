
/* ------------------------------------------
 * Clase: Main
 * Versión: 0.1
 * Fecha: 15/09/2016
 * Autor: JCL
 * ------------------------------------------
 */

import enums.Estados;
import enums.Valores;
import poo.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        // Instancio los objetos

        Mazo mazo = new Mazo();

        Repartidor repartidor = new Repartidor();

        Juez juez = new Juez();

        CPU computadora = new CPU("CPUcita");

        Jugador jugador1 = new Jugador("Jugador 1");

        computadora.setEstado(Estados.PIE);

        jugador1.setEstado(Estados.MANO);

        int manos, cSel1;

        System.out.println("Jugamos a ver quien tira la carta con Mayor en valor de TRUCO:");

        manos = 1;

        do {

            repartidor.Repartir(computadora, jugador1, mazo);

            computadora.ordenar(Valores.TRUCO);

            jugador1.getMano();

            System.out.println("------------------------------------------");

            do {

                cSel1 = Integer.parseInt(JOptionPane.showInputDialog("¿Que carta desea jugar?"));

                Carta cJ2 = jugador1.jugarCarta(cSel1 - 1);

                System.out.println("Su carta: " + cJ2.toString());

                Carta cJ1 = computadora.comparar(cJ2, Valores.TRUCO);

                System.out.println(computadora.getNombre() + " jugó: " + cJ1.toString());

                juez.asignarPuntos(computadora, jugador1, cJ1, cJ2, Valores.TRUCO);

                System.out.println("------------------------------------------");

            } while (jugador1.getCartasEnMano() > 0);

            manos++;

        } while (computadora.getPuntos() < 30 && jugador1.getPuntos() < 30);

        System.out.println("------------------------------------------");
        System.out.println("Los puntos obtenidos por " + jugador1.getNombre() + " son : " + jugador1.getPuntos());
        System.out.println("Los puntos obtenidos por " + computadora.getNombre() + " son : " + computadora.getPuntos());
        System.out.println("------------------------------------------");

        if (computadora.getPuntos() > jugador1.getPuntos()) {
            System.out.println("Ganó después de " + manos + " manos: " + computadora.getNombre());
        } else {
            System.out.println("Ganó después de " + manos + " manos: " + jugador1.getNombre());
        }

    }

}