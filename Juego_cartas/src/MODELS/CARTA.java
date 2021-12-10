package MODELS;

public class CARTA {

	// ATRIBUTOS

		private int numero;
		private int palo;

		// COSNTRUCTORES

		public CARTA(int numero, int palo) {

			this.numero = numero;
			this.palo = palo;

		}

		public CARTA(int id) {

			if (id % 10 != 0) {
				this.numero = id % 10;
				this.palo = id / 10;
			} else {
				this.numero = (id % 10) + 10;
				this.palo = (id / 10) - 1;
			}
		}

		// METODOS

		public int getID() {

			int id = this.numero + (this.palo * 10);

			return id;
		}

		public int getNumero() {
			return numero;

		}

		public int getPalo() {
			return palo;
		}

		public String getNombreNumero() {

			String nombre = null;

			if (numero == 1) {
				nombre = "AS";

			}

			if (numero == 8) {
				nombre = "SOTA";

			}

			if (numero == 9) {
				nombre = "CABALLO";

			}

			if (numero == 10) {
				nombre = "REY";

			}

			if (numero == 2) {
				nombre = "DOS";

			}

			if (numero == 3) {
				nombre = "TRES";

			}

			if (numero == 4) {
				nombre = "CUATRO";

			}

			if (numero == 5) {
				nombre = "CINCO";

			}

			if (numero == 6) {
				nombre = "SEIS";

			}

			if (numero == 7) {
				nombre = "SIETE";

			}
			return nombre;
		}

		public String getNombrePalo() {

			String nombrepalo = null;

			if (palo == 0) {
				nombrepalo = "ORO";

			}

			if (palo == 1) {
				nombrepalo = "ESPADAS";

			}

			if (palo == 2) {
				nombrepalo = "COPAS";

			}

			if (palo == 3) {
				nombrepalo = "BASTOS";

			}

			return nombrepalo;
		}

		public void getNombreCarta() {

			String Nnum = getNombreNumero();
			String Npalo = getNombrePalo();

			System.out.println(Nnum + " DE " + Npalo);
			

		}

		public double getValor7ymedia() {

			double valor = 0;

			if (this.numero == 1) {
				valor = 0.5;
				System.out.println("SU VALOR ES: " + valor);
			}
			if (this.numero == 8) {
				valor = 0.5;
				System.out.println("SU VALOR ES: " + valor);
			}
			if (this.numero == 9) {
				valor = 0.5;
				System.out.println("SU VALOR ES: " + valor);
			}
			if (this.numero == 10) {
				valor = 0.5;
				System.out.println("SU VALOR ES: " + valor);
			}

			if (this.numero == 2) {
				valor = 2.0;
				System.out.println("SU VALOR ES: " + valor);
			}

			if (this.numero == 3) {
				valor = 3.0;
				System.out.println("SU VALOR ES: " + valor);
			}

			if (this.numero == 4) {
				valor = 4.0;
				System.out.println("SU VALOR ES: " + valor);
			}

			if (this.numero == 5) {
				valor = 5.0;
				System.out.println("SU VALOR ES: " + valor);
			}

			if (this.numero == 6) {
				valor = 6.0;
				System.out.println("SU VALOR ES: " + valor);
			}

			if (this.numero == 7) {
				valor = 7.0;
				System.out.println("SU VALOR ES: " + valor);
			}
			return valor;

		}

		// ToString
		@Override
		public String toString() {
			return String.format("CARTA [numero=%s palo=%s ]",  numero,palo );
		}
}
