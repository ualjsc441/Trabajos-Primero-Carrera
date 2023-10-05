package org.pc.tema01;

public class TestPasoPorValor {

	/** Intercambia dos variables */
	public static void swap(int n1, int n2) {
		System.out.println("\tDentro del método swap");
		System.out.println("\t\tAntes del intercambio n1 es " + n1 + " n2 es "
				+ n2);

		// Intercambio n1 con n2
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("\t\tDespués del intercambio n1 es " + n1
				+ " n2 es " + n2);
	}

	/** método main */
	public static void main(String[] args) {
		// Declaro e inicializo variables
		int num1 = 1;
		int num2 = 2;

		System.out.println("Antes de la llamada al método swap, num1 es "
				+ num1 + " y num2 es " + num2);

		// Llamo al método swap
		swap(num1, num2);

		System.out.println("Después de la llamada al metodo swap, num1 es "
				+ num1 + " y num2 es " + num2);
	}

}


