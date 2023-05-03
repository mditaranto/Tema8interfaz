package ejercicio4;

public class Perro extends AnimalDomestico {

	@Override
	public void vacunar() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hacerCaso() {
		int num = (int) (Math.random() * 100);
		boolean resultado = true;
		if (num >= 0 && num <= 9) {
			resultado = false;
		}
		return resultado;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau Guau");
	}

	/**
	 * Metodo particular del perro
	 */
	public void sacarPaseo() {
	}

}