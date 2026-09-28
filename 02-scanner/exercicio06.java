/*
 * Exercício 06:
 * Leia três valores reais A, B e C.
 * Utilize esses valores para calcular as áreas de:
 *
 * - Triângulo retângulo, utilizando A como base e C como altura;
 * - Círculo, utilizando C como raio;
 * - Trapézio, utilizando A e B como bases e C como altura;
 * - Quadrado, utilizando B como lado;
 * - Retângulo, utilizando A como base e B como altura.
 *
 * Ao final, mostre o resultado das cinco áreas calculadas.
 */

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double areaTriangulo = a * c / 2;
		double pi = 3.14159;
		double areaCirculo = pi * c * c;
		double areaTrapezio = (a + b) * c / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		System.out.println("Triângulo: " + areaTriangulo);
		System.out.println("Círculo: " + areaCirculo);
		System.out.println("Trapézio: " + areaTrapezio);
		System.out.println("Quadrado: " + areaQuadrado);
		System.out.println("Retângulo: " + areaRetangulo);
		sc.close();

	}
}
