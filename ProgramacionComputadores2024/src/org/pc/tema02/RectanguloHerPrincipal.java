package org.pc.tema02;

public class RectanguloHerPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjGeometrico obj = new ObjGeometrico(1, 7);
		System.out.println(obj.toString());
		RectanguloHer rec1 = new RectanguloHer(1, 4, 5, 5);
		System.out.println(rec1.toString());
		CirculoHer circulo = new CirculoHer(3, 4, 5.7);
		System.out.println(circulo.toString());
		System.out.println("El valor de y en el rectangulo es " + rec1.getY());


	}

}
