package aula03_04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

			
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um n�mero maior ou igual a 100:");
			int n1 = ler.nextInt();
			
			if(n1 >= 100) {
				System.out.println("N�mero v�lido!");
			}
			System.out.println("Fim do programa.");
			ler.close();
		}


}
