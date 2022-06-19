package exerc13_14;

import java.util.Scanner;

public class Des02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma informação: ");
		String informacao = ler.nextLine();
		removerEspacosIniFim(informacao);
	}

	public static void removerEspacosIniFim(String informacao) {
		informacao = informacao.trim();
		verificarLetras(informacao);
		verificarInteiros(informacao);
		verificarReais(informacao);
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

	public static void verificarInteiros(String informacao) {
		String inteiros = "0123456789 ";
		String infoInteiros = "";
		for (int i = 0; i < informacao.length(); i++) {
			for (int j = 0; j < inteiros.length(); j++) {
				if (informacao.charAt(i) == inteiros.charAt(j)) {
					infoInteiros = infoInteiros + informacao.charAt(i);
				}

			}
		}
		System.out.println("Inteiros da informação: " + infoInteiros);
	}

	public static void verificarReais(String informacao) {
		String parametro = ".";
		String infoReais = "";
		for (int i = 0; i < informacao.length(); i++) {
			for (int j = 0; j < parametro.length(); j++) {
				if (informacao.charAt(i) == parametro.charAt(j)) {
					String k = informacao.charAt(i - 1) + "";
					String l = informacao.charAt(i) + "";
					String m = informacao.charAt(i + 1) + "";
					infoReais = k + l + m;
				}

			}
		}
		System.out.println("Reais da informação: " + infoReais);
	}

}
