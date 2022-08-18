package Ejercicio_5;

import java.util.*;

public class Ej_5 {

	public static void main(String[] args) {
		Scanner hallar = new Scanner(System.in);
		int n1, n2, n3, cont = 0;
		float porcentaje;

		System.out.println("Ingrese tres numeros: ");
		n1 = hallar.nextInt();
		n2 = hallar.nextInt();
		n3 = hallar.nextInt();

		if (n1 > 50) {

			if (n1 < 70) {
				cont = cont + 1;
			}
		}

		if (n2 > 50) {

			if (n2 < 70) {
				cont = cont + 1;
			}
		}

		if (n3 > 50) {

			if (n3 < 70) {
				cont = cont + 1;
			}
		}

		porcentaje = (float) (cont * 100) / 3;

		System.out.println("El porcentaje de los números ingresados es: " + porcentaje);

	}
}
