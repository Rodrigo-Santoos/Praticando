package exercicios;

import java.util.Scanner;

public class For_exercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n;
		char resp;
		int mult = 0;
		int resultado;

		System.out.print("Deseja ver a tabuada? [S ou N]: ");
		resp = entrada.nextLine().charAt(0);

		while(resp != 's' && resp != 'S' ) {
			System.out.print("Digite [S ou N]: ");
			resp = entrada.nextLine().charAt(0);
		}
		
		System.out.println("Resposta "+ resp);
		System.out.println();
		System.out.print("Tabuada de: ");
		n = entrada.nextInt();

		while (resp == 's' || resp == 'S') {

	        while(mult <= 10)
	        {
	            resultado = n * mult;
	            System.out.println(resultado);   
	            mult++;
	        }
		}

		entrada.close();
	}
}
