package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_06 {
	
	static Scanner input = new Scanner(System.in);
	
	public static String pedirNombre(){
		String nombre = "";
		do{
		System.out.print("Ingresa tu nombre: ");
		nombre = input.nextLine();
		}while(nombre.equals(""));
		return nombre;
	}
	
	public static int pedirPromedio(){
		int promedio = 0;
		
		do{
		System.out.print("Ingresa tu promedio: ");
		promedio = input.nextInt();
		input.nextLine();
		}while(promedio < 0 || promedio > 10);
		return promedio;
	}
	
	public static void main(String[] args) {
		String nombre, mejorNombre = "";
		int promedio, mejorPromedio = 0;
		
		for(int i = 0; i < 10; i++){
			nombre = pedirNombre();
			promedio = pedirPromedio();
			
			if(promedio > mejorPromedio){
				mejorPromedio = promedio;
				mejorNombre = nombre;
			}
			
		}
		System.out.println("El mejor alumno es: " + mejorNombre + ", con promedio de: " + mejorPromedio );
		
		input.close();

	}

}