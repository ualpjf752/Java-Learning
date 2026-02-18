package com.learning.session01;

public class Relacion1Ej03 {

	public static void main(String[] args) {

		double altura = 0.1; //m
		double radio = 0.03; //m
		double densidad_carga = Math.pow(10, -6);
		double carga_total = densidad_carga * (Math.PI * (Math.pow(radio, 2)) *  altura);
		System.out.println("Solución al ejercicio 3 de la relación 1: Relacion1Ej03"
				+ "\r======================="
				+ "\rENUNCIADO:"
				+ "\r3) Un cilindro de " + (altura * 100) + " cm de altura y radio de"
				+ "la base " + (radio * 100) + " cm tiene una densidad homogénea"
				+ "\rde carga volumétrica de " + (densidad_carga * 1000000) + " μC/m^3."
				+ " Calcular la carga total que almacena."
				+ "\r======================="
				+ "\rDATOS:"
				+ "\rAltura = " + altura + " m" 
				+ "\rRadio = " + radio + " m"
				+ "\rDensidad de carga = " + densidad_carga 
				+ "\r======================="
				+ "\rSOLUCIÓN:"
				+ "\rLa carga total almacenada es: " + carga_total + " C"
				+ "\r=======================");
		
	}

}