package aula11_12;

public class Ex03 {

	public static void main(String[] args) {
		//ele faz a diferencia��o por causa da tabela ascii. numera��es dferentes. valores s�o baseados na
		//subtra��o do primeiro pelo segundo. por isso, caso d� n�mero negativo, significa que a ordem
		//n1 vem antes de n2
		String n1 = "tHALIA";
		String n2 = "THALIA";
		
		System.out.println(n1.equals(n2));
		System.out.println(n1.equalsIgnoreCase(n2));

	}

}
