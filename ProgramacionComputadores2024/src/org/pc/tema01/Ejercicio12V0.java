package org.pc.tema01;

public class Ejercicio12V0 {

	/**
	 * Muestra si un entero positivo es primo
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato = 4;
		int divisor = 2;
		boolean primo = true;
		for (divisor = 2; divisor < dato; divisor++) {
			if (dato % divisor == 0) {
				primo = false;
				break;

			}
		}
		if (primo)
			System.out.println("El número es primo");
		else
			System.out.println("El número no es primo");

	}
}
