package exerc03_04;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Programa para verificar se dois caracteres são iguais ou diferentes.");

		System.out.println("Digite o primeiro caracter:");
		char c1 = ler.next().charAt(0);

		System.out.println("Digite o segundo caracter:");
		char c2 = ler.next().charAt(0);

		if (c1 == c2) {
			System.out.println("Os dois caracteres são iguais.");
		} else {
			System.out.println("Os dois caracteres são diferentes.");

		}
		System.out.println("Fim do programa.");
		ler.close();
	}
}
