package exerc05_06;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para escolher item do menu.");
		System.out.println("Menu:");
		System.out.println("1 para somar dois valores.");
		System.out.println("2 para subtrair dois valores.");
		System.out.println("3 para multiplicar dois valors.");
		System.out.println("4 para dividir dois valores.");
		System.out.println("5 para sair.");
		int n = ler.nextInt();

		switch (n) {
		case 1:
			System.out.println("Digite o primeiro valor.");
			int n1 = ler.nextInt();
			System.out.println("Digite o segundo valor.");
			int n2 = ler.nextInt();
			System.out.println("O resultado é: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Digite o primeiro valor.");
			int n3 = ler.nextInt();
			System.out.println("Digite o segundo valor.");
			int n4 = ler.nextInt();
			System.out.println("O resultado é: " + (n3 - n4));
			break;
		case 3:
			System.out.println("Digite o primeiro valor.");
			int n6 = ler.nextInt();
			System.out.println("Digite o segundo valor.");
			int n7 = ler.nextInt();
			System.out.println("O resultado é: " + (n6 * n7));
			break;
		case 4:
			System.out.println("Digite o primeiro valor.");
			int n9 = ler.nextInt();
			System.out.println("Digite o segundo valor.");
			int n10 = ler.nextInt();
			System.out.println("O resultado é: " + (n9 / n10));
			break;
		case 5:
			System.out.println("Saindo do programa...");
			break;
		default:
			System.out.println("Comando inválido.");
		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
