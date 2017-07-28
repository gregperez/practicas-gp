import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controlador.Controlador;
import modelo.Persona;

public class Main {

	private static Scanner sc = null;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de personas que procesara: ");
		int cont = sc.nextInt();
		List<Persona> arrPers = new ArrayList<Persona>();
		Persona person = null;
		String nombre = "";
		int edad = 0;
		
		for (int i = 1; i <= cont; i++) {
			System.out.print("Nombre: ");
			nombre = sc.next();
			System.out.print("Edad: ");
			edad = sc.nextInt();
			
			person = new Persona(nombre, edad);
			arrPers.add(person);
		}
		Controlador controlador = new Controlador();
		controlador.procesarPersonas(arrPers);
	}

}
