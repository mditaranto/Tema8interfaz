package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Socio socio[] = new Socio[10];

		for (int i = 0; i < socio.length; i++) {
			socio[i] = new Socio((int) (Math.random() * 55), "Luis", 74);
		}

		for (int i = 0; i < socio.length; i++) {
			Socio temp;
			for (int j = 0; j < socio.length; j++) {
				if (socio[i].compareTo(socio[j]) > 0) {
					temp = socio[i];
					socio[i] = socio[j];
					socio[j] = temp;
				}
			}
		}

		for (int i = 0; i < socio.length; i++) {
			System.out.println(socio[i].toString());
			System.out.println();
		}
	}

}
