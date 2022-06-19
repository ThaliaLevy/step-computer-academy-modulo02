package exerc03_04;

public class Exerc03 {

	public static void main(String[] args) {

		System.out.println("Programa para verificar qual número, dentre 2, é menor:");

		Double n1 = 1.5;
		Double n2 = 4.7;

		System.out.println("O primeiro número é 1,5.");
		System.out.println("O segundo número é 4,7.");

		if (n1 < n2) {
			System.out.println(n1 + " é menor que " + n2);
		} else {
			System.out.println(n2 + " é menor que " + n1);
		}

		System.out.print("Fim do programa.");
	}
}
