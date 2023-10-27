package org.pc.tema02;

public class ExcepcionIntervaloPrincipal {
	
	public static void rango(int num, int den) throws ExcepcionIntervalo{
		if ((num > 100) || (den < -5)){
			throw new ExcepcionIntervalo("Numeros fuera de rango");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numerador = 120;
		int denominador = 5;
		int cociente;
			
		try{
			rango(numerador, denominador);
			cociente = numerador/denominador;
			System.out.println("El cociente es..." +cociente);
		}
		
		catch (ExcepcionIntervalo ex){
			System.out.println("Al calcular el rango se ha producido una excepción");
			System.out.println("con el mensaje: "+ex.getMessage());
			System.out.println(ex); // igual que poner System.out.println(ex.toString)
		//	ex.printStackTrace();    da la traza del error
		}
		
		System.out.println("FIN");
		}
	}


