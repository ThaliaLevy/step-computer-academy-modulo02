package exerc13_14;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um nome completo: ");
		String nomeCompleto = ler.nextLine();
		removerEspacosIniFim(nomeCompleto);
	}

	public static void removerEspacosIniFim(String nomeCompleto) {
		nomeCompleto = nomeCompleto.trim();
		inicialMaiuscula(nomeCompleto);
	}

	public static void inicialMaiuscula(String nomeCompleto) {

	}
}
