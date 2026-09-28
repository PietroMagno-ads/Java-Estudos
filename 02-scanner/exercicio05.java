/*
 * Exercício 05:
 * Leia os dados de duas peças, sendo:
 * código da peça, quantidade de peças e valor unitário.
 *
 * Calcule o valor total de cada peça e, ao final,
 * calcule e mostre o valor total a pagar pelas duas peças.
 */
 
import java.util.Scanner;
import java.util.Locale;

public class exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt", "BR"));
		Scanner sc = new Scanner(System.in);

		System.out.println("PEÇA 1");
		System.out.println("Digite: Código da peça | Número de peças | Valor por peça");
		int codigoP1 = sc.nextInt();
		int quantidadeP1 = sc.nextInt();
		double valorUnd1 = sc.nextDouble();
		double totalP1 = quantidadeP1 * valorUnd1;
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("PEÇA 2");
		System.out.println("Digite: Código da peça | Número de peças | Valor por peça");
		int codigoP2 = sc.nextInt();
		int quantidadeP2 = sc.nextInt();
		double valorUnd2 = sc.nextDouble();
		double totalP2 = quantidadeP2 * valorUnd2;
		double valorTotal = totalP1 + totalP2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

		sc.close();

	}

}
