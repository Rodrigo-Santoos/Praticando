package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Register_account {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Account acc;

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
			acc = new Account(numA, holder, deposi);
		} else {
			acc = new Account(numA, res);
		}
//-----------------------------------------------------------------------------------------------------------------------------
		// add deposit

		System.out.println("Account data:");

		System.out.println(acc.toString());

		acc.pularLinha();
		System.out.print("Enter a deposit value: ");
		double deposi2 = entrada.nextDouble();

		acc.addDepo(deposi2);

		System.out.println("Account data:");

		System.out.println(acc.toString());

//------------------------------------------------------------------------------------------------------------------------------
		// cash withdrawal
		acc.pularLinha();
		System.out.print("Enter a withdraw value: ");
		double withdraw = entrada.nextDouble();

//		deposi = (deposi - withdraw) - 5.00;
//
//		acc.setDepositValue(deposi);

		acc.withCash(withdraw);

		System.out.println("Account data:");

		System.out.println(acc.toString());

//------------------------------------------------------------------------------------------------------------------------------
		entrada.close();

	}

}
