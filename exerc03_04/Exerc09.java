package exerc03_04;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar se o caracter � uma consoante.");

		System.out.println("Digite o caracter:");
		char caracter = ler.next().charAt(0);

		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
			System.out.println("Caracter n�o � uma consoante.");
		} else {
			System.out.println("Caracter � uma consoante!");
		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
