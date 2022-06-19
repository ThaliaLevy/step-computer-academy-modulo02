package exerc05_06;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um caracter:");
		char n = ler.next().charAt(0);

		switch (n) {
		case 'b': case 'B': case 'c': case 'C': case 'd': case 'D': case 'f': case 'F': case 'g': case 'G':
		case 'h': case 'H': case 'j': case 'J': case 'k': case 'K': case 'l': case 'L': case 'm':
		case 'M': case 'n': case 'N': case 'p': case 'P': case 'q': case 'Q': case 'r': case 'R': case 's': case 'S':
		case 't': case 'T': case 'v': case 'V': case 'W': case 'w': case 'X': case 'x': case 'Y':
		case 'y': case 'Z': case 'z':
			System.out.println(n + " é uma consoante.");
			break;
		default:
			System.out.println(n + " não é uma consoante.");
		}

		System.out.println("Fim do programa.");
		ler.close();

	}

}
