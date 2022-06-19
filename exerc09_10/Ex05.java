package exerc09_10;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira os 12 valores inteiros: ");
		int vetor[] = new int[12];
		int j = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
			j = vetor[i] + j;
		}

		System.out.println("A soma dos números é: " + j);

		ler.close();

	}

}
