package com.learning.session02;

import java.util.Scanner;

public class PuroLatinoFest {

	public static void main(String[] args) {

		System.out.println(""
				+ "=======================================\r\n"
				+ "   Festival Puro Latino Fest Almería\r\n"
				+ "         4 y 5 de Julio, 2025\r\n"
				+ "=======================================\r\n"
				+ "Tarifas del festival:\r\n"
				+ "---------------------------------------\r\n"
				+ "Abono General : 60,00€\r\n"
				+ "Abono Oro : 175,00€\r\n"
				+ "Abono Platino : 210,00€\r\n"
				+ "Plataforma Premium : 240,00€\r\n"
				+ "Descuentos:\r\n"
				+ "   Edad <= 26 y Carné Joven : 15%\r\n"
				+ "   Compra Anticipada : 10%\r\n"
				+ "Adicionales:\r\n"
				+ "   Servicio Reacceso : + 40,00€\r\n"
				+ "---------------------------------------\r\n"
				+ "Cálculo de la entrada (ticket)\r\n"
				+ "---------------------------------------\r\n"
				+ "Tipo de entrada");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("(General/Oro/Platino/Plataforma): ");
		String tipo = entrada.nextLine();
		System.out.print("Edad: ");
		int edad = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Carné Joven (s/n): ");
		String carne = entrada.nextLine();
		System.out.print("Dias de antelación: ");
		int dias = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Quiere reacceso (s/n); ");
		String reacceso = entrada.nextLine();
		
		double precio = 60;
		switch (tipo) {
		case "Oro": precio = 175; break;
		case "Platino": precio = 210; break;
		case "Plataforma": precio = 240; break;
		}
		
		double descuento = 0;
		if (carne.equals("s") && edad <= 26) {
			descuento += 0.15;
		} 
		if (dias > 90) {
			descuento += 0.10;
		}
		double precioReacceso = 0;
		if (reacceso.equals("s")) {
			precioReacceso += 40;
		}
		
		System.out.printf(""
				+ "------------------------\r\n"
				+ "Precio base : %.2f€\r\n"
				+ "Descuento : - %.2f€\r\n"
				+ "Adicionales : %.2f€\r\n"
				+ "PRECIO FINAL: %.2f€\r\n"
				+ "------------------------", precio, (precio * descuento), precioReacceso, (precio - precio*descuento + precioReacceso));
		
		entrada.close();
		
	}

}