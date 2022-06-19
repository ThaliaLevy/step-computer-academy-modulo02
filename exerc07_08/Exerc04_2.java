package exerc07_08;

import java.util.Scanner;

public class Exerc04_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		for (int inicial = 0, limite = 25; inicial <= limite; inicial++) {
			System.out.println(inicial);
		}

		for (int inicial = 25, limite = 0; inicial >= limite; inicial--) {
			System.out.println(inicial);
		}
		ler.close();

	}

}
