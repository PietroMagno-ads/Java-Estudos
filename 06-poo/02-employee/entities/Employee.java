/*
 * Classe Employee:
 *
 * Representa um funcionário por meio dos atributos:
 * - name;
 * - grossSalary;
 * - tax.
 *
 * Possui métodos para:
 * - calcular o salário líquido;
 * - aplicar um aumento percentual ao salário bruto.
 */

package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}

}
