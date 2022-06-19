package exerc23_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Poupanca extends Conta {

	private double rendimento;

	Poupanca() {

	}

	Poupanca(String agencia, String nrConta, double saldo, String titular, double rendimento) {
		this.setAgencia(agencia);
		this.setNrConta(nrConta);
		this.setSaldo(saldo);
		this.setTitular(titular);
		this.setRendimento(rendimento);
	}
	
	public void cadastrar(Scanner ler) {
		System.out.print("Digite o nome do titular da Conta Poupan�a: ");
		setTitular(ler.nextLine());
		System.out.print("Digite o n�mero da ag�ncia da Conta Poupan�a: ");
		setAgencia(ler.nextLine());
		System.out.print("Digite o n�mero da Conta Poupan�a: ");
		setNrConta(ler.nextLine());
		System.out.print("Digite o saldo da Conta Poupan�a: ");
		setSaldo(Double.parseDouble(ler.nextLine()));
		System.out.print("Digite o valor do limite da Conta Poupan�a: ");
		setRendimento(Double.parseDouble(ler.nextLine()));
	}
	
	public void salvarPoupanca(String caminhoPoupanca) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoPoupanca, true));
			bw.write("\n" + getTitular() + "#" + getAgencia() + "#" + getNrConta() + "#" + getSaldo() + "#"
					+ getRendimento());
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String[] localizarPoupanca(String caminhoPoupanca, Scanner ler) throws IOException {
		try {
			System.out.println("Digite o nome do titular da Conta a ser localizada: ");
			String nomeLoc = ler.nextLine();
			@SuppressWarnings("resource")
			BufferedReader ler2 = new BufferedReader(new FileReader(caminhoPoupanca));

			String[] vetor;

			while (ler2.ready()) {
				ler2.ready();
				vetor = ler2.readLine().split("#");

				if (vetor[0].equalsIgnoreCase(nomeLoc)) {
					System.out.println("Conta Poupan�a localizada!");
					return vetor;
				}
			}
			System.out.println("Conta Poupan�a n�o localizada!");
			return null;

		} catch (IOException e) {
			System.out.println("Erro no programa.");
		}
		return null;
	}

	public void imprimirPoupancas(String caminhoPoupanca) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoPoupanca));
			String linha;
			System.out.println("Imprimindo rela��o de Contas Poupan�as salvas...");
			System.out.println("(Nome Titular, Nro Ag�ncia, Nro Conta, Saldo, Limite)");
			while (br.ready()) {
				linha = br.readLine();

				if (linha.equals("﻿")) {
					System.out.print("");
				} else {
					System.out.println(linha.replace("#", ", "));
				}
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void contarPoupancas(String caminhoPoupanca) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoPoupanca));
			int cont = 0;
			String vazio;
			System.out.println("Calculando quantidade de Contas Poupan�as salvas...");
			while (br.ready()) {
				vazio = br.readLine();
				if (!vazio.isEmpty() && !vazio.equals("﻿")) {
					cont++;
				} 
			}
			System.out.println(cont + " Contas Poupan�as cadastradas.");
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
}
