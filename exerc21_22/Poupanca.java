package exerc21_22;

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
		System.out.print("Digite o nome do titular da Conta Poupan�a:");
		setTitular(ler.nextLine());
		System.out.print("Digite o n�mero da ag�ncia da Conta Poupan�a: ");
		setAgencia(ler.nextLine());
		System.out.print("Digite o n�mero da Conta Poupan�a: ");
		setNrConta(ler.nextLine());
		System.out.print("Digite o saldo da Conta Poupan�a: ");
		setSaldo(Double.parseDouble(ler.nextLine()));
		System.out.print("Digite o valor do rendimento da Conta Poupan�a:");
		setRendimento(Double.parseDouble(ler.nextLine()));
	}

	public void sacar(Scanner ler) {
		System.out.print("Digite o valor a ser sacado: ");
		String valorSacado = ler.nextLine();
		double i = Double.parseDouble(valorSacado);
		if (i <= getSaldo() && i > 0) {
			setSaldo(getSaldo() - i);
			System.out.println("O novo saldo da conta �: " + getSaldo());
		} else {
			System.out.println("Comando inv�lido.");
		}
	}

	public void depositar(Scanner ler) {
		System.out.print("Digite o valor a ser depositado: ");
		String valorDepositado = ler.nextLine();
		setSaldo(getSaldo() + Double.parseDouble(valorDepositado));
		System.out.println("O novo saldo da conta �: " + getSaldo());
	}

	public void verificarSaldo(Scanner ler) {
		System.out.println("Saldo da conta: " + getSaldo() + " reais.");
	}
	
	public void aplicarRendimento (Scanner ler) {
		setSaldo((getSaldo() + getSaldo() * getRendimento()) / 100);
		System.out.println("Novo saldo com o rendimento aplicado: " + getSaldo());
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

}
