package exercicios;

import java.util.Scanner;

public class If_Else_exercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite um valor: ");
		valor = entrada.nextDouble();
		
		if(valor < 0.00 || valor > 100.0) {
			System.out.println("Fora de intervalo!");
			
		} else if(valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
			
		}else if(valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
			
		}else if(valor <= 75.00) {
			System.out.println("Intervalo (50,75]");
			
		}else {
			System.out.println("Intervalo (75,100]");
			
		}
		
		entrada.close();
	}

}
