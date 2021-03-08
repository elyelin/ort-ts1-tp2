package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_15 {
	static Scanner input = new Scanner(System.in);

	public static final int ABONO_A = 2;
	public static final double ABONO_B = 1.5;
	public static final int ABONO_C = 1;
	public static final int TOPE_C = 10;

	public static void main(String[] args) {
		int duracionLlamada;
		int cliente;
		char abono;
		double precioB = 0;
		int precio = 0;
		int contLlamada = 0;
		double promedio;
		int acumuladorA = 0, acumuladorB = 0, acumuladorC = 0, acumulado;
		int contadorLlamadaMenor = 0;
		int llamadaMasLarga = 0;
		int contadorLlamada = 0;

		do {
			System.out.print("Ingresa codigo cliente: ");
			cliente = input.nextInt();
			if (cliente > 10001 && cliente < 99999) {
				do {
					System.out.print("ingresa la duracion de la llamada: ");
					duracionLlamada = input.nextInt();
				} while (duracionLlamada < 1);
				if (duracionLlamada < 6) {
					contadorLlamadaMenor++;
				}
				if (llamadaMasLarga < duracionLlamada) {
					llamadaMasLarga = duracionLlamada;
				}

				contadorLlamada++;
			
				System.out.print("Ingresa tipo de abono: ");
				abono = input.next().charAt(0);

				switch (abono) {
				case 'a':
					precio = duracionLlamada * ABONO_A;
					System.out.println(precio);
					acumuladorA = acumuladorA + precio;
					break;
				case 'b':
					precio = duracionLlamada * ABONO_A;
					if (duracionLlamada > 5) {
						precioB = duracionLlamada * ABONO_B;
						System.out.println(precioB);
					} else {
						System.out.println(precio);
					}
					acumuladorB = acumuladorB + precio;
					break;
				case 'c':
					if (duracionLlamada <= TOPE_C) {
						precio = duracionLlamada * ABONO_C;
						System.out.println(precio);
					} else if (duracionLlamada > TOPE_C) {
						precio = TOPE_C;
						System.out.println(precio);
					}
					acumuladorC = acumuladorC + precio;
					break;
				default:
					System.out.print("No existe");
					break;
				}
				contLlamada++;
			} else if (cliente != 0) {
				System.out.print("Codigo invalido, ingrese nuevamente.");
			}
		} while (cliente != 0);
		

		if (contadorLlamada > 0) {
			System.out.println("Importe acumulado a pagar por abono: \n" + " a: " + acumuladorA + "\n b: " + acumuladorB + "\n c: " + acumuladorC);
			acumulado = acumuladorA + acumuladorB + acumuladorC;
			promedio = acumulado / contLlamada;
			System.out.println("Promedio de precio por llamada: " + promedio);
			System.out.println("Cantidad de llamadas de menos de 6 minutos: " + contadorLlamadaMenor);
			System.out.println("Minutos de la llamada mas larga: " + llamadaMasLarga);
		}else{
			System.out.print("No existe");
		}

		input.close();
	}
}
