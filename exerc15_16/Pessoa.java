package exerc15_16;

public class Pessoa {
	String nomeCompleto, identidade, cpf, anoNascimento, telefone;

	public int calcularIdade() {
		int n = Integer.parseInt(anoNascimento);
		return 2020-n;
	}
	public String primeiroNome() {
		return nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
	}

	public String ultimoNome() {
		return nomeCompleto.substring(nomeCompleto.lastIndexOf(" ")+1);
	}
}
