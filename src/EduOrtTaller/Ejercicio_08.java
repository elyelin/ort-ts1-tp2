package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_08 {
	
	static Scanner input = new Scanner(System.in);
	
	public static boolean esMultiplo(int num1, int num2){
		return num1%num2==0;
	}
	
	public static int pedirNum(String mensaje){
		int num;
		
		do{
		System.out.println("Ingresa un numero: ");
		num = input.nextInt();
	
		if(num <= 0){
			System.out.println("Vuelve a ingresar un numero mayor a 0");
		}
		}while(num <= 0);
		
		return num;
	}

	public static void main(String[] args) {
		int numero1, numero2;
		boolean multiplo;
		numero1 = pedirNum("Ingresa un numero: ");
		numero2 = pedirNum("mensaje");
		
		multiplo = esMultiplo(numero1, numero2);
		System.out.println("¿El numero " + numero1 + " es multiplo de " + numero2 + "? " + multiplo);
		input.close();
	}

}