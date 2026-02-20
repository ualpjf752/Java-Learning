package com.learning.session02;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número entre 1 y 7: ");
		int n = sc.nextInt();
		
		if (n == 1) System.out.println("Lunes");
		else if (n == 2) System.out.println( "Martes");
		else if (n == 3) System.out.println("Miercoles");
 		else if (n == 4) System.out.println("Jueves");
 		else if (n == 5) System.out.println("Viernes");
 		else if (n == 6) System.out.println("Sabado");
 		else if (n == 7) System.out.println("Domingo");
 		else System.out.println("Numero no valido.");
		
		sc.close();
		
	}
	
}