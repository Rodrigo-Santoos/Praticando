package exercicios;

import java.util.Scanner;

public class If_Else_exercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("\"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\"");
		
		System.out.print("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = entrada.nextInt();
		
		if(a % b == 0 || b % a == 0){
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao Sao multiplos");
		}
		
		entrada.close();
	}

}
