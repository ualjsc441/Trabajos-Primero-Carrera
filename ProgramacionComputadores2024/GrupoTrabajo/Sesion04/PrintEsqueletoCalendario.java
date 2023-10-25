package org.pc.sesion04;

import java.util.Scanner;

public class PrintEsqueletoCalendario {
  /** M�todo main*/
  @SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // El usuario introduce el a�o 
    System.out.print("Introduzca un a�o completo (e.g., 2001): ");
    int a�o = entrada.nextInt();

    // El usuario introduce el mes
    System.out.print("Introduzca un mes como un n�mero entre 1 y 12: ");
    int mes = entrada.nextInt();

    // Muestra el calendario pra el mes y el a�o introducidos
    printMes(a�o, mes);
  }

  /** printMes puede parecerse a esto */
  public static void printMes(int a�o, int mes) {
    System.out.print(mes + " " + a�o);
  }

  /** printTituloMes puede parecerse a esto */
  public static void printTituloMes(int a�o, int mes) {
  }

  /** printCuerpoMes puede parecerse a esto */
  public static void printCuerpoMes(int a�o, int mes) {
  }

  /** getNombreMes puede parecerse a esto */
  public static String getNombreMes(int mes) {
    return "Enero"; // Un valor de ejemplo
  }

  /** getDiaInicio puede parecerse a esto */
  public static int getDiaInicio(int a�o, int mes) {
    return 1; // Un valor de ejemplo
  }

 

  /** getNumeroTotalDeDiasDelMes puede parecerse a esto */
  public static int getNumeroDeDiasDelMes(int a�o, int mes) {
    return 31; // Un valor de ejemplo
  }

  /** esBisiesto puede parecerse a esto*/
  public static boolean esBisiesto(int a�o) {
    return true; // Un valor de ejemplo
  }
}
