package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_11 {
	
	static Scanner input = new Scanner(System.in);
	
	public static int ingresaNum(){
		int numero;
		System.out.println("Ingrese un numero: ");
		numero = input.nextInt();
		return numero;
	}

	public static void main(String[] args) {
		int numA, numB, suma = 0, max, sumados;
		
		numA = ingresaNum();
		numB = ingresaNum();
		
		if(numA < numB){
			max = numA;
			sumados = numB;
		} else {
			max = numB;
			sumados = numA;
		}
		
		for (int i = 0; i < max; i++){
			suma += sumados;
		}
		System.out.println("El producto entre " + numA + " y " + numB + " es " + suma);
		
		suma = 0;
		
		for(int i = 0; i < sumados; i++){
			suma += max;
		}
		System.out.println("El producto entre " + numB + " y " + numA + " es " + suma);

	}

}
