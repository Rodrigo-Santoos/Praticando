package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Register_account {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numA;
		String holder;
		String res;
		double deposi = 0;

		System.out.print("Enter account number: ");
		numA = entrada.nextInt();

		entrada.nextLine();

		System.out.print("Enter accont Holder: ");
		holder = entrada.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		res = entrada.nextLine();

		if (res.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			deposi = entrada.nextDouble();
		} 
		
		System.out.println();
		Account acc = new Account(numA, holder, deposi);

		System.out.println("Account data:");
		
		System.out.println("Account " + acc.getAccontNum() + ", " + " Holder: " + acc.getAccontHol() + ", "
				+ "Balance: " + "$ " + acc.getDepositValue());
		
		System.out.println();

		
		
		entrada.close();

	}

}
