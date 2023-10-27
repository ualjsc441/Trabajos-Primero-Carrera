package org.pc.tema02;

import java.util.Scanner; 

public class CocienteConIf {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two integers
    System.out.print("Introduzca dos enteros: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    if (num2 != 0)
      System.out.println(num1 + " / " + num2 + " es " +
        (num1 / num2));
    else
      System.out.println("No se puede hacer una division por cero ");
  }
}


