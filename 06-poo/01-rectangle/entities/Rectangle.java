/*
 * Classe Rectangle:
 *
 * Representa um retângulo por meio dos atributos width e height.
 *
 * Possui métodos responsáveis por calcular:
 * - área;
 * - perímetro;
 * - diagonal.
 */

package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height; 
	}
	
	public double perimeter() {
		return 2 * width + 2 * height;
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
