package curso_programacao.ex04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int employeNumber, workHours ;
		double salaryPerHour, employeSalary;

		System.out.println("Informe o n�mero do funcion�rio: ");
		employeNumber = sc.nextInt();
		
		System.out.println("Informe o n�mero de horas trabalhadas: ");
		workHours = sc.nextInt();
		
		System.out.println("Informe o sal�rio hora: ");
		salaryPerHour = sc.nextDouble();
		
		employeSalary = workHours * salaryPerHour;
		
		System.out.println("NUMBER = " + employeNumber);
		System.out.printf("SALARY = U$ %.2f " , employeSalary);
	
		sc.close();	
	}

}
