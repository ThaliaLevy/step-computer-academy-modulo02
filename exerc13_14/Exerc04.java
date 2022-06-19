package exerc13_14;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = ler.nextLine();

		System.out.println("Digite seu email: ");
		String email = ler.nextLine();
		removerEspacosIniFim(nome, email);
	}

	public static void removerEspacosIniFim(String nome, String email) {
		nome = nome.trim();
		email = email.trim();
		System.out.println("Nome: " + nome);
		formatarEmail(email);
	}

	public static void formatarEmail(String email) {
		String caracteresInvalidos = "Á~„ı-/|#$%®&*()+=";

		for (int i = 0; i < email.length(); i++) {
			for (int j = 0; j < caracteresInvalidos.length(); j++) {
				if (email.charAt(i) == caracteresInvalidos.charAt(j)) {
					String s = email.charAt(i) + "";
					email = email.replace(s, "");
				}
			}
		}

		System.out.println("Email: " + email);

	}
}
