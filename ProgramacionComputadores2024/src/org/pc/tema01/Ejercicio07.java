package org.pc.tema01;


public class Ejercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividendo = 39;
		int divisor = 11;
		int cociente, resto;

		cociente = 0;
		resto = dividendo;
		while (resto >= divisor) {
			resto = resto - divisor;
			cociente = cociente + 1;
		}
		System.out.println("El cociente es " + cociente);
		System.out.println("El resto es " + resto);

	}

}
