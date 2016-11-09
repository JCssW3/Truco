package poo;

import enums.Valores;

public class CPU extends Jugador {

	public CPU(String nombre) {

		super(nombre);

	}

	public Carta comparar(Carta c, Valores v){

		int i = 0;
		boolean gana = false;

		// Primero tengo que ordenar las cartas
        // según el valor del truco, luego me pregunto
        // si la carta es mayor a la que me pasaron
        // salgo del bucle conservando el indice (i)
        // y tiro esa carta
		for(Carta miCarta : getCartas()){

			if( miCarta != null) {
				if(miCarta.getValor(v) > c.getValor(v)){
					gana = true;
					break;
				}
			}

			i++;
		}

		if(gana){
			return jugarCarta(i);
		} else {

			i = 0;

            // En caso que ninguna carta gane, me
            // descarto la más baja, que no sea null, obviamente
			for(Carta miCarta : getCartas()){

				if(miCarta != null){
					break;
				}

				i++;
			}

			return jugarCarta(i);
		}

	}

	public void ordenar(Valores v){

		// Primero paso el array original a uno nuevo
		Carta[] nuevoOrden = this.getCartas();

		// Luego voy a comparar la primer carta con la segunda, y así
		// sucesivamente hasta dejar el array ordenado de menor a mayor
		// con respecto al valor pasado en el parámetro [Insert Sort]
		for(int i = 1; i < nuevoOrden.length; i++){

			Carta carta = nuevoOrden[i];

			int j = i-1;

			while(j>=0 && nuevoOrden[j].getValor(v) > carta.getValor(v)){

				nuevoOrden[j+1] = nuevoOrden[j];
				j--;

			}

			nuevoOrden[j+1] = carta;

		}

		//Una vez ordenado el array de cartas lo seteo
		setCartas(nuevoOrden);

	}

}
