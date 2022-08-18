package Ejercicio_1;

import java.util.*;
ejercicio editado

public class Ej_1 {
	
	public static void main(String[] args) {
		Scanner hallar = new Scanner(System.in);
		int n1, n2;

		System.out.println("Ingrese dos números enteros:");
		n1 = hallar.nextInt();
		n2 = hallar.nextInt();

		if (n1 > 20) {
			System.out.println("El primer numero ingresado es mayor a 20");
		}

		if (n1 < 50) {

			if (n1 > 20) {
				System.out.println("El primer numero ingresado es mayor a 20 y menor a 50");
			}
		}

		if (n2 > 20) {
			System.out.println("El segundo numero ingresado es mayor a 20");
		}

		if (n2 < 50) {

			if (n2 > 20) {
				System.out.println("El segundo numero ingresado es mayor a 20 y menor a 50");
			}
		}

		if (n1 < 20) {

			if (n2 < 20) {
				System.out.println("Ningún número cumple con la condición");
			}

		}

	}

}
