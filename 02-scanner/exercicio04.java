/*
 * Exercício 04:
 * Leia o número de identificação de um funcionário,
 * a quantidade de horas trabalhadas e o valor recebido por hora.
 * Calcule o salário do funcionário e mostre o número
 * e o salário com duas casas decimais.
 */
 
import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;

		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();

	}

}
