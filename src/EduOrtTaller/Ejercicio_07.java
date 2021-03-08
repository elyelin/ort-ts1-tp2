package EduOrtTaller;

import java.util.Scanner;

public class Ejercicio_07 {

	static Scanner input = new Scanner(System.in);

	public static String pedirUsuario(String usuario) {
		do {
			System.out.println("Ingrese su usuario: ");
			usuario = input.nextLine();
		} while (usuario.equals(""));
		return usuario;
	}

	public static int pedirPassword(int password) {
		do {
			System.out.println("Ingrese su contraseña: ");
			password = input.nextInt();
		} while (password < 0 || password > 10);
		return password;
	}
	
	public static void main(String[] args) {

		String usuarioGuardado = "user";
		String passwordGuardado = "2443";
		String username;
		String password;
		int numeroIntentos = 0;
		boolean ingresoExitoso = false;

		do {
			System.out.println("Ingrese su usuario: ");
			username = input.nextLine();
			System.out.println("Ingrese su contraseña: ");
			password = input.nextLine();

			if (usuarioGuardado.equals(username) && passwordGuardado.equals(password)) {
				ingresoExitoso = true;

			} else {
				numeroIntentos++;
				if (numeroIntentos <= 2) {
					System.out.println("Usuario o clave incorrectos, vuelva a intentar");
				} else {
					System.out.println("Usuario o clave incorrectos");
				}
			}

		} while (ingresoExitoso == false && numeroIntentos < 3);

		if (ingresoExitoso) {
			System.out.println("Ha ingresado correctamente");
		} else {
			System.out.println("Se ha bloqueado su cuenta");
		}

		input.close();
	}

}
