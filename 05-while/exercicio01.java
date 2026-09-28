/*
 * Exercício 01:
 * Leia uma senha inteira e verifique se ela é igual a 2002.
 *
 * Enquanto a senha informada estiver incorreta, solicite
 * que o usuário digite a senha novamente e mostre
 * a mensagem "Senha Invalida.".
 *
 * Quando a senha correta for informada, mostre
 * a mensagem "Acesso Permitido!".
 */

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("-------------------------");
			System.out.println("Senha Invalida.");
			System.out.println();
			System.out.print("Digite novamente: ");
			senha = sc.nextInt();

		}

		System.out.println();
		System.out.println("Acesso Permitido!");

		sc.close();
	}
}
