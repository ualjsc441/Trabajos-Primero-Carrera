package org.pc.sesion04;

import java.util.Scanner;

public class PrintEsqueletoCalendario {
  /** Método main*/
  @SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // El usuario introduce el año 
    System.out.print("Introduzca un año completo (e.g., 2001): ");
    int año = entrada.nextInt();

    // El usuario introduce el mes
    System.out.print("Introduzca un mes como un número entre 1 y 12: ");
    int mes = entrada.nextInt();

    // Muestra el calendario pra el mes y el año introducidos
    printMes(año, mes);
  }

  /** printMes puede parecerse a esto */
  public static void printMes(int año, int mes) {
    System.out.print(mes + " " + año);
  }

  /** printTituloMes puede parecerse a esto */
  public static void printTituloMes(int año, int mes) {
  }

  /** printCuerpoMes puede parecerse a esto */
  public static void printCuerpoMes(int año, int mes) {
  }

  /** getNombreMes puede parecerse a esto */
  public static String getNombreMes(int mes) {
    return "Enero"; // Un valor de ejemplo
  }

  /** getDiaInicio puede parecerse a esto */
  public static int getDiaInicio(int año, int mes) {
    return 1; // Un valor de ejemplo
  }

 

  /** getNumeroTotalDeDiasDelMes puede parecerse a esto */
  public static int getNumeroDeDiasDelMes(int año, int mes) {
    return 31; // Un valor de ejemplo
  }

  /** esBisiesto puede parecerse a esto*/
  public static boolean esBisiesto(int año) {
    return true; // Un valor de ejemplo
  }
}
