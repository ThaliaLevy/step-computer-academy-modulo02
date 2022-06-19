package exerc15_16;

public class Calculadora {

	int n1, n2, n3;

	public int somar(int n1, int n2) { 
		return (n1 + n2);
	}

	public int somar(int n1, int n2, int n3) {
		return (n1 + n2 + n3);
	}

	public int subtrair(int n1, int n2) {
		return (n1 - n2);
	}

	public int subtrair(int n1, int n2, int n3) {
		return (n1 - n2 - n3);
	}

	public int multiplicar(int n1, int n2) {
		return (n1 * n2);
	}

	public int multiplicar(int n1, int n2, int n3) {
		return (n1 * n2 * n3);
	}

	public int dividir(int n1, int n2) {
		return (n1 / n2);
	}

	public int dividir(int n1, int n2, int n3) {
		return (n1 / n2 / n3);
	}

}
