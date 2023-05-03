package ejercicio4;

public class AnimalDomestico implements Animal{
	/**
	 * Nombre del animal
	 */
	private String nombre;
	/**
	 * Raza del animal
	 */
	private String raza;
	/**
	 * peso del animal
	 */
	private double peso;
	/**
	 * Color del animal
	 */
	private String color;
	/**
	 * Vacunado?
	 */
	public abstract void vacunar();
	/**
	 * ¿Hara caso?
	 * @return Verdadero o falso dependiendo del resultado aleatorio
	 */
	public abstract boolean hacerCaso();
	@Override
	public abstract void comer();
	@Override
	public abstract void dormir();
	@Override
	public abstract void hacerRuido();

}