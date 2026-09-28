/*
 * Exercício 06:
 * Leia um valor real e verifique em qual dos seguintes intervalos
 * o valor está:
 *
 * [0,25]
 * (25,50]
 * (50,75]
 * (75,100]
 *
 * Caso o valor não pertença a nenhum desses intervalos,
 * mostre "Fora de intervalo".
 */

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		double valor = sc.nextDouble();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");

		} else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo [25,50]");

		} else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalo [50,75]");

		} else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo [75,100]");

		} else if (valor < 0 && valor > 100) {
			System.out.println("Fora de intervalo");

		sc.close();
		}
	}
}
