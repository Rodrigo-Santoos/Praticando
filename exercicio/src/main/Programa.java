package main;

import java.util.Scanner;

import entidades.Cadastro;

public class Programa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Cadastro[] vetor = new Cadastro[10];

		System.out.print("Quantos quartos ira alugar? ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			entrada.nextLine();

			System.out.println();
			System.out.println("Pessoa #" + i);

			System.out.print("Nome: ");
			String nome = entrada.nextLine();

			System.out.print("Email: ");
			String email = entrada.nextLine();

			System.out.print("Quarto: ");
			int quarto = entrada.nextInt();

			vetor[quarto] = new Cadastro(nome, email);
		}

		System.out.println();
		System.out.println("Quartos alugados:");

		// for each trazendo todos os campos do veotor
//		for(Cadastro obj : vetor) {
//			System.out.println(obj + " :" + obj);
//		}

		// for para trazer os campos que tem informaçao
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + " :" + vetor[i]);
			}
		}

		entrada.close();
	}

}
