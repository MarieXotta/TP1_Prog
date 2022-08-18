package Ejercicio_4;

import java.util.*;

public class Ej_4 {

	public static void main(String[] args) {
		Scanner hallar = new Scanner(System.in);
		float d1, d2, d3, suma, maximo;

		System.out.println("Ingrese tres numeros decimales: ");
		d1 = hallar.nextFloat();
		d2 = hallar.nextFloat();
		d3 = hallar.nextFloat();

		suma = d1 + d2 + d3;

		System.out.println("La suma de los números ingresados es: " + suma);

		maximo = d1;

		if (d2 > maximo) {
			maximo = d2;
		}

		if (d3 > maximo) {
			maximo = d3;
		}

		System.out.println("El número máximo es: " + maximo);

	}

}
