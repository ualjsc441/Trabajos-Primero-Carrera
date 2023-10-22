package org.pc.tema01;
public class Suma {
	public static int sumaEnteros(int i1, int i2) {
		int suma = 0;
		for (int i = i1; i <= i2; i++) {
			suma += i;
		}
		return suma;
	}

	public static void main(String[] args) {
		System.out.println(" La suma de 1 a 10 es  " + sumaEnteros(1, 10));
		System.out.println(" La suma de 20 a 30 es  " + sumaEnteros(20, 30));
		System.out.println(" La suma de 35 a 45 es  " + sumaEnteros(35, 45));
	}
}
