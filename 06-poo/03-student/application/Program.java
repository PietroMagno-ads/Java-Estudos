/*
 * Exercício 03 — Student:
 *
 * Crie uma classe Student com os dados de um aluno e suas notas
 * dos três trimestres.
 *
 * Leia o nome do aluno e as três notas. Calcule a nota final
 * somando as notas dos três trimestres e verifique se o aluno
 * foi aprovado ou reprovado.
 *
 * A nota mínima para aprovação é 60 pontos.
 * Caso a nota final seja menor que 60, mostre também
 * a quantidade de pontos que faltaram para atingir a nota mínima.
 *
 * O exercício tem como objetivo praticar classes, objetos,
 * atributos, métodos e estruturas condicionais.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.print("1° Trimestre: ");
        student.primeiroTrimestre = sc.nextDouble();

        System.out.print("2° Trimestre: ");
        student.segundoTrimestre = sc.nextDouble();

        System.out.print("3° Trimestre: ");
        student.terceiroTrimestre = sc.nextDouble();

        double finalGrade = student.finalGrade();

        System.out.printf("FINAL GRADE = %.2f%n", finalGrade);

        if (finalGrade >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }

        sc.close();
    }
}