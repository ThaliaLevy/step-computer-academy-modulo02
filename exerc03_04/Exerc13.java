package exerc03_04;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {

		System.out.println("Programa para fazer os c�lculos de contracheque.");

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o valor do sal�rio bruto:");
		Double salarioBruto = ler.nextDouble();

		Double inss = (12.0 / 100.0) * salarioBruto;
		Double fgts = (8.0 / 100.0) * salarioBruto;
		Double sindicato = (1.0 / 100.0) * salarioBruto;

		System.out.println("Paga pens�o? (sim/n�o)");
		String p = ler.next();
		Double pensao;
		if (p.equals("sim")) {
			pensao = (20.0 / 100.0) * salarioBruto;
		} else {
			pensao = 0.0;
		}

		Double descontos = inss + fgts + sindicato + pensao;
		Double salarioLiquido = salarioBruto - descontos;
		System.out.println("O sal�rio bruto foi de: " + salarioBruto);
		System.out.println("Os descontos foram de: " + inss + "(INSS) + " + fgts + "(FGTS) + " + sindicato
				+ "(Sindicato) + " + pensao + "(Pens�o)");
		System.out.println("Portanto, o sal�rio l�quido � de: " + salarioLiquido);

		ler.close();
	}

}