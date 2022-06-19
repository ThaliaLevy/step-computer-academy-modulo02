package exerc13_14;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = ler.nextLine();

		removerEspacosIniFim(nomeCompleto);
	}

	public static void removerEspacosIniFim(String nomeCompleto) {
		nomeCompleto = nomeCompleto.trim();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		imprimirPrimeiroNome(nomeCompleto);
		imprimirUltimoNome(nomeCompleto);
		imprimirSegundoNome(nomeCompleto);
	}

	public static void imprimirPrimeiroNome(String nomeCompleto) {
		int primeiroIndice = nomeCompleto.indexOf(" ");
		String primeiroNome = nomeCompleto.substring(0, primeiroIndice);
		System.out.println("Nome: " + primeiroNome);
	}

	public static void imprimirSegundoNome(String nomeCompleto) {
		int ultimoIndice = nomeCompleto.lastIndexOf(" ");
		String ultimoNome = nomeCompleto.substring(ultimoIndice + 1);
		System.out.println("Sobrenome: " + ultimoNome);
	}

	public static void imprimirUltimoNome(String nomeCompleto) {
		int ultimoIndice = nomeCompleto.lastIndexOf(" ");
		int primeiroIndice = nomeCompleto.indexOf(" ");
		String nomeDoMeio = nomeCompleto.substring(primeiroIndice + 1, ultimoIndice);
		System.out.println("Sobrenome: " + nomeDoMeio);
	}

}
