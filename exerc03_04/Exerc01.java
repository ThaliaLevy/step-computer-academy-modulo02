package exerc03_04;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar se duas palavras s�o iguais ou n�o.");

		System.out.print("Digite a primeira palavra:");
		String primeiraPalavra = ler.nextLine();

		System.out.print("Digite a segunda palavra:");
		String segundaPalavra = ler.nextLine();

		if (primeiraPalavra.equals(segundaPalavra)) {
			System.out.println("As palavras s�o iguais!");
		} else {
			System.out.println("As palavras n�o s�o iguais.");
		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
