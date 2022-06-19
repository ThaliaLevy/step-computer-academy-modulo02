package exerc03_04;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar se a pessoa é maior ou menor de idade:");

		System.out.println("Digite a idade:");
		int idade = ler.nextInt();

		if (idade < 18) {
			System.out.println("A pessoa tem " + idade + " anos e é menor de idade.");
		} else {
			System.out.println("A pessoa tem " + idade + " anos e é maior de idade.");
		}

		System.out.println("Fim do programa.");
		ler.close();

	}

}
