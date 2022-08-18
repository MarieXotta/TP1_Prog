package Ejercicio_2;

import java.util.Scanner;

public class Ej_2 {
	
	public static void main(String[] args) {
		Scanner hallar = new Scanner(System.in);
		int a1, a2, max = 0, min = 0;

		System.out.println("Ingrese dos numeros enteros: ");
		a1 = hallar.nextInt();
		a2 = hallar.nextInt();

		if (a1 < a2) {
			min = a1;
			max = a2;
		}

		if (a2 < a1) {
			min = a2;
			max = a1;
		}

		System.out.println("El número máximo es: " + max + " El número mínimo es: " + min);

	}
}
