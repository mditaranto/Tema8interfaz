package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio {
	/**
	 * Superficie del polideportivo
	 */
	private double superficie;
	/**
	 * Nombre del polideportivo
	 */
	private String nombre;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param superficie Superficie del polideportivo
	 * @param nombre     Nombre del polideportivo
	 */
	public Polideportivo(double superficie, String nombre) {
		super();
		this.superficie = superficie;
		this.nombre = nombre;
	}

	@Override
	public int getTipoDeInstalacion() {
		int tipo = 0;
		switch (nombre) {
		case "futbol" -> tipo = 1;
		case "tenis" -> tipo = 2;
		case "padel" -> tipo = 3;
		case "baloncesto" -> tipo = 4;
		default -> tipo = 0;
		}
		return tipo;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

}
