package org.pc.tema01;
public class Ejercicio12V1 {

	/**
	 * Muestra si un entero positivo es primo
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato = 9;
		int divisor = 2;
		boolean primo = true;
		while (primo && divisor <= (int)Math.sqrt(dato)){
			if (dato % divisor == 0)
				primo = false;
			divisor++;
		}
		if (primo)
			System.out.println("El número es primo");
		else
			System.out.println("El número no es primo");

	}
}
