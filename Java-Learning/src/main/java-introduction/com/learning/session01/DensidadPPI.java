package com.learning.session01;

public class DensidadPPI {
	
	public static void main(String[] args) {
		
		// Full HD
		int ancho_resolucion = 1920;
		int alto_resolucion = 1080;
		double tamaño_diagonal = 27;
		double ppi = Math.sqrt(Math.pow(ancho_resolucion, 2) + Math.pow(alto_resolucion, 2)) / tamaño_diagonal;
		System.out.printf("\rLa densidad de PPI del monitor Full HD de 27 pulgadas es: %.2f PPI", ppi);
		
		// 4K
		ancho_resolucion = 3840;
		alto_resolucion = 2160;
		tamaño_diagonal = 32;
		ppi = Math.sqrt(Math.pow(ancho_resolucion, 2) + Math.pow(alto_resolucion, 2)) / tamaño_diagonal;
		System.out.printf("\rLa densidad de PPI del monitor 4K de 32 pulgadas es: %.2f PPI", ppi);
		
		// Dispositivo móvil
		ancho_resolucion = 2340;
		alto_resolucion = 1080;
		tamaño_diagonal = 6.5;
		ppi = Math.sqrt(Math.pow(ancho_resolucion, 2) + Math.pow(alto_resolucion, 2)) / tamaño_diagonal;
		System.out.printf("\rLa densidad de PPI del dispositivo móvil de 6,5 pulgadas es: %.2f PPI", ppi);
		
	}

}