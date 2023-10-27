package org.pc.tema02;

public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {

		Punto otro = (Punto) obj;
		return x == otro.x && y == otro.y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
}


