package exerc09_10;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira os 12 valores inteiros: ");
		int vetor[] = new int[12];
		int j = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
			if (i == 0) {
				j = vetor[0];
			} else {
				if (vetor[i] < j) {
					j = vetor[i];
				}
			}
		}

		System.out.println("O menor número digitado é o: " + j);

		ler.close();
	}
}
