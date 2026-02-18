package com.learning.session01;

public class Relacion1Ej01 {

	public static void main(String[] args) {

		double electrones = 400;
		double superficie = 1E-6;
		double carga = 400 * 1000000 * (-1.602E-19); //Multiplicamos por la cte de Faraday
		double densidad = carga / superficie;
		
		System.out.println("Solución al ejercicio 1 de la relación 1: Relacion1Ej01"
				+ "\r======================="
				+ "\rENUNCIADO:"
				+ "\r" + electrones + " millones de electrones se encuentran distribuidos en una superficie de "+ Math.sqrt(superficie) / 1000 +" mm2.\r\n"
				+ "Calcular la densidad de carga superficial que suponen, en C m-2"
				+ "\r======================="
				+ "\rDATOS:"
				+ "\rElectrones: " + electrones + " millones"
				+ "\rSuperficie: " + Math.sqrt(superficie) / 1000 + " nm2"
				+ "\r======================="
				+ "\rSOLUCIÓN:"
				+ "\rLa densidad total es: " + densidad 
				+ "\r=======================");
		
	}

}