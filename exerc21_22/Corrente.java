package exerc21_22;

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

	public void cadastrar(Scanner ler) {
		System.out.print("Digite o nome do titular da Conta Corrente: ");
		setTitular(ler.nextLine());
		System.out.print("Digite o n�mero da ag�ncia da Conta Corrente: ");
		setAgencia(ler.nextLine());
		System.out.print("Digite o n�mero da Conta Corrente: ");
		setNrConta(ler.nextLine());
		System.out.print("Digite o saldo da Conta Corrente: ");
		setSaldo(Double.parseDouble(ler.nextLine()));
		System.out.print("Digite o valor do limite da Conta Corrente: ");
		setLimite(Double.parseDouble(ler.nextLine()));
	}

	public void sacar(Scanner ler) {
		System.out.print("Digite o valor a ser sacado: ");
		String valorSacado = ler.nextLine();
		double i = Double.parseDouble(valorSacado);
		if (i <= getSaldo() + getLimite() && i > 0) {
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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
