package exerc23_24;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws IOException {

	//	String caminhoCorrente = "C:\\Users\\HP\\Desktop\\Step Java SE\\aulas\\caminhos\\caminhoCorrente.txt";
	//	String caminhoPoupanca = "C:\\Users\\HP\\Desktop\\Step Java SE\\aulas\\caminhos\\caminhoPoupanca.txt";
		String caminhoPoupanca = System.getProperty("user.dir") + "\\src\\aula2324\\poupanca.txt";
		String caminhoCorrente = System.getProperty("user.dir") + "\\src\\aula2324\\corrente.txt";
		//verificarArquivo(caminhoPoupanca);
		
		String op = null;
		Scanner ler = new Scanner(System.in);

		do {
			do {
				System.out.println(" Menu \n======");
				System.out.println(" Escolha a opção: \n==================");
				System.out.println("1 - para acessar opções para Conta Corrente;");
				System.out.println("2 - para acessar opções para Conta Poupança;");
				System.out.println("s - para sair.");

				op = ler.nextLine();

			} while (!(op.equals("1") | op.equals("2") | op.equalsIgnoreCase("S")));

			switch (op) {
			case "s":
			case "S": {
				System.out.println("Saindo...\n");
				break;
			}
			default: {
				System.out.println("opção inválida;");
				break;
			}
			case "1": {
				Corrente cc = new Corrente();
				cc.verificarArquivo(caminhoCorrente);
				System.out.println("Carregando opções para Conta Corrente. Aguarde...\n");
				System.out.println(" Escolha a opção: \n==================");
				System.out.println("1 - para cadastrar uma Conta Corrente;");
				System.out.println("2 - para localizar/sacar/depositar/alterar informações de uma Conta Corrente;");
				System.out.println("3 - para informar quantas Contas Correntes existem;");
				System.out.println("4 - para listar todas as Contas Correntes existentes;");

				op = ler.nextLine();

				switch (op) {
				default: {
					System.out.println("opção inválida;");
					break;
				}
				case "1": {
					System.out.println("Iniciando sessão de cadastramento para Conta Corrente. Aguarde...\n");
					cc.cadastrar(ler);
					cc.salvarCorrente(caminhoCorrente);
					System.out.println("\nConta Corrente cadastrada com sucesso.\n");
					break;
				}
				case "2": {
					cc.localizarCorrente(caminhoCorrente, ler);
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
				}
				break;
			}
			case "2": {
				Poupanca cp = new Poupanca();
				System.out.println("Carregando opções para Conta Poupança. Aguarde...\n");
				System.out.println(" Escolha a opção: \n==================");
				System.out.println("1 - para cadastrar uma Conta Poupança;");
				System.out.println("2 - para localizar uma Conta Poupança;");
				System.out.println("3 - para informar quantas Contas Poupanças existem;");
				System.out.println("4 - para listar todas as Contas Poupanças existentes;");

				op = ler.nextLine();

				switch (op) {
				default: {
					System.out.println("opção inválida;");
					break;
				}
				case "1": {

					System.out.println("Iniciando sessão de cadastramento para Conta Corrente. Aguarde...\n");
					cp.cadastrar(ler);
					cp.salvarPoupanca(caminhoPoupanca);
					System.out.println("\nConta Poupança cadastrada com sucesso.\n");
					break;
				}
				case "2": {
					cp.localizarPoupanca(caminhoPoupanca, ler);
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
				}
				break;
			}
			}
		} while (!(op.equalsIgnoreCase("s") | op.equals("S") | op.equals("3") | op.equals("4") | op.equals("5")
				| op.equals("6") | op.equals("7") | op.equals("8") | op.equals("9") | op.equals("s")));
		System.out.println("Fim do programa.\n");

	}
}