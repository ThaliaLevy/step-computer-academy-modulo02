package exerc07_08;

import java.util.Scanner;

public class Exerc08_1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int inicial = 0;
		int limite = 20000;

		while (inicial < limite) {
			if (inicial % 2 != 0) {

				System.out.println(inicial);
			}
			inicial++;
		}

		ler.close();

	}

}
