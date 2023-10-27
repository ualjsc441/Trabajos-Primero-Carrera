package org.pc.tema02;

import java.util.Scanner;

public class Cociente {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca dos enteros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		System.out.println(num1 + " / " + num2 + " es " + (num1 / num2));
	}
}


