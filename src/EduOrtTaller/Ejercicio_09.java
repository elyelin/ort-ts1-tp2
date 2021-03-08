package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_09 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, numerosCant = 0;
		float promedio = 0, suma = 0;
	
		for (int u = 0; u < 5; u++) {
			numerosCant = 0;
			suma = 0;
			for (int i = 0; i < 3; i++) {
				System.out.println("numero");
				numero = input.nextInt();
				input.nextLine();
				numerosCant++;
				suma += numero;
				
			}
			
			promedio = suma / numerosCant;
			System.out.println("Suma " + suma);
			System.out.println("Promedio " + promedio);
		}
		
		input.close();
	}

}