package estrutura_condicional.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros com um espaço entre si: ");
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos.");
		}
		else {
			System.out.println("Não são multiplos.");
		}
				
		sc.close();

	}

}
