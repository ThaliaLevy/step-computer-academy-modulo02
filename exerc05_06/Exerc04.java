package exerc05_06;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int n1 = ler.nextInt();
		System.out.println("Digite o segundo valor: ");
		int n2 = ler.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int n3 = ler.nextInt();
		System.out.println("Digite o quarto valor: ");
		int n4 = ler.nextInt();

		if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
			System.out.println(n1 + " é o maior valor.");
		} else {
			if (n2 >= n3 && n2 >= n4) {
				System.out.println(n2 + " é o maior valor.");
			} else {
				if (n3 >= n4) {
					System.out.println(n3 + " é o maior valor.");
				} else {
					System.out.println(n4 + " é o maior valor.");
				}
			}
		}

		System.out.println("Fim do programa.");
		ler.close();

	}

}
