package exerc11_12;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Insira seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		nomeCompleto = nomeCompleto.trim();

		while (nomeCompleto.indexOf("  ") != -1) {
			nomeCompleto = nomeCompleto.replace("  ", " ");
		}
		System.out.println("Nome sem espaços vazios: " + nomeCompleto);

		String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String nomeFinalizado = "";

		for (int i = 0; i < nomeCompleto.length(); i++) {
			for (int j = 0; j < alfabeto.length(); j++) {
				if (nomeCompleto.charAt(i) == alfabeto.charAt(j)) {

					nomeFinalizado = nomeFinalizado + nomeCompleto.charAt(i);

				}

			}
		}
		System.out.print("Nome sem números ou caracteres especiais: " + nomeFinalizado);

		ler.close();

	}

}
