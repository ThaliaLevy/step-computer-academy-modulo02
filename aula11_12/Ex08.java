package aula11_12;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		nome = ler.nextLine();
		int ultimoEspaco = nome.lastIndexOf(" ");
		System.out.println("�ndice �: " + ultimoEspaco);
		
		String ultimoNome = nome.substring(ultimoEspaco+1);
		System.out.println("�ltimo nome �: " + ultimoNome);
		ler.close();
	}

}
