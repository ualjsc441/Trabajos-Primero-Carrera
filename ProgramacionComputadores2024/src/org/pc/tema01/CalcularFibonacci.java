package org.pc.tema01;

import java.util.Scanner;

public class CalcularFibonacci {
	/** Método main */
	public static void main(String args[]) {
		// Crea un objeto de la clase Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out
				.print("Introduzca el índice para obtener el número de Fibonacci : ");
		int indice = entrada.nextInt();
		int terminos;
		// Obtiene y muestra el número de Fibonacci. Fibonacci(n)
		System.out.println("El número de Fibonacci para el índice " + indice + " es "
				+ fibonacci(indice));
		// Muestra los n términos de la serie de Fibonacci
		System.out
				.println("Introduzca el número de términos que desea ver de la serie de Fibonacci");
		terminos = entrada.nextInt();
		System.out.println("La serie de Fibonacci es");
		for (int i = 0; i < terminos; i++) {
			System.out.print(fibonacci(i) + "\t");

		}
	}

	/** M�todo para obtener el n�mero de Fibonacci */
	public static long fibonacci(long n) {
		if (n == 0) // Caso base
			return 0;
		else if (n == 1) // Caso base
			return 1;
		else
			// Reducci�n y llamadas recursivas
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

