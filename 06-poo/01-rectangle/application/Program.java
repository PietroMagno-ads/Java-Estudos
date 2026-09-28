/*
 * Exercício 01 — Rectangle:
 *
 * Crie uma classe Rectangle com os atributos width e height.
 *
 * Leia a largura e a altura de um retângulo e, utilizando
 * métodos da classe Rectangle, calcule e mostre:
 *
 * - Área;
 * - Perímetro;
 * - Diagonal.
 *
 * O exercício tem como objetivo praticar os conceitos básicos
 * de Programação Orientada a Objetos, como classes, objetos,
 * atributos e métodos.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle(); 
        System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();
	}

}
