package exerc03_04;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para escolher um dia da semana.");

		System.out.println("1 - segunda-feira.");
		System.out.println("2 - ter�a-feira.");
		System.out.println("3 - quarta-feira.");
		System.out.println("4 - quinta-feira.");
		System.out.println("5 - sexta-feira.");
		System.out.println("6 - s�bado.");
		System.out.println("7 - domingo.");
		System.out.println("Digite o n�mero correspondente ao dia (de 1 a 7):");

		int n1 = ler.nextInt();

		if (n1 == 1) {
			System.out.println("O dia escolhido � segunda-feira.");
		} else {
			if (n1 == 2) {
				System.out.println("O dia escolhido � ter�a-feira.");
			} else {
				if (n1 == 3) {
					System.out.println("O dia escolhido � quarta-feira.");
				} else {
					if (n1 == 4) {
						System.out.println("O dia escolhido � quinta-feira.");
					} else {
						if (n1 == 5) {
							System.out.println("O dia escolhido � sexta-feira.");
						} else {
							if (n1 == 6) {
								System.out.println("O dia escolhido � s�bado.");
							} else {
								if (n1 == 7) {
									System.out.println("O dia escolhido � domingo.");
								} else {
									System.out.println("Comando inv�lido.");
								}
							}
						}
					}
				}
			}

		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
