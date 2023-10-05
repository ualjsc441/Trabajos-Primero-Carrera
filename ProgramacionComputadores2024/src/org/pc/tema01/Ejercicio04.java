package org.pc.tema01;

public class Ejercicio04 {

	/**
	 * Contrato en una empresa si los trabajadores cumplen: Que la edad sea de
	 * al menos 18 años y tengan más de 85 puntos en alguna de las dos pruebas
	 * que han realizado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int edad, nota1, nota2;
		// PRE: edad >= 0 y nota1 >= 0 y nota2 >= 0
		edad = 18;
		nota1 = 159;
		nota2 = 15;
		if (edad >= 18 && (nota1 > 85 || nota2 > 85)) {
			System.out.println("CONTRATADO");
		} else {
			System.out.println("NO CONTRATADO");
		}

	}

}
