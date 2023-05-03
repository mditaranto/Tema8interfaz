package ejercicio1;

/**
 * Clase que guarda socios
 * @author Matis
 *
 */
public class Socio implements Comparable{
	/**
	 * Atributo de ID del socio
	 */
	private int id;
	/**
	 * Atributo de Nombre del socio
	 */
	private String nombre;
	/**
	 * Atributo de Edad del socio
	 */
	private int edad;
	/**
	 * Constructor por defecto
	 * @param id Id dado 
	 * @param nombre 
	 * @param edad 
	 */
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Metodo toString
	 */
	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", edad=" + edad;
	}
	/**
	 * Metodo implementado de comparar
	 */
	@Override
	public int compareTo(Socio obv) {
		int respuesta = 0;
		if(this.id > obv.id) {
			respuesta = 1;
		}
		else if(this.id < obv.id) {
			respuesta = -1;
		}
		return respuesta;
	}
}
