package com.learning.session01;

public class EnteroAleatorio {

	public static void main(String[] args) {

		int min = -15;
		int max = 15;
		
		System.out.println("Vamos a generar un entero aleatorio entre -15 y 15");
		System.out.println();
		int enteroAleatorio = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("El entero generado aleatoriamente es: " + enteroAleatorio);
		
	}

}