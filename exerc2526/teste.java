package exerc2526;

import java.util.Scanner;

public class teste {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		//está dando erro. tentar novamente depois!
		String s = in.nextLine();
		System.out.println(s);
		String i[] = s.split("");
		String aux[] = null;
		for (int j = i.length; j > 0; j--) {
			aux[j] = i[j];
			System.out.println(aux[0]);
			}

		
	}
}
