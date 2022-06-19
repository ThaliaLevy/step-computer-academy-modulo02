package exerc13_14;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira uma frase: ");
		String frase = ler.nextLine();

		removerEspacosIniFim(frase);

	}

	public static void removerEspacosIniFim(String frase) {
		frase = frase.trim();
		contarVogais(frase);
		contarConsoantes(frase);
		contarNumeros(frase);
		contarPontuacoes(frase);
		contarPalavras(frase);
	}

	public static void contarVogais(String frase) {
		String vogais = "aeiouAEIOU";
		int quantidadeVogais = 0;
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < vogais.length(); j++) {
				if (frase.charAt(i) == vogais.charAt(j)) {
					quantidadeVogais++;

				}
			}
		}
		System.out.print("A frase contém " + quantidadeVogais + " vogais, ");
	}

	public static void contarConsoantes(String frase) {
		int quantidadeConsoantes = 0;
		String consoantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < consoantes.length(); j++) {
				if (frase.charAt(i) == consoantes.charAt(j)) {
					quantidadeConsoantes++;

				}

			}
		}
		System.out.print(quantidadeConsoantes + " consoantes, ");
	}

	public static void contarNumeros(String frase) {
		int quantidadeNumeros = 0;
		String numeros = "0123456789" + "";
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (frase.charAt(i) == numeros.charAt(j)) {
					quantidadeNumeros++;

				}

			}
		}
		System.out.print(quantidadeNumeros + " numeros, ");
	}

	public static void contarPontuacoes(String frase) {
		int quantidadePontuacoes = 0;
		String pontuacoes = "/?^~´`)(][!}{=:;.,<>";
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < pontuacoes.length(); j++) {
				if (frase.charAt(i) == pontuacoes.charAt(j)) {
					quantidadePontuacoes++;

				}

			}
		}
		System.out.print(quantidadePontuacoes + " pontuacoes e ");
	}

	public static void contarPalavras(String frase) {
		int quantidadePalavras = 1;
		String espaco = " ";
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < espaco.length(); j++) {
				if (frase.charAt(i) == espaco.charAt(j)) {
					quantidadePalavras++;

				}

			}
		}
		System.out.print(quantidadePalavras + " palavras.");
	}
}
