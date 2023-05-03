package ejercicio2;

public class Futbolista implements Comparable {
	/**
	 * Numero de camiseta del jugador
	 */
	private int numCamiseta;
	/**
	 * Nombre del futbolista
	 */
	private String nombre;
	/**
	 * Edad del futbolista
	 */
	private int edad;
	/**
	 * Numero de goles del futbolista
	 */
	private int numGoles;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param numCamiseta Numero de camiseta dado por el usuario
	 * @param nombre      Nombre dado por el usuario
	 * @param edad        Edad dada por el usuario
	 * @param numGoles    Numero de goles dado por el usuario
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "numCamiseta=" + numCamiseta + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles;
	}

	/**
	 * Compara si son iguales los objetos
	 * 
	 * @param obj Objeto a comparar
	 * @return True/False dependiendo si son iguales o no
	 */
	public boolean equals(Futbolista obj) {
		boolean iguales = false;
		if (this.numCamiseta == obj.numCamiseta && this.nombre.equals(obj.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	public int compareTo(Futbolista obj) {
		
		int respuesta = 0;
		if (this.numCamiseta > obj.numCamiseta) {
			respuesta = 1;
		} else if (this.numCamiseta < obj.numCamiseta) {
			respuesta = -1;
		} else {
			if (this.nombre.equals(obj.nombre)) {
				respuesta = 0;
			} else {
				respuesta = this.nombre.compareTo(obj.nombre);
			}
		}
		return respuesta;
	}
}
