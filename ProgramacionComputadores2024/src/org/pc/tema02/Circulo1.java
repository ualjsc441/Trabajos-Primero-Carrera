package org.pc.tema02;

public class Circulo1 {
	
	private double radio;
	private static int numeroCirculos = 0;
	
	public Circulo1(double radio) {
		super();
		this.radio = radio;
		numeroCirculos++;
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}


	public static int getNumeroCirculos() {
		return numeroCirculos;
	}

	public double getArea(){
		
		return Math.PI * radio * radio;
	}
	
	

}
