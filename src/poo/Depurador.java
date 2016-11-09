package poo;

import enums.Valores;

public class Depurador {

    public static void main(String[] args) {

        Mazo mazo = new Mazo();

        Repartidor repartidor = new Repartidor();

        CPU fritzTruc = new CPU("FritzTruc");

        Jugador jugador = new Jugador("Juan Cruz");

        repartidor.Repartir(fritzTruc, jugador, mazo);

        System.out.println("Mano recibida");

        fritzTruc.getMano();

        System.out.println("Ordenada por valor de Envido");

        fritzTruc.ordenar(Valores.ENVIDO);

        fritzTruc.getMano();

        System.out.println("Ordenada por valor de Truco");

        fritzTruc.ordenar(Valores.TRUCO);

        fritzTruc.getMano();

        System.out.println("Ordenada por numeración de la carta");

        fritzTruc.ordenar(Valores.CARTA);

        fritzTruc.getMano();


    }

}
