package com.learning.session02;

import java.util.Scanner;

public class BuenosDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la hora: ");
		int hora = sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		int minutos = sc.nextInt();
		
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}
		
		sc.close();
		
	}

}