package exerc07_08;

import java.util.Scanner;

public class Exerc03_1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int inicial = 51;
		int limite = 12;

		while (inicial > limite) {
			inicial--;
			System.out.println(inicial);
		}

		ler.close();
	}
}
