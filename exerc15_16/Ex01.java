package exerc15_16;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Escolha a opção desejada: ");
		System.out.println("1 - subtrair dois valores;");
		System.out.println("2 - subtrair três valores;");
		System.out.println("3 - subtrair quatro valores;");
		System.out.println("4 - subtrair cinco valores;");

		int op = ler.nextInt();

		switch (op) {

		case 1: {
			System.out.println("Digite o primeiro valor: ");
			double v1 = ler.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double v2 = ler.nextDouble();
			subtrair(v1, v2);
			break;
		}
		case 2: {
			System.out.println("Digite o primeiro valor: ");
			double v1 = ler.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double v2 = ler.nextDouble();
			System.out.println("Digite o terceiro valor: ");
			double v3 = ler.nextDouble();
			subtrair(v1, v2, v3);
			break;
		}
		case 3: {
			System.out.println("Digite o primeiro valor: ");
			double v1 = ler.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double v2 = ler.nextDouble();
			System.out.println("Digite o terceiro valor: ");
			double v3 = ler.nextDouble();
			System.out.println("Digite o quarto valor: ");
			double v4 = ler.nextDouble();
			subtrair(v1, v2, v3, v4);
			break;
		}
		case 4: {
			System.out.println("Digite o primeiro valor: ");
			double v1 = ler.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double v2 = ler.nextDouble();
			System.out.println("Digite o terceiro valor: ");
			double v3 = ler.nextDouble();
			System.out.println("Digite o quarto valor: ");
			double v4 = ler.nextDouble();
			System.out.println("Digite o quarto valor: ");
			double v5 = ler.nextDouble();
			subtrair(v1, v2, v3, v4, v5);
			break;
		}
		}
	}

	public static void subtrair(double v1, double v2) {
		System.out.println("Subtração de dois valores: " + (v1 - v2));
	}

	public static void subtrair(double v1, double v2, double v3) {
		System.out.println("Subtração de três valores: " + (v1 - v2 - v3));
	}

	public static void subtrair(double v1, double v2, double v3, double v4) {
		System.out.println("Subtração de quatro valores: " + (v1 - v2 - v3 - v4));
	}

	public static void subtrair(double v1, double v2, double v3, double v4, double v5) {
		System.out.println("Subtração de cinco valores: " + (v1 - v2 - v3 - v4 - v5));
	}
}