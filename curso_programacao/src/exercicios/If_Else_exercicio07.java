package exercicios;

import java.util.Scanner;

public class If_Else_exercicio07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1 ;
		
		System.out.print("Digite um numero inteiro: ");
		n1 = entrada.nextInt();
		
		
		if(n1 < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Nao negativo");
		}
		
		entrada.close();
	}

}
