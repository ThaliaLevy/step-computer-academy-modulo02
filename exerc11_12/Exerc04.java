package exerc11_12;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = ler.nextLine();
		nome = nome.trim();

		System.out.println("Digite seu email: ");
		String email = ler.nextLine();
		email = email.trim();

		String caracteresInvalidos = "Á~„ı-/|#$%®&*()+=";

		for (int i = 0; i < email.length(); i++) {
			for (int j = 0; j < caracteresInvalidos.length(); j++) {
				if (email.charAt(i) == caracteresInvalidos.charAt(j)) {
					String s = email.charAt(i) + "";
					email = email.replace(s, "");
				}

			}
		}
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);

		ler.close();

	}

}
