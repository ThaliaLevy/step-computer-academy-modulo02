package exerc11_12;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma informação: ");
		String informacao = ler.nextLine();
		informacao = informacao.trim();

		String numeros = "0123456789 ";
		String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String infoNumeros = "";
		String infoLetras = "";

		for (int i = 0; i < informacao.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (informacao.charAt(i) == numeros.charAt(j)) {
					infoNumeros = infoNumeros + informacao.charAt(i);
				}

			}
		}

		for (int i = 0; i < informacao.length(); i++) {
			for (int j = 0; j < letras.length(); j++) {
				if (informacao.charAt(i) == letras.charAt(j)) {
					infoLetras = infoLetras + informacao.charAt(i);
				}

			}
		}
		System.out.println("Informações numéricas: " + infoNumeros);
		System.out.println("Informações com letras: " + infoLetras);

		ler.close();

	}

}
