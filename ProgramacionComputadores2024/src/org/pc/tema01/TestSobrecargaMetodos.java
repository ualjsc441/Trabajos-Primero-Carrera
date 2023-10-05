package org.pc.tema01;

public class TestSobrecargaMetodos {
	/** Devuelve el máximo entre dos valores enteros*/
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	/** Devuelve el máximo entre dos valores reales */
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	/** Devuelve el máximo entre tres valores reales */
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

	/** Método main */
	public static void main(String[] args) {
		// Invoco al método max con parámetros de tipo int
		System.out.println("El máximo entre 3 y 4 es " + max(3, 4));

		// Invoco al método max con parámetros de tipo double
		System.out.println("El máximo entre 3.0 y 5.4 es "
				+ max(3.0, 5.4));

		// Invoco al método max con tres parámetros de tipo double
		System.out.println("El máximo entre 3.0, 5.4, y 10.14 es "
				+ max(3.0, 5.4, 10.14));
	}
}

