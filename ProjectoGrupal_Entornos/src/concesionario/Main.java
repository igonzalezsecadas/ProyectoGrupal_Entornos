package concesionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Coches> listaCoches = new ArrayList<>();
		ArrayList<Empleados> listaEmpleados = new ArrayList<>();
		
		insertarEmpleado(listaEmpleados);
		insertarCoche(listaCoches);
		
	}
	
	public static void insertarEmpleado(ArrayList<Empleados> lista) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce un nombre: ");
		String nombre = in.nextLine();
		
		System.out.println("Introduce un DNI: ");
		String dni = in.nextLine();
		
		System.out.println("Introduce una direccion: ");
		String direccion = in.nextLine();
		
		lista.add(new Empleados(nombre, dni, direccion));
	}
	
	public static void insertarCoche(ArrayList<Coches> lista) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce una matricula: ");
		String matricula = in.nextLine();
		
		System.out.println("Introduce los kilometros: ");
		float kilometros = Float.parseFloat(in.nextLine());
		
		System.out.println("Introduce el precio: ");
		float precio = Float.parseFloat(in.nextLine());
		
		lista.add(new Coches(matricula, kilometros, precio));
	}
	
	

}
