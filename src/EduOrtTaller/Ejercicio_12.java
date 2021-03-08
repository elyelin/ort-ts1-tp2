package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_12 {

	static Scanner input = new Scanner(System.in);

	public static int suma(int num1, int num2) {
		return num1 + num2;
	}

	public static int resta(int num1, int num2) {
		return num1 - num2;
	}

	public static int producto(int num1, int num2) {
		return num1 * num2;
	}

	public static float division(float num1, float num2) {
		return num1 / num2;
	}

	public static float modulo(float num1, float num2) {
		return num1 % num2;
	}

	public static void main(String[] args) {
		int numA, numB;

		char fin = 'f';
		char operacion;

		do {
			System.out.println("Elija la operacion que desea realizar: ");
			System.out.println("Para sumar ingresa + ");
			System.out.println("Para restar ingresa - ");
			System.out.println("Para sacar el producto ingresa * ");
			System.out.println("Para dividir ingresa / ");
			System.out.println("Para obtener el resto ingresa % ");
			System.out.println("Para salir ingrese f ");
			operacion = input.next().charAt(0);
			System.out.println("Ingresa dos numeros: ");
			numA = input.nextInt();
			input.nextLine();
			numB = input.nextInt();

			float resultado;

			switch (operacion) {
			case '+':
				resultado = suma(numA, numB);
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case '-':
				resultado = resta(numA, numB);
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case '*':
				resultado = producto(numA, numB);
				System.out.println("El resultado del producto es: " + resultado);
				break;
			case '/':
				if (numB == 0) {
					System.out.println("No se puede dividir por 0");
				} else {
					resultado = division(numA, numB);
					System.out.println("El resultado de la division es: " + resultado);
				}
			case '%':
				if (numB == 0) {
					System.out.println("No se puede dividir por 0");
				} else {
					resultado = modulo(numA, numB);
					System.out.println("El resultado del modulo es: " + resultado);
				}
				break;
			default:
				System.out.println("Esa operacion no existe");
			}

		} while (operacion != fin);

		input.close();
	}

}
