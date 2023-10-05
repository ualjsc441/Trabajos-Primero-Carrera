package org.pc.tema01;

public class SumaSerieN {
	
	
	public static int sumaRecursiva(int n){
		if (n == 1)
			return 1;
		else
			return n + sumaRecursiva(n-1);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println("La suma de los "+n+" primeros números es "+sumaRecursiva(n));

	}

}
