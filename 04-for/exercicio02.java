/*
 * Exercício 02:
 * Leia um número inteiro N e, em seguida, leia N números inteiros.
 * Conte quantos desses valores estão dentro do intervalo de 10 a 20
 * e quantos estão fora desse intervalo.
 * Ao final, mostre a quantidade de valores "in" e "out".
 */

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}