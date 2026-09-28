/*
 * Exercício 02:
 * Leia o valor do raio de um círculo e calcule sua área.
 * Considere PI = 3.14159.
 * Ao final, mostre o resultado com quatro casas decimais.
 */
 
import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = 3.14159;
		double calculo = area * (raio * raio);

		System.out.printf("RESULTADO DO CALCULO = %.4f %n", calculo);

		sc.close();

	}
}
