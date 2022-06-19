package exerc07_08;

import java.util.Scanner;

public class Exerc04_1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int inicial = -1;
		int limite = 25;

		while (inicial < limite) {
			inicial++;
			System.out.println(inicial);
		}

		int limite2 = 0;
		int inicial2 = 26;

		while (inicial2 > limite2) {
			inicial2--;
			System.out.println(inicial2);
		}

		ler.close();
	}
}
