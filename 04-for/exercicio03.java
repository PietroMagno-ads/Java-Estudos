
/*
 * Exercício 03:
 * Leia um número inteiro N, representando a quantidade de casos.
 * Para cada caso, leia três valores reais e calcule a média ponderada
 * desses valores, utilizando os pesos 2, 3 e 5, respectivamente.
 * Ao final de cada caso, mostre a média com uma casa decimal.
 */

import java.util.Locale;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de Casos: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();

	}

}
