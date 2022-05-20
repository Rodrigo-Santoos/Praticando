package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int cod1, cod2, num1, num2;
		double valorUni1, valorUni2, valor;
		
		//codigo do produto
		System.out.println("Digite o codigo da peça 1: ");
		cod1 = entrada.nextInt();
		
		System.out.println("Digite o codigo da peça 2: ");
		cod2 = entrada.nextInt();
		
		//quantidade que ira levar
		System.out.println("Digite quantos ira levar do codigo da peça" +cod1+ " : ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite quantos ira levar do codigo da peça" +cod2+ " : ");
		num2 = entrada.nextInt();
		
		//valor de cada peça
		System.out.println("Digite o valor unitario da peça " + cod1 + " :");
		valorUni1 = entrada.nextDouble();
		
		System.out.println("Digite o valor unitario da peça " + cod2 + " :");
		valorUni2 = entrada.nextDouble();
		
		valor = valorUni1 * num1 + valorUni2 * num2;
		
		System.out.printf("O valor a pagar: %.2f",valor);
		
		entrada.close();
		
	}
}
