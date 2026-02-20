package com.learning.session02;

public class EcuacionSegundoGradoArgumentos {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("SOLUCION DE UNA ECUACION DE SEGUNDO GRADO"
				+ "\rValores de los coeficientes"
				+ "\ra = "+a+", b = "+b+", c = "+c);
		
		int radicando = b * b - 4 * a * c;
		
		if (a == 0) {
			System.out.println("No es una ecuacion de segundo grado");
		} else if (radicando < 0) {
			System.out.println("No tiene solucion real");
		} else if (radicando == 0) {
			System.out.println("Una unica raiz de valor doble");
			System.out.println("x = "+(-b/(2*a)));
		} else {
			System.out.println("Dos raices de valores");
			System.out.println("x1 = " +(-b+Math.sqrt(radicando)) / (2*a));
			System.out.println("x2 = " +(-b-Math.sqrt(radicando)) / (2*a));
		}
		
	}

}