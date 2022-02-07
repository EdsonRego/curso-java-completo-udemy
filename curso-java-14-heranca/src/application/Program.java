package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		/*
		 * Account acc = new Account(1001, "Edson", 0.0); BusinessAccount bacc = new
		 * BusinessAccount(1002, "Maria", 0.0, 500.0);
		 * 
		 * //UpCasting
		 * 
		 * Account acc1 = bacc; Account acc2 = new BusinessAccount(1003, "Camilly", 0.0,
		 * 200.0); Account acc3 = new SavingsAccount(1004, "Edson", 0.0, 0.01);
		 * 
		 * //DownCasting
		 * 
		 * BusinessAccount acc4 = (BusinessAccount)acc2; acc4.loan(100.0);
		 * 
		 * //BusinessAccount acc5 = (BusinessAccount)acc3; if(acc3 instanceof
		 * BusinessAccount) { BusinessAccount acc5 = (BusinessAccount) acc3;
		 * acc5.loan(200.0); System.out.println("Loan!"); }
		 * 
		 * if(acc3 instanceof SavingsAccount) { SavingsAccount acc5 = (SavingsAccount)
		 * acc3; acc5.updateBalance(); System.out.println("Updated!"); } //Classes e
		 * métodos final
		 * 
		 * Account acc10 = new Account(2001, "Alex", 1000.0); acc10.withdraw(200.0);
		 * System.out.println(acc10.getBalance());
		 * 
		 * Account acc11 = new SavingsAccount(2002, "Maria", 1000.0, 0.01);
		 * acc11.withdraw(200); System.out.println(acc11.getBalance());
		 * 
		 * Account acc12 = new BusinessAccount(2003, "Bob", 1000.0, 500.0);
		 * acc12.withdraw(200); System.out.println(acc12.getBalance());
		 * 
		 * 
		 * 
		 * //Polimorfismo Account x = new Account(1020, "Alex", 1000.0); Account y = new
		 * SavingsAccount(1023, "Maria", 1000.0, 0.01); x.withdraw(50.0);
		 * y.withdraw(50.0);
		 * 
		 * System.out.println(x.getBalance()); System.out.println(y.getBalance());
		 * 
		 * //Classe abstrata
		 * 
		 * Account acc13 = new Account(3011, "Alex", 1000.0); Account acc14 = new
		 * SavingsAccount(3012, "Maria", 1000.0, 0.01); Account acc15 = new
		 * BusinessAccount(3013, "Bob", 1000.0, 500.0);
		 * 
		 */
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
