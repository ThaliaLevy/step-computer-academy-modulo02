package exerc05_06;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para escolher um dia da semana.");
		System.out.println("Digite um número:");
		int n = ler.nextInt();

		switch (n) {
		case 1:
			System.out.println(n + " - você escolheu segunda-feira.");
			break;
		case 2:
			System.out.println(n + " - você escolheu terça-feira.");
			break;
		case 3:
			System.out.println(n + " - você escolheu quarta-feira.");
			break;
		case 4:
			System.out.println(n + " - você escolheu quinta-feira.");
			break;
		case 5:
			System.out.println(n + " - você escolheu sexta-feira.");
			break;
		case 6:
			System.out.println(n + " - você escolheu sábado.");
			break;
		case 7:
			System.out.println(n + " - você escolheu domingo.");
			break;
		default:
			System.out.println("Comando inválido.");
		}

		System.out.println("Fim do programa.");
		ler.close();
	}

}
