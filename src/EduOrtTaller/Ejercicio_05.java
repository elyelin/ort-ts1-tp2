package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_05 {
	public static Scanner input = new Scanner(System.in);

	public static int ingreseNumero() {
		int numero;

		System.out.println("Ingrese un numero");
		numero = input.nextInt();
		input.nextLine();

		return numero;
	}

	public static void main(String[] args) {

		int numeroIngresado, mayorNumIngresado = 0;
		int promedio = 0;
		int numerosCant = 0;
		int sumaNumeros = 0;

		do {
			numeroIngresado = ingreseNumero();
			numerosCant++;
			sumaNumeros += numeroIngresado;
			promedio = sumaNumeros / numerosCant;

			if (numeroIngresado > mayorNumIngresado) {
				mayorNumIngresado = numeroIngresado;
			}

		} while (promedio < 20);

		System.out.println("Numeros ingresados: " + numerosCant);
		System.out.println("El mayor numero fue: " + mayorNumIngresado);
		input.close();

	}

}