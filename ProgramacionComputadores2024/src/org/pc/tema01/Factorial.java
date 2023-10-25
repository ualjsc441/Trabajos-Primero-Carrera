package org.pc.tema01;
public class Factorial {

	// Método iterativo para el cálculo del factorial

	public static long factorialIterativo(int n) {
		long fact = 1;
		int i = 1;
		int j = n;
		while (i < j) {
			fact = fact * i * j;
			i++;
			j--;
		}
		if (i == j) {
			fact = fact * i;
		}
		return fact;
	}

	// Método recursivo para el cálculo del factorial

	public static long factorialRecursivo(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorialRecursivo(n - 1);
	}
	// Método que produce un desbordamiento de la pila por ejecutarse indefinidamente. StackOverflowError

	
	  public static long factorialDesbordado(int n) {
	   return n * factorialDesbordado(n - 1); 
	   }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 5;
		int p = 7;
		
		
		// Muestra el factorial de n utilizando el método recursivo
		System.out.println("El factorial de " + n + " es "
				+ factorialRecursivo(n));

		// Muestra el factorial de m utilizando el método iterativo
		System.out.println("El factorial de " + m + " es "
				+ factorialIterativo(m));

		//Desbordamiento
		System.out.println("El factorial de " + p + " es "
				+ factorialDesbordado(p));
	}
}
