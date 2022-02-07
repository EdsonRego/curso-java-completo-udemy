package estrutura_while.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SENHA: ");
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
