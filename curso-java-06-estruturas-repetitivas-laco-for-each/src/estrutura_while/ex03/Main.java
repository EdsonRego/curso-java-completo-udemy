package estrutura_while.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Informe o tipo de comb�st�vel: ");

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += +1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}
			tipo = sc.nextInt();
		}

		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
