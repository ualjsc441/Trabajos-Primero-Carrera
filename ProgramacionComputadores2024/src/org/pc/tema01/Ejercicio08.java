package org.pc.tema01;

public class Ejercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiplicador = 64;
		int multiplicando = 99;
		int producto = 0;
		System.out.println("MULTIPLICADOR     MULTIPLICANDO");
	  
		while (multiplicador >= 1) {
			System.out.printf("%7d%18d\n", multiplicador, multiplicando);
			if (multiplicador % 2 != 0) // multiplicador es impar
				producto = producto + multiplicando;
			multiplicador = multiplicador / 2;
			multiplicando = multiplicando * 2;
			
		}
		System.out.println("El producto es  "+ producto);
	}

}
