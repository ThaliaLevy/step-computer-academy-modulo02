package exerc07_08;

import java.util.Scanner;

public class Exerc07_2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número:");
		int limite = ler.nextInt();

		for (int inicial = 0; inicial <= limite; inicial++) {

			if (inicial % 2 == 0) {
				System.out.println(inicial);
			}

		}
		ler.close();

	}

}
