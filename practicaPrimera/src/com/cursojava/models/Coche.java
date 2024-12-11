package com.cursojava.models;

import com.cursojava.interfaces.Conducible;

public class Coche extends Vehiculo implements Conducible {

	private static final int NUN_RUEDAS = 4;
	private int calibrePistola;

	public Coche(int id, String nombre, Color color, String matricula, int calibrePistola, boolean arrancado) {
		super(id, nombre, color, matricula, arrancado);
		this.calibrePistola = calibrePistola;
	}

	/**
	 * Pinta el coche aplicando el calibre de la pistola de pulverización. Las capas
	 * de pintura serán el calibre por el num de ruedas
	 */
	@Override
	public void pintarVehiculo(Color color) {
		int numCapas = Coche.NUN_RUEDAS * this.calibrePistola;
		System.out.println("Aplicando calibre de: " + this.calibrePistola);
		System.out.println("Pintando coche---- aplicando capas----::" + numCapas);
		System.out.println("Pintado de color:" + color);
	}

	@Override
	public String toString() {
		return "id: " + id + "/n" + " /nombre: " + nombre + "/n" + "Color: " + color + "/n" + "matricula: " + matricula
				+ ":" + (arrancado ? "Arrancado" : "Parado");
	}

	@Override
	public void conducir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() {
		if (isArrancado()) {
			setArrancado(false);
		} else {
			System.err.println("Vehículo ya parado");
		}

	}

	@Override
	public void arrancar() {
		if (isArrancado()) {
			System.err.println("Vehículo ya arrancado");
		} else {
			setArrancado(true);
		}

	}

	@Override
	public void avanzar(double distancia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retroceder(double distancia) {
		// TODO Auto-generated method stub

	}

}
