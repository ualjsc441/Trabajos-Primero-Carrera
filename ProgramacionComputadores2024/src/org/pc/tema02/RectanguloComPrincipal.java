package org.pc.tema02;
public class RectanguloComPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p = new Punto(5, 10);
		System.out.println(p.toString());
		RectanguloCom rec1 = new RectanguloCom(p, 5, 20);
		System.out.println(rec1.toString());
		RectanguloCom rec2 = new RectanguloCom(new Punto(4, 4), 10, 20);
		System.out.println(rec2.toString());
		rec1.desplazar(2, 2);
		System.out.println(rec1.toString());

	}

}

