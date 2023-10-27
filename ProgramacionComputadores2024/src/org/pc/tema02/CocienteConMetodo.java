package org.pc.tema02;

import java.util.Scanner; 

public class CocienteConMetodo { 
  public static int cociente(int number1, int number2) {
    if (number2 == 0)
      System.out.println("No se puede hacer una division por cero");
    	
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
    	System.out.println("Excepcion: un entero " + 
        "no se puede dividir por cero ");
    }

    System.out.println("La ejecucion continua ...");
  }
}


