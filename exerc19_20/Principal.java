package exerc19_20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String op;
		Corrente cc = null;
		Poupanca cp = null;
		
		do {

			System.out.println("Menu");
			System.out.println("Escolha a op��o: \n");
			System.out.println("1 - para cadastrar Conta Corrente;");
			System.out.println("2 - para cadastrar Conta Poupan�a;");
			System.out.println("3 - para mostrar dados Conta Corrente;");
			System.out.println("4 - para mostrar dados Conta Poupan�a;");
			System.out.println("5 - para depositar Conta Corrente;");
			System.out.println("6 - para depositar Conta Poupan�a;");
			System.out.println("7 - para sacar Conta Corrente;");
			System.out.println("8 - para sacar Conta Poupan�a;");
			System.out.println("9 - para aplicar rendimento;");
			System.out.println("s - para sair.");

			op = ler.nextLine();

			switch (op) {
			case "1": {
				cc = new Corrente();
				System.out.print("Op��o 1 escolhida! Digite o nome do Titular da conta: ");
				cc.setTitular(ler.nextLine());
				System.out.print("Digite o n�mero da conta: ");
				cc.setNrConta(ler.nextLine());
				System.out.print("Digite a ag�ncia da conta: ");
				cc.setAgencia(ler.nextLine());
				System.out.print("Digite o saldo da conta: ");
				cc.setSaldo(Double.parseDouble(ler.nextLine()));
				System.out.print("Digite o limite da conta: ");
				cc.setLimite(Double.parseDouble(ler.nextLine()));

				System.out.println("Conta Corrente cadastrada com sucesso!\n");
				break;
			}
			case "2": {
				cp = new Poupanca();
				System.out.print("Op��o 2 escolhida! Digite o nome do Titular da conta: ");
				cp.setTitular(ler.nextLine());
				System.out.print("Digite o n�mero da conta: ");
				cp.setNrConta(ler.nextLine());
				System.out.print("Digite a ag�ncia da conta: ");
				cp.setAgencia(ler.nextLine());
				System.out.print("Digite o saldo da conta: ");
				cp.setSaldo(Double.parseDouble(ler.nextLine()));
				System.out.print("Digite o rendimento da conta: ");
				cp.setRendimento(Integer.parseInt(ler.nextLine()));

				System.out.println("Conta Poupan�a cadastrada com sucesso!\n");
				break;
			}
			case "3": {
				if (cc == null) {
					System.out.println("Conta corrente ainda n�o foi cadastrada.\n");
				} else {
					System.out.println("Exibindo os dados da Conta Corrente: \n");
					System.out.println("Nome do titular da conta: " + cc.getTitular());
					System.out.println("N�mero da conta: " + cc.getNrConta());
					System.out.println("Ag�ncia da conta: " + cc.getAgencia());
					System.out.println("Saldo da conta: " + cc.getSaldo());
					System.out.println("Limite da conta: " + cc.getLimite() + "\n");
				}
				break;
			}
			case "4": {
				if (cp == null) {
					System.out.println("Conta poupan�a ainda n�o foi cadastrada.\n");
				} else {
					System.out.println("Exibindo os dados da Conta Poupan�a: \n");
					System.out.println("Nome do titular da conta: " + cp.getTitular());
					System.out.println("N�mero da conta: " + cp.getNrConta());
					System.out.println("Ag�ncia da conta: " + cp.getAgencia());
					System.out.println("Saldo da conta: " + cp.getSaldo());
					System.out.println("Rendimento da conta: " + cp.getRendimento() + "\n");
				}
				break;
			}
			case "5": {
				if (cc == null) {
					System.out.println("Conta corrente ainda n�o foi cadastrada.\n");
				} else {
					System.out.print("Digite o valor a ser depositado: ");
					String valorDepositado = ler.nextLine();
					cc.setSaldo(cc.getSaldo() + Double.parseDouble(valorDepositado));
					System.out.println("O novo saldo da conta �: " + cc.getSaldo());
				}
				break;
			}
			case "6": {
				if (cp == null) {
					System.out.println("Conta poupan�a ainda n�o foi cadastrada.\n");
				} else {
					System.out.print("Digite o valor a ser depositado: ");
					String valorDepositado = ler.nextLine();
					cp.setSaldo(cp.getSaldo() + Double.parseDouble(valorDepositado));
					System.out.println("O novo saldo da conta �: " + cp.getSaldo());
				}
				break;
			}
			case "7": {
				if (cc == null) {
					System.out.println("Conta corrente ainda n�o foi cadastrada.\n");
				} else {
					System.out.print("Digite o valor a ser sacado: ");
					String valorSacado = ler.nextLine();
					double i = Double.parseDouble(valorSacado);
					if (i <= cc.getSaldo() + cc.getLimite() && i > 0) {
						cc.setSaldo(cc.getSaldo() - i);
						System.out.println("O novo saldo da conta �: " + cc.getSaldo());
					} else {
						System.out.println("Comando inv�lido.");
					}
				}
				break;
			}
			case "8": {
				if (cp == null) {
					System.out.println("Conta poupan�a ainda n�o foi cadastrada.\n");
				} else {
					System.out.print("Digite o valor a ser sacado: ");
					String valorSacado = ler.nextLine();
					double i = Double.parseDouble(valorSacado);
					if (i <= cp.getSaldo() && i > 0) {
						cp.setSaldo(cp.getSaldo() - i);
						System.out.println("O novo saldo da conta �: " + cp.getSaldo());
					} else {
						System.out.println("Comando inv�lido.");
					}
				}
				break;
			}
			case "9": {
				if (cp == null) {
					System.out.println("Conta poupan�a ainda n�o foi cadastrada.\n");
				} else {
					cp.setSaldo(cp.getSaldo() + cp.getSaldo() * cp.getRendimento() / 100);
					System.out.println("Novo saldo com o rendimento aplicado: " + cp.getSaldo());
				}
				break;
			}
			case "s":
			case "S": {
				System.out.println("Saindo do programa...");
				break;
			}
			default:
				System.out.println("Op��o inv�lida. Escolha outra: ");
			}

		} while (!op.equalsIgnoreCase("s"));
		System.out.println("Fim do programa.");
		ler.close();
	}

}
