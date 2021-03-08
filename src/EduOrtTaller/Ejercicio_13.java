package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_13 {

	static Scanner input = new Scanner(System.in);

	/*
	 * public static int pedirAlumnos(int numeros){ int alumnos;
	 * System.out.println("Ingresa la cantidad de alumnos: "); alumnos =
	 * input.nextInt(); return alumnos;}
	 */

	public static void main(String[] args) {
		int cantAlum;
		int contTaller = 0;
		int contMate = 0;
		int contFunda = 0;
		char curso = ' ';
		int materia = 0;
		boolean incorrecto = false;

		System.out.println("Ingresa la cantidad de alumnos: ");
		cantAlum = input.nextInt();

		for (int a = 1; a <= cantAlum; a++) {

			do {
				System.out.println("Ingresa el curso:  ");
				curso = input.next().charAt(0);
			} while (curso != 'a' && curso != 'b' && curso != 'c' && curso != 'd');

			do {
				incorrecto = false;
				System.out.println("Ingresa la materia: \n 1)Taller \n 2)Matematicas \n 3)Fundamentos");
				materia = input.nextInt();

				switch (materia) {
				case 1:
					contTaller++;
					break;
				case 2:
					contMate++;
					break;
				case 3:
					contFunda++;
					break;
				default:
					incorrecto = true;
					System.out.println("No existe");
					break;
				}
				
			} while (incorrecto == true);

		}
		
		if(contMate > contFunda && contMate > contTaller){
			System.out.println("La materia mas requerida fue Matematicas");
		} else if(contFunda > contTaller && contFunda > contMate){
			System.out.println("La materia mas requerida fue Fundamentos");
		}else if(contTaller > contMate && contTaller > contFunda){
			System.out.println("La materia mas requerida fue Taller");
		}else{
			System.out.println("Todas las materias son requeridas igualitariamente");
		}
		
		input.close();

	}
}