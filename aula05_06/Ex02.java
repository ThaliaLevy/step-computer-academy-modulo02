package aula05_06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar qual n�mero � maior:");

		System.out.println("Digite o primeiro n�mero:");
		int n1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int n2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		int n3 = ler.nextInt();
		System.out.println("Digite o quarto n�mero:");
		int n4 = ler.nextInt();
		System.out.println("Digite o quinto n�mero:");
		int n5 = ler.nextInt();
		System.out.println("Digite o sexto n�mero:");
		int n6 = ler.nextInt();

		if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5 && n1 >= n6) {
			System.out.println(n1 + " � o maior valor.");
		} else {
			if (n2 >= n3 && n2 >= n4 && n3 >= n5 && n2 >= n6) {
				System.out.println(n2 + " � o maior valor.");
			} else {
				if (n3 >= n4 && n3 >= n5 && n3 >= n6) {
					System.out.println(n3 + " � o maior valor.");
				} else {
					if (n4 >= n5 && n4 >= n6) {
						System.out.println(n4 + " � o maior valor.");
					} else {
						if (n5 >= n6) {
							System.out.println(n5 + " � o maior valor.");
						} else {
							System.out.println(n6 + " � o maior valor.");
						}
					}
				}
				System.out.println("Fim do programa.");
				ler.close();

			}
		}
	}
}
