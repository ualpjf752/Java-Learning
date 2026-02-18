package com.learning.session01;

public class Circunferencia {

	public static void main (String[] args) {
		
		double radio = 4.57;
		double area = Math.PI * Math.pow(radio, 2);
		double diametro = 2 * radio;
		double perimetro = Math.PI * diametro;
		
		System.out.printf("Radio = %.2f\n", radio);
		System.out.printf("Diametro de la circuenferencia = %.2f\n", diametro);
		System.out.printf("Perimetro de la circunferencia = %.3f\n", perimetro);
		System.out.printf("Area de la circunferencia = %.3f", area);
		
	}
	
}
