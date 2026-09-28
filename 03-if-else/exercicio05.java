/*
 * Exercício 05:
 * Leia o código de um produto e a quantidade comprada.
 * De acordo com o código informado, utilize o preço correspondente
 * ao produto e calcule o valor total da compra.
 *
 * Código 1 - R$ 4,00
 * Código 2 - R$ 4,50
 * Código 3 - R$ 5,00
 * Código 4 - R$ 2,00
 * Código 5 - R$ 1,50
 *
 * Ao final, mostre o valor total da compra com duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        int quantidade;
        double preco = 0;
        
        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        
        System.out.println();

        System.out.print("Digite a quantidade do produto: ");
        quantidade = sc.nextInt();

        
        if (codigo == 1) {
            preco = 4.00;

        } else if (codigo == 2) {
            preco = 4.50;

        } else if (codigo == 3) {
            preco = 5.00;

        } else if (codigo == 4) {
            preco = 2.00;

        } else if (codigo == 5) {
            preco = 1.50;
        }
        
        double valorTotal = preco * quantidade;
        
        System.out.println("___________________________________");
        System.out.printf ("Valor total = %.2f %n", valorTotal);
        
        sc.close();
    }
}