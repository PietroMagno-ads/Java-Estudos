/*
 * Exercício 01:
 * Leia dois números inteiros e calcule a soma entre eles.
 * Ao final, mostre o resultado da soma.
 */

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int soma = numero1 + numero2;

		System.out.println("SOMA: " + soma);

		sc.close();

	}
}
