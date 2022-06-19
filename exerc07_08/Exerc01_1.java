package exerc07_08;

import java.util.Scanner;

public class Exerc01_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a velocidade do veículo: ");
		int vel = ler.nextInt();
		int multa1 = (10 * 80 / 100) + 80;
		int multa2 = (20 * 80 / 100) + 80;
		int multa3 = (40 * 80 / 100) + 80;
		
		while (vel > 0) {
			if (vel <= 80) {
				System.out.println("Sua velocidade é de " + vel
						+ "km/h e está dentro do limite permitido, portanto, não há multa.");
				break;
			}
			if (80 < vel && vel <= multa1) {
				System.out.println("Sua velocidade é de " + vel + "km/h, portanto sua multa é de 50,00 reais.");
				break;
			}
			if (multa1 < vel && vel <= multa2) {
				System.out.println("Sua velocidade é de " + vel
						+ "km/h, portanto sua multa é de 130,00 reais e 3 pontos na carteira.");
				break;
			}
			if (multa2 < vel && vel <= multa3) {
				System.out.println("Sua velocidade é de " + vel
						+ "km/h, portanto sua multa é de 450,00 reais e 6 pontos na carteira.");
				break;
			}
			if (multa3 < vel) {
				System.out.println("Sua velocidade é de " + vel
						+ "km/h, portanto sua multa é de 1500,00 reais e 15 pontos na carteira.");
				break;
			}
		}

		ler.close();
	}

}
