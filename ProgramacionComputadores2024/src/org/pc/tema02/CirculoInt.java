package org.pc.tema02;

public class CirculoInt implements FiguraInt {
	private double radio;

	public CirculoInt(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}
}





