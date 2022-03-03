package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b,c;
		
		double tri, raio,tra, quadra, retan;
		
		System.out.print("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.println("");
		tri = a * b /2;
		
		System.out.printf("Triangulo : %.3f.",tri);
		entrada.close();
		
		System.out.println(" ");
		
		raio = Math.PI * Math.pow(c, 2);
		
		System.out.printf("Circulo : %.3f " , raio);
		
		System.out.println(" ");
		
		tra = (a+b)/2 * c;
		
		System.out.printf("trapézio : %.3f " , tra);
		
		System.out.println(" ");
		
		quadra = Math.pow(b, 2);
		
		System.out.printf("Quadrado : %.3f", quadra);
		
		System.out.println(" ");
		
		retan = a * b;
		
		System.out.printf("Retangulo : %.3f",retan);
		
		
		
	}

}
