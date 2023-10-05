package org.pc.tema01;
import java.util.Scanner;
public class EntradaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int dato;
		do {
			System.out.print("Introduce entero positivo => ");
			dato = entrada.nextInt();
		} while (dato <= 0);
	}

}
