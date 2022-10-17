package primerParcialTHP;

import java.util.Scanner;

public class PrimerParcialTHP {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;
		final int TOPE_MAXIMO = 1000;
		final int TOPE_MINIMO = 1;
		final String MAYOR = "MA";
		final String MENOR = "ME";
		final String IGUAL = "IG";
		String eleccionJugador = ".";
		int contadorPuntos = 0;
		boolean juegoTerminado = false;


		numero1 = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
		System.out.println("El 1er. numero es: " + numero1);

		do {
			numero2 = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));

			System.out.println("El siguiente numero que sera Mayor (MA), Menor (ME) o Igual (IG): ");
			eleccionJugador = input.nextLine().toUpperCase();
			while(!eleccionJugador.equals(MAYOR) && !eleccionJugador.equals(MENOR) && !eleccionJugador.equals(IGUAL)) {
				System.out.println("Ingrese una opcion valida Mayor (MA), Menor (ME) o Igual (IG):");
				eleccionJugador = input.nextLine().toUpperCase();
			}
			System.out.println("El nuevo numero es: " + numero2);

			if(numero1 > numero2 && eleccionJugador.equals(MENOR)) {
				contadorPuntos++;
				System.out.println("Usted sumo +1 punto.");
			}else if(numero1 < numero2 && eleccionJugador.equals(MAYOR)) {
				contadorPuntos++;
				System.out.println("Usted sumo +1 punto.");
			}else if(numero1 == numero2 && eleccionJugador.equals(IGUAL)) {
				contadorPuntos++;
				System.out.println("Usted sumo +1 punto.");
			}else {
				juegoTerminado = true;
				System.out.println("JUEGO TERMINADO.");
			}

			numero1 = numero2;

		}while(!juegoTerminado);

		System.out.println("El total de puntos que logro hacer es de: " + contadorPuntos);

	}
}
