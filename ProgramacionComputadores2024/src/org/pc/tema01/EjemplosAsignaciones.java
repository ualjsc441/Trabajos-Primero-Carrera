package org.pc.tema01;

import java.util.Locale;
import java.util.Scanner;

public class EjemplosAsignaciones {

	private static Scanner entrada;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1; double d =1.0;
		double valor = 1.234;
		System.out.println("El valor es "+valor);
		entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
	    d = entrada.nextDouble();
		
	
		System.out.println(d);
	    System.out.println(0.0/0.0);
		System.out.printf("%8d%8s%8.2f\n",1234,"JAVA",3.23);
		System.out.printf(Locale.ENGLISH,"%-8d%-8s%-8.2f\n",1234,"JAVA",3.23);
		
		a = 46 / 9;  //5
		System.out.println(a);
		a=1;
		a = 46 % 9 + 4 * 4 - 2; // 1 + 16 - 2 = 15
		System.out.println(a);
		a = 45 + 43 % 5 * (23 * 3 % 2); // 45 + 43 % 5 * (69%2)= 45 + 43 % 5 * 1 = 45 + 3 * 1= 45 +3 = 48
		System.out.println(a);
		a = 1;
		a %= 3 / a + 3; //a = a % (3 /a + 3 ) , 1 % (3/ 1 +3) = 1  % (3 + 3) = 1 % 6 = 1
		System.out.println(a);
		d = 1.0;
		d = 4 + d * d + 4; //4 + 1.0*1.0 +4 = 4 +1.0 +4 = 9.0
		System.out.println(d);
		
		a =1;
		d = 1.0;
		d += 1.5 * 3 + (++a); //d = d + (1.5 * 3 + (++a)) , 1.0 + 1.5*3 + 2 =1.0 + 4.5 + 2 = 7.5
		System.out.println(d);
		d = 1.0;
		a= 1;
		d -= 1.5 * 3 + a++; //  d = d - (1.5*3 + a++),  1.0 - (1.5*3 +1) =1.0-4.5 -1 = -4.5
		System.out.println(d);
	

	}

}
