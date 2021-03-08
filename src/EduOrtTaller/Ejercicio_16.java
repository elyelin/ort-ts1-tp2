package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_16 {
	static Scanner input = new Scanner(System.in);

	public static final int IMP_CLA = 300;
	public static final int IMP_CELI = 310;
	public static final int IMP_KOS = 430;
	public static final int IMP_LIG = 290;
	public static final int IMP_BEBI = 30;
	public static final String OP_CELIACO = "celiaco";
	public static final String OP_KOSHER = "kosher";
	public static final String OP_LIGHT = "light";
	public static final String OP_CLASICO = "clasico";
	public static final String OP_FIN = "fin";

	public static boolean bienvenidaSiNo() {
		boolean calcularBienvenida = false;
		String ingreso;
		do {
			System.out.println("Bienvenido! ¿Desea calcular el precio total del catering para su fiesta? (s/n)");
			ingreso = input.nextLine().toLowerCase();
			if (!ingreso.equals("s") && !ingreso.equals("n")) {
				System.out.println("Ingreso incorrecto");
			}
		} while (!ingreso.equals("s") && !ingreso.equals("n"));
		if (ingreso.equals("s")) {
			calcularBienvenida = true;
		}

		return calcularBienvenida;
	}

	public static int pedirInvitados() {
		int invitados;
		do {
			System.out.println("Ingrese la cantidad total de invitados: ");
			invitados = Integer.parseInt(input.nextLine());
		} while (invitados < 0);
		return invitados;
	}

	public static String pedirMenu() {
		String comida;
		boolean opcionValida = false;
		do {
			System.out.println("Ingrese el tipo de menú (clásico/celiaco/kosher/light. fin para finalizar)");
			comida = input.nextLine().toLowerCase();
			opcionValida = comida.equals("clasico") || comida.equals("celiaco") || comida.equals("kosher")
					|| comida.equals("light") || comida.equals("fin");
			if (!opcionValida) {
				System.out.println("Error");
			}
		} while (!opcionValida);
		return comida;
	}

	public static int cantidadPlatos(int platosRestantes) {
		int platos;
		System.out.println("Ingrese la cantidad de invitados que eligieron ese menú");
		platos = Integer.parseInt(input.nextLine());
		while (platos < 0 || platos > platosRestantes) {
			System.out.println("ERROR: Ha ingresado mas cantidad de platos que de invitados!");
			System.out.print("Ingrese la cantidad de invitados que eligieron este menu: ");
			platos = Integer.parseInt(input.nextLine());
		}
		return platos;
	}

	private static void informarCantidadesYCostos(int cantidadDeInvitados, int cantidadClasico, int cantidadCeliaco,
			int cantidadKosher, int cantidadLight) {
		int platosProcesados, importeCeliaco, importeClasico, importeKosher, importeLight, importeComida,
				importeBebidas, importeTotal;
		platosProcesados = cantidadClasico + cantidadCeliaco + cantidadKosher + cantidadLight;
		importeClasico = cantidadClasico * IMP_CLA;
		importeCeliaco = cantidadCeliaco * IMP_CELI;
		importeKosher = cantidadKosher * IMP_KOS;
		importeLight = cantidadLight * IMP_LIG;
		importeBebidas = platosProcesados * IMP_BEBI;
		importeComida = importeClasico + importeCeliaco + importeKosher + importeLight;
		importeTotal = importeComida + importeBebidas;
		System.out.printf("Usted ha invitado a %d personas.\n", cantidadDeInvitados);
		System.out.printf("Clasico: $%d\n", importeClasico);
		System.out.printf("Celiaco: $%d\n", importeCeliaco);
		System.out.printf("Kosher: $%d\n", importeKosher);
		System.out.printf("Light: $%d\n", importeLight);
		System.out.printf("El costo de comida es de $%d\n", importeComida);
		System.out.printf("El costo de bebidas es de $%d\n", importeBebidas);
		System.out.printf("El costo total es de $%d\n", importeTotal);
		if (platosProcesados != cantidadDeInvitados) {
			System.out.printf("ATENCION: No se procesaron %d platos.\n", cantidadDeInvitados - platosProcesados);
		}
	}

	public static void main(String[] args) {
		int invitados;
		String menu = "";
		int cantInvitados, cantidadClasico, cantidadCeliaco, cantidadKosher, cantidadLight;
		int platosRestantes;
		cantidadClasico = 0;
		cantidadCeliaco = 0;
		cantidadKosher = 0;
		cantidadLight = 0;

		if (bienvenidaSiNo()) {
			invitados = pedirInvitados();
			platosRestantes = invitados;
			menu = pedirMenu();

			while (!menu.equals(OP_FIN)) {
				cantInvitados = cantidadPlatos(platosRestantes);
				// *invitados = invitados - cantInvitados;
				// cont++;
				// System.out.println(invitados);*/
				if (menu.equals(OP_CLASICO)) {
					cantidadClasico += cantInvitados;
				} else if (menu.equals(OP_CELIACO)) {
					cantidadCeliaco += cantInvitados;
				} else if (menu.equals(OP_KOSHER)) {
					cantidadKosher += cantInvitados;
				} else if (menu.equals(OP_LIGHT)) {
					cantidadLight += cantInvitados;
				}
				platosRestantes -= cantInvitados;
				if (platosRestantes == 0) {
					menu = OP_FIN;
				} else {
					menu = pedirMenu();
				}
			}
			informarCantidadesYCostos(invitados, cantidadClasico, cantidadCeliaco, cantidadKosher, cantidadLight);
		} else {
			System.out.println("Muchas gracias!");
		}
		input.close();
	}
}