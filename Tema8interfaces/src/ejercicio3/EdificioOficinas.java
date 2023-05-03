package ejercicio3;

public class EdificioOficinas implements Edificio {
	/**
	 * Numero total de oficinas en el edificio
	 */
	private int numoficinas;
	/**
	 * Superficie del edificio
	 */
	private double superficie;

	/**
	 * Devuelve el numero de oficinas del edificio
	 * 
	 * @return Numero de oficinas del edificio
	 */
	public int getNumoficinas() {
		return numoficinas;
	}

	/**
	 * Construcor con todos los parametros
	 * 
	 * @param numoficinas Numero de oficinas dado por el usuario
	 * @param superficie  Superficie dada por el usuario
	 */
	public EdificioOficinas(int numoficinas, double superficie) {
		super();
		this.numoficinas = numoficinas;
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
}