package org.pc.tema01;

public class EjemploRecursivo {

	public static void misterio(int orden, int margen) {

		if (orden > 0) {
			misterio(orden - 1, margen + 1);
			for (int k = 1; k <= margen; k++) {
				System.out.print('b');
			}
			for (int k = 1; k <= orden; k++) {
				System.out.print('*');
			}
			System.out.println();
			misterio(orden - 1, margen + 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		misterio(3, 0);
	}

}
