package exercicios;

import java.util.Scanner;

public class For_exercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Digite um numero: ");
		n = entrada.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.print(i+ " ");
			}
		}
		
		
		entrada.close();
	}

}
