package exerc09_10;

import java.util.Scanner;

public class Des00 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira os 12 valores inteiros: ");
		int vetor[] = new int[12];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
			if (i == 11) {
				for (int j : vetor) {
					System.out.println(j);
				}
			}
		}

		ler.close();

	}
}
