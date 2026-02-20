package com.learning.session02;

import java.util.Scanner;

public class ImpuestoIRPF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce su nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("Introduce tu base imponible: ");
		int base = entrada.nextInt();
		
		double imp1 = 0;
		double imp2 = 0;
		double imp3 = 0;
		double imp4 = 0;
		double imp5 = 0;
		double imp6 = 0;
		int dif1 = 0;
		int dif2 = 0;
		int dif3 = 0;
		int dif4 = 0;
		int dif5 = 0;
		int dif6 = 0;
		
		//Tramo 1 (19 %)
		if (base >= 0 && base <= 12450) {
			dif1 = base - 0;
		} else if (base > 12450) {
			dif1 = 12450 - 0;
		}
		imp1 = dif1 * 0.19;
		
		//Tramo 2 (24%)
		if (base >= 12451 && base <= 20200) {
			dif2 = base - 12451;
		} else if ( base > 20200) {
			dif2 = 20200 - 12450;
		}
		imp2 = dif2 * 0.24;
		
		//Tramo 3 (30%)
		if (base >= 20201 && base <= 35200) {
			dif3 = base - 20201;
		} else if ( base > 35200) {
			dif3 = 35200 - 20200;
		}
		imp3 = dif3 * 0.30;
		
		//Tramo 4 (37%)
		if (base >= 35201 && base <= 60000) {
			dif4 = base - 35201;
		} else if ( base > 60000) {
			dif4 = 60000 - 35200;
		}
		imp4 = dif4 * 0.37;
		
		//Tramo 5 (45%)
		if (base >= 60001 && base <= 300000) {
			dif5 = base - 60001;
		} else if ( base > 300000) {
			dif5 = 300000 - 60000;
		}
		imp5 = dif5 * 0.45;
		
		//Tramo 6 (47%)
		if (base > 300000) {
			dif6 = base - 300000;
		}
		imp6 = dif6 * 0.47;
		
		if(dif1 > 0) {
			System.out.printf("\rImpuesto por el primer tramo (0 - 12.450 €): "+dif1+" € * 19%% = %.2f €", imp1);
		} 
		if(dif2 > 0) {
			System.out.printf("\rImpuesto por el segundo tramo (12.451 - 20.200 €): "+dif2+" € * 24%% = %.2f €", imp2);
		} 
		if(dif3 > 0) {
			System.out.printf("\rImpuesto por el tercer tramo (20.201 - 35.200 €): "+dif3+" € * 30%% = %.2f €", imp3);
		} 
		if(dif4 > 0) {
			System.out.printf("\rImpuesto por el cuarto tramo (35.201 - 60.000 €): "+dif4+" € * 37%% = %.2f €", imp4);
		} 
		if(dif5 > 0) {
			System.out.printf("\rImpuesto por el quinto tramo (60.000 - 300.000 €): "+dif5+" € * 45%% = %.2f €", imp5);
		} 
		if(dif6 > 0) {
			System.out.printf("\rImpuesto por el sexto tramo (> 300.000 €): "+dif6+" € * 47%% = %.2f € \n", imp6);
		} 
		
		System.out.printf("\r\rSr./Sra. "+nombre+", el impuesto IRPF total a pagar es: %.2f €", (imp1+imp2+imp3+imp4+imp5+imp6));
		
		entrada.close();
		
	}

}