package exerc03_04;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Programa para escolher um dos meses do ano.");

		System.out.println("1 - Janeiro.");
		System.out.println("2 - Fevereiro.");
		System.out.println("3 - Mar�o.");
		System.out.println("4 - Abril.");
		System.out.println("5 - Maio.");
		System.out.println("6 - Junho.");
		System.out.println("7 - Julho.");
		System.out.println("8 - Agosto.");
		System.out.println("9 - Setembro.");
		System.out.println("10 - Outubro.");
		System.out.println("11 - Novembro.");
		System.out.println("12 - Dezembro.");
		System.out.println("Digite o n�mero correspondente ao m�s (de 1 a 12):");

		int n1 = ler.nextInt();

		if (n1 == 1) {
			System.out.println("O m�s escolhido � janeiro.");
		} else {
			if (n1 == 2) {
				System.out.println("O m�s escolhido � fevereiro.");
			} else {
				if (n1 == 3) {
					System.out.println("O m�s escolhido � mar�o.");
				} else {
					if (n1 == 4) {
						System.out.println("O m�s escolhido � abril.");
					} else {
						if (n1 == 5) {
							System.out.println("O m�s escolhido � maio.");
						} else {
							if (n1 == 6) {
								System.out.println("O m�s escolhido � junho.");
							} else {
								if (n1 == 7) {
									System.out.println("O m�s escolhido � julho.");
								} else {
									if (n1 == 8) {
										System.out.println("O m�s escolhido � agosto.");
									} else {
										if (n1 == 9) {
											System.out.println("O m�s escolhido � setembro.");
										} else {
											if (n1 == 10) {
												System.out.println("O m�s escolhido � outubro.");
											} else {
												if (n1 == 11) {
													System.out.println("O m�s escolhido � novembro.");
												} else {
													if (n1 == 12) {
														System.out.println("O m�s escolhido � dezembro.");
													} else {
														System.out.println("Comando inv�lido.");
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