package com.cursojava.interfaces;

public interface Conducible {
	/**
	 * Define la propìedad arrancado del vehículo
	 */
	void arrancar();

	/**
	 * Permite conducir un vehículo
	 */
	void conducir();

	/**
	 * El vehículo se desplaza tantos metros + el tiempo de viaje actual.
	 * 
	 * @param distancia
	 */
	void avanzar(double distancia);

	/**
	 * El vehículo retrocede la distancia indicada
	 * 
	 * @param distancia
	 */
	void retroceder(double distancia);

	/**
	 * Permite parar nuestro vehículo
	 */
	void parar();
}
