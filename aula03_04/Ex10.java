package aula03_04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o n�mero para saber se � nulo, positivo ou negativo:");
		int n = ler.nextInt();

		if (n == 0) {
			System.out.println("N�mero nulo.");
		} else {
			if (n > 0) {
				System.out.println("N�mero positivo.");
			} else {
				System.out.println("N�mero negativo.");
			}

		}

		System.out.println("Fim do programa.");
		ler.close();

	}

}
