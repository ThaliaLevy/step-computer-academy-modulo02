package exerc03_04;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar se o caracter é um número.");

		System.out.println("Digite o caracter:");
		char caracter = ler.next().charAt(0);

		if (caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5'
				|| caracter == '6' || caracter == '7' || caracter == '8' || caracter == '9' || caracter == '0') {
			System.out.println("Caracter é um número.");
		} else {
			System.out.println("Caracter não é um número.");
		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
