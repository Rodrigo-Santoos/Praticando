package exercicios;

import java.util.Scanner;

public class While_exercicio15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a sua senha: ");
		senha = entrada.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha invalida");
			System.out.println();
			System.out.print("Digite a sua senha Novamente: ");
			senha = entrada.nextInt();
		}
		
		System.out.println();
		System.out.println("Acesso Permitido!");
		
		entrada.close();
	}

}
