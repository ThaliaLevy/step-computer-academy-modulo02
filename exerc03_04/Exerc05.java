package exerc03_04;

public class Exerc05 {

	public static void main(String[] args) {

		System.out.println("Programa para verificar se duas palavras são iguais ou não.");

		String primeiraPalavra = "Carlos";
		String segundaPalavra = "Renan";

		System.out.println("A primeira palavra é " + primeiraPalavra);
		System.out.println("A segunda palavra é " + segundaPalavra);

		if (primeiraPalavra.equals(segundaPalavra)) {
			System.out.println("As palavras são iguais!");
		} else {
			System.out.println("As palavras não são iguais.");
		}
		System.out.println("Fim do programa.");
	}

}
