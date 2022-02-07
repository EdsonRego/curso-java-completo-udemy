package estrutura_condicional.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do produto e a quantidade");
		
		int codProd = sc.nextInt();
		int quantProd = sc.nextInt();
		
		double total;
		
		if(codProd == 1) {
			total = quantProd * 4.00;
			
		} else if (codProd == 2) {
			total = quantProd * 4.50;
			
		} else if (codProd == 3) {
			total = quantProd * 5.00;
			
		} else if (codProd == 4) {
			total = quantProd * 2.00;
			
		} else {
			total = quantProd * 1.50;
		} 
		
		System.out.printf("Total: %.2f%n", total);
		
		sc.close();
		
	}

}
