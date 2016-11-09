package poo;

import enums.Estados;
import enums.Valores;

public class Juez {

    public void asignarPuntos(Jugador j1, Jugador j2, Carta cJ1, Carta cJ2, Valores v) {

        if (cJ1.getValor(v) > cJ2.getValor(v)) {

            j1.setPuntos(3);
            System.out.println("---Ganó los 3 puntos: " + j1.getNombre() + ", tiene " + j1.getPuntos() + " puntos.");

        } else if (cJ1.getValor(v) < cJ2.getValor(v)) {

            j2.setPuntos(3);
            System.out.println("---Ganó los 3 puntos: " + j2.getNombre() + ", tiene " + j2.getPuntos() + " puntos.");

        } else {

            if (j1.getEstado() == Estados.MANO) {

                j1.setPuntos(3);
                System.out.println("---Ganó los 3 puntos: " + j1.getNombre() + " por -> " + j1.getEstado() + ", tiene " + j1.getPuntos() + " puntos.");

            } else {

                j2.setPuntos(3);
                System.out.println("---Ganó los 3 puntos: " + j2.getNombre() + " por -> " + j2.getEstado() + ", tiene " + j2.getPuntos() + " puntos.");

            }

        }

    }

}
