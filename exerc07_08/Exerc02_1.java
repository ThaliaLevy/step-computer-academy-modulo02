package exerc07_08;

import java.util.Scanner;

public class Exerc02_1 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int inicial = 0;
		int limite = 30;
		while (inicial < limite) {
			inicial++;
			System.out.println(inicial);
		}

		ler.close();

	}
}
