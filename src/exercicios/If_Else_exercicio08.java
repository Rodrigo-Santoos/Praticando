package exercicios;

import java.util.Scanner;

public class If_Else_exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Par ou Impar");
		
		System.out.print("Digite um numero: ");
		n1 = entrada.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		entrada.close();
	}

}
