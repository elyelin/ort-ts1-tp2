package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_10 {

	static Scanner input = new Scanner(System.in);

	public final static int SEG = 3600;

	public static int devolverSegundos(int horas, int minutos, int segundos) {
		int total = horas * 3600 + minutos * 60 + segundos;

		return total;
	}

	public static void main(String[] args) {

		int numCorredor = 0, horas = 0, minutos = 0, segundos = 0, tiempoEnSegundos;
		int totalTiempo = 0, totalCorredores = 0;
		int numGanador = 0, tiempoGanador = Integer.MAX_VALUE;
		int corredoresRapidos = 0;

		do {
			System.out.print("Numero del corredor: ");
			numCorredor = input.nextInt();
			if (numCorredor != 0) {
				System.out.print("Horas de carrera: ");
				horas = input.nextInt();
				System.out.print("Minutos: ");
				minutos = input.nextInt();
				System.out.print("Segundos: ");
				segundos = input.nextInt();

				tiempoEnSegundos = devolverSegundos(horas, minutos, segundos);

				if (tiempoEnSegundos < tiempoGanador) {
					tiempoGanador = tiempoEnSegundos;
					numGanador = numCorredor;
				}

				if (tiempoEnSegundos < SEG) {
					corredoresRapidos = corredoresRapidos + 1;
				}
				totalTiempo = totalTiempo + tiempoEnSegundos;
				totalCorredores = totalCorredores + 1;
			}

		} while (numCorredor != 0);

		if (totalCorredores > 0) {
			System.out.println("El ganador es: " + numGanador + " y tardo: " + tiempoGanador + " segundos");

			float promedioEnSegundos = totalTiempo / totalCorredores;

			System.out.println("El promedio de los corredores en segundos es: " + promedioEnSegundos);

			float porcentaje = corredoresRapidos * 100 / totalCorredores;
			System.out.println("El porcentaje menos de una hora es " + porcentaje);
		} else {
			System.out.println("Terminado");
		}

		input.close();
	}
}
