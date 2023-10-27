package org.pc.tema02;

/**
 * @author Mercedes
 *
 */
public class Rectangulo {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private static int numRectangulos = 0;

	public Rectangulo(int x, int y, int ancho, int alto) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		numRectangulos++;
	}

	public Rectangulo(int x, int y) {
		this(x, y, 0, 0);
	}

	/**
	 * @return origen x del rectangulo
	 */
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

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public static int getNumRectangulos() {
		return numRectangulos;
	}

	@Override
	public String toString() {
		return "Rectangulo x=" + x + ", y=" + y + ", ancho=" + ancho
				+ ", alto=" + alto;
	}

	@Override
	public boolean equals(Object obj) {
		Rectangulo otro = (Rectangulo) obj;
		return x == otro.x && y == otro.y && ancho == otro.ancho
				&& alto == otro.alto;
	}

	/**
	 * Método que compara dos rectángulos devolviendo 0 si son iguales, -1 si el
	 * primero es menor y 1 si el primero es mayor
	 *
	 * @param obj
	 * @return un entero 0, -1, 1
	 */
	public int compareTo(Object obj) {
		Rectangulo otro = (Rectangulo) obj;

		if (calcularArea() == otro.calcularArea())
			return 0;
		else if (calcularArea() < otro.calcularArea())
			return -1;
		else
			return 1;

	}

	/**
	 * @param dx
	 *            desplazamiento del rectangulo en el eje x
	 * @param dy
	 *            desplazamiento del rectangulo en el eje y
	 */
	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public boolean estaDentro(int x1, int y1) {
		if (x1 > x && x1 < x + ancho && y1 > y && y1 < y + alto)
			return true;
		else
			return false;
	}

	public int calcularArea() {
		return ancho * alto;
	}
}
