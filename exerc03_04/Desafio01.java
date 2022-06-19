package exerc03_04;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Menu.");
		System.out.println("Escolha uma das op��es abaixo:");

		System.out.println("1 � para calcular a �rea de um quadrado.");
		System.out.println("2 � para calcular a �rea de um ret�ngulo.");
		System.out.println("3 -  para calcular a �rea de um triangulo ret�ngulo.");
		System.out.println("4 � para calcular a �rea de um c�rculo.");
		System.out.println("5 -  para calcular a �rea de um trap�zio.");
		System.out.println("6 � para calcular o per�metro de um quadrado.");
		System.out.println("7 � para calcular o per�metro de um ret�ngulo.");
		System.out.println("8 � para calcular o per�metro de um c�rculo.");

		System.out.println("Digite o n�mero correspondente ao c�lculo desejado (de 1 a 8):");
		int n1 = ler.nextInt();

		if (n1 == 1) {
			System.out.println("Insira o valor do lado: ");
			int lado = ler.nextInt();

			System.out.println("�rea do quadrado: " + lado * lado);
		} else {
			if (n1 == 2) {
				System.out.println("Insira o valor da base: ");
				int base = ler.nextInt();
				System.out.println("Insira o valor da altura: ");
				int altura = ler.nextInt();

				System.out.println("�rea do ret�ngulo: " + base * altura);
			} else {
				if (n1 == 3) {
					System.out.println("Insira o valor da base: ");
					int base = ler.nextInt();
					System.out.println("Insira o valor da altura: ");
					int altura = ler.nextInt();

					System.out.println("�rea do tri�ngulo ret�ngulo: " + (base * altura) / 2);
				} else {
					if (n1 == 4) {
						System.out.println("pi = 3,14.");
						double pi = 3.14;
						System.out.println("Insira o valor do raio: ");
						int raio = ler.nextInt();

						System.out.println("�rea do c�rculo: " + pi * raio * raio);
					} else {
						if (n1 == 5) {
							System.out.println("Insira o valor da base maior:");
							int baseMaior = ler.nextInt();
							System.out.println("Insira o valor da base menor: ");
							int baseMenor = ler.nextInt();
							System.out.println("Insira o valor da altura: ");
							int altura = ler.nextInt();

							System.out.println("�rea do trap�zio: " + ((baseMaior + baseMenor) * altura) / 2);
						} else {
							if (n1 == 6) {
								System.out.println("Insira o valor do lado:");
								int lado = ler.nextInt();

								System.out.println("O per�metro do quadrado �: " + 4 * lado);
							} else {
								if (n1 == 7) {
									System.out.println("Insira o valor da base: ");
									int base = ler.nextInt();
									System.out.println("Insira o valor da altura: ");
									int altura = ler.nextInt();

									System.out.println("O per�metro do ret�ngulo �: " + ((2 * base) + (2 * altura)));
								} else {
									if (n1 == 8) {
										System.out.println("Insira o valor do raio: ");
										int raio = ler.nextInt();
										System.out.println("Valor de pi = 3,14.");
										double pi = 3.14;

										System.out.println("O per�metro do c�rculo �: " + 2 * pi * raio);
									} else {
										System.out.println("Comando inv�lido.");
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