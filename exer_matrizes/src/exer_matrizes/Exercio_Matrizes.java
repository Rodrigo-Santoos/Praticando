package exer_matrizes;

import java.util.Scanner;

public class Exercio_Matrizes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int m, n;

		System.out.print("Digite quantas linhas tera a matriz: ");
		m = entrada.nextInt();

		System.out.print("Digites quantas colunas tera: ");
		n = entrada.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println();
		int x = entrada.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		entrada.close();
	}

}
