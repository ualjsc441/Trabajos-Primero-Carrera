package org.pc.tema02;

import java.util.Scanner;

public class CocienteConMetodoYExcepcion {

	public static int cociente(int number1, int number2) { // no es necesario ponerlo
	    if (number2 == 0)
	      // Se lanza la excepcion
	    throw new ArithmeticException("No se puede dividir por cero");
	    return number1 / number2;
	  }
	  
	  public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Introduzca dos enteros ");
	    int num1 = entrada.nextInt();
	    int num2 = entrada.nextInt();
	    
	    try {
	      int result = cociente(num1, num2);
	      System.out.println(num1 + " / " + num2 + " es " 
	        + result);
	    }
	    catch (Exception ex) {
	      System.out.println(ex.getMessage());
	      System.out.println(ex.toString());
	      ex.printStackTrace();
	    }

	    System.out.println("La ejecucion continua ...");
	    System.out.println("El producto de los valores es " +num1*num2);
	  }
}


