package curso_programacao.ex03;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.println("Diferença: " + DIFERENCA);
		
		sc.close();

	}

}
