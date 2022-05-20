package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
				
		int a, b , c ,d, diferencia;
		
		System.out.print("Valor de A: ");
		a = entrada.nextInt();
		
		System.out.print("Valor de B: ");
		b = entrada.nextInt();
				
		System.out.print("Valor de C: ");
		c = entrada.nextInt();
		
		System.out.print("Valor de D: ");
		d = entrada.nextInt();
		
		diferencia = a*b-c*d;
		
		System.out.println("diferenca: " + diferencia);
		
		entrada.close();
	}

}
