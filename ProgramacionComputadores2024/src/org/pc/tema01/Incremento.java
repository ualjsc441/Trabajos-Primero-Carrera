package org.pc.tema01;

public class Incremento {
	public static void increment(int n) {
		n++;
		System.out.println("n dentro del método es " + n);
	}

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Antes de la llamada, x es " + x);
		increment(x);
		System.out.println("después de la llamada, x es " + x);
	}

}
