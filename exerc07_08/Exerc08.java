//package exerc07_08;
//
//import java.util.Scanner;
//
//public class Exerc08 {
//
//	public static void main(String[] args) {Scanner ler = new Scanner(System.in);
//
//	System.out.println("Digite um caracter:");
//	char n = ler.next().charAt(0);
//
//	switch (n) {
//	case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
//		System.out.println(n + " � uma vogal.");
//		break;
//	case '�': case '~': case '.': case ',': case ':': case ';':
//		System.out.println(n + " � uma pontua��o.");
//		break;
//	case '@': case '$': case '#': case '�': case '*': case ')':
//		System.out.println(n + " � um caracter especial.");
//		break;
//	case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0':
//		System.out.println(n + " � um n�mero.");
//		break;
//	case 'b': case 'B': case 'c': case 'C': case 'd': case 'D': case 'f': case 'F': case 'g': case 'G':
//	case 'h': case 'H': case 'j': case 'J': case 'k': case 'K': case 'l': case 'L': case 'm':
//	 case 'N': case 'n': case 'M': case 'p': case 'P': case 'q': case 'Q': case 'r': case 'R': case 's': case 'S':
//	case 't': case 'T': case 'v': case 'V': case 'W': case 'w': case 'X': case 'x': case 'Y':
//	case 'y': case 'Z': case 'z':
//		System.out.println(n + " � uma consoante.");
//		break;
//	default:
//		System.out.println(n + " n�o � vogal, consoante, n�mero, caracter especial ou pontua��o.");
//	}
//
//	System.out.println("Fim do programa.");
//	ler.close();
//
//	}
//
//}
