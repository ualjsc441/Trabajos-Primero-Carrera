package org.pc.tema01;

public class MayorValor {
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;
	}

	public static void main(String[] args) {
		int i = 9, j = 2;
		int k = max(i, j);
		System.out.println("El máximo entre  " + i + "  y " + j + " es  " + k);
	}
}                            