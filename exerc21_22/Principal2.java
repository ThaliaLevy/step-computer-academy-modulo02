package exerc21_22;

import java.util.ArrayList;

import java.util.Scanner;

public class Principal2 {

	static ArrayList<Corrente> listaContaCorrente = new ArrayList<Corrente>();
	static ArrayList<Poupanca> listaContaPoupanca = new ArrayList<Poupanca>();

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String op;

		do {
			do {
				System.out.println(" Menu \n======");
				System.out.println(" Escolha a op��o: \n==================");
				System.out.println("1 - para acessar op��es para Conta Corrente;");
				System.out.println("2 - para acessar op��es para Conta Poupan�a;");
				System.out.println("s - para sair.");

				op = ler.nextLine();

			} while (!(op.equals("1") | op.equals("2") | op.equalsIgnoreCase("S")));

			switch (op) {
			case "1": {
				System.out.println("Carregando op��es para Conta Corrente. Aguarde...\n");
				System.out.println(" Escolha a op��o: \n==================");
				System.out.println("1 - para cadastrar uma Conta Corrente;");
				System.out.println("2 - para localizar/sacar/depositar/alterar informa��es de uma Conta Corrente;");
				System.out.println("3 - para informar quantas Contas Correntes existem;");
				System.out.println("4 - para listar todas as Contas Correntes existentes;");
				System.out.println("s - para sair.");

				op = ler.nextLine();

				switch (op) {

				case "1": {
					Corrente cc = new Corrente();
					System.out.println("Iniciando sess�o de cadastramento para Conta Corrente. Aguarde...\n");
					cc.cadastrar(ler);
					listaContaCorrente.add(cc);
					System.out.println("\nConta Corrente cadastrada com sucesso.\n");
					break;
				}
				case "2": {
					Corrente cc = new Corrente();
					System.out.print("Digite o nome do titular da Conta Corrente a ser localizada: ");
					String nomeLocalizado = ler.nextLine();
					boolean naoEncontrado = true;

					for (int i = 0; i < listaContaCorrente.size(); i++) {
						Corrente c = listaContaCorrente.get(i);
						String j = c.getTitular();

						if (j.equals(nomeLocalizado)) {
							System.out.println("Conta Corrente localizada. (�ndice: " + i + ").\n");
							naoEncontrado = false;

							System.out.println(" Escolha a op��o: \n==================");
							System.out.println("1 - para alterar informa��es da Conta Corrente;");
							System.out.println("2 - para sacar da Conta Corrente;");
							System.out.println("3 - para depositar na Conta Corrente;");
							System.out.println("4 - para verificar saldo da Conta Corrente.");
							String op2 = ler.nextLine();

							switch (op2) {

							case "1": {
								System.out.println(" Escolha a op��o: \n==================");
								System.out.println("1 - para alterar titular da Conta Corrente;");
								System.out.println("2 - para alterar n�mero da Conta Corrente;");
								System.out.println("3 - para alterar ag�ncia da Conta Corrente;");
								System.out.println("4 - para alterar limite da Conta Corrente;");
								System.out.println("5 - para alterar saldo da Conta Corrente.");

								String op3 = ler.nextLine();
								Corrente editadaCorrente = listaContaCorrente.get(i);

								switch (op3) {

								case "1": {
									System.out.println("Digite o nome novo titular da Conta Corrente: ");
									editadaCorrente.setTitular(ler.nextLine());
									break;
								}
								case "2": {
									System.out.println("Digite o novo n�mero da Conta Corrente: ");
									editadaCorrente.setNrConta(ler.nextLine());
									break;
								}
								case "3": {
									System.out.println("Digite a nova ag�ncia da Conta Corrente: ");
									editadaCorrente.setAgencia(ler.nextLine());
									break;
								}
								case "4": {
									System.out.println("Digite o novo limite da Conta Corrente: ");
									editadaCorrente.setLimite(ler.nextDouble());
									break;
								}
								case "5": {
									System.out.println("Digite o novo saldo da Conta Corrente: ");
									editadaCorrente.setSaldo(ler.nextDouble());
									break;
								}
								}
								listaContaCorrente.set(i, editadaCorrente);
								System.out.println("Conta Corrente atualizada com sucesso!");
							}
							case "2": {
								cc.sacar(ler);
								break;
							}
							case "3": {
								cc.depositar(ler);
								break;
							}
							case "4": {
								cc.verificarSaldo(ler);
								break;
							}
							}
						}
					}
					if (naoEncontrado) {
						System.out.println("Conta Corrente n�o localizada. � preciso cadastra-la primeiro! \n");
					}
					break;
				}
				case "3": {
					System.out.println("Existem " + listaContaCorrente.size() + " Contas Correntes cadastradas.");
					break;
				}
				case "4": {
					if (listaContaCorrente.isEmpty()) {
						System.out.println("Lista de Contas Correntes est� vazia.");
					} else {
						System.out.println(
								"Imprimindo a rela��o de Contas Correntes cadastradas:\n =====================================================");
						for (Corrente cc : listaContaCorrente) {
							System.out.println(listaContaCorrente.indexOf(cc) + " Titular: " + cc.getTitular()
									+ " N�mero da conta: " + cc.getNrConta() + " Ag�ncia: " + cc.getAgencia()
									+ " Limite: " + cc.getLimite() + " Saldo: " + cc.getSaldo());
						}
					}
					break;
				}
				case "s":
				case "S": {
					System.out.println("Saindo...\n");
				}
				}
				break;
			}
			case "2": {
				System.out.println("Carregando op��es para Conta Poupan�a. Aguarde...\n");
				System.out.println(" Escolha a op��o: \n==================");
				System.out.println("1 - para cadastrar uma Conta Poupan�a;");
				System.out.println(
						"2 - para localizar/sacar/depositar/aplicar rendimento/alterar informa��es de uma Conta Poupan�a;");
				System.out.println("3 - para informar quantas Contas Poupan�as existem;");
				System.out.println("4 - para listar todas as Contas Poupan�as existentes;");
				System.out.println("s - para sair.\n");

				op = ler.nextLine();

				switch (op) {

				case "1": {
					Poupanca cp = new Poupanca();
					System.out.println("Iniciando sess�o de cadastramento para Conta Poupan�a. Aguarde...\n");
					cp.cadastrar(ler);
					listaContaPoupanca.add(cp);
					System.out.println("\nConta Poupan�a cadastrada com sucesso.\n");
					break;
				}
				case "2": {
					Poupanca cp = new Poupanca();
					System.out.print("Digite o nome do titular da Conta Poupan�a a ser localizada: ");
					String nomeLocalizado = ler.nextLine();
					boolean naoEncontrado = true;

					for (int i = 0; i < listaContaPoupanca.size(); i++) {
						Poupanca p = listaContaPoupanca.get(i);
						String j = p.getTitular();

						if (j.equals(nomeLocalizado)) {
							System.out.println("Conta Poupan�a localizada. (�ndice: " + i + ").\n");
							naoEncontrado = false;

							System.out.println(" Escolha a op��o: \n==================");
							System.out.println("1 - para alterar informa��es da Conta Poupan�a;");
							System.out.println("2 - para sacar da Conta Poupan�a;");
							System.out.println("3 - para depositar na Conta Poupan�a;");
							System.out.println("4 - para verificar saldo da Conta Poupan�a.");
							System.out.println("5 - para aplicar rendimento na Conta Poupan�a;");
							String op2 = ler.nextLine();

							switch (op2) {

							case "1": {
								System.out.println(" Escolha a op��o: \n==================");
								System.out.println("1 - para alterar titular da Conta Poupan�a;");
								System.out.println("2 - para alterar n�mero da Conta Poupan�a;");
								System.out.println("3 - para alterar ag�ncia da Conta Poupan�a;");
								System.out.println("4 - para alterar limite da Conta Poupan�a;");
								System.out.println("5 - para alterar saldo da Conta Poupan�a.");

								String op3 = ler.nextLine();
								Poupanca editadaPoupanca = listaContaPoupanca.get(i);

								switch (op3) {

								case "1": {
									System.out.println("Digite o nome novo titular da Conta Poupan�a: ");
									editadaPoupanca.setTitular(ler.nextLine());
									break;
								}
								case "2": {
									System.out.println("Digite o novo n�mero da Conta Poupan�a: ");
									editadaPoupanca.setNrConta(ler.nextLine());
									break;
								}
								case "3": {
									System.out.println("Digite a nova ag�ncia da Conta Poupan�a: ");
									editadaPoupanca.setAgencia(ler.nextLine());
									break;
								}
								case "4": {
									System.out.println("Digite o novo rendimento da Conta Poupan�a: ");
									editadaPoupanca.setRendimento(ler.nextDouble());
									break;
								}
								case "5": {
									System.out.println("Digite o novo saldo da Conta Poupan�a: ");
									editadaPoupanca.setSaldo(ler.nextDouble());
									break;
								}
								}
								listaContaPoupanca.set(i, editadaPoupanca);
								System.out.println("Conta Poupan�a atualizada com sucesso!");
							}
							case "2": {
								cp.sacar(ler);
								break;
							}
							case "3": {
								cp.depositar(ler);
								break;
							}
							case "4": {
								cp.verificarSaldo(ler);
								break;
							}
							case "5": {
								cp.aplicarRendimento(ler);
								break;
							}
							}
						}
					}
					if (naoEncontrado) {
						System.out.println("Conta Poupan�a n�o localizada. � preciso cadastra-la primeiro! \n");
					}
					break;
				}
				case "3": {
					System.out.println("Existem " + listaContaPoupanca.size() + " Contas Poupan�as cadastradas.");
					break;
				}
				case "4": {
					if (listaContaPoupanca.isEmpty()) {
						System.out.println("Lista de Contas Poupan�as est� vazia.");
					} else {
						System.out.println(
								"Imprimindo a rela��o de Contas Poupan�as cadastradas:\n =====================================================");
						for (Poupanca cp : listaContaPoupanca) {
							System.out.println(listaContaPoupanca.indexOf(cp) + " Titular: " + cp.getTitular()
									+ " N�mero da conta: " + cp.getNrConta() + " Ag�ncia: " + cp.getAgencia()
									+ " Rendimento: " + cp.getRendimento() + " Saldo: " + cp.getSaldo());
						}
					}
					break;
				}
				case "s":
				case "S": {
					System.out.println("Saindo...\n");
				}
				}
				break;
			}

			case "s":
			case "S": {
				System.out.println("Saindo...\n");
			}
			}

		} while (!(op.equalsIgnoreCase("s") | op.equals("S") | op.equals("3") | op.equals("4") | op.equals("5")
				| op.equals("6") | op.equals("7") | op.equals("8") | op.equals("9") | op.equals("s")));
		System.out.println("Fim do programa.\n");
		
		
	}
}
