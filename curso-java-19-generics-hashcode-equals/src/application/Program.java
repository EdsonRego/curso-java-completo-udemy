package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		entities.Client c1 = new Client("Maria", "maria@gmail.com");
		entities.Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));//equal compara o conte�do dos objetos;
		System.out.println(c1 == c2);//== compara as referencias de mem�ria "new object", da� d� diferente .
		System.out.println(s1 == s2);//== compara os literais, d� igual.
	}
}
