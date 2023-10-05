package org.pc.tema01;

public class Ejercicio05 {

	/**
	 * Muestra un mensaje en pantalla indicando si un a�o bisiesto.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		int año = 1800;
		// PRE: año > 0
		if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
			System.out.println("AñO BISIESTO");
		} else {
			System.out.println("AñO NO BISIESTO");
		}
	}
}
