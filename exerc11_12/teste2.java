package exerc11_12;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		nomeCompleto = nomeCompleto.trim().replace("  ", " ");

		while (nomeCompleto.indexOf("  ") != -1) {
			nomeCompleto = nomeCompleto.replace("  ", " ");
		}
		System.out.println("Nome sem espa�os vazios: " + nomeCompleto);

		String alfabeto = "abcdefghijklmnopqrstuvwxyz ";
		String nomeFinalizado = "";

		for (int i = 0; i < nomeCompleto.length(); i++) {
			for (int j = 0; j < alfabeto.length(); j++) {
				if (nomeCompleto.charAt(i) == alfabeto.charAt(j)) {

					nomeFinalizado = nomeFinalizado + nomeCompleto.charAt(i);

				}

			}
		}
		System.out.print("Nome sem n�meros ou caracteres especiais: " + nomeFinalizado);

		ler.close();

	}

}
