package aula09_10;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetor[] = new int[50];

		System.out.println("N�meros aleat�rios: ");
		for (int aux = 0, aux2 = 0; aux < vetor.length; aux++) {
			vetor[aux] = (int) (Math.random() * 100);
			System.out.println((aux + 1) + "� valor �: " + vetor[aux]);
			aux2 = aux2 + vetor[aux];
			System.out.println("Soma dos n�meros �: " + aux2);
		}

		System.out.println("N�meros pares: ");
		for (int aux = 0, aux2 = 0; aux < vetor.length; aux++) {
			vetor[aux] = (int) (Math.random() * 100);
			if (vetor[aux] % 2 == 0) {
				aux2 = aux2 + vetor[aux];
				System.out.println((aux + 1) + "� valor �: " + vetor[aux]);
				System.out.println("Soma dos pares: " + aux2);
			}

		}

		System.out.println("N�meros impares: ");
		for (int aux = 0, aux2 = 0; aux < vetor.length; aux++) {
			vetor[aux] = (int) (Math.random() * 100);
			if (vetor[aux] % 2 != 0) {
				aux2 = aux2 + vetor[aux];
				System.out.println((aux + 1) + "� valor �: " + vetor[aux]);
				System.out.println("Soma dos impares: " + aux2);
			}

		}
		ler.close();

	}

}
