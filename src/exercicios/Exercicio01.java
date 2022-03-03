package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1 , n2, soma;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		n2 = entrada.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("Soma= " + soma);
		
		
		entrada.close();
	}

}
