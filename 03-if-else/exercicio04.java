/*
 * Exercício 04:
 * Leia a hora inicial e a hora final de um evento.
 * Calcule a duração do evento em horas.
 * Caso a hora final seja menor ou igual à hora inicial,
 * considere que o evento terminou no dia seguinte.
 */

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("HORA INICIAL: ");
		int horaInicial = sc.nextInt();
		System.out.println("HORA FINAL");
		int horaFinal = sc.nextInt();
		int duracao;
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("Duração: " + duracao);
		sc.close();
	}
}
