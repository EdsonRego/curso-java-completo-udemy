package curso_programacao.ex05;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int spareCode1, spareQuant1, spareCode2, spareQuant2;
		double sparePrice1, sparePrice2, totalValue; 
		
		spareCode1 = sc.nextInt();
		spareQuant1 = sc.nextInt();
		sparePrice1 = sc.nextDouble();
		
		spareCode2 = sc.nextInt();
		spareQuant2 = sc.nextInt();
		sparePrice2 = sc.nextDouble();
		
		totalValue = spareQuant1 * sparePrice1 + spareQuant2 * sparePrice2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", totalValue);
		
		sc.close();
	}

}
