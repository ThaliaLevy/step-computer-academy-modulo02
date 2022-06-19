package exerc07_08;

import java.util.Scanner;

public class Exerc09_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int limite = ler.nextInt();
		int inicial = 0;

		while (inicial <= limite) {
			if (inicial % 3 == 0) {

				System.out.println(inicial);
			}
			inicial++;
		}

		ler.close();

	}

}
