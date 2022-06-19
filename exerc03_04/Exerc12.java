package exerc03_04;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		System.out.println("Programa para saber a nota de um aluno e se ele foi aprovado ou não.");

		Scanner ler = new Scanner(System.in);
		Double mp;
		int p1 = 1;
		int p2 = 2;
		int p3 = 3;
		int p4 = 4;
		System.out.println("Digite a primeira nota:");
		Double n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota:");
		Double n2 = ler.nextDouble();
		System.out.println("Digite a terceira nota:");
		Double n3 = ler.nextDouble();
		System.out.println("Digite a quarta nota:");
		Double n4 = ler.nextDouble();

		mp = (n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4) / (p1 + p2 + p3 + p4);
		System.out.println("A nota final do aluno é " + mp);

		if (mp >= 5) {
			System.out.println("O aluno está aprovado!");
		} else {
			System.out.println("O aluno está reprovado.");
		}
		System.out.println("Fim do programa.");
		ler.close();
	}

}
