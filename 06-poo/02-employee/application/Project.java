/*
 * Exercício 02 — Employee:
 *
 * Crie uma classe Employee com os atributos name, grossSalary e tax.
 *
 * Leia os dados de um funcionário e mostre seu salário líquido.
 * Em seguida, leia uma porcentagem de aumento salarial,
 * aplique o aumento e mostre os dados atualizados do funcionário.
 *
 * O exercício tem como objetivo praticar classes, objetos,
 * atributos, métodos com retorno e métodos void.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

		System.out.println();
		System.out.println("Which porcentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.netSalary());

		sc.close();

	}
}
