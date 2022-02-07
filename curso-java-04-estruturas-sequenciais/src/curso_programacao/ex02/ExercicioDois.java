package curso_programacao.ex02;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("Área = %.4f%n ", area);
				
		sc.close();

	}

}
