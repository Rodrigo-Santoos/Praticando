package main;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite quantos campos ira adicionar: ");
		int n = entrada.nextInt();
		System.out.println();

		// criando a Matriz
		int[][] mat = new int[n][n];

		// for para percorrer a matriz inteira
		for (int i = 0; i < n; i++) {
			// percorrendo as colunas
			for (int j = 0; j < n; j++) {
//				System.out.print("Na fileira " + i + " da Matriz e na coluna " + j + " digite o valor: ");
				mat[i][j] = entrada.nextInt();
			}
			System.out.println();
		}
//---------------------------------------------------------------------------------------------------------
		
		// trazendo os numeros na diagonal da Matriz
		System.out.println("Main diagonal");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

//---------------------------------------------------------------------------------------------------------
		int count = 0;

		// percorrendo para contar quantos numeros negativos tem
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
				
		System.out.println();
		System.out.println("Numbers negative: " + count);

		entrada.close();
	}

}
