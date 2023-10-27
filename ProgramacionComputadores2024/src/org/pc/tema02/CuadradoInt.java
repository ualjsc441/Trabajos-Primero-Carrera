package org.pc.tema02;

public class CuadradoInt implements FiguraInt {
	private double radio;

	public CuadradoInt(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radio * radio;
	}
}

