/*
 * Exercício 03:
 * Leia dois números inteiros e verifique se o primeiro número
 * é múltiplo do segundo.
 * Ao final, informe se os números são múltiplos ou não.
 */

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite dois números inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		sc.close();

	}

}
