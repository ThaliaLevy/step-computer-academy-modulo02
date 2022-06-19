package exerc11_12;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		nomeCompleto = nomeCompleto.trim();

		for (int i = 0; i < nomeCompleto.length(); i++) {
			String j = "abcdefghijklmnopqrstuvwxyz";
			
			for (int k = 0; k < j.length(); k++) {
				if (nomeCompleto.indexOf(i) != -1) {
					System.out.println(j.charAt(k) + " é uma letra.");
				}
			}

		}

		ler.close();

	}

}
