package org.pc.tema02;

public class Circulo extends Figura{
	private double radio;
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radio*radio;
	}
}
