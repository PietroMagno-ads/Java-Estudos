/*
 * Exercício 01:
 * Leia um número inteiro e verifique se ele é negativo ou não negativo.
 * Ao final, mostre a classificação do número.
 */

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro sendo ele NEGATIVO ou NÃO NEGATIVO: ");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("NÚMERO NEGATIVO");
		}

		else {
			System.out.println("NÚMERO NÃO NEGATIVO");
		}
		sc.close();

	}
}
