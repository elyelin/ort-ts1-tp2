package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_14 {

	static final int ABONO = 8500;
	static final int VIAJE_ADICIONAL = 100;
	static final int TOPE = 30;

	static Scanner input = new Scanner(System.in);

	public static String empresa() {
		String nombre;
		do{
			System.out.println("Ingresa el nombre de la empresa: ");
			nombre = input.nextLine();
		}while(nombre.equals(""));
		return nombre;
	}

	public static int calcularFactura(int viajesAdicionales) {
		if (viajesAdicionales <= TOPE) {
			return ABONO + (viajesAdicionales * VIAJE_ADICIONAL);
		} else {
			int subtotal = ABONO + (viajesAdicionales * VIAJE_ADICIONAL);
			return (int) (subtotal - (subtotal * 0.10));
		}
	}

	public static void main(String[] args) {
		String nombreEmpre;
		int total;
		float promedio;
		int factura = 0;
		int contViajes = 0;
		int viajesAdicionales = 0;
		boolean cantidadInvalida = true;

		nombreEmpre = empresa();
		do {
			System.out.println("Ingrese la cantidad de viajes adicionales: ");
			viajesAdicionales = input.nextInt();
			cantidadInvalida = viajesAdicionales < 0 || viajesAdicionales >= 1000;

			if (cantidadInvalida) {
				System.out.println("Cantidad de viajes invalida, Ingrese de nuevo...");
			}
			contViajes++;

		} while (cantidadInvalida);

		total = calcularFactura(viajesAdicionales);
		promedio = total / contViajes;
	
		if (factura < total) {
			factura = total;
		}
		
		System.out.println("La empresa " + nombreEmpre + " realizo " + viajesAdicionales
				+ " viajes adicionales y debe pagar una factura de $" + total);
		System.out.println("El promedio pagado por empresa en el pasado mes fue de $" + promedio + " La mayor factura es por un total de $" + factura);

		input.close();
	}

}
