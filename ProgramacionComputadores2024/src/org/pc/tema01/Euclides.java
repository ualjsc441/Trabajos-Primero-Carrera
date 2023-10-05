package org.pc.tema01;

public class Euclides {

	/**
	 * Calcula el máximo comun divisor de dos enteros positivos utilizando el
	 * algoritmo de Euclides
	 * @param args
	 */
	public static int mcdEuclides(int dato1, int dato2){
		int aux;
		while (dato1 % dato2 != 0) {
			aux = dato1;
			dato1 = dato2;
			dato2 = aux % dato2;
		}
		return dato2;
		
	}
	public static void main(String[] args) {
		int dato1 = 10;
		int dato2 = 25;
		int maximo;
		maximo = mcdEuclides(dato1,dato2);
		System.out.println("El MCD de " + dato1 + " y "+ dato2+ " es "+maximo);

	}

}


