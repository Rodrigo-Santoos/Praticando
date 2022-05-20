package exercicios;

import java.util.Scanner;

public class If_Else_exercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int codigo,quantidade;
		double preco;
		
		System.out.print("Digite o codigo do produto:");
		codigo = entrada.nextInt();
		
		System.out.print("Digite a quantidade: ");
		quantidade = entrada.nextInt();
		
		if(codigo == 1) {
			preco = quantidade * 4.00;
			
		} else if(codigo == 2 ) {
			preco = quantidade * 4.50;
			
		} else if(codigo == 3) {
			preco = quantidade * 5.00;
			
		}else if(codigo == 4) {
			preco = quantidade * 2.00;
			
		} else {
			preco = quantidade * 1.50;
			
		}
		
		System.out.printf("Total: %.2f" , preco);
		
		entrada.close();
	}

}
