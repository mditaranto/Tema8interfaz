package ejercicio4;

/**
 * @author Matis
 *
 */
public class Gato extends AnimalDomestico{

	@Override
	public void vacunar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hacerCaso() {
		int num = (int) (Math.random()*100);
		boolean resultado = false;
		if(num>=0&&num<=4) {
			resultado = true;
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
		System.out.println("Meow Meow");
	}
	/**
	 * Metodo particular del gato
	 */
	public void toserBolaPelo() {}
}
