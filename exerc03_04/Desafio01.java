package exerc03_04;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Menu.");
		System.out.println("Escolha uma das opções abaixo:");

		System.out.println("1 – para calcular a área de um quadrado.");
		System.out.println("2 – para calcular a área de um retângulo.");
		System.out.println("3 -  para calcular a área de um triangulo retângulo.");
		System.out.println("4 – para calcular a área de um círculo.");
		System.out.println("5 -  para calcular a área de um trapézio.");
		System.out.println("6 – para calcular o perímetro de um quadrado.");
		System.out.println("7 – para calcular o perímetro de um retângulo.");
		System.out.println("8 – para calcular o perímetro de um círculo.");

		System.out.println("Digite o número correspondente ao cálculo desejado (de 1 a 8):");
		int n1 = ler.nextInt();

		if (n1 == 1) {
			System.out.println("Insira o valor do lado: ");
			int lado = ler.nextInt();

			System.out.println("Área do quadrado: " + lado * lado);
		} else {
			if (n1 == 2) {
				System.out.println("Insira o valor da base: ");
				int base = ler.nextInt();
				System.out.println("Insira o valor da altura: ");
				int altura = ler.nextInt();

				System.out.println("Área do retângulo: " + base * altura);
			} else {
				if (n1 == 3) {
					System.out.println("Insira o valor da base: ");
					int base = ler.nextInt();
					System.out.println("Insira o valor da altura: ");
					int altura = ler.nextInt();

					System.out.println("Área do triângulo retângulo: " + (base * altura) / 2);
				} else {
					if (n1 == 4) {
						System.out.println("pi = 3,14.");
						double pi = 3.14;
						System.out.println("Insira o valor do raio: ");
						int raio = ler.nextInt();

						System.out.println("Área do círculo: " + pi * raio * raio);
					} else {
						if (n1 == 5) {
							System.out.println("Insira o valor da base maior:");
							int baseMaior = ler.nextInt();
							System.out.println("Insira o valor da base menor: ");
							int baseMenor = ler.nextInt();
							System.out.println("Insira o valor da altura: ");
							int altura = ler.nextInt();

							System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
						} else {
							if (n1 == 6) {
								System.out.println("Insira o valor do lado:");
								int lado = ler.nextInt();

								System.out.println("O perímetro do quadrado é: " + 4 * lado);
							} else {
								if (n1 == 7) {
									System.out.println("Insira o valor da base: ");
									int base = ler.nextInt();
									System.out.println("Insira o valor da altura: ");
									int altura = ler.nextInt();

									System.out.println("O perímetro do retângulo é: " + ((2 * base) + (2 * altura)));
								} else {
									if (n1 == 8) {
										System.out.println("Insira o valor do raio: ");
										int raio = ler.nextInt();
										System.out.println("Valor de pi = 3,14.");
										double pi = 3.14;

										System.out.println("O perímetro do círculo é: " + 2 * pi * raio);
									} else {
										System.out.println("Comando inválido.");
									}
									System.out.println("Fim do programa.");
									ler.close();
								}
							}
						}
					}
				}
			}
		}
	}
}