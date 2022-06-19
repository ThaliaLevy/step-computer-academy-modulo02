package exerc03_04;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar se duas palavras são iguais ou não.");

		System.out.print("Digite a primeira palavra:");
		String primeiraPalavra = ler.nextLine();

		System.out.print("Digite a segunda palavra:");
		String segundaPalavra = ler.nextLine();

		if (primeiraPalavra.equals(segundaPalavra)) {
			System.out.println("As palavras são iguais!");
		} else {
			System.out.println("As palavras não são iguais.");
		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
