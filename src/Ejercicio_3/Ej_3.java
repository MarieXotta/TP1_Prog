package Ejercicio_3;

import java.util.Scanner;

public class Ej_3 {
	public static void main(String[] args) {

		Scanner hallar = new Scanner(System.in);
		int b1, b2;

		System.out.println("Ingrese dos numeros enteros: ");
		b1 = hallar.nextInt();
		b2 = hallar.nextInt();

		if (b1 < 20) {

			if (b2 < 20) {

				System.out.println("El promedio de los numeros menores a 20 es: " + ((float) (b1 + b2) / 2));
			}

		}

		if (b1 < 20) {

			if (b2 > 20) {

				System.out.println("El promedio de los numeros menores a 20 es: " + b1);
			}

		}

		if (b2 < 20) {

			if (b1 > 20) {

				System.out.println("El promedio de los numeros menores a 20 es: " + b2);
			}

		}

		if (b1 > 20) {

			if (b2 > 20) {

				System.out.println("Ningun numero cumple con la condición ");
			}

		}

	}
}
