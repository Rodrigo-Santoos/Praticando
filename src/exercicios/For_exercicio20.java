package exercicios;

import java.util.Scanner;

public class For_exercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1 = 0; 
		int n2 = 0;
		int sub = 0;
		
		for(int i = 1; i<= 3; i++) {
			System.out.println("Operaçao Subtraçao!");
			System.out.println("");
			System.out.println("Conta " + i);
			System.out.println("");
			System.out.print("Digite um numero:");
			n1 = entrada.nextInt();
			
			System.out.print("Digite o segundo: ");
			n2 = entrada.nextInt();
			
			sub = n1 - n2;
			
			System.out.println();
			System.out.println(n1 + " - " + n2 + " = " + sub);
			System.out.println();
		}
		
		
		entrada.close();
	}

}
