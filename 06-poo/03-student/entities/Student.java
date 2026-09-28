/*
 * Classe Student:
 *
 * Representa um aluno por meio dos atributos:
 * - name;
 * - primeiroTrimestre;
 * - segundoTrimestre;
 * - terceiroTrimestre.
 *
 * Possui métodos para:
 * - calcular a nota final;
 * - calcular a quantidade de pontos faltantes para atingir
 *   a nota mínima de 60 pontos.
 */

package entities;

public class Student {

    public String name;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public double finalGrade() {
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}