package exerc03_04;

public class Exerc05 {

	public static void main(String[] args) {

		System.out.println("Programa para verificar se duas palavras s�o iguais ou n�o.");

		String primeiraPalavra = "Carlos";
		String segundaPalavra = "Renan";

		System.out.println("A primeira palavra � " + primeiraPalavra);
		System.out.println("A segunda palavra � " + segundaPalavra);

		if (primeiraPalavra.equals(segundaPalavra)) {
			System.out.println("As palavras s�o iguais!");
		} else {
			System.out.println("As palavras n�o s�o iguais.");
		}
		System.out.println("Fim do programa.");
	}

}
