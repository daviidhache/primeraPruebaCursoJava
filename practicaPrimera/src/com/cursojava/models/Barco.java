package com.cursojava.models;

import com.cursojava.interfaces.Conducible;

public class Barco extends Vehiculo implements Conducible {
	private double eslora;

	public Barco(int id, String nombre, Color color, String matricula, double eslora, boolean arrancado) {
		super(id, nombre, color, matricula, arrancado);
		this.eslora = eslora;
	}

	@Override
	public void pintarVehiculo(Color c) {
		// TODO Auto-generated method stub

	}
	public boolean getArrancado() {
		return isArrancado();
	}

	@Override
	public String toString() {
		return "id: " + id + "/n" + "/nombre: " + nombre + "/n" + "Color: " + color + "/n" + "matricula: " + matricula
				+ " " + (arrancado ? "Arrancado" : "Parado");
	}

	@Override
	public void conducir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub

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
