package exerc03_04;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double maior;

		System.out.println("Programa para verificar qual n�mero, dentre 2, � maior:");

		System.out.println("Digite o primeiro n�mero:");
		Double n1 = ler.nextDouble();
		maior = n1;

		System.out.println("Digite o segundo n�mero:");
		Double n2 = ler.nextDouble();
		if (n2 > maior) {
			maior = n2;
		}

		System.out.println("O maior n�mero � " + maior);
		ler.close();

	}
}
