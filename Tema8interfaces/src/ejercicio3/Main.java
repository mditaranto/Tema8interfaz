package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double superficie;
		String nombre;
		int numoficinas;

		Polideportivo poli[] = new Polideportivo[5];
		EdificioOficinas edi[] = new EdificioOficinas[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < poli.length; i++) {
			System.out.print("Introduzca la superficie del polideportivo: ");
			superficie = sc.nextDouble();
			System.out.print("Introduzca el nombre del tipo de polideportivo");
			nombre = sc.nextLine();
			poli[i] = new Polideportivo(superficie, nombre);
		}

		for (int i = 0; i < edi.length; i++) {
			System.out.print("Introduzca la superficie del edificio: ");
			superficie = sc.nextDouble();
			System.out.print("Introduzca el numero de oficinas en el ediificio: ");
			numoficinas = sc.nextInt();
			edi[i] = new EdificioOficinas(numoficinas, superficie);
		}

		for (int i = 0; i < edi.length + poli.length; i++) {
			if (i < 5) {
				System.out.println("La superficie del polideportivo es de " + poli[i].getSuperficieEdificio()
						+ "m2 y el tipo es " + poli[i].getTipoDeInstalacion());
			}
			if (i < 10) {
				System.out.println("El numero de oficinas es de " + edi[i - 5].getNumoficinas()
						+ " y la superficie del edificio es de " + edi[i - 5].getSuperficieEdificio() + "m2");
			}
		}
	}

}
