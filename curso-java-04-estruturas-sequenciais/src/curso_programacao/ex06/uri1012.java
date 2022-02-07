package curso_programacao.ex06;

import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Informe o valor de 3 cotas, em milimetros: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = A * C / 2;
		areaCirculo = C * C * 3.14159;
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trap�zio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Ret�ngulo: %.3f%n", areaRetangulo);
		
		sc.close();

	}

}
