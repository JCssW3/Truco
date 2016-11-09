/* ------------------------------------------
 * Clase: Jugador
 * Versión: 0.1
 * Fecha: 18/09/2016
 * Autor: JCL
 * ------------------------------------------
 */

package poo;

import enums.Estados;

public class Jugador {

    private String nombre;
    private Estados estado;
    private Carta[] cartas;
    private int puntos;

    public Jugador(String nombre) {

        this.nombre = nombre;

    }

    // Métodos SETTERS
    // -----------------------------------------------------------

    public void setCartas(Carta[] cartas) {

        // Acá si son más de 3 tendría que
        // arrojar una exception "RepartoException"
        this.cartas = cartas;

    }

    public void setEstado(Estados estado) {

        this.estado = estado;

    }

    public void cambiarEstado() { // Alterno el estado del jugador

        if (estado == Estados.MANO) {
            estado = Estados.PIE;
        } else {
            estado = Estados.MANO;
        }

    }

    public void setPuntos(int puntos) {

        this.puntos += puntos;

    }

    // Métodos GETTERS
    // -----------------------------------------------------------

    public String getNombre() {

        return this.nombre;

    }

    public Carta getCarta(int i) { // Devuelve una carta especifica

        return this.cartas[i - 1];

    }

    public Carta[] getCartas() { // Devuelve todas las cartas

        return this.cartas;

    }

    public int getPuntos() {

        return this.puntos;
    }

    public Estados getEstado() {

        return estado;

    }

    public int getCartasEnMano() {

        int cantidad = 0;

        // Si la carta en la posición
        // no es null, la cuento
        for (Carta c : cartas) {
            if (c != null) {
                cantidad++;
            }
        }

        return cantidad;

    }

    // Acciones -------------------------------------------------------------

    public Carta jugarCarta(int c) {

        // Acá si la carta ya fué jugada debería
        // arrojar una exception "CartaException"

        // Almaceno la carta seleccionada para jugarla...
        Carta cartaJugada = cartas[c];

        // Ahora voy a sacar esa carta de la mano del jugador
        Carta[] cartasRestantes = new Carta[cartas.length];

        int indice = 0;

        for (Carta carta : this.cartas) {

            if (cartaJugada != carta) {
                // Si la carta es distinta a la jugada la conservo
                cartasRestantes[indice] = carta;

            } else {
                // En caso contrario la retiro
                cartasRestantes[indice] = null;
            }

            indice++;

        }

        // Seteo las cartas restantes
        setCartas(cartasRestantes);

        // finalmente juego la carta
        return cartaJugada;

    }

    // @debugger Candidato a borrarse
    public void getMano() {

        System.out.println("Las cartas de " + nombre + " son: ");

        int i = 1;

        for (Carta c : cartas) {

            // Si la carta es null es porque ya se jugó
            if (c != null) {
                System.out.println(i + ": " + c.toString());
            } else {
                System.out.println(i + ": Ya jugada!");
            }

            i++;

        }

    }

    // @debugger Candidato a borrarse
    public boolean esFlor() {

        return cartas[0].getPalo() == cartas[1].getPalo() && cartas[1].getPalo() == cartas[2].getPalo();

    }

}