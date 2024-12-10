package com.cursojava.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cursojava.interfaces.Conducible;
import com.cursojava.models.Barco;
import com.cursojava.models.Coche;
import com.cursojava.models.Vehiculo;
import com.cursojava.models.Vehiculo.Color;

/**
 * Aplicación que permite gestionar los vehículos autónomos de empresa X
 * 
 * @author DavidH
 * @version 1.0
 */
public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Vehiculo> lista = new ArrayList<>();

	public static void main(String[] args) {
		// Datos de prueba
		lista.add(new Coche(1, "Nissan", Color.VERDE, "1345-FMG", 23, false));
		lista.add(new Coche(7, "Ford", Color.VERDE, "1345-FMG", 23, false));
		lista.add(new Coche(6, "Toyota", Color.VERDE, "1345-FMG", 23, false));
		lista.add(new Barco(4, "Poseidón", Color.BLANCO, "34354245-G", 123, false));
		lista.add(new Coche(5, "Telsa", Color.VERDE, "1345-FMG", 23, false));
		lista.add(new Coche(2, "Skoda", Color.VERDE, "1345-FMG", 23, false));
		lista.add(new Barco(8, "Fabior", Color.BLANCO, "777589038-A", 200, false));
		lista.add(new Barco(3, "Continentale", Color.ROJO, "11177839-Z", 400, false));
		menu();

	}

	/**
	 * Muestra las opciones disponibles al usuario
	 */
	private static void menu() {
		System.out.println("***GESTIÓN DE FLOTA DE VEHÍCULOS AUTÓNOMOS****");
		System.out.println();
		int opcion = 0;
		boolean salir = false;
		do {

			// Mostramos todos los vehículos disponibles
			mostrarVehiculos();
			try {
				System.out.println("Selecciona el id del vehículo a operar... (Se muestran por categorias)");
				opcion = sc.nextInt();
				sc.nextLine();

				// Busca vehículo
				Vehiculo v = obtenerVehiculo(opcion);
				if (v != null) {
					System.out.println(v);

					menuAccionesVehiculo(v);

				} else {
					System.err.println("No existe vehículo con el id proporcionado");
				}

			} catch (Exception e) {
				System.err.println("Opción no válida");
				salir = true;
			}

		} while (!salir);

	}

	/**
	 * Nos permite realizar las opciones de cada vehículo
	 * 
	 * @param Vehículo seleccionado
	 */
	private static void menuAccionesVehiculo(Vehiculo v) {
		int opcion = 0;
		boolean salir = false;
		do {
			System.out.println("1.Arrancar");
			System.out.println("2.conducir");
			System.out.println("3.avanzar");
			System.out.println("4.retrodecer");
			System.out.println("5.Parar");
			System.out.println("6.Pintar");
			System.out.println("7.Salir");
			try {
				opcion = sc.nextInt();
				sc.nextLine();
				switch (opcion) {
				case 1:
					arrancarVehiculo(v);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					pararVehiculo(v);
					break;
				case 6:
					pintarVehiculo(v);
					break;
				case 7:
					salir = true;
					break;
				default:
					System.err.println("Opción no válida");
					break;
				}
			} catch (Exception e) {
				System.err.println("Error");
				break;
			}
		} while (!salir);
	}

	/**
	 * Permite cambiar el estado de un vehículo a parado
	 * 
	 * @param Vehiculo
	 */
	private static void pararVehiculo(Vehiculo v) {
		if (v.isArrancado()) {
			v.setArrancado(false);
		} else {
			System.err.println("El vehículo ya se encuentra parado");
		}

	}

	/**
	 * Permite cambiar el estado de un vehículo a arrancado
	 * 
	 * @param Vehiculo
	 */
	private static void arrancarVehiculo(Vehiculo v) {
		if (!v.isArrancado()) {
			v.setArrancado(true);
		} else {
			System.err.println("El vehículo ya se encuentra arrancado");
		}

	}

	/**
	 * Pinta el vehiculo
	 * 
	 * @param Vehiculo
	 */
	private static void pintarVehiculo(Vehiculo v) {
		System.out.println("Elige color:");
		for (Color colores : Color.values()) {
			System.out.println(colores);
		}
		System.out.println("-->");
		String color = sc.nextLine();

	}

	/**
	 * Obtiene el vehiculo a partir de su id
	 * 
	 * @param id
	 * @return Vehiculo
	 */
	private static Vehiculo obtenerVehiculo(int opcion) {
		Vehiculo v = null;
		// Elección dentro del rango
		if ((opcion < lista.size()) && opcion > 0) {
			v = lista.get(opcion - 1);

		}

		return v;
	}

	/**
	 * Muestra todos los vehiculos del sistema
	 */
	private static void mostrarVehiculos() {
		for (Vehiculo vehiculo : lista) {
			if (vehiculo instanceof Coche c) {
				System.out.println("Tipo Coche: " + c);
			}
			if (vehiculo instanceof Barco b) {
				System.out.println("Tipo Barco: " + b);
			}
		}

	}

}
