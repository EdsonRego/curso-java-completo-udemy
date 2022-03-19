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
		System.out.println(c1.equals(c2));//equal compara o conteúdo dos objetos;
		System.out.println(c1 == c2);//== compara as referencias de memória "new object", daí dá diferente .
		System.out.println(s1 == s2);//== compara os literais, dá igual.
	}
}
