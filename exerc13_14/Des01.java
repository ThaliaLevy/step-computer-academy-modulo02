package exerc13_14;

import java.util.Scanner;

public class Des01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um nome completo: ");
		String nomeCompleto = ler.nextLine();
		removerEspacosIniFim(nomeCompleto);
	}

	public static void removerEspacosIniFim(String nomeCompleto) {
		nomeCompleto = nomeCompleto.trim();
		inicialMaiuscula(nomeCompleto);
		// abcdefghijklmnopqrstuvwxyz
	}

	public static void inicialMaiuscula(String nomeCompleto) {
		// String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		// String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
		String parametro = " ";
		String parametro2 = "d";
		String substituirInicial = "";
		String k = "";

		for (int i = 0; i < nomeCompleto.length(); i++) {
			for (int j = 0; j < parametro.length(); j++) {
				System.out.println(k);
				if (nomeCompleto.charAt(i) == nomeCompleto.charAt(0)) {
					k = (nomeCompleto.charAt(i) + "").toUpperCase();
					

				} else {
				//	if (nomeCompleto.charAt(i) == parametro2.charAt(j)) {
				//		k = k + nomeCompleto.charAt(i) + "";
					//} else 
					
						if (nomeCompleto.charAt(i) != parametro2.charAt(j)) {
							if (nomeCompleto.charAt(i) == parametro.charAt(j)) {
								k = k + " " + (nomeCompleto.charAt(i + 1) + "").toUpperCase();

							}
						} else {
							k = k + nomeCompleto.charAt(i) + "";
						}
					}

				}
			}
		}

		// System.out.println("Nome formatado: " + substituirInicial);
	

	public static void verificarInteiros(String nomeCompleto) {
		String inteiros = "0123456789 ";
		String infoInteiros = "";
		for (int i = 0; i < nomeCompleto.length(); i++) {
			for (int j = 0; j < inteiros.length(); j++) {
				if (nomeCompleto.charAt(i) == inteiros.charAt(j)) {
					infoInteiros = infoInteiros + nomeCompleto.charAt(i);
				}

			}
		}
		System.out.println("Inteiros da informação: " + infoInteiros);
	}

	public static void verificarReais(String nomeCompleto) {
		String parametro = ".";
		String infoReais = "";
		for (int i = 0; i < nomeCompleto.length(); i++) {
			for (int j = 0; j < parametro.length(); j++) {
				if (nomeCompleto.charAt(i) == parametro.charAt(j)) {
					String k = nomeCompleto.charAt(i - 1) + "";
					String l = nomeCompleto.charAt(i) + "";
					String m = nomeCompleto.charAt(i + 1) + "";
					infoReais = k + l + m;
				}

			}
		}
		System.out.println("Reais da informação: " + infoReais);
	}
}
