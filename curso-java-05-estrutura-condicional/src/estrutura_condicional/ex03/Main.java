package estrutura_condicional.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros inteiros com um espa�o entre si: ");
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o multiplos.");
		}
		else {
			System.out.println("N�o s�o multiplos.");
		}
				
		sc.close();

	}

}
