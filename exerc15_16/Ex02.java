package exerc15_16;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Calculadora c1 = new Calculadora();

		System.out.println("Escolha a opção desejada: ");
		System.out.println("1 - para somar;");
		System.out.println("2 - para subtrair;");
		System.out.println("3 - para multiplicar;");
		System.out.println("4 - para dividir;");

		int op = ler.nextInt();

		switch (op) {

		case 1: {
			System.out.println("Escolha a quantidade de argumentos (2 ou 3): ");
			int i = ler.nextInt();
			switch (i) {
			case 2: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Resultado: " + c1.somar(c1.n1, c1.n2));
				break;
			}
			case 3: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Digite o terceiro valor: ");
				c1.n3 = ler.nextInt();
				System.out.println("Resultado: " + c1.somar(c1.n1, c1.n2, c1.n3));
				break;
			}

			}
			break;
		}
		case 2: {
			System.out.println("Escolha a quantidade de argumentos (2 ou 3): ");
			int i = ler.nextInt();
			switch (i) {
			case 2: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Resultado: " + c1.subtrair(c1.n1, c1.n2));
				break;
			}
			case 3: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Digite o terceiro valor: ");
				c1.n3 = ler.nextInt();
				System.out.println("Resultado: " + c1.subtrair(c1.n1, c1.n2, c1.n3));
				break;
			}
			}
			break;
		}
		case 3: {
			System.out.println("Escolha a quantidade de argumentos (2 ou 3): ");
			int i = ler.nextInt();
			switch (i) {
			case 2: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Resultado: " + c1.multiplicar(c1.n1, c1.n2));
				break;
			}
			case 3: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Digite o terceiro valor: ");
				c1.n3 = ler.nextInt();
				System.out.println("Resultado: " + c1.multiplicar(c1.n1, c1.n2, c1.n3));
				break;
			}
			}
			break;
		}
		case 4: {
			System.out.println("Escolha a quantidade de argumentos (2 ou 3): ");
			int i = ler.nextInt();
			switch (i) {
			case 2: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Resultado: " + c1.dividir(c1.n1, c1.n2));
				break;
			}
			case 3: {
				System.out.println("Digite o primeiro valor: ");
				c1.n1 = ler.nextInt();
				System.out.println("Digite o segundo valor: ");
				c1.n2 = ler.nextInt();
				System.out.println("Digite o terceiro valor: ");
				c1.n3 = ler.nextInt();
				System.out.println("Resultado: " + c1.dividir(c1.n1, c1.n2, c1.n3));
				break;
			}
			}
			break;
		}
		}
	}
}
