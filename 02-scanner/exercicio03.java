/*
 * Exercício 03:
 * Leia quatro números inteiros A, B, C e D.
 * Calcule a diferença entre o produto de A por B
 * e o produto de C por D.
 * Ao final, mostre o resultado da diferença.
 */

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			int diferenca = (A * B) - (C * D);

			System.out.println("DIFERENÇA = " + diferenca);

		}
	}
}