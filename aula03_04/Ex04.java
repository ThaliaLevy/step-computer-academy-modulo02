package aula03_04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int num1, num2;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		num1 = ler.nextInt();

		System.out.println("Digite o segundo n�mero:");
		num2 = ler.nextInt();

		System.out.println("A soma � = " + (num1 + num2));
		System.out.println("A subtra��o � = " + (num1 - num2));
		System.out.println("A multiplica��o � = " + (num1 * num2));
		System.out.println("A divis�o � = " + (num1 / num2));

		ler.close();
	}

}
