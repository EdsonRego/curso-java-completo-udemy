package curso_programacao.ex01;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, soma;
				
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		soma = a + b;
		
		System.out.println("Soma = " + soma);
	}

}
