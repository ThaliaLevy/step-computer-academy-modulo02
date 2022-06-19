package exerc03_04;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Programa para escolher um dos meses do ano.");

		System.out.println("1 - Janeiro.");
		System.out.println("2 - Fevereiro.");
		System.out.println("3 - Março.");
		System.out.println("4 - Abril.");
		System.out.println("5 - Maio.");
		System.out.println("6 - Junho.");
		System.out.println("7 - Julho.");
		System.out.println("8 - Agosto.");
		System.out.println("9 - Setembro.");
		System.out.println("10 - Outubro.");
		System.out.println("11 - Novembro.");
		System.out.println("12 - Dezembro.");
		System.out.println("Digite o número correspondente ao mês (de 1 a 12):");

		int n1 = ler.nextInt();

		if (n1 == 1) {
			System.out.println("O mês escolhido é janeiro.");
		} else {
			if (n1 == 2) {
				System.out.println("O mês escolhido é fevereiro.");
			} else {
				if (n1 == 3) {
					System.out.println("O mês escolhido é março.");
				} else {
					if (n1 == 4) {
						System.out.println("O mês escolhido é abril.");
					} else {
						if (n1 == 5) {
							System.out.println("O mês escolhido é maio.");
						} else {
							if (n1 == 6) {
								System.out.println("O mês escolhido é junho.");
							} else {
								if (n1 == 7) {
									System.out.println("O mês escolhido é julho.");
								} else {
									if (n1 == 8) {
										System.out.println("O mês escolhido é agosto.");
									} else {
										if (n1 == 9) {
											System.out.println("O mês escolhido é setembro.");
										} else {
											if (n1 == 10) {
												System.out.println("O mês escolhido é outubro.");
											} else {
												if (n1 == 11) {
													System.out.println("O mês escolhido é novembro.");
												} else {
													if (n1 == 12) {
														System.out.println("O mês escolhido é dezembro.");
													} else {
														System.out.println("Comando inválido.");
													}
												}
											}
										}
									}
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