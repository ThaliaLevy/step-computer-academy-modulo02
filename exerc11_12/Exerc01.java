package exerc11_12;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		nomeCompleto = nomeCompleto.trim();
		System.out.println("Seu nome completo é: " + nomeCompleto);

		int primeiroIndice = nomeCompleto.indexOf(" ");
		int ultimoIndice = nomeCompleto.lastIndexOf(" ");

		String primeiroNome = nomeCompleto.substring(0, primeiroIndice);
		String nomeDoMeio = nomeCompleto.substring(primeiroIndice + 1, ultimoIndice);
		String ultimoNome = nomeCompleto.substring(ultimoIndice + 1);

		System.out.println("Nome: " + primeiroNome);
		System.out.println("Nome do meio: " + nomeDoMeio);
		System.out.println("Sobrenome: " + ultimoNome);

		ler.close();
	}

}
