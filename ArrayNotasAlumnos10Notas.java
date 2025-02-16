package ArrayNotasAlumnos10Notas;

import java.util.Scanner;

public class ArrayNotasAlumnos10Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[10];
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {

			System.out.println("Cual es la nota: " + (i + 1));
			notas[i] = scanner.nextDouble();

		}
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		System.out.println("La media de las notas es: " + suma/notas.length);
		
		
		scanner.close();
	}

}
