package org.pc.tema02;

import java.util.Scanner;

public class CocienteConExcepcion {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		// Mensaje al usuario
		System.out.print("Introduzca dos enteros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		try {
			System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
		} catch (Exception ex) {
			System.out.println("Excepcion: un entero "
					+ "no se puede dividir por cero ");
		}

		System.out.println("La ejecucion continua ...");
	}
}



