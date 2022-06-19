package exerc13_14;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma informação: ");
		String informacao = ler.nextLine();
		removerEspacosIniFim(informacao);
	}

	public static void removerEspacosIniFim(String informacao) {
		informacao = informacao.trim();
		verificarLetras(informacao);
		verificarNumeros(informacao);
	}

	public static void verificarLetras(String informacao) {
		String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String infoLetras = "";
		for (int i = 0; i < informacao.length(); i++) {
			for (int j = 0; j < letras.length(); j++) {
				if (informacao.charAt(i) == letras.charAt(j)) {
					infoLetras = infoLetras + informacao.charAt(i);
				}

			}
		}
		System.out.println("Palavras da informação: " + infoLetras);
	}

	public static void verificarNumeros(String informacao) {
		String numeros = "0123456789 ";
		String infoNumeros = "";
		for (int i = 0; i < informacao.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (informacao.charAt(i) == numeros.charAt(j)) {
					infoNumeros = infoNumeros + informacao.charAt(i);
				}

			}
		}
		System.out.println("Números da informação: " + infoNumeros);
	}

}
