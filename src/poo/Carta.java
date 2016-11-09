/* ------------------------------------------
 * Clase: Carta
 * Versión: 0.1
 * Fecha: 15/09/2016
 * Autor: JCL
 * ------------------------------------------
 */

package poo;

import enums.Palos;
import enums.Cartas;
import enums.Valores;

public class Carta {

    private Cartas carta;
    private Palos palo;
    private int valorEnvido;
    private int valorTruco;

    public Carta(Cartas carta, Palos palo) {

        this.carta = carta;
        this.palo = palo;

        // Asigno el valor de la carta para el envido

        if(carta.getNumero() > 7) {
            valorEnvido = 0;
        } else {
            valorEnvido = carta.getNumero();
        }

        // Asigno el valor de la carta para el truco

        if (carta.name().equals("UNO") && palo.name().equals("ESPADA")) {
            valorTruco = 19;
        } else if (carta.name().equals("UNO") && palo.name().equals("BASTO")) {
            valorTruco = 18;
        } else if (carta.name().equals("SIETE") && palo.name().equals("ESPADA")) {
            valorTruco = 17;
        } else if (carta.name().equals("SIETE") && palo.name().equals("ORO")) {
            valorTruco = 16;
        } else if (carta.name().equals("TRES")) {
            valorTruco = 15;
        } else if (carta.name().equals("DOS")) {
            valorTruco = 14;
        } else if (carta.name().equals("UNO")) {
            valorTruco = 13;
        } else {
            valorTruco = carta.getNumero();
        }

    }

    // Métodos getters

    public int getNumeroCarta() {

        return carta.getNumero();

    }

    public String getPalo() {

        return palo.name();

    }

    public int getValor(Valores v) {

        switch (v.name()) {
            case "TRUCO":
                return valorTruco;
            case "ENVIDO":
                return valorEnvido;
            default:
                return getNumeroCarta();
        }

    }

    public String toString() {

        // Devuelvo el nombre de la carta en Mayúsculas
        return carta.name().toUpperCase() + " de " + palo.name().toUpperCase();

    }

}