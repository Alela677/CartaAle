package MainAPP;

import java.util.ArrayList;
import java.util.Scanner;

import MODELS.BARAJA;
import MODELS.CARTA;

public class Main_CARTA {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opc = Menu();
		sieteymedia(opc);

	}

	public static String Menu() {

		System.out.println("A. La baraja\nB. Las cartas\nC. 7 y media");
		String opc = sc.nextLine().toUpperCase();
		return opc;
	}

	public static void sieteymedia(String opc) {
		ArrayList<CARTA> cartas = new ArrayList<CARTA>();

		switch (opc) {
		case "A":

			BARAJA nueva1 = new BARAJA(1, true);
			System.out.println(nueva1);

			break;

		case "B":
			for (int i = 1; i <= 40; i++) {

				CARTA carta1 = new CARTA(i);

				cartas.add(carta1);

			}

			for (CARTA c : cartas) {
				c.getNombreCarta();
				c.getValor7ymedia();

				System.out.println(c);
			}

			break;

		case "C":
			BARAJA juego = new BARAJA(1, true);
			double puntuacion = 0;
			boolean terminar = false;

			do {
				if (puntuacion < 7.5) {

					System.out.println(
							"Su puntiacion es: " + puntuacion + " \nQue desea hacer: \n1. Coger carta 2. Plantarse ");
					int eleccion = Integer.parseInt(sc.nextLine());
					switch (eleccion) {
					case 1:
						CARTA nueva = new CARTA(juego.Robar().getID());
						System.out.println("La carta es ");
						nueva.getNombreCarta();
						puntuacion += nueva.getValor7ymedia();
						
						break;
					case 2: 
						System.out.println("Te has plantado");
						terminar = true;
						break;
					default:
							System.out.println("La se encuentra disponible su eleccion, por favor introduzca otra");
						break;
					}

				} else {
					System.out.println("Su puntuacion es:" + puntuacion );
					System.out.println("Has perdido");
					terminar = true;
				}

			} while (!terminar);
		}
	}

}
