/*
 * Exercício 02:
 * Apresente um menu com opções de tipos de combustível:
 *
 * 1 - Álcool
 * 2 - Gasolina
 * 3 - Diesel
 * 4 - Encerrar
 *
 * Enquanto a opção informada for diferente de 4,
 * registre a escolha realizada e conte quantas vezes
 * cada tipo de combustível foi selecionado.
 *
 * Ao informar 4, encerre a leitura e mostre a mensagem
 * "MUITO OBRIGADO" junto com a quantidade de escolhas
 * para cada tipo de combustível.
 */

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("1) Álcool");
		System.out.println("2) Gasolina");
		System.out.println("3) Diesel");
		System.out.println("4) Encerrar Sessão");
		System.out.println("Deixe aqui sua escolha: ");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
		
	

	
