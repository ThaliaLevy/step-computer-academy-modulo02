package exerc03_04;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para escolher um dia da semana.");

		System.out.println("1 - segunda-feira.");
		System.out.println("2 - terça-feira.");
		System.out.println("3 - quarta-feira.");
		System.out.println("4 - quinta-feira.");
		System.out.println("5 - sexta-feira.");
		System.out.println("6 - sábado.");
		System.out.println("7 - domingo.");
		System.out.println("Digite o número correspondente ao dia (de 1 a 7):");

		int n1 = ler.nextInt();

		if (n1 == 1) {
			System.out.println("O dia escolhido é segunda-feira.");
		} else {
			if (n1 == 2) {
				System.out.println("O dia escolhido é terça-feira.");
			} else {
				if (n1 == 3) {
					System.out.println("O dia escolhido é quarta-feira.");
				} else {
					if (n1 == 4) {
						System.out.println("O dia escolhido é quinta-feira.");
					} else {
						if (n1 == 5) {
							System.out.println("O dia escolhido é sexta-feira.");
						} else {
							if (n1 == 6) {
								System.out.println("O dia escolhido é sábado.");
							} else {
								if (n1 == 7) {
									System.out.println("O dia escolhido é domingo.");
								} else {
									System.out.println("Comando inválido.");
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
