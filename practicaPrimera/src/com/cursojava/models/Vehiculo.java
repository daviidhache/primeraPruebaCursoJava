package com.cursojava.models;

/**
 * Superclase vehículo
 * 
 * @author DavidH @version1.0
 */
public abstract class Vehiculo {
	public enum Color {
		VERDE, AZUL, ROJO, BLANCO, NEGRO, GRIS;
	}

	protected int id;
	protected String nombre;
	protected Color color;
	protected String matricula;
	protected boolean arrancado;

	public Vehiculo(int id, String nombre, Color color, String matricula, boolean arrancado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.matricula = matricula;
		this.arrancado = false;
	}

	protected boolean isArrancado() {
		return arrancado;
	}

	protected void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Método que definirá como debe ser pintado para cada vehículo
	 * 
	 * @param El color nuevo asignado
	 */
	protected abstract void pintarVehiculo(Color c);

}
