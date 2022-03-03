package exercicios;

import java.util.Scanner;

public class While_exercicio16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Digite o valor de X: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		y = entrada.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			} 			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			
			System.out.print("Digite o valor de X: ");
			x = entrada.nextInt();
			
			System.out.print("Digite o valor de Y: ");
			y = entrada.nextInt();
		}
		
		entrada.close();
	}

}
