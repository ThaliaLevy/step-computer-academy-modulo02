package exerc15_16;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa p1 = new Pessoa();

		System.out.println("Digite o nome completo: ");
		p1.nomeCompleto = ler.nextLine();

		System.out.println("Digite a identidade: ");
		p1.identidade = ler.nextLine();

		System.out.println("Digite o CPF: ");
		p1.cpf = ler.nextLine();

		System.out.println("Digite o ano Nascimento: ");
		p1.anoNascimento = ler.nextLine();

		System.out.println("Nome: " + p1.nomeCompleto);
		System.out.println("Identidade: " + p1.identidade);
		System.out.println("CPF: " + p1.cpf);
		System.out.println("Ano nascimento: " + p1.anoNascimento);
		System.out.println("Idade: " + p1.calcularIdade());
		System.out.println("Primeiro nome: " + p1.primeiroNome());
		System.out.println("Ultimo nome: " + p1.ultimoNome());
	}

}

