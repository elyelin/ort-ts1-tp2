package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_04 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2;

		do {
			System.out.println("Ingresa dos numero: ");
			num1 = input.nextInt();
			input.nextLine();
			num2 = input.nextInt();
			input.nextLine();
			if (num1 > num2) {
				System.out.println("El numero " + num1 + " Debe ser menor");
			}
		} while (num1 > num2);

		System.out.println("Incluyendo");
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		System.out.println("Excluyendo");
		for (int i = (num1 + 1); i <= num2; i++) {
			System.out.println(i);
		}

		input.close();
	}
}
