package exerc11_12;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira uma frase: ");
		String frase = ler.nextLine();
		frase = frase.trim();

		String vogais = "aeiouAEIOU";
		String consoantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		String numeros = "0123456789" + "";
		String pontuacoes = "/?^~´`)(][!}{=:;.,<>";
		String espaco = " ";

		int quantidadeVogais = 0;
		int quantidadeConsoantes = 0;
		int quantidadeNumeros = 0;
		int quantidadePontuacoes = 0;
		int quantidadePalavras = 1;

		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < vogais.length(); j++) {
				if (frase.charAt(i) == vogais.charAt(j)) {
					quantidadeVogais++;

				}

			}
		}

		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < consoantes.length(); j++) {
				if (frase.charAt(i) == consoantes.charAt(j)) {
					quantidadeConsoantes++;

				}

			}
		}

		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (frase.charAt(i) == numeros.charAt(j)) {
					quantidadeNumeros++;

				}

			}
		}
		
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < pontuacoes.length(); j++) {
				if (frase.charAt(i) == pontuacoes.charAt(j)) {
					quantidadePontuacoes++;

				}

			}
		}

		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < espaco.length(); j++) {
				if (frase.charAt(i) == espaco.charAt(j)) {
					quantidadePalavras++;

				}

			}
		}

		System.out.print("A frase " + frase + " contém " + quantidadeVogais + " vogais, " + quantidadeConsoantes
				+ " consoantes, " + quantidadeNumeros + " números, " + quantidadePontuacoes + " pontuações e "
				+ quantidadePalavras + " palavras.");
		ler.close();

	}

}
