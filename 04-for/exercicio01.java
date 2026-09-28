
/*
 * Exercício 01:
 * Leia um número inteiro X e mostre todos os números ímpares
 * de 1 até X.
 */

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		int i;
		for (i = 1; i <= x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
		sc.close();
	}
}
