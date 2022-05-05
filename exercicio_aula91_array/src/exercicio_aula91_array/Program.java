package exercicio_aula91_array;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n;

		Infor_Client[] vect = new Infor_Client[10];

		System.out.print("How many rooms will be rented? ");
		n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			entrada.nextLine();
			System.out.println("Rent # " + i + ":");

			System.out.print("Name : ");
			String name = entrada.nextLine();

			System.out.print("E-mail :");
			String email = entrada.nextLine();

			System.out.print("Room : ");
			int room = entrada.nextInt();

			vect[room] = new Infor_Client(name, email);

		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		entrada.close();
	}

}
