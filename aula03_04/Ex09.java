package aula03_04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int maior;
		int menor;

		System.out.println("Programa para verificar qual n�mero, dentre 3, � maior:");

		System.out.println("Digite o primeiro n�mero:");
		int n1 = ler.nextInt();
		maior = n1;
		menor = n1;

		System.out.println("Digite o segundo n�mero:");
		int n2 = ler.nextInt();
		if (n2 > maior) {
			maior = n2;
		}
		if (n2 < menor) {
			menor = n2;
		}

		System.out.println("Digite o terceiro n�mero:");
		int n3 = ler.nextInt();
		if (n3 > maior) {
			maior = n3;
		}
		if (n3 < menor) {
			menor = n3;
		}
		
		System.out.println("Digite o quarto n�mero:");
		int n4 = ler.nextInt();
		if (n4 > maior) {
			maior = n4;
		}
		if (n4 < menor) {
			menor = n4;
		}
		
		System.out.println("Digite o quinto n�mero:");
		int n5 = ler.nextInt();
		if (n5 > maior) {
			maior = n5;
		}
		if (n5 < menor) {
			menor = n5;
		}
		
		System.out.println("O maior n�mero � " + maior);
		System.out.println("O menor n�mero � " + menor);
		ler.close();
	}
}
