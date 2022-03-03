package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		double raio, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = entrada.nextDouble();
		
		area = Math.PI * Math.pow(raio,2);
		
		System.out.printf("A= %.4f ", area );
		
		entrada.close();

	}

}
