/*
 * Exercício 04:
 * Leia um número inteiro N e, em seguida, leia N pares de números inteiros.
 * Para cada par, divida o primeiro valor pelo segundo.
 * Caso o segundo valor seja igual a zero, mostre a mensagem
 * "Divisão impossível".
 * Para as divisões possíveis, mostre o resultado com uma casa decimal.
 */

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("Divisão impossível");

			} else {
				double divisao = (double) a / b;
				System.out.printf("%.1f%n", divisao);
			}

		}

		sc.close();
	}
}
