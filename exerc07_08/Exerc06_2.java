package exerc07_08;

import java.util.Scanner;

public class Exerc06_2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		for (int inicial = 0, limite = 1000; inicial <= limite; inicial++) {

			if (inicial % 2 == 0) {
				System.out.println(inicial);
			}

		}
		ler.close();

	}

}
