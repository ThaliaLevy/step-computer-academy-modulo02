package exerc2526;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws IOException {

		String caminhoPoupanca = System.getProperty("user.dir") + "\\src\\exerc2526\\poupanca.txt";
		String caminhoCorrente = System.getProperty("user.dir") + "\\src\\exerc2526\\corrente.txt";
		String op = null;
		Scanner ler = new Scanner(System.in);

		do {
			do {
				System.out.println("\n Menu \n======");
				System.out.println(" Escolha a op��o: \n==================");
				System.out.println("1 - para acessar op��es para Conta Corrente;");
				System.out.println("2 - para acessar op��es para Conta Poupan�a;");
				System.out.println("3 - para verificar a soma do montante deste Banco.");
				System.out.println("s - para sair.");

				op = ler.nextLine();

			} while (!(op.equals("1") | op.equals("2") | op.equals("3") | op.equalsIgnoreCase("S")));

			switch (op) {
			case "s":
			case "S": {
				System.out.println("Saindo...\n");
				break;
			}
			default: {
				System.out.println("op��o inv�lida;");
				break;
			}
			case "1": {
				Corrente cc = new Corrente();
				cc.verificarArquivo(caminhoCorrente);
				System.out.println("Carregando op��es para Conta Corrente. Aguarde...\n");
				System.out.println(" Escolha a op��o: \n==================");
				System.out.println("1 - para cadastrar uma Conta Corrente;");
				System.out.println(
						"2 - para alterar informa��es/sacar/depositar/verificar saldo/localizar uma Conta Corrente;");
				System.out.println("3 - para informar quantas Contas Correntes existem;");
				System.out.println("4 - para listar todas as Contas Correntes existentes;");
				System.out.println("5 - para excluir uma Conta Corrente existente;");
				System.out.println("6 - para exibir Conta Corrente com maior saldo.");

				op = ler.nextLine();

				switch (op) {
				default: {
					System.out.println("op��o inv�lida;");
					break;
				}
				case "1": {
					System.out.println("Iniciando sess�o de cadastramento para Conta Corrente. Aguarde...\n");
					cc.cadastrar(ler);
					cc.salvarCorrente(caminhoCorrente);
					System.out.println("\nConta Corrente cadastrada com sucesso.\n");
					break;
				}
				case "2": {
					System.out.println(" Escolha a op��o: \n==================");
					System.out.println("1 - para alterar informa��es da Conta Corrente;");
					System.out.println("2 - para sacar da Conta Corrente;");
					System.out.println("3 - para depositar na Conta Corrente;");
					System.out.println("4 - para verificar saldo da Conta Corrente.");
					System.out.println("5 - para verificar se uma Conta Corrente est� cadastrada.");
					String op2 = ler.nextLine();

					switch (op2) {

					case "1": {
						cc.atualizarCorrente(caminhoCorrente, ler);
						break;
					}
					case "2": {
						cc.salvarSaque(caminhoCorrente, ler);
						break;
					}
					case "3": {
						cc.salvarDeposito(caminhoCorrente, ler);
						break;
					}
					case "4": {
						cc.verificarSaldo(caminhoCorrente, ler);
						break;
					}
					case "5": {
						cc.localizarCorrente(caminhoCorrente, ler);
						break;
					}
					}
					break;
				}
				case "3": {
					cc.contarCorrentes(caminhoCorrente);
					break;
				}
				case "4": {
					cc.imprimirCorrentes(caminhoCorrente);
					break;
				}
				case "5": {
					cc.excluirConta(caminhoCorrente, ler);
					break;
				}
				case "6": {
					cc.verificarMaior(caminhoCorrente);
					break;
				}
				}
				break;
			}

			case "2": {
				Poupanca cp = new Poupanca();
				cp.verificarArquivo(caminhoPoupanca);
				System.out.println("Carregando op��es para Conta Poupanca. Aguarde...\n");
				System.out.println(" Escolha a op��o: \n==================");
				System.out.println("1 - para cadastrar uma Conta Poupanca;");
				System.out.println(
						"2 - para alterar informa��es/sacar/depositar/verificar saldo/localizar uma Conta Poupanca;");
				System.out.println("3 - para informar quantas Contas Poupancas existem;");
				System.out.println("4 - para listar todas as Contas Poupancas existentes;");
				System.out.println("5 - para excluir uma Conta Poupanca existente;");
				System.out.println("6 - para exibir Conta Poupanca com menor saldo;");
				System.out.println("7 - para aplicar rendimento na Conta Poupan�a.");

				op = ler.nextLine();

				switch (op) {
				default: {
					System.out.println("op��o inv�lida;");
					break;
				}
				case "1": {
					System.out.println("Iniciando sess�o de cadastramento para Conta Poupan�a. Aguarde...\n");
					cp.cadastrar(ler);
					cp.salvarPoupanca(caminhoPoupanca);
					System.out.println("\nConta Poupan�a cadastrada com sucesso.\n");
					break;
				}
				case "2": {
					System.out.println(" Escolha a op��o: \n==================");
					System.out.println("1 - para alterar informa��es da Conta Poupanca;");
					System.out.println("2 - para sacar da Conta Poupanca;");
					System.out.println("3 - para depositar na Conta Poupanca;");
					System.out.println("4 - para verificar saldo da Conta Poupanca.");
					System.out.println("5 - para verificar se uma Conta Poupanca est� cadastrada.");
					String op2 = ler.nextLine();

					switch (op2) {

					case "1": {
						cp.atualizarPoupanca(caminhoPoupanca, ler);
						break;
					}
					case "2": {
						cp.salvarSaque(caminhoPoupanca, ler);
						break;
					}
					case "3": {
						cp.salvarDeposito(caminhoPoupanca, ler);
						break;
					}
					case "4": {
						cp.verificarSaldo(caminhoPoupanca, ler);
						break;
					}
					case "5": {
						cp.localizarPoupanca(caminhoPoupanca, ler);
						break;
					}
					}
					break;
				}
				case "3": {
					cp.contarPoupancas(caminhoPoupanca);
					break;
				}
				case "4": {
					cp.imprimirPoupancas(caminhoPoupanca);
					break;
				}
				case "5": {
					cp.excluirConta(caminhoPoupanca, ler);
					break;
				}
				case "6": {
					cp.verificarMaior(caminhoPoupanca);
					break;
				}
				case "7": {
					cp.aplicarRendimento(caminhoPoupanca, ler);
					break;
				}
				}
				break;
			}
			case "3": {
				Corrente cc = new Corrente();
				Poupanca cp = new Poupanca();
				cp.somaPoupanca(caminhoPoupanca);
				cc.somaCorrente(caminhoCorrente);

				double resultado = cp.getSomaP() + cc.getSomaC();
				System.out.println("O montante deste Banco �: " + resultado);
			}
			}
		} while (!(op.equalsIgnoreCase("s") | op.equals("S")));
		System.out.println("Fim do programa.\n");

	}

}
