package MODELS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import MODELS.CARTA;

public class BARAJA {

	// PROPIEDADES
	private ArrayList<CARTA> lista_carta;

	// CONSTRUCTORES

	public BARAJA() {

		lista_carta = new ArrayList<CARTA>();

		for (int i = 1; i <= 40; i++) {

			lista_carta.add(new CARTA(i));

		}

	}

	public BARAJA(int tipobaraja) {
		lista_carta = new ArrayList<CARTA>();
		switch (tipobaraja) {
		case 1:

			
			for (int i = 1; i <= 40; i++) {
				lista_carta.add(new CARTA(i));

			}

			break;
			
		case 2:
				
				for (int i = 1; i < 2; i++) {
					for (int j = 1; j <= 40; j++) {
						lista_carta.add(new CARTA(i));
					}
				}
			
			break;
		default:
			break;
		}

	}

	public BARAJA(int tipobaraja, boolean barajar) {
		this(tipobaraja);
		Barajar();
	}

	// METODOS

	public void Barajar() {

		Collections.shuffle(lista_carta);

	}

	public void Cortar(int posicion) {

		for (int i = 1; i < 40; i++) {
			lista_carta.remove(0);
			lista_carta.add(new CARTA(i));

		}

	}

	public CARTA Robar() {
		lista_carta.remove(0);
		return this.lista_carta.get(0);
		
	}

	public void insertarCartaFinal(int id) {
		int aux = id;
		this.lista_carta.add(new CARTA(aux));

	}

	public void insertarCartaPrincipio(int id) {
		int aux = id;
		this.lista_carta.add(0, new CARTA(aux));
	}

	public void insertarCartaFinal(CARTA c) {
		this.lista_carta.add(c);
	}

	public void insertarCartaPrincipio(CARTA c) {
		this.lista_carta.add(0, c);
	}

	@Override
	public String toString() {
		return "BARAJA [lista_carta=" + lista_carta + "]";
	}

}
