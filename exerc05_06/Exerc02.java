package exerc05_06;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um caracter:");
		char n = ler.next().charAt(0);

		switch (n) {
		case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0':
			System.out.println(n + " é um número.");
			break;
		default:
			System.out.println(n + " não é um número.");
		}

		System.out.println("Fim do programa.");
		ler.close();
		}

	}
