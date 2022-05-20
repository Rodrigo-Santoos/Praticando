package exercicios;

import java.util.Scanner;

public class For_exercicio18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um valor: ");
		x = entrada.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}

}
