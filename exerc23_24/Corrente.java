package exerc23_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Corrente extends Conta {
	private double limite;

	Corrente() {

	}

	Corrente(String agencia, String nrConta, double saldo, String titular, double limite) {
		this.setAgencia(agencia);
		this.setNrConta(nrConta);
		this.setSaldo(saldo);
		this.setTitular(titular);
		this.setLimite(limite);
	}

	public void verificarArquivo(String caminhoCorrente) {
		try {
			File f = new File(caminhoCorrente);
			if (!f.exists()) {
				String auxCaminho = caminhoCorrente.substring(0, caminhoCorrente.lastIndexOf("\\"));
				File fDir = new File(auxCaminho);
				fDir.mkdir();
				f.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cadastrar(Scanner ler) {
		System.out.print("Digite o nome do titular da Conta Corrente: ");
		setTitular(ler.nextLine());
		System.out.print("Digite o número da Agência da Conta Corrente: ");
		setAgencia(ler.nextLine());
		System.out.print("Digite o número da Conta Corrente: ");
		setNrConta(ler.nextLine());
		System.out.print("Digite o saldo da Conta Corrente: ");
		setSaldo(Double.parseDouble(ler.nextLine()));
		System.out.print("Digite o valor do limite da Conta Corrente: ");
		setLimite(Double.parseDouble(ler.nextLine()));
	}

	public int lerUltimoRegistro(String caminhoCorrente) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoCorrente));
			int i = 99;
			String[] aux;
			while (br.ready()) {
				br.ready();
				aux = br.readLine().split(" ");
				i = Integer.parseInt(aux[0]);
			}
			br.close();
			return ++i;
		} catch (IOException e) {
			System.out.print("Erro no programa.");
		}
		return 0;

	}

	public void salvarCorrente(String caminhoCorrente) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoCorrente, true));
			bw.write(lerUltimoRegistro(caminhoCorrente) + " " + getTitular() + "#" + getAgencia() + "#" + getNrConta()
					+ "#" + getSaldo() + "#" + getLimite());
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String[] localizarCorrente(String caminhoCorrente, Scanner ler) {
		try {
			System.out.println("Digite o nome do titular da Conta a ser localizada: ");
			String nomeLoc = ler.nextLine();
			BufferedReader ler2 = new BufferedReader(new FileReader(caminhoCorrente));

			String[] vetor;

			while (ler2.ready()) {
				ler2.ready();
				vetor = ler2.readLine().split("#");

				if (vetor[0].equalsIgnoreCase(nomeLoc)) {
					System.out.println("Conta Corrente localizada!");
					ler2.close();
					return vetor;
				}
			}
			System.out.println("Conta Corrente não localizada!");
			ler2.close();
			return null;

		} catch (IOException e) {
			System.out.println("Erro no programa.");
		}
		ler.close();
		return null;
	}

	public void imprimirCorrentes(String caminhoCorrente) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoCorrente));
			String linha;
			System.out.println("Imprimindo relação de Contas Correntes salvas...");
			System.out.println("(Nome Titular, Nro Agência, Nro Conta, Saldo, Limite)");

			while (br.ready()) {
				linha = br.readLine();

				// if (linha.equals("﻿")) {
				// System.out.print("");
				// } else {
				System.out.println(linha.replace("#", ", "));
				// }
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void contarCorrentes(String caminhoCorrente) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoCorrente));
			int cont = 0;
			String vazio;
			System.out.println("Calculando quantidade de Contas Correntes salvas...");
			while (br.ready()) {
				vazio = br.readLine();
				if (!vazio.isEmpty() && !vazio.equals("﻿")) {
					cont++;
				}
			}
			System.out.println(cont + " Contas Correntes cadastradas.");
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
