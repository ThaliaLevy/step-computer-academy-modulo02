package exerc03_04;

public class Exerc03 {

	public static void main(String[] args) {

		System.out.println("Programa para verificar qual n�mero, dentre 2, � menor:");

		Double n1 = 1.5;
		Double n2 = 4.7;

		System.out.println("O primeiro n�mero � 1,5.");
		System.out.println("O segundo n�mero � 4,7.");

		if (n1 < n2) {
			System.out.println(n1 + " � menor que " + n2);
		} else {
			System.out.println(n2 + " � menor que " + n1);
		}

		System.out.print("Fim do programa.");
	}
}
