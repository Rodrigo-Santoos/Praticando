package main;

import java.util.Scanner;

import entities.Cadastro;

public class Program_2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n;

		Cadastro[] vect = new Cadastro[10];

		System.out.print("Quantos quartos serão alugados? ");
		n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			entrada.nextLine();

			System.out.print("Name : ");
			String name = entrada.nextLine();

			System.out.print("Email : ");
			String email = entrada.nextLine();

			System.out.print("Numero do Quarto: ");
			int quarto = entrada.nextInt();

			vect[quarto] = new Cadastro(name, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		entrada.close();
	}

}
