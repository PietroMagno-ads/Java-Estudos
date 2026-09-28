/*
 * Exercício 02:
 * Leia um número inteiro e verifique se ele é par ou ímpar.
 * Ao final, mostre a classificação do número.
 */

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		sc.close();

	}

}
